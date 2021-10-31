package com.example.tourismapp;

public class bok {

    private String car;
    private String days;
    private String location;
    private String cartype;
    private String carneed;
    private String bkash;
    private String cbkash;
    private String checkindatwe;
    private String checkoutdate;
    private String payy;
    private String name;
    private String phone;




    public bok(String car, String days, String location, String cartype, String carneed, String bkash, String cbkash,String checkindatwe,String checkoutdate,String payy, String name,String phone) {
        this.car = car;
        this.days = days;
        this.location = location;
        this.cartype = cartype;
        this.carneed = carneed;
        this.bkash = bkash;
        this.cbkash = cbkash;
        this.checkindatwe=checkindatwe;
        this.checkoutdate=checkoutdate;
        this.payy=payy;
        this.name=name;
        this.phone=phone;



    }

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }

    public String getDays() {
        return days;
    }

    public void setDays(String days) {
        this.days = days;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCartype() {
        return cartype;
    }

    public void setCartype(String cartype) {
        this.cartype = cartype;
    }

    public String getCarneed() {
        return carneed;
    }

    public void setCarneed(String carneed) {
        this.carneed = carneed;
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

    public String getCheckindatwe() {
        return checkindatwe;
    }

    public void setCheckindatwe(String checkindatwe) {
        this.checkindatwe = checkindatwe;
    }

    public String getCheckoutdate() {
        return checkoutdate;
    }

    public void setCheckoutdate(String checkoutdate) {
        this.checkoutdate = checkoutdate;
    }
}