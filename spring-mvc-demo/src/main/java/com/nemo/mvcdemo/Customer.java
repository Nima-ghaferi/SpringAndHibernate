package com.nemo.mvcdemo;

import javax.validation.constraints.*;

public class Customer {

    private String firstName;
    @NotNull(message = "is required.")
    @Size(min = 1, message = "is required.")
    private String lastName;

    @NotNull(message = "is required.")
    @Min(value = 0, message = "must be greater than 0")
    @Max(value = 10, message = "must be less  than 10")
    private Integer freePasses;

    @Pattern(regexp = "^[a-zA-Z\\d]{5}", message = "Only 5 characters")
    private String postalCode;

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

    public Integer getFreePasses() {
        return freePasses;
    }

    public void setFreePasses(Integer freePasses) {
        this.freePasses = freePasses;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
}
