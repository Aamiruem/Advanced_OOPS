package OPPS.L17Polymorphism;

public class Shape {
    public void area(double radius){
        double ar = Math.PI*Math.pow(radius, 2);
        System.out.println("Area of Circle is = " + ar);
        System.out.println("Area of Circle is = " + (3.14 * radius * radius));
    }

    public void area(int side){
        int ar = side*side;
        System.out.println("Area of Square is = " + ar);
    }

    public void area(double l, double b){
        double ar = l*b;
        System.out.println("Area of Rectangle is = " + ar);
    }
}

// area method is polymorphism
