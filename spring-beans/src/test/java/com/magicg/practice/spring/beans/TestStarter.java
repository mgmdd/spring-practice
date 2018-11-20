package com.magicg.practice.spring.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStarter {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath*:spring/*.xml");
        InventoryService inventoryService = context.getBean("inventoryservice", InventoryService.class);
        inventoryService.doit();
    }
}
