class Computer {
    String brand;

    Computer(String brand) {
        this.brand = brand;
    }

    void boot() {
        System.out.println(brand + " is booting up.");
    }

    void shutDown() {
        System.out.println(brand + " is shutting down.");
    }
}

class Laptop extends Computer {
    double screenSize;

    Laptop(String brand, double screenSize) {
        super(brand);
        this.screenSize = screenSize;
    }

    void sleepMode(){
        System.out.println(brand + " is entering sleep mode.");
    }
}

class SmartPhone extends Computer {
    String operatingSystem;

    SmartPhone(String brand, String operatingSystem) {
        super(brand);
        this.operatingSystem = operatingSystem;
    }

    void call() {
        System.out.println("Making a call on " + brand + " running " + operatingSystem + ".");
    }


    public static void main(String[] args) {
        Laptop laptop = new Laptop("Dell", 15.6);
        SmartPhone smartphone = new SmartPhone("iPhone", "iOS");

        // Demonstrating methods of the Laptop class
        laptop.boot();
        laptop.sleepMode();
        laptop.shutDown();

        System.out.println();

        // Demonstrating methods of the SmartPhone class
        smartphone.boot();
        smartphone.call();
        smartphone.shutDown();
}
}

