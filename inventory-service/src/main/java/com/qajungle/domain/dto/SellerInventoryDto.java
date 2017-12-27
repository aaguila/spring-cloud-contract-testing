package com.qajungle.domain.dto;

import com.qajungle.domain.Account;
import com.qajungle.domain.Item;

import java.util.List;

public class SellerInventoryDto {

    Account account;
    List<Item> items;

    public SellerInventoryDto() {
    }

    public SellerInventoryDto(Account account, List<Item> items) {
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
