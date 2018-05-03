package model;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mac
 */
public class AdsvertiseData {
    private Connection con;
    private Statement st;
    ArrayList<AdsDescription> ads_set = new ArrayList<AdsDescription>();
    
    
    public AdsvertiseData(Connection con) {
        this.con = con;

        try {
            st = con.createStatement();
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public AdsvertiseData() {

    }
    
    public String insertAdsData(String place_name ,
            String time_purchase ,
            String date_activate ,
            String date_expire ,
            double cost_amount,
            String provider_username ,
            int advertising_ads_id,
            String status_ads){
        String sql = "INSERT INTO `advertise_data` "
                    + "( `place_name`, `time_purchase`, `date_activate`"
                    + ", `date_expire`, `cost_amount`, `provider_username`"
                    + ", `advertising_ads_id`, `status_ads`) VALUES (?,?,?,?,?,?,?,?)";
        System.out.println(sql);
        try {
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setString(1, place_name);
            pstmt.setString(2, time_purchase);
            pstmt.setString(3, date_activate);
            pstmt.setString(4, date_expire);
            pstmt.setDouble(5, cost_amount);
            pstmt.setString(6,provider_username);
            pstmt.setInt(7, advertising_ads_id);
            pstmt.setString(8, status_ads);
            
            pstmt.execute();
            pstmt.close();
            return "success";
        } catch (SQLException ex) {
            Logger.getLogger(AdsvertiseData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "none";
    }
    
    public ArrayList<AdsDescription> queryAdsAll(){
        String sql = "select * from advertise_data order by time_purchase desc";
        System.out.println(sql);
        try {
            ResultSet rs = st.executeQuery(sql);
//            System.out.println(rs.toString());
            
            while (rs.next()){
                int id = rs.getInt("id");
                String place_name = rs.getString("place_name");
                String time_purchase = rs.getString("time_purchase");
                String date_activate = rs.getString("date_activate");
                String date_expire = rs.getString("date_expire");
                Double cost_amount = rs.getDouble("cost_amount");
                String provider_username = rs.getString("provider_username");
                int advertising_ads_id = rs.getInt("advertising_ads_id");
                String status_ads = rs.getString("status_ads");
                System.out.println(id);
                
                AdsDescription ads = new AdsDescription();
                ads.setAllAdsDes(id, place_name, time_purchase, date_activate, date_expire, cost_amount, provider_username, advertising_ads_id, status_ads);
                ads_set.add(ads);
            }
            st.close();
            return ads_set;
            
        } catch (SQLException ex) {
            Logger.getLogger(AdsvertiseData.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return ads_set;
    }
    
    public String updateStatus(int id, String status_ads){
        String sql;
        if(status_ads.equals("not_approve")){
            sql = "update advertise_data set status_ads = 'approve' where id="+id;
        }
        else{
            sql = "update advertise_data set status_ads = 'not_approve' where id="+id;
        }
        try {
            st.execute(sql);
            st.close();
            return "success";
            
        } catch (SQLException ex) {
            Logger.getLogger(AdsvertiseData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "none";
    }
}
