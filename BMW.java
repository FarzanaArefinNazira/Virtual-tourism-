package com.example.tourismapp;

public class BMW {

    private String name;
    private String phonenumber;
    private String email;
    private String bkash;
    private String cbkash;

    public BMW() {

    }



    public BMW(String name,String phonenumber,String email,String bkash,String cbkash)
    {
        this.name=name;
        this.phonenumber=phonenumber;
        this.email=email;
        this.bkash=bkash;
        this.cbkash=cbkash;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBkash() {
        return bkash;
    }

    public void setBkash(String bkash) {
        this.bkash = bkash;
    }

    public String getCbkash() {
        return cbkash;
    }

    public void setCbkash(String cbkash) {
        this.cbkash = cbkash;
    }
}

