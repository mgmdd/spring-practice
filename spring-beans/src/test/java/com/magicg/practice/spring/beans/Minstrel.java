package com.magicg.practice.spring.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.PrintStream;

@Component(value = "minstrel")
public class Minstrel {
    @Autowired
    @Value("#{T(System).out}")
    private PrintStream stream;

    public Minstrel() {
        this.stream = System.out;
    }

    public void singBeforeQuest() {
        stream.println("Fa la la, the knight is so brave!");
    }

    public void singAfterQuest() {
        stream.println("Tee hee hee, the brave knight " +
                "did embark on a quest!");
    }
}