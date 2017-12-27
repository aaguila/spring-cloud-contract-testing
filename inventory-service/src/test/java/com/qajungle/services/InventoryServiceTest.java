package com.qajungle.services;

import com.qajungle.domain.SellerInventory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.contract.stubrunner.spring.AutoConfigureStubRunner;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureStubRunner(ids = "com.qajungle:account-service:+:stubs:8082", workOffline = true)
public class InventoryServiceTest {

    @Autowired
    private InventoryService inventoryService;
    public static final Long sellerId = 123456789L;

    @Test
    public void should_return_seller_information() throws Exception {
        //when
        SellerInventory sellerInventory = inventoryService.getSellerInventory(sellerId);

        //then
        assertThat(sellerInventory.getAccount().getName()).isEqualTo("aritz");
        assertThat(sellerInventory.getAccount().getLastname()).isEqualTo("aguila");
        assertThat(sellerInventory.getAccount().getType()).isEqualTo("seller");
        assertThat(sellerInventory.getAccount().getLogin()).isEqualTo("aaguila");
    }

}
