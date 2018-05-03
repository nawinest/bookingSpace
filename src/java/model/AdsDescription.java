/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author mac
 */
public class AdsDescription {
    private int id;
    private String place_name;
    private String time_purchase;
    private String date_activate;
    private String date_expire;
    private Double cost_amount;
    private String provider_username;
    private int advertising_ads_id;
    private String status_ads;

    public AdsDescription() {
    }

    public void setAllAdsDes(int id,String place_name,
            String time_purchase,
            String date_activate,
            String date_expire,
            Double cost_amount,
            String provider_username,
            int advertising_ads_id,
            String status_ads) {
        this.id = id;
        this.place_name = place_name;
        this.time_purchase = time_purchase;
        this.date_activate = date_activate;
        this.date_expire = date_expire;
        this.cost_amount = cost_amount;
        this.provider_username = provider_username;
        this.advertising_ads_id = advertising_ads_id;
        this.status_ads = status_ads;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    

    public String getPlace_name() {
        return place_name;
    }

    public void setPlace_name(String place_name) {
        this.place_name = place_name;
    }

    public String getTime_purchase() {
        return time_purchase;
    }

    public void setTime_purchase(String time_purchase) {
        this.time_purchase = time_purchase;
    }

    public String getDate_activate() {
        return date_activate;
    }

    public void setDate_activate(String date_activate) {
        this.date_activate = date_activate;
    }

    public String getDate_expire() {
        return date_expire;
    }

    public void setDate_expire(String date_expire) {
        this.date_expire = date_expire;
    }

    public Double getCost_amount() {
        return cost_amount;
    }

    public void setCost_amount(Double cost_amount) {
        this.cost_amount = cost_amount;
    }

    public String getProvider_username() {
        return provider_username;
    }

    public void setProvider_username(String provider_username) {
        this.provider_username = provider_username;
    }

    public int getAdvertising_ads_id() {
        return advertising_ads_id;
    }

    public void setAdvertising_ads_id(int advertising_ads_id) {
        this.advertising_ads_id = advertising_ads_id;
    }

    public String getStatus_ads() {
        return status_ads;
    }

    public void setStatus_ads(String status_ads) {
        this.status_ads = status_ads;
    }

}
