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
class vehicle {
    public void sound() {
        System.out.println("Vehicle makes a sound");
    }
}
class car extends vehicle {
    public void sound() {
        System.out.println("Car goes vroom vroom");
    }
}
class bike extends vehicle {
    public void sound() {
        System.out.println("Bike goes beep beep");
    }
}
public class compileTime {
    public static void main(String[] args) {
        vehicle v;
        v = new car();
        v.sound();
        v = new bike();
        v.sound();
        
    }
}