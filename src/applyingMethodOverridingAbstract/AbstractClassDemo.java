package applyingMethodOverridingAbstract;


abstract class Figure{
    double dim1;
    double dim2;
        Figure(double a, double b){
             dim1=a;
             dim2=b;
    }
     abstract double areaCal();
        abstract double circleArea();
    void callMeToo(){
        System.out.println("inside super class");
    }
}

class Triangle extends Figure{
    Triangle(double a, double b){
        super(a,b);
    }
    double areaCal(){
                return (0.5)*dim1*dim2;
    }

    @Override
    double circleArea() {
        return 0;
    }
}

class Rectangle extends Figure{
    Rectangle(double a, double b){
        super(a,b);
    }
    double areaCal(){
        return dim1*dim2;
    }

    @Override
    double circleArea() {
        return 0;
    }
}

class Circle extends Figure{
    Circle(double r, double h){
        super(r,h);
    }

    @Override
    double circleArea() {

        return (3.14)*dim1*dim1*dim2;
    }

    @Override
    double areaCal() {
        return 0;
    }
}

public class AbstractClassDemo {
    public static void main(String[] args) {
        Figure ref;
        Triangle t=new Triangle(3,4);
        Rectangle r = new Rectangle(4,3);
        Circle c =new Circle(2,3);
        ref= t;
        System.out.println(ref.areaCal());
        ref=r;
        System.out.println(ref.areaCal());
        ref.callMeToo();
        ref =c;
        System.out.println(ref.circleArea());


    }
}
