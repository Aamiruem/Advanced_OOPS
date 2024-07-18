// static
//abstract
// final
// private






// package OPPS.L23Abstract;

// class A {
//    public abstract void show(){
//     System.out.println("in show of A");
//    }
// }
// class B extends A{
//     public void show(){
//         System.out.println("in show of B");
//     }
// }
// public class Demo {
//     public static void main(String[] args) {
//         A ref = new B();
//         ref.show();
//     }
// }











package OOPS.L23Abstract;

// Define an abstract class A with an abstract method show
abstract class A {
    public abstract void show(); // Abstract method without a body
}

// Class B extends abstract class A and provides implementation for the abstract method show
class B extends A {
    public void show() {
        System.out.println("in show of B");
    }
}

// Demo class to demonstrate the use of abstract class and method
public class Demo {
    public static void main(String[] args) {
        A ref = new B(); // Create an object of class B and refer it using class A
        ref.show();      // Calls the show method of class B
    }
}
