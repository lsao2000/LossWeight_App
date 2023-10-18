package com.example.healthweight;
import java.util.ArrayList;
public class Personne {
    private  String fullname;
    private String email;
    private String password;
    private String gender;
    private String username;
    private Float weight;
    private Float height;
    private static ArrayList information = new ArrayList<>();
    Personne(){

    }
    Personne(String fullname, String email, String password){
        this.fullname = fullname;
        this.email = email;
        this.password = password;
    }


    public void setFullname(String fullname) {
        this.fullname = fullname;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }
    public void setHeight(Float height) {
        this.height = height;
    }


    public static void setInformation(ArrayList information) {
        Personne.information = information;
    }

    public static ArrayList getInformation() {
        return information;
    }
}
