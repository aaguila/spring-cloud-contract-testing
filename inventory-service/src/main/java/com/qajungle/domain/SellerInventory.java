package com.qajungle.domain;

import java.util.List;

public class SellerInventory {

    Account account;
    List<Item> items;

    public SellerInventory() {
    }

    public SellerInventory(Account account, List<Item> items) {
        this.account = account;
        this.items = items;
    }

    public Account getAccount() {
        return account;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}
