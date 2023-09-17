package WAP;

public class InheritanceConceptWithMethodOverriding {
    protected void fun(){
        System.out.println("Parent");
    }
}

class B extends InheritanceConceptWithMethodOverriding{
    protected void fun(){
        System.out.println("Child");
    }
    public static B obj = new B();

    public static void main(String[] args) {
        obj.fun();
    }
}
