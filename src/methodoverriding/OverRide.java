package methodoverriding;

 class A {

    int i,j;
    A(int a, int b){
        System.out.println("inside A");
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
     int k;

     B(int a,int b ,int c){
         super(a,b);
         k=c;


     }

     //display k

     void show() {
         System.out.println("Inside class B");
         System.out.println("k = " + k);

     }

 }

 public class OverRide{
    public static void main(String[] args) {
        B subOB = new B(1,2,3);
        subOB.show();

    }
}