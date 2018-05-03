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
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mac
 */
public class Provider {

    private Connection conn;
    private Statement st;
    private String sql;

    private String username;
    private String password;
    private String idCard;
    private String phone;
    private String email;
    private String address;
    private String owner;
    private String provider_status;

    ArrayList<ProviderData> array_provider_data = new ArrayList<ProviderData>();

    public Provider(Connection conn) {
        this.conn = conn;
        try {
            st = conn.createStatement();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    public Provider() {
    }

    public boolean insertNewProvider(String username, String password, String idCard, String phone, String email, String address, String owner, String provider_status) {

        try {
            sql = String.format("INSERT INTO providers (username, password, idCard, "
                    + "phone,email, address,owner,provider_status) VALUES ('%s','%s','%s','%s','%s','%s','%s','%s')",
                    username, password, idCard, phone, email, address, owner, provider_status);
            st.execute(sql);
            st.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Provider.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;
    }

    public String checkIsProvider(String username_input, String password_input) {
        try {
            sql = "SELECT * FROM providers";
            ResultSet rs = st.executeQuery(sql);
            Boolean isProvider = false;
            while (rs.next()) {
                this.username = rs.getString("username");
                this.password = rs.getString("password");

                if (password_input.equals(password) && username_input.equals(username)) {
                    this.owner = rs.getString("owner");
                    this.address = rs.getString("address");
                    this.idCard = rs.getString("idCard");
                    this.phone = rs.getString("phone");
                    this.email = rs.getString("email");
                    this.provider_status = rs.getString("provider_status");
                    if (rs.getString("provider_status").equals("approve")) {
                        isProvider = true;
                        break;
                    } else {
                        isProvider = false;
                        break;
                    }
                } else {
                    isProvider = false;
                }
            }
            st.close();
            if (isProvider) {
                return "provider";
            } else {
                return "none";
            }

        } catch (SQLException ex) {
            return ex + "";
        }

    }

    public ArrayList<ProviderData> queryProviderForAdmin() {
        sql = "select * from providers order by provider_status  desc,owner";
        try {
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                String username = rs.getString("username");
                String password = rs.getString("password");
                String idCard = rs.getString("idCard");
                String phone = rs.getString("phone");
                String email = rs.getString("email");
                String address = rs.getString("address");
                String owner = rs.getString("owner");
                String provider_status = rs.getString("provider_status");
                
                ProviderData provider_data = new ProviderData();
                provider_data.setProviderData(username, password, idCard, phone, email, address, owner, provider_status);
                
                array_provider_data.add(provider_data);
            }
            st.close();
            return array_provider_data;
        } catch (SQLException ex) {
            Logger.getLogger(Provider.class.getName()).log(Level.SEVERE, null, ex);
        }
        return array_provider_data;

    }
    
    public String updateStatus_provider(String username){
        sql = "update providers set provider_status = 'approve' where username = '"+username+"'";
        try {
            st.execute(sql);
            st.close();
            return "success";
        } catch (SQLException ex) {
            Logger.getLogger(Provider.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "none";
    }

    public String getProvider_status() {
        return provider_status;
    }

    public void setProvider_status(String provider_status) {
        this.provider_status = provider_status;
    }

    public void queryProvider() {

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

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
