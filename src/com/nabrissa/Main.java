package com.nabrissa;

public class Main {

    public static void main(String[] args) {

        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case pcCase = new Case("220B", "Dell", "240", dimensions);
        Monitor monitor = new Monitor("27inch Beast", "Acer", 27, new Resolution(2540, 1440));
        Motherboard motherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");

        PC pc = new PC(pcCase,monitor,motherboard);

//        pc.getMonitor().drawPixelAt(1500, 1200,"red");
//        pc.getMotherboard().loadProgram("Windows 95");
//        pc.getPcCase().pressPowerButton();

        pc.powerUp();


        // Challenge
        // Create a single room of a house using composition
        // Think about the things that should be included in the room
        // Maybe physical parts of the house but furniture as well
        // Add at least one method to access an object via a getter and
        // then add at least one method to hide the object e.g. not using a getter
        // but to access the object used in composition within the main class
        // like you saw in this video.

        


    }
}
