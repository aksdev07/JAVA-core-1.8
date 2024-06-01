package interfaces;

public interface HelloWorldInterface extends SuperHello {
     void fun();
    default void printk(){
        System.out.println("print()");
    }
    default void prints(){
        System.out.println("prints()");
    }
}
