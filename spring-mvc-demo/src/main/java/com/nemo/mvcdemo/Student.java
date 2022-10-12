package com.nemo.mvcdemo;

import java.util.HashMap;

public class Student {
    private String firstName;
    private String lastName;
    private String country;

    private HashMap<String, String> countryOptions;
    private String favoriteLanguage;

    public Student() {
        countryOptions = new HashMap<>();
        countryOptions.put("BR", "Brazil");
        countryOptions.put("IR", "Iran");
        countryOptions.put("US", "United States");
        countryOptions.put("FR", "France");
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public HashMap<String, String> getCountryOptions() {
        return countryOptions;
    }

    public String getFavoriteLanguage() {
        return favoriteLanguage;
    }

    public void setFavoriteLanguage(String favoriteLanguage) {
        this.favoriteLanguage = favoriteLanguage;
    }
}
