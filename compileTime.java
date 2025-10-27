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
public class compileTime {
    public void deposit(int amount) {
        System.out.println("Deposited amount: " + amount);
    }
    public void deposit(int amount, String accountType) {
        System.out.println("Deposited amount: " + amount + " to " + accountType + " account.");
    }
    public void deposit(double amount) {
        System.out.println("Deposited amount: " + amount);
    }
    public static void main(String[] args) {
        compileTime bank = new compileTime();
        bank.deposit(500);                    
        bank.deposit(1000, "savings");       
        bank.deposit(250.75);                 
    }
}