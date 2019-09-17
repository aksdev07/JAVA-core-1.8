package methodoverriding;

 class A {

    int i,j;
    A(){
        System.out.println("inside A");
    }
    A(int a, int b){
        i=a;
        j=b;
    }

    //display i and j
    void show(){
        System.out.println("inside class A");
        System.out.println("i = " + i);
        System.out.println("j = " + j);
    }
}

 class B extends A {
     int k,m ;
     B(){
         System.out.println("inside B");
     }
     B(int a,int b){
         k=a;
         m=b;

     }

     //display i and j

     void show() {
         System.out.println("Inside class B");
         System.out.println("i = " + k);
         System.out.println("j = " + m);
     }

 }

 public class OverRide{
    public static void main(String[] args) {
        B subOB = new B(1,2);
        subOB.show();

    }
}