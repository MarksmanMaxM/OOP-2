public class Main {
    public static void main(String[] args) {

        String modelName = "car1";
        String modelName1 = "car2";
        int wheelsCount = 4;
        int wheelsCount1 = 4;
        Car car = new Car(modelName, wheelsCount);
        Car car2 = new Car(modelName1, wheelsCount1);

        String modelName2 = "truck1";
        String modelName3 = "truck2";
        int wheelsCount2 = 6;
        int wheelsCount3 = 8;
        Truck truck = new Truck(modelName2, wheelsCount2);
        Truck truck2 = new Truck(modelName3, wheelsCount3);

        String modelName4 = "bicycle1";
        String modelName5 = "bicycle2";
        int wheelsCount4 = 2;
        int wheelsCount5 = 2;
        Bicycle bicycle = new Bicycle(modelName4, wheelsCount4);
        Bicycle bicycle2 = new Bicycle(modelName5, wheelsCount5);


        car.check(car);
        car2.check(car2);
        bicycle.check(bicycle);
        bicycle2.check(bicycle2);
        truck.check(truck);
        truck2.check(truck2);
    }
}