package cn.onedull.tmis.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import cn.onedull.tmis.dao.IProductDAO;
import cn.onedull.tmis.domain.Product;
import cn.onedull.tmis.util.JDBCUtil;

public class ProductDAOImpl implements IProductDAO{

	@Override
	public void save(Product product) {
		//sql语句
		String sql = "INSERT INTO t_product(productName, salePrice, cutoff) VALUES(?, ?, ?);";
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			//加载驱动
			Class.forName("com.mysql.jdbc.Driver");
			//获取数据库连接对象
			conn = DriverManager.getConnection("jdbc:mysql:///message", "root", "123456");
			//获取预编译语句对象
			ps = conn.prepareStatement(sql);
			//设置值
			ps.setObject(1, product.getProductName());
			ps.setObject(2, product.getSalePrice());
			ps.setObject(3, product.getCutoff());
			//执行sql语句
			ps.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			JDBCUtil.close(null, ps, conn);
		}
	}

	@Override
	public void delete(Long id) {
		//sql语句
		String sql = "DELETE FROM t_product WHERE id = ?";
		Connection conn = null;
		PreparedStatement ps = null;
		
		try {
			//加载驱动
			Class.forName("com.mysql.jdbc.Driver");
			//获取数据库连接对象
			conn = DriverManager.getConnection("jdbc:mysql:///message", "root", "123456");
			//获取预编译语句对象
			ps = conn.prepareStatement(sql);
			//设置值
			ps.setObject(1, id);
			//执行sql语句
			ps.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			JDBCUtil.close(null, ps, conn);
		}
	}
	


	@Override
	public void update(Product product) {
		//sql语句
		String sql = "UPDATE t_product SET productName = ?, salePrice = ?, cutoff = ?";
		Connection conn = null;
		PreparedStatement ps = null;
		
		try {
			//加载驱动
			getClass().forName("com.mysql.jdbc.Driver");
			//获取数据库连接对象
			conn = DriverManager.getConnection("jdbc:mysql:///message", "root", "123456");
			//获取预编译语句对象
			ps = conn.prepareStatement(sql);
			//设置值
			ps.setObject(1, product.getProductName());
			ps.setObject(2, product.getSalePrice());
			ps.setObject(3, product.getCutoff());
			//执行语句
			ps.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			JDBCUtil.close(null, ps, conn);
		}
	}

	@Override
	public List<Product> get(Long id) {
		//sql语句
		String sql = "SELECT * FROM t_product";
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<Product> list = new ArrayList<>();
		try {
			//加载驱动
			Class.forName("com.mysql.jdbc.Driver");
			//获取数据库连接对象
			conn = DriverManager.getConnection("jdbc:mysql:///message", "root", "123456");
			//获取预编译语句对象
			ps = conn.prepareStatement(sql);
			//执行sql语句
			rs = ps.executeQuery();
			while(rs.next()){
				Product product = new Product();
				product.setProductName(rs.getString("productName"));
				product.setSalePrice(rs.getObject("salePrice"));
				product.setCutoff(rs.getObject("cutoff"));
				list.add(product);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			JDBCUtil.close(rs, ps, conn);
		}
		return list;
	}



}
