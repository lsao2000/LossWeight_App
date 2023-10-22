package com.example.healthweight;
import androidx.annotation.NonNull;

import java.util.ArrayList;
public class  Personne {
    private static String fullname;
    private static String email;
    private static String password;
    private static String gender;
    private static String username;
    private static Float weight;
    private static Float height;
    Personne(){

    }
    Personne(String fullname, String email, String password){
        Personne.fullname = fullname;
        Personne.email = email;
        Personne.password = password;
    }


    public String getFullname() {
        return fullname;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getGender() {
        return gender;
    }

    public String getUsername() {
        return username;
    }

    public Float getWeight() {
        return weight;
    }

    public Float getHeight() {
        return height;
    }

    public static void setFullname(String newFullname) {

        fullname = newFullname;
    }
    public static void setEmail(String newEmail) {
        email = newEmail;
    }
    public static void setPassword(String newPassword) {
        password = newPassword;
    }

    public static void setGender(String newGender) {
        Personne.gender = newGender;
    }

    public static void setUsername(String newUsername) {
        Personne.username = newUsername;
    }

    public static void setWeight(Float newWeight) {
        weight = newWeight;
    }
    public static void setHeight(Float newHeight) {
        height = newHeight;
    }

    public  String toString() {
        return "full name: "+fullname +" Username : "+username + " Email : "+email+
                " password : "+ password + " height : "+ height + " weight : "+ weight+ " Gender : "+ gender;
    }
}
