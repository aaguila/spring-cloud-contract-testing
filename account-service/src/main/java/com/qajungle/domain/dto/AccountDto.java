package com.qajungle.domain.dto;

public class AccountDto {

    String name;
    String lastname;
    String login;
    String type;

    public AccountDto() {
    }

    public AccountDto(String name, String lastname, String login, String type) {
        this.name = name;
        this.lastname = lastname;
        this.login = login;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public String getLogin() {
        return login;
    }

    public String getType() {
        return type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setType(String type) {
        this.type = type;
    }
}
