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
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mac
 */
public class Place {

    private Connection con;
    private Statement st;
    private List<String> listName_place = new ArrayList();
    ArrayList<PlaceData> pd_set = new ArrayList<PlaceData>();

    public Place(Connection con) {
        this.con = con;

        try {
            st = con.createStatement();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public Place() {

    }

    public List queryPlaceByNameProvider(String owner_name) {

        String sql = "select * from place_description where owner_name = '" + owner_name + "'";
        try {
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                String place_name = rs.getString("place_name");
                listName_place.add(place_name);

            }
        } catch (SQLException ex) {
            Logger.getLogger(Place.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(listName_place.size());
        return listName_place;
    }

    public ArrayList<PlaceData> queryPlaceForShow(String search_obj , String search_zone ,Double search_people) {
        String sql = "select * from place_description "
//                + "join place_picture using(place_name) "
                + "join place_type using(place_name) "
                + "join place_appropriate using(place_name) "
                + "join place_capacity using(place_name) "
                + "where "+search_obj+" = 1 and place_zone like '"+search_zone
                +"' and (stand_capacity >= "+search_people
                +" or sit_capacity >= "+search_people+")";
        
        System.out.println(sql);
        try {
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                String place_name = rs.getString("place_name");
                String place_featured = rs.getString("place_featured");
                String place_description = rs.getString("place_description");
                String place_status = rs.getString("place_status");
                String place_lat = rs.getString("place_lat");
                String place_lng = rs.getString("place_lng");
                String place_zone = rs.getString("place_zone");
                String phone = rs.getString("phone");
                String email = rs.getString("email");
                String owner_name = rs.getString("owner_name");
                double price_phour = rs.getDouble("price_phour");
                double price_pday = rs.getDouble("price_pday");
                String place_address = rs.getString("place_address");

                //place img
//                int img_id = rs.getInt("img_id");
//                String img_name =rs.getString("img_name");
                
                PlaceData pd = new PlaceData();
                pd.SetPlaceData(place_name, place_featured, place_description, place_status, place_lat, place_lng, place_zone, phone, email, owner_name, price_phour, price_pday, place_address);
                
                pd_set.add(pd);

            }
        } catch (SQLException ex) {
            Logger.getLogger(Place.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
        return pd_set;

    }

}
