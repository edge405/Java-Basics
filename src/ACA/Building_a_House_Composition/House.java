package ACA.Building_a_House_Composition;

import java.util.ArrayList;
import java.util.List;

public class House {

    private LivingRoom livingRoom;
    private Bedroom bedroom;
    private Kitchen kitchen;

    public House() {
        livingRoom = new LivingRoom();
        bedroom = new Bedroom();
        kitchen = new Kitchen();
    }

    public double getTotalArea() {
        double totalArea = livingRoom.getArea() + bedroom.getArea() + kitchen.getArea();
        return totalArea;
    }
}
