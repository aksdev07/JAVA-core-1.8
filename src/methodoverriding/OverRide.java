package methodoverriding;

 class A {

    int i,j;
    A(int a, int b){
        i=a;
        j=b;
    }


    //display i and j
    void show(){
        System.out.println("inside class A");
        System.out.println("Value of i : " + i + "  j: " + j);
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

         System.out.println("Value of K :" + k);

     }

 }

 public class OverRide{
    public static void main(String[] args) {
        B subOB = new B(1,2,3);
        subOB.show();

    }
}