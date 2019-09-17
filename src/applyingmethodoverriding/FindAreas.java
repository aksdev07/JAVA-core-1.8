package applyingmethodoverriding;



//Creating a reusable super class for all of its subclass
class Figure{
    int dim1;
    int dim2;

    Figure(int a, int b){
        dim1=a;
        dim2=b;
    }
    //If there is no overridden method present in the subclass then this(super) method will be called by default
    double showArea(){
        System.out.println("no area has been defined");
        return 0;
    }
}
class Rectangle extends Figure{
    Rectangle(int a, int b){
        //super method will initialize the value of dim1 and dim2 of super class
        super(a,b);
    }
    double showArea(){
        System.out.println("Area of Rectangle : ");
        return dim1*dim2;
    }
}
class Triangle extends Figure{

    Triangle(int a, int b){
        //super method will initialize the value of dim1 and dim2 of super class
        super(a,b);
    }
    double showArea(){
        System.out.println("Area of triangle : ");
        return (0.5*dim1)*dim2;
    }
}

public class FindAreas {
    public static void main(String[] args) {
        Figure f =new Figure(10,10);
        Figure r = new Rectangle(6,4);
        Figure t =new Triangle(3,5);

        //super class type of reference is created
        Figure ref;

        //super class type of reference is pointing to its subclass --> rectangle
        ref =r;
        System.out.println(r.showArea());

        //super class type of reference is pointing to its subclass --> Triangle
        ref =t;
        System.out.println(ref.showArea());

        ref = f;
        System.out.println(ref.showArea());
    }
}
