package com.example.tourismapp;

public class hotelbook {

    private  String hotel;
    private  String room;
    private  String roomneed;
    private  String adult;
    private  String child;
    private  String checkindate;
    private  String checkoutdate;
    private  String bkash;
    private  String cbkash;
    private  String pay;
    private String name;
    private String phonenumber;

public hotelbook()
{

}



    public hotelbook(String hotel,String room,String roomneed,String adult ,String child,String bkash,String cbkash,String checkindate, String checkoutdate,String pay, String name,String phonenumber)
    {
        this.hotel=hotel;
        this.room= room;
        this.adult= adult;
        this.roomneed=roomneed;
        this.child= child;
        this.checkindate=checkindate;
        this.checkoutdate=checkoutdate;
        this.bkash=bkash;
        this.cbkash=cbkash;
        this.pay=pay;
        this.name=name;
        this.phonenumber=phonenumber;



    }

    public String getHotel() {
        return hotel;
    }

    public void setHotel(String hotel) {
        this.hotel = hotel;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getRoomno() {
        return roomneed;
    }

    public void setRoomno(String roomno) {
        this.roomneed = roomneed;
    }

    public String getAdult() {
        return adult;
    }

    public void setAdult(String adult) {
        this.adult = adult;
    }

    public String getChild() {
        return child;
    }

    public void setChild(String child) {
        this.child = child;
    }

    public String getCheckindate() {
        return checkindate;
    }

    public void setCheckindate(String checkindate) {
        this.checkindate = checkindate;
    }

    public String getCheckoutdate() {
        return checkoutdate;
    }

    public void setCheckoutdate(String checkoutdate) {
        this.checkoutdate = checkoutdate;
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

    public String getPay() {
        return pay;
    }

    public void setPay(String pay) {
        this.pay = pay;
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

    public String getRoomneed() {
        return roomneed;
    }

    public void setRoomneed(String roomneed) {
        this.roomneed = roomneed;
    }

}
