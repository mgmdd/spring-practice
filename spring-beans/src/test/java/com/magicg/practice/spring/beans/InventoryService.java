package com.magicg.practice.spring.beans;

public interface InventoryService {
    default void doit() {
        System.out.println("Inventory service doit");
    }
}
