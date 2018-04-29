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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpSession;

/**
 *
 * @author mac
 */
public class Members {

    private Connection con;
    private Statement st;

    private String sql;
    private String username = "he";
    private String password;
    private String name;
    private String phone;
    private String email;

    public Members(Connection con) {
        this.con = con;

        try {
            st = con.createStatement();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public Members() {
    }

    public String queryMember(String username_input, String password_input) {

        try {
            sql = "SELECT * FROM member";
            ResultSet rs = st.executeQuery(sql);
            Boolean isMember = false;
            while (rs.next()) {
                this.username = rs.getString("username");
                this.password = rs.getString("password");

                if (password_input.equals(password) && username_input.equals(username)) {
                    this.name = rs.getString("firstName") + " " + rs.getString("lastName");
                    this.phone = rs.getString("phone");
                    this.email = rs.getString("email");
                    isMember = true;
                    break;

                } else {
                    isMember = false;
                }
            }
            st.close();
            if (isMember) {
                
                return "member";
                
            } else {
                return "none";
            }

        } catch (SQLException ex) {
            return ex + "";
        }

    }

    public String updateProfile(String username, String firstName, String lastName, String phone) {
        System.out.println(username + firstName + lastName + phone);

        try {

            sql = "update member set firstName = '" + firstName + "' , lastName = '" + lastName + "' , phone = '" + phone + "' where username = '" + username + "'";
            st.executeUpdate(sql);
            this.name = firstName + " " + lastName;
            this.phone = phone;
            st.close();
            return "updated";
        } catch (Exception e) {
            e.printStackTrace();

        }
        return "1";
    }
    
    public String insertMember(String username ,String password, String fname, String lname , String email,String phone , Double balance){
        System.out.println(username+ password+ fname+ lname+ email+ phone+ balance);
        try {
            sql = "INSERT INTO member (username, password, firstName,lastName, phone,email,balance) VALUES ('"
                    +username+"','"+password+"','"+fname+"','"+
                    lname+"','"+email+"','"+phone+"',"+balance+")";
            st.execute(sql);
            st.close();
            return "success";
        } catch (SQLException ex) {
            Logger.getLogger(Members.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "0";
    }

    public String getSql() {
        return sql;
    }

    public void setSql(String sql) {
        this.sql = sql;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
