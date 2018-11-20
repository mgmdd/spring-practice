package com.magicg.practice.spring.beans;

import com.magicg.practice.spring.beans.support.InventoryServiceImpl;
import com.magicg.practice.spring.beans.support.ProductServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfiguration {
    @Bean
    public InventoryService inventoryService() {
        return new InventoryServiceImpl();
    }

    @Bean
    public ProductService productService() {
        return new ProductServiceImpl(inventoryService());
    }
}
