package com.groupeisi.metier;

import java.io.Serializable;

public class EmployeeDto implements Serializable {

    private String firstname;
    private String lastname;

    public EmployeeDto() {
    }

    public EmployeeDto(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
