/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author mac
 */
public class Admin {
    private Connection conn;
    private Statement st;
    private String sql;
    
    private String username;
    private String password;
    private String name;
    private String role;
    
    public Admin(Connection conn){
        this.conn = conn;
        try {
            st = conn.createStatement();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
                
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
    
    public Admin() {
    }
    
    public String checkIsProvider(String username_input, String password_input){
        try {
            sql = "SELECT * FROM admin";
            ResultSet rs = st.executeQuery(sql);
            Boolean isProvider = false;
            while (rs.next()) {
                this.username = rs.getString("username");
                this.password = rs.getString("password");

                if (password_input.equals(password) && username_input.equals(username)) {
                    this.name = rs.getString("name");
                    this.role = rs.getString("role");
                    isProvider = true;
                    break;
                    
                } else {
                    isProvider = false;
                }
            }
            st.close();
            if (isProvider) {
                return "admin";
            } else {
                return "none";
            }

        } catch (SQLException ex) {
            return ex + "";
        }
        
    }
    
}
