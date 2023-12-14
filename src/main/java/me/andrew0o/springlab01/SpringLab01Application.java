package me.andrew0o.springlab01;

import me.andrew0o.springlab01.items.Item;
import me.andrew0o.springlab01.items.Note;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringLab01Application {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("me.andrew0o.springlab01");

        Character character = context.getBean("character", Character.class);

        System.out.println("-------------------------------");
        System.out.printf("Vest pocket size is %d x %d\n", character.getBody().getPocket().getHeight(), character.getBody().getPocket().getWidth());
        System.out.printf("Vest pocket contain a %s\n", character.getBody().getPocket().getItem().getName());
        System.out.printf("Pants pocket size is %d x %d\n", character.getLegs().getPocket().getHeight(), character.getLegs().getPocket().getWidth());
        System.out.printf("Character's name is %s!\n", character.getName());
        System.out.println("-------------------------------");
        Item note = new Note("Just note", 2, 2);
        character.getLegs().getPocket().setItem(note);
    }
}
