package me.andrew0o.springlab01;

import me.andrew0o.springlab01.equipment.Equipment;

public class Character {
    private String name;
    private Equipment head;
    private Equipment body;
    private Equipment legs;

    public Character() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Equipment getHead() {
        return head;
    }

    public void setHead(Equipment head) {
        this.head = head;
    }

    public Equipment getBody() {
        return body;
    }

    public void setBody(Equipment body) {
        this.body = body;
    }

    public Equipment getLegs() {
        return legs;
    }

    public void setLegs(Equipment legs) {
        this.legs = legs;
    }
}

