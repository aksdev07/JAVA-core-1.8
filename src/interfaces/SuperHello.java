package interfaces;

public interface SuperHello {
    void superPrint();
    default void superHelloPrint(){
        System.out.println("default superHelloPrint");
    }
}
