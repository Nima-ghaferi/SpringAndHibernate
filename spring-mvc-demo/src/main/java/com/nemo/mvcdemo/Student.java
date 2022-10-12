package com.nemo.mvcdemo;

import java.util.HashMap;
import java.util.Map;

public class Student {
    private String firstName;
    private String lastName;
    private String country;
    private Map<String, String> countryOptions;
    private String favoriteLanguage;
    private Map<String, String> languageOptions;
    private String[] operatingSystems;

    public Student() {
        countryOptions = new HashMap<>();
        countryOptions.put("BR", "Brazil");
        countryOptions.put("IR", "Iran");
        countryOptions.put("US", "United States");
        countryOptions.put("FR", "France");

        languageOptions = new HashMap<>();
        languageOptions.put("C#", "C#");
        languageOptions.put("Java", "Java");
        languageOptions.put("Ruby", "Ruby");
        languageOptions.put("PHP", "PHP");
        languageOptions.put("JavaScript", "JavaScript");
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

    public Map<String, String> getCountryOptions() {
        return countryOptions;
    }

    public String getFavoriteLanguage() {
        return favoriteLanguage;
    }

    public void setFavoriteLanguage(String favoriteLanguage) {
        this.favoriteLanguage = favoriteLanguage;
    }

    public Map<String, String> getLanguageOptions() {
        return languageOptions;
    }

    public String[] getOperatingSystems() {
        return operatingSystems;
    }

    public void setOperatingSystems(String[] operatingSystems) {
        this.operatingSystems = operatingSystems;
    }
}
