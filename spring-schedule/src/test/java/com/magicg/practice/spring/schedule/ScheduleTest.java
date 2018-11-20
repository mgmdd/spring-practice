package com.magicg.practice.spring.schedule;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduleTest {
    @Scheduled(fixedRate = 300l)
    public void doit() {
        System.out.println("doit");
    }
}
