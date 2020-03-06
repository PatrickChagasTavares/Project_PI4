/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project_pi4.DAO;

/**
 *
 * @author lucas.paiva
 */
import com.project_pi4.Model.Product;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ProductDAO {

    private Connection con;
    private PreparedStatement stmt;
    private Statement st;
    private ResultSet rs;
    private ArrayList<Product> lista;

    public ProductDAO() {
        con = new ConnectionFactory().getConnection();

        }

        public void Insert(Product produto) throws SQLException {
            String sql = "INSERT INTO products (name,description,price,category) values (?,?,?,?)";
        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, produto.getNome());
            stmt.setString(2, produto.getDesc());
            stmt.setDouble(3, produto.getPreco());
            stmt.setString(4, produto.getCategoria());

            stmt.executeUpdate();
            con.close();

        } catch (Exception error) {
            throw new RuntimeException("Insert Error: " + error);
        }
        stmt.close();

    }

    public void Delete(int id) {
        String sql = "DELETE FROM products WHERE idproduct = " + id;
        try {
            st = con.createStatement();
            st.execute(sql);
            st.close();

        } catch (Exception error) {
            throw new RuntimeException("Delete Error: " + error);
        }
    }

    public void Update(Product produto) {
        String sql = "UPDATE products SET name=?,description =?, price=?,category=? WHERE idProduct = ?";
        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, produto.getNome());
            stmt.setString(2, produto.getDesc());
            stmt.setDouble((3), produto.getPreco());
            stmt.setString(4, produto.getCategoria());
            stmt.setInt(5, produto.getId());
            stmt.execute();
            stmt.close();

        } catch (Exception error) {
            throw new RuntimeException("Update Error: " + error);
        }
    }

    public ArrayList<Product> GetAll() {
        String sql = "SELECT * FROM products";
        try {
            st = con.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                Product produto = new Product();
                produto.setNome(rs.getString("name"));
                produto.setCategoria(rs.getString("category"));
                produto.setDesc(rs.getString("description"));
                produto.setPreco(rs.getDouble("price"));
                lista.add(produto);
            }
            return lista;
        } catch (Exception error) {
            throw new RuntimeException("GetAll Error: " + error);
        }
    }

    public ArrayList<Product> GetByCategory(String categoria) {
        String sql = "SELECT * FROM products WHERE category = " + categoria;
        try {
            st = con.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                Product produto = new Product();
                produto.setNome(rs.getString("name"));
                produto.setCategoria(rs.getString("category"));
                produto.setDesc(rs.getString("description"));
                produto.setPreco(rs.getDouble("price"));
                lista.add(produto);
            }
            return lista;
        } catch (Exception error) {
            throw new RuntimeException("GetByCategory Error: " + error);
        }
    }
}
