package interfaces;

public class HelloWordInterface implements HelloWorldInterface{


//    @Override
//    public void printk() {
//        HelloWorldInterface.super.printk();
//    }


    public void fun() {
        System.out.println(" ");
    }

    @Override
    public void prints() {
        HelloWorldInterface.super.prints();
    }

    @Override
    public void superPrint() {
        System.out.println("superPrint");
    }

    public static void main(String[] args) {
        HelloWordInterface obj = new HelloWordInterface();
        obj.fun();
        obj.prints();
        obj.printk();
        obj.superHelloPrint();
    }
}
