package com.qajungle.services;

import com.qajungle.domain.Account;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AccountService {

    public AccountService() {

    }

    public List<Account> getAccounts() {
        List<Account> accounts = new ArrayList<>();
        accounts.add(new Account(123456789L,"aritz", "aguila", "aaguila", "seller"));
        accounts.add(new Account(111111111L, "aker", "beltz", "abeltz", "buyer"));
        return accounts;
    }

    public Account getAccountById(Long id) {
        return new Account(id, "aritz", "aguila", "aaguila", "seller");
    }

}
