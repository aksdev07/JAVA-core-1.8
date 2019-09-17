package dynamicdispatchmethod;
/*
    overridden methods are called on the basis of type of the object
    and not on the basis of reference variable

 */



class A{
    void show(){
        System.out.println("inside class A");
    }
}

class B extends A{
    void show(){
        System.out.println("inside class B");
    }
}

class C extends B{
    void show(){
        System.out.println("inside class C");
    }
}

public class RuntimePolymorphism {
    public static void main(String[] args) {
        A a=new A();
        B b=new B();
        C c=new C();

        A r;
        r=a;
        r.show();

        r=b;
        r.show();

        r=c;
        r.show();
    }
}
