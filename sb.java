package com.example.tourismapp;

public class sb {

    public String Qu;
    public String color;
    public String date;
    public String bkash;
    public String cbkash;
    public String name;
    public String phone;
    public String pay;

    public sb(){

    }



    public sb(String Qu, String color, String date, String bkash, String cbkash,String name,String phone,String pay) {

       this.Qu=Qu;
       this.color=color;
       this.date=date;
       this.bkash=bkash;
       this.cbkash=cbkash;
       this.name=name;
       this.phone=phone;
       this.pay=pay;

    }

    public String getQu() {
        return Qu;
    }

    public void setQu(String qu) {
        Qu = qu;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
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

    public String getPay() {
        return pay;
    }

    public void setPay(String pay) {
        this.pay = pay;
    }
}

