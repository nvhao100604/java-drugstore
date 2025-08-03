package app.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import app.DTO.ProductDTO;
import app.database.DBConnect;

class ProductDAO {
	public ArrayList<ProductDTO> getProducts() {
		ArrayList<ProductDTO> products = null;
		Connection connection = DBConnect.getConnection();
		if (connection != null) {
			try {
				String sql = "SELECT * FROM `sanpham` WHERE 1";
				ResultSet rs = connection.prepareStatement(sql).executeQuery();
				products = new ArrayList<ProductDTO>();
				while (rs.next()) {
					ProductDTO product = new ProductDTO(rs.getString(1), rs.getString(2), rs.getString(3),
							rs.getString(4), rs.getString(5), rs.getString(6), rs.getBoolean(7), rs.getBoolean(8));
					products.add(product);
				}
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return products;
	}

	public boolean addProduct(ProductDTO product) {
		Connection connection = DBConnect.getConnection();
		boolean result = false;
		if (connection != null) {
			try {
				String sql = "INSERT INTO sanpham VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
				PreparedStatement stmt = connection.prepareStatement(sql);
				stmt.setString(1, product.getId());
				stmt.setString(2, product.getName());
				stmt.setString(3, product.getType());
				stmt.setString(4, product.getProducer());
				stmt.setString(5, product.getSpecifications());
				stmt.setString(6, product.getOrigin());
				stmt.setBoolean(7, product.getIsIsNeedPrescribe());
				stmt.setBoolean(8, product.getStatus());
				result = stmt.execute();

				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}

	public boolean updateProduct(ProductDTO product) {
		Connection connection = DBConnect.getConnection();
		boolean result = false;
		if (connection != null) {
			try {
				String sql = "UPDATE sanpham SET tensp = ?, loaisp = ?, nhasanxuat = ?, quycach = ?, xuatxu = ?, canketoa = ? WHERE masp = ?";
				PreparedStatement stmt = connection.prepareStatement(sql);
				stmt.setString(1, product.getId());
				stmt.setString(2, product.getName());
				stmt.setString(3, product.getType());
				stmt.setString(4, product.getProducer());
				stmt.setString(5, product.getSpecifications());
				stmt.setString(6, product.getOrigin());
				stmt.setBoolean(7, product.getIsIsNeedPrescribe());
				stmt.setBoolean(8, product.getStatus());
				result = stmt.execute();

				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}

	public void removeProduct(String productID) {
		Connection connection = DBConnect.getConnection();
		if (connection != null) {
			try {
				String sql = "DELETE FROM sanpham WHERE masp = ?";
				PreparedStatement stmt = connection.prepareStatement(sql);
				stmt.setString(1, productID);
				int rows = stmt.executeUpdate();
				System.out.print(rows + " row deleted\n");
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		ProductDAO instance = new ProductDAO();
		ProductDTO newProduct = new ProductDTO("SP0014");
		if (instance.addProduct(newProduct)) {
			ArrayList<ProductDTO> productList = instance.getProducts();
			for (ProductDTO product : productList) {
				System.out.print(product + "\n");
			}
		} else {
			System.out.print("Lỗi thấy bà");
		}
	}
}
