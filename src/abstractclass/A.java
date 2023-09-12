package abstractclass;

abstract class A {
    public void run(){
        System.out.printf("class A");
    }
}

class B extends A{
    public void run(){
        System.out.println("class B");
    }

}

class C{
    public static void main(String[] args) {
        B obj = new B();
        obj.run();
    }
}
