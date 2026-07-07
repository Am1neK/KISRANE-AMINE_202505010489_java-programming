class WashingMachine extends Appliance {

    public WashingMachine(String brand) {
        super(brand);
    }

    @Override
    public void operate() {
        System.out.println("Washing clothes...");
    }
}

class Refrigerator extends Appliance {

    public Refrigerator(String brand) {
        super(brand);
    }

    @Override
    public void operate() {
        System.out.println("Store food & beverages...");
    }
}

public class Main {

    public static void main(String[] args) {

        WashingMachine wm = new WashingMachine("LG");

        wm.displayBrand();
        wm.turnOn();
        wm.operate();
        wm.turnOff();

        System.out.println();

        Refrigerator rf = new Refrigerator("Panasonic");

        rf.displayBrand();
        rf.turnOn();
        rf.operate();
        rf.turnOff();
    }
}