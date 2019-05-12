package cn.onedull._01_tx;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

import org.junit.Test;

import com.mysql.jdbc.Statement;

import cn.onedull.util.JDBCUtil;

public class TxTest {
	@Test
	public void testTx() throws Exception {
		//连接
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		//查询某人金额
		String sql = "SELECT * FROM account WHERE name=?;";
		try {
			//获取数据库连接对象
			conn = JDBCUtil.connection();
			//开启事务
			conn.setAutoCommit(false);
			//获取预编译语句对象
			ps = conn.prepareStatement(sql);
			//设置值
			ps.setObject(1, "小天");
			//执行sql语句
			rs = ps.executeQuery();
			//判断
			if(!rs.next()){
				System.out.println("余额不足");
				return;
			}
			
			
			//减少某人金额
			sql = "UPDATE account SET balance=balance - ? WHERE name = ?";
			//获取预编译语句对象
			ps = conn.prepareStatement(sql);
			//设置值
			ps.setObject(1, 1000);
			ps.setObject(2, "小天");
			//执行sql语句
			ps.executeUpdate();
			
			
			//增加某人金额
			sql = "UPDATE account SET balance=balance + ? WHERE name = ?";
			//获取预编译语句对象
			ps = conn.prepareStatement(sql);
			//设置值
			ps.setObject(1, 1000);
			ps.setObject(2, "小亮");
			//执行sql语句
			ps.executeUpdate();
			
			//增加某人(获取自动生成的主键)
			sql = "INSERT account(name, balance) VALUES(?, ?)";
			//获取预编译语句对象
			ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			ps.setObject(1, "小乔");
			ps.setObject(2, 12000);
			//执行sql语句
			ps.executeUpdate();
			//获取主键
			ResultSet gs = ps.getGeneratedKeys();
			ResultSetMetaData ma = gs.getMetaData();
			//获取列数
			int cm = ma.getColumnCount();
			System.out.println(cm);
			//获取列
			String cme = ma.getColumnName(1);
			System.out.println(cme);
			while(gs.next()){
				String string = gs.getString(1);
				System.out.println(string);
			}
			//提交
			conn.commit();
			
		} catch (Exception e) {
			//回滚
			conn.rollback();
			e.printStackTrace();
		}finally{
			JDBCUtil.close(rs, ps, conn);
		}
		
		
		
	}
}
