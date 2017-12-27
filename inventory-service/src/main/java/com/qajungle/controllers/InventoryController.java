package com.qajungle.controllers;

import com.qajungle.domain.SellerInventory;
import com.qajungle.domain.dto.SellerInventoryDto;
import com.qajungle.services.InventoryService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;

@RestController
public class InventoryController {

    @Autowired
    private ModelMapper modelMapper;

    private final InventoryService inventoryService;

    public InventoryController(InventoryService inventoryService) {
        this.inventoryService = inventoryService;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/inventory/seller/{id}")
    @ResponseBody
    public SellerInventoryDto getSellerInventory(@PathVariable("id") Long id) throws Exception{
        return convertToDto(inventoryService.getSellerInventory(id));
    }

    private SellerInventoryDto convertToDto(final SellerInventory sellerInventory) {
        return modelMapper.map(sellerInventory, SellerInventoryDto.class);
    }

}
