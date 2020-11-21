class Car {

    // instance field
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    // constructor
    public Car(String name, int cylinders) {
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.name = name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName(){
        return name;
    }

    public void startEngine() {
        System.out.println("Car engine is starting!");
    }

    public void accelerate() {
        System.out.println("Car is accelerating for speed!");
    }

    public void brake() {
        System.out.println("Car is applying brake!");
    }

}
// 1st sub class
class Hyundai extends Car {
    public Hyundai(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public void startEngine() {
        System.out.println(getClass().getSimpleName() + " engine is starting!");
    }

    @Override
    public void accelerate() {
        System.out.println(getClass().getSimpleName() + " is accelerating for speed!");
    }

    @Override
    public void brake() {
        System.out.println(getClass().getSimpleName() + " is applying brake!");
    }
}

// 2nd sub class
class Toyota extends Car{
    public Toyota(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public void startEngine() {
        System.out.println(getName() + " engine is starting!");
    }

    @Override
    public void accelerate() {
        System.out.println(getName() + " is accelerating for speed!");
    }

    @Override
    public void brake() {
        System.out.println(getName() + " is applying brake!");
    }
}

// 3rd sub class
class Audi extends Car{
    public Audi(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public void startEngine() {
        System.out.println(getName() + " engine is starting!");
    }

    @Override
    public void accelerate() {
        System.out.println(getName() + " is accelerating for speed!");
    }

    @Override
    public void brake() {
        System.out.println(getName() + " is applying brake!");
    }
}

//main class
public class Main {
    public static void main(String [] args){
        Car car = new Car("A7",10);
        car.startEngine();
        car.accelerate();
        car.brake();

        Hyundai creta = new Hyundai("Creta",12);
        creta.startEngine();
        creta.accelerate();
        creta.brake();

        Toyota fortuner = new Toyota("Fortuner",20);
        fortuner.startEngine();
        fortuner.accelerate();
        fortuner.brake();

        Audi A7 = new Audi("A7",6);
        A7.startEngine();
        A7.accelerate();
        A7.brake();
    }
}