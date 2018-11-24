package com.magicg.practice.spring.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import java.io.PrintStream;

@Component(value = "minstrel")
@PropertySource("classpath:test.properties")
public class Minstrel {
    @Autowired
    @Value("#{T(System).out}")
    private PrintStream stream;

    @Autowired
    private Environment environment;

    public Minstrel() {
        this.stream = System.out;
    }

    public void singBeforeQuest() {
        System.out.println(environment.getProperty("abc"));
        System.out.println(environment.getProperty("java.version"));
        for (String activeProfile : environment.getActiveProfiles()) {
            System.out.println(activeProfile);
        }
        stream.println("Fa la la, the knight is so brave!");
    }

    public void singAfterQuest() {
        stream.println("Tee hee hee, the brave knight " +
                "did embark on a quest!");
    }
}