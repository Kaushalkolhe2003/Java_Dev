package com.KK.ProductManagementApp.DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.KK.ProductManagementApp.model.Product;

public class productDB {
    private Connection con;

    public productDB()  {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/projectdb", "root", "Kolhe2003@");
        } catch (SQLException e) {
            e.printStackTrace(); // Log this properly in a real application
        } catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    public void save(Product p) {
        String query = "INSERT INTO product (name, type, place, warranty) VALUES (?, ?, ?, ?)";

        try (PreparedStatement st = con.prepareStatement(query)) {
            st.setString(1, p.getName());
            st.setString(2, p.getType());
            st.setString(3, p.getPlace());
            st.setInt(4, p.getWarranty());
            st.executeUpdate(); // Correct usage
        } catch (SQLException e) {
            e.printStackTrace(); // Log this properly in a real application
        }
    }

    public List<Product> getProducts() {
        List<Product> products = new ArrayList<>();
        String query = "SELECT * FROM product";

        try (PreparedStatement st = con.prepareStatement(query);
             ResultSet rs = st.executeQuery()) {

            while (rs.next()) {
                Product p = new Product();
                p.setId(rs.getInt("id"));
                p.setName(rs.getString("name"));
                p.setType(rs.getString("type"));
                p.setPlace(rs.getString("place"));
                p.setWarranty(rs.getInt("warranty"));
                products.add(p);
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Log this properly in a real application
        }

        return products;
    }

    public Product getProductByName(String name) {
        String query = "SELECT * FROM product WHERE name=?";
        Product p = null;

        try (PreparedStatement st = con.prepareStatement(query)) {
            st.setString(1, name);
            try (ResultSet rs = st.executeQuery()) {
                if (rs.next()) {
                    p = new Product();
                    p.setId(rs.getInt("id"));
                    p.setName(rs.getString("name"));
                    p.setType(rs.getString("type"));
                    p.setPlace(rs.getString("place"));
                    p.setWarranty(rs.getInt("warranty"));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Log this properly in a real application
        }

        return p;
    }
}
