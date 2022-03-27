package Composition;

public class Bedroom {
    private Wall wall1, wall2, wall3, wall4;
    private String name;
    private Ceiling ceiling;
    private Bed bed;
    private Lamp lamp;

    public Bedroom(Wall wall1, Wall wall2, Wall wall3, Wall wall4, String name, Ceiling ceiling, Bed bed, Lamp lamp) {
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.name = name;
        this.ceiling = ceiling;
        this.bed = bed;
        this.lamp = lamp;
    }

    public Lamp getLamp() {
        return lamp;
    }

    public void makeBed() {
        System.out.println("The bed is being made");
        bed.make();

    }
}
