package com.magicg.practice.spring.beans;

public interface ProductService {
    default void doit() {
        System.out.println("ProductService doit");
    }
}
