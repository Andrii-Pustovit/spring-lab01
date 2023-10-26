package me.andrew0o.springlab01.items;

public class Pan extends Item {
    public Pan(String name, int height, int width) {
        super(name, height, width);
        System.out.println("Pan bean is created");
    }
}
