package com.qajungle.domain;

public class Account {

    Long id;
    String name;
    String lastname;
    String login;
    String type;

    public Account() {
    }

    public Account(Long id, String name, String lastname, String login, String type) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.login = login;
        this.type = type;
    }

    public Long getId() {
        return id;
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

    public void setId(Long id) {
        this.id = id;
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
