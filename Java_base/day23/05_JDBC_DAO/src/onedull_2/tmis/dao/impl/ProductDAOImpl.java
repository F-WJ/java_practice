package onedull_2.tmis.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.sun.xml.internal.ws.resources.BindingApiMessages;

import onedull_2.tmis.dao.IProductDAO;
import onedull_2.tmis.domain.Product;
import onedull_2.tmis.util.JDBCUtil;
import onedull_2.tmis.util.Template;



public class ProductDAOImpl implements IProductDAO{

	@Override
	public void save(Product product) {
		//sql语句
		String sql = "INSERT INTO t_product(productName, salePrice, cutoff) VALUES(?, ?, ?);";
		Template.dml(sql, product.getProductName(), product.getSalePrice(), product.getCutoff());
	}
	@Override
	public void delete(Long id) {
		//sql语句
		String sql = "DELETE FROM t_product WHERE id = ?";
		Template.dml(sql, id);
	}
	
	@Override
	public void update(Product product) {
		//sql语句
		String sql = "UPDATE t_product SET productName = ?, salePrice = ?, cutoff = ?";
		Template.dml(sql, product.getProductName(), product.getSalePrice(), product.getCutoff());
	}
	@Override
	public List<Product> get(Product product, Long id) {
		//sql语句
		String sql = "SELECT * FROM t_product";
		List list = Template.dql(sql, product.getClass(), id);
		return list;
	}

}

