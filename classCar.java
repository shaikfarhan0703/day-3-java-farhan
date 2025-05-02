public class Car {

    // Method to display car details
    void displayDetails(String showroomName, String modelName, int price) {
        System.out.println("Showroom Name : " + showroomName);
        System.out.println("Car Model : " + modelName);
        System.out.println("Car Price : " + price);
        System.out.println("-------------------------");
    }

    public static void main(String[] args) {
        // Creating an object of Car
        Car car = new Car();

        // Calling the method with different data
        car.displayDetails("Elite Motors", "Tesla Model S", 80000);
        car.displayDetails("Elite Motors", "BMW X5", 75000);
    }
}