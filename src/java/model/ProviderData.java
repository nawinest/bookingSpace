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
public class ProviderData {

    private String username;
    private String password;
    private String idCard;
    private String phone;
    private String email;
    private String address;
    private String owner;
    private String provider_status;

    public ProviderData() {

    }

    public void setProviderData(String username,
            String password,
            String idCard,
            String phone,
            String email,
            String address,
            String owner,
            String provider_status) {
            this.username = username;
            this.password = password;
            this.idCard = idCard;
            this.phone = phone;
            this.email = email;
            this.address = address;
            this.owner = owner;
            this.provider_status = provider_status;
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

    public String getProvider_status() {
        return provider_status;
    }

    public void setProvider_status(String provider_status) {
        this.provider_status = provider_status;
    }
    
    

}
