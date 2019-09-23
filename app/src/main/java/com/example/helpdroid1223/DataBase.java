package com.example.helpdroid1223;

public class DataBase {
    String Name;
    String Email;
    String Phone;

    String Relation;

    public void Data() {

    }

    public DataBase(String name, String email, String phone, String relation) {
        Name = name;
        Email = email;
        Phone = phone;
        Relation = relation;
    }

    public String getName() {
        return Name;
    }

    public String getEmail() {
        return Email;
    }

    public String getPhone() {
        return Phone;
    }

    public String getRelation() {
        return Relation;
    }
}