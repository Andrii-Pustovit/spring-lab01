package me.andrew0o.springlab01.equipment;

import org.springframework.stereotype.Component;

@Component
public class Helmet extends Equipment {
    Helmet() {
        System.out.println("Helmet bean is created");
    }
}
