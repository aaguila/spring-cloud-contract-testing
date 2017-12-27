package com.qajungle.gateway;

import com.qajungle.domain.Account;
import com.qajungle.domain.Item;
import com.qajungle.domain.SellerInventory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

@Component
public class AccountGateway {

    private final RestTemplate restTemplate;
    private final String accountUrl;

    public AccountGateway(RestTemplateBuilder restTemplateBuilder, @Value("${account.service.url}") String accountUrl) {
        this.restTemplate = restTemplateBuilder.build();
        this.accountUrl = accountUrl;
    }

    /**
     * Get seller inventory
     * 1.- Call Account Service for get seller account data
     * 2.- Add item list and user to return data
     *
     * @param User account id
     * @return Seller listing
     */
    public SellerInventory getSellerInventory(Long id) {

        URI uri = UriComponentsBuilder.fromUriString(accountUrl)
                .pathSegment("account/" + id)
                .build()
                .toUri();

        ResponseEntity<Account> response = restTemplate.getForEntity(uri, Account.class);

        Account seller = response.getBody();

        List<Item> items = new ArrayList<>();
        items.add(new Item("Explore It!", 1, 20.00));
        items.add(new Item("Growing Object-Oriented Software", 4, 15.00));

        return new SellerInventory(seller, items);
    }

}
