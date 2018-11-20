package com.magicg.practice.spring.beans.support;

import com.magicg.practice.spring.beans.InventoryService;
import com.magicg.practice.spring.beans.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceImpl implements ProductService {
    @Autowired
    private InventoryService inventoryService;

    public ProductServiceImpl(InventoryService inventoryService) {
        this.inventoryService = inventoryService;
    }
}
