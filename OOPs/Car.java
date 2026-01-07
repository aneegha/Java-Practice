public class Car {
    String manufacture;
    String model;
    int year;

    public Car(String manufacture, String model, int year) {
        this.manufacture = manufacture;
        this.model = model;
        this.year = year;
    }

    public void startEngine() {
        System.out.println("The " + year + " " + manufacture + " " + model + "'s engine is started.");
    }

    public void displayInfo() {
        System.out.println("Car info: " + manufacture + " " + model + " (" + year + ")");
    }
}
