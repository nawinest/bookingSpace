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
    private Statement st2;
    private List<String> listName_place = new ArrayList();

    ArrayList<PlaceData> pd_set = new ArrayList<PlaceData>();
    PlaceData pd_result;

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
            st.close();
        } catch (SQLException ex) {
            Logger.getLogger(Place.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(listName_place.size());
        return listName_place;
    }

    public ArrayList<PlaceData> queryPlaceForShow(String search_obj, String search_zone, Double search_people) {
        String sql = "select * from place_description "
                + "join place_type using(place_name) "
                + "join place_appropriate using(place_name) "
                + "join place_capacity using(place_name) "
                + "where " + search_obj + " = 1 and place_zone like '" + search_zone
                + "' and (stand_capacity >= " + search_people
                + " or sit_capacity >= " + search_people + ")";

//        System.out.println(sql);
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

                //image
                ArrayList<PlaceImage> place_img = this.queryImageOfPlace(place_name);

                //place appropriate
                boolean good_meeting = rs.getBoolean("good_meeting");
                boolean good_seminar = rs.getBoolean("good_seminar");
                boolean good_workshop = rs.getBoolean("good_workshop");
                boolean good_openproduct = rs.getBoolean("good_openproduct");
                boolean good_party = rs.getBoolean("good_party");
                boolean good_photo = rs.getBoolean("good_photo");
                boolean good_concert = rs.getBoolean("good_concert");

                //place Capacity
                double stand_capacity = rs.getDouble("stand_capacity");
                double banquat_capacity = rs.getDouble("banquat_capacity");
                double sit_capacity = rs.getDouble("sit_capacity");
                double meeting_capacity = rs.getDouble("meeting_capacity");
                double park_capacity = rs.getDouble("park_capacity");
                double room_capacity = rs.getDouble("room_capacity");

                //place type
                boolean isHotel = rs.getBoolean("isHotel");
                boolean isConference = rs.getBoolean("isConference");
                boolean isRestaurant = rs.getBoolean("isRestaurant");
                boolean isCoworking = rs.getBoolean("isCoworking");
                boolean isOthers = rs.getBoolean("isOthers");

                PlaceData pd = new PlaceData();

                pd.SetPlaceData(place_name, place_featured, place_description, place_status,
                        place_lat, place_lng, place_zone, phone, email, owner_name,
                        price_phour, price_pday, place_address, place_img,
                        good_meeting,
                        good_seminar,
                        good_workshop,
                        good_openproduct,
                        good_party,
                        good_photo,
                        good_concert,
                        stand_capacity,
                        banquat_capacity,
                        sit_capacity,
                        meeting_capacity,
                        park_capacity,
                        room_capacity,
                        isHotel,
                        isConference,
                        isRestaurant,
                        isCoworking,
                        isOthers);

                pd_set.add(pd);

            }
            st.close();

        } catch (SQLException ex) {
            Logger.getLogger(Place.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
        return pd_set;

    }
    
    public ArrayList<PlaceData> queryPlaceSponser() {
        String sql = "select * from place_description join place_type using(place_name) join place_appropriate using(place_name) "
                + "join place_capacity using(place_name) "
                + "join advertise_data using(place_name) where status_ads = 'approve' limit 10";

                

//        System.out.println(sql);
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

                //image
                ArrayList<PlaceImage> place_img = this.queryImageOfPlace(place_name);

                //place appropriate
                boolean good_meeting = rs.getBoolean("good_meeting");
                boolean good_seminar = rs.getBoolean("good_seminar");
                boolean good_workshop = rs.getBoolean("good_workshop");
                boolean good_openproduct = rs.getBoolean("good_openproduct");
                boolean good_party = rs.getBoolean("good_party");
                boolean good_photo = rs.getBoolean("good_photo");
                boolean good_concert = rs.getBoolean("good_concert");

                //place Capacity
                double stand_capacity = rs.getDouble("stand_capacity");
                double banquat_capacity = rs.getDouble("banquat_capacity");
                double sit_capacity = rs.getDouble("sit_capacity");
                double meeting_capacity = rs.getDouble("meeting_capacity");
                double park_capacity = rs.getDouble("park_capacity");
                double room_capacity = rs.getDouble("room_capacity");

                //place type
                boolean isHotel = rs.getBoolean("isHotel");
                boolean isConference = rs.getBoolean("isConference");
                boolean isRestaurant = rs.getBoolean("isRestaurant");
                boolean isCoworking = rs.getBoolean("isCoworking");
                boolean isOthers = rs.getBoolean("isOthers");

                PlaceData pd = new PlaceData();

                pd.SetPlaceData(place_name, place_featured, place_description, place_status,
                        place_lat, place_lng, place_zone, phone, email, owner_name,
                        price_phour, price_pday, place_address, place_img,
                        good_meeting,
                        good_seminar,
                        good_workshop,
                        good_openproduct,
                        good_party,
                        good_photo,
                        good_concert,
                        stand_capacity,
                        banquat_capacity,
                        sit_capacity,
                        meeting_capacity,
                        park_capacity,
                        room_capacity,
                        isHotel,
                        isConference,
                        isRestaurant,
                        isCoworking,
                        isOthers);

                pd_set.add(pd);

            }
            st.close();

        } catch (SQLException ex) {
            Logger.getLogger(Place.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
        return pd_set;

    }

    public ArrayList<PlaceImage> queryImageOfPlace(String place_name) {
        String sql = "select * from place_description join place_picture using(place_name) where place_name = '" + place_name + "'";
//        System.out.println(sql2);
        ArrayList<PlaceImage> pd_img = new ArrayList<PlaceImage>();
        
        try {
//            ResultSet rs2 = st2.execute(sql2);
            st2 = con.createStatement();
            ResultSet rs = st2.executeQuery(sql);

            while (rs.next()) {
                int img_id = rs.getInt("img_id");
                String img_name = rs.getString("img_name");
                PlaceImage pi = new PlaceImage();
                pi.setPlaceImage(img_id, img_name);
                pd_img.add(pi);

            }
            st2.close();
        } catch (SQLException ex) {
            Logger.getLogger(Place.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
        return pd_img;
    }

    public PlaceData getPlaceData(String place_name) {
        String sql = "select * from place_description "
                //                + "join place_picture using(place_name) "
                + "join place_type using(place_name) "
                + "join place_appropriate using(place_name) "
                + "join place_capacity using(place_name) "
                + "where place_name = '" + place_name + "'";
        
        try {
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()){
                System.out.println(sql);
//                String place_name = rs.getString("place_name");
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

                //image
                ArrayList<PlaceImage> place_img = this.queryImageOfPlace(place_name);
                
                //place appropriate
                boolean good_meeting = rs.getBoolean("good_meeting");
                boolean good_seminar = rs.getBoolean("good_seminar");
                boolean good_workshop = rs.getBoolean("good_workshop");
                boolean good_openproduct = rs.getBoolean("good_openproduct");
                boolean good_party = rs.getBoolean("good_party");
                boolean good_photo = rs.getBoolean("good_photo");
                boolean good_concert = rs.getBoolean("good_concert");

                //place Capacity
                double stand_capacity = rs.getDouble("stand_capacity");
                double banquat_capacity = rs.getDouble("banquat_capacity");
                double sit_capacity = rs.getDouble("sit_capacity");
                double meeting_capacity = rs.getDouble("meeting_capacity");
                double park_capacity = rs.getDouble("park_capacity");
                double room_capacity = rs.getDouble("room_capacity");

                //place type
                boolean isHotel = rs.getBoolean("isHotel");
                boolean isConference = rs.getBoolean("isConference");
                boolean isRestaurant = rs.getBoolean("isRestaurant");
                boolean isCoworking = rs.getBoolean("isCoworking");
                boolean isOthers = rs.getBoolean("isOthers");
                
                PlaceData pd_result = new PlaceData();
                pd_result.SetPlaceData(place_name, place_featured, place_description
                        , place_status, place_lat, place_lng, place_zone, phone, email
                        , owner_name, price_phour, price_pday, place_address, place_img
                        , good_meeting, good_seminar, good_workshop, good_openproduct
                        , good_party, good_photo, good_concert, stand_capacity, banquat_capacity
                        , sit_capacity, meeting_capacity, park_capacity, room_capacity
                        , isHotel, isConference, isRestaurant, isCoworking, isOthers);
                
                
                return pd_result;
            }
            st.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(Place.class.getName()).log(Level.SEVERE, null, ex);
        }
        return pd_result;
    }

}
