// public class compileTime {
//     public int add(int a, int b) {
//         return a + b;
//     }
//     public int add(int a, int b, int c) {
//         return a + b + c;
//     }
//     public double add(double a, double b) {
//         return a + b;
//     }
//     public static void main(String[] args) {
//         compileTime obj = new compileTime();
//         System.out.println(obj.add(2, 3));          
//         System.out.println(obj.add(2, 3, 4));    
//         System.out.println(obj.add(2.5, 3.5));     
//     }
// }


// create a class bank and overload a method deposit 
// public class compileTime {
//     public void deposit(int amount) {
//         System.out.println("Deposited amount: " + amount);
//     }
//     public void deposit(int amount, String accountType) {
//         System.out.println("Deposited amount: " + amount + " to " + accountType + " account.");
//     }
//     public void deposit(double amount) {
//         System.out.println("Deposited amount: " + amount);
//     }
//     public static void main(String[] args) {
//         compileTime bank = new compileTime();
//         bank.deposit(500);                    
//         bank.deposit(1000, "savings");       
//         bank.deposit(250.75);                 
//     }
// }
// class vehicle {
//     public void start() {
//         System.out.println("Vehicle is start with key or button");
//     }
// }
// class car extends vehicle {
//     public void start() {
//         System.out.println("Car is starts.....");
//     }
// }
// class bike extends vehicle {
//     public void start() {
//         System.out.println("Bike start with kick or button");
//     }
// } 
// public class compileTime {
//     public static void main(String[] args) {
//         vehicle v;
//         v = new car();
//         v.start();
//         v = new bike();
//         v.start();
        
//     }
// }
//  create a parent class vehicle with method sound create a subclass car and bike override the method sound with different output
// class vehicle {
//     public void sound() {
//         System.out.println("Vehicle makes a sound");
//     }
// }
// class car extends vehicle {
//     public void sound() {
//         System.out.println("Car goes vroom vroom");
//     }
// }
// class bike extends vehicle {
//     public void sound() {
//         System.out.println("Bike goes beep beep");
//     }
// }
// public class compileTime {
//     public static void main(String[] args) {
//         vehicle v;
//         v = new car();
//         v.sound();
//         v = new bike();
//         v.sound();
        
//     }
// }




abstract class vehicle{
    String brand;
    int speed;
    public  vehicle(String brand, int speed){
        this.brand = brand;
        this.speed = speed;
    }
    abstract void startEngine();
    void displayInfo(){
        System.out.println("brand: " + brand);
        System.out.println("speed : " + speed+ "km/h");

    }

}
class Car extends vehicle{
    int seats;
    public Car(String brand, int speed, int seats){
        super(brand, speed);
    }
    void startEngine(){
        System.out.println("car engine starts with push button");
        
    }
    void displayInfo(){
        super.displayInfo();
        System.out.println("seats" + seats);
    }
}
class Bike extends vehicle{
    boolean hasdiscbreak;
    public Bike(String brand, int speed,boolean hasdiscbreak){
        super(brand, speed);
        this.hasdiscbreak = hasdiscbreak;
    }
    void startEngine(){
        System.out.println("bike starts with self start");
    }
    void displayInfo(){
        super.displayInfo();
        System.out.println("discbreak?" + (hasdiscbreak ? "yes":"no"));
    }
}
class Truck extends vehicle{
    int capacity;
    public Truck(String brand, int speed,int capacity){
        super(brand, speed);
        this.capacity = capacity;

    }
    void startEngine(){
        System.out.println("engine starts with key");
    }
        void displayInfo(){
            super.displayInfo();
            System.out.println("load capacity" + capacity);
        }
    
}
public class compileTime{
    public static void main(String[] args) {
        vehicle car = new Car("toyota", 180,5);
        vehicle bike = new Bike("fr",56,true);
        vehicle truck = new Truck("VOLVO",230,5);
        System.out.println("==Car details==");
        car.startEngine();
        car.displayInfo();
        System.out.println("==bike details==");
        bike.startEngine();
        bike.displayInfo();
        System.out.println("==truck details==");
        truck.startEngine();
        truck.displayInfo();
        

    }
}