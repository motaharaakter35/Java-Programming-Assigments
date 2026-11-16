class Vehicle {
    void start() {
        System.out.println("Vehicle is starting");
    }
}

class Car extends Vehicle {
    void display() {
        System.out.println("This is a Car");
    }
}

class Bike extends Vehicle {
    void display() {
        System.out.println("This is a Bike");
    }
}

class Truck extends Vehicle {
    void display() {
        System.out.println("This is a Truck");
    }
}

public class Vehicleclass {
    public static void main(String[] args) {

        Car c = new Car();
        Bike b = new Bike();
        Truck t = new Truck();

        c.start();
        c.display();

        b.start();
        b.display();

        t.start();
        t.display();
    }
}