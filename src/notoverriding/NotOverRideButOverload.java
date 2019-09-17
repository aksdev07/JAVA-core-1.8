package notoverriding;
class A{
    int i,j;
    A(int a, int b){
        i=a;
        j=b;
    }
    void show(){
        System.out.println("Value of i : " + i + "  j: " + j);
    }
}

class B extends A{
    int k;
    B(int a, int b, int c){
        super(a,b);
        k=c;
    }

    void show(String s){
        System.out.println(s + k);
    }
}
public class NotOverRideButOverload {
    public static void main(String[] args) {
        B subOb = new B(1,2,3);
        subOb.show("value of k ");
        subOb.show();
    }
}
