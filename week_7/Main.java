class WashingMachine extends Appliances {
    public WashingMachine(String brand) {
        super(brand);
    }

    
    public void operate() {
        System.out.println("Washing clothes");
    }
}

class Refrigerator extends Appliances {
    public Refrigerator(String brand) {
        super(brand);
    }

    
    public void operate() {
        System.out.println("Store food ");
    }
}

class AirConditioner extends Appliances {
    public AirConditioner(String brand) {
        super(brand);
    }

    @Override
    public void operate() {
        System.out.println("Cooling the room");
    }
}

class Microwave extends Appliances {
    public Microwave(String brand) {
        super(brand);
    }

    
    public void operate() {
        System.out.println("Heating food...");
    }
}

public class Main {

    public static void main(String[] args) {

        WashingMachine washingMachine = new WashingMachine("LG");
        washingMachine.displayBrand();
        washingMachine.turnOn();
        washingMachine.operate();
        washingMachine.turnOff();

        System.out.println();

        Refrigerator refrigerator = new Refrigerator("Panasonic");
        refrigerator.displayBrand();
        refrigerator.turnOn();
        refrigerator.operate();
        refrigerator.turnOff();

        System.out.println();

        AirConditioner airConditioner = new AirConditioner("Toshiba");
        airConditioner.displayBrand();
        airConditioner.turnOn();
        airConditioner.operate();
        airConditioner.turnOff();

        System.out.println();

        Microwave microwave = new Microwave("Samsung");
        microwave.displayBrand();
        microwave.turnOn();
        microwave.operate();
        microwave.turnOff();
    }
}