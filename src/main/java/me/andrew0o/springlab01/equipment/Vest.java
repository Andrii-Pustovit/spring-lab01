package me.andrew0o.springlab01.equipment;

import me.andrew0o.springlab01.Pocket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Vest extends Equipment {
    public Vest(){
        System.out.println("Vest bean is created");
    }
    @Autowired
    @Qualifier("largePocket")
    public void setPocket(Pocket pocket) {
        super.setPocket(pocket);
    }
}
