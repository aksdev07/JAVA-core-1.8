package enumeration;

public class Temple {
    enum TempleName{
        Shiv, Hanuman, Shankar, Krishna
    }

    public static void main(String[] args) {
        TempleName t;
        t = TempleName.Hanuman;
        if (t == TempleName.Shiv) {
            System.out.println(t);
        } else {
            System.out.println("t contains something else");
            t = TempleName.Shiv;
        }
        System.out.println(t);

        switch (t) {
            case Shiv:
                System.out.println("Caught Shiv Temple");

        }

    }
}
