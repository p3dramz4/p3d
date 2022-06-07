package tamrin_3;

public class Main {
    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();
        ICar car = carFactory.getCar("Benz");
        car.showCarDetails();
    }
}
