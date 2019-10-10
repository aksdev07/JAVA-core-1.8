package linkedlist;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> students=new LinkedList<>();
        students.add("Anuj");
        students.add("Suraj");
        students.add("Vijay");
        students.add("Ram");
        students.add("Saurav");

        students.addFirst("Arun");
        students.addLast("Ramesh");
        students.add(3,"Suresh");

        String firstStudent = students.getFirst();
        System.out.println("First "+firstStudent);

        String lastStudent = students.getLast();
        System.out.println("Last "+lastStudent);

        System.out.println(students);
        System.out.println("Size of the linked List "+students.size());

        int i=students.indexOf("Anuj");
        System.out.println(i);

        students.remove(i);
        students.removeFirst();
        students.removeLast();
        students.remove("Ramesh");
        System.out.println(students);
        System.out.println(students.size());

        boolean hasAnuj=students.contains("Anuj");
        System.out.println(hasAnuj);

        boolean hasSaurav = students.contains("Saurav");
        System.out.println(hasSaurav);

        students.clear();
        System.out.println(students);


    }

}
