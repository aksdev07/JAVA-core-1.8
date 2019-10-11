package stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<String> deckOfPlates = new Stack<>();
        deckOfPlates.push("Plate 1");
        deckOfPlates.push("Plate 2");
        deckOfPlates.push("Plate 3");
        System.out.println(deckOfPlates);
        String recentlyRemoved = deckOfPlates.pop();
        System.out.println(recentlyRemoved);
        System.out.println(deckOfPlates);

        String peekTest = deckOfPlates.peek();
        System.out.println("peekTest = " + peekTest);
        while(!deckOfPlates.isEmpty()){
            String removedItem = deckOfPlates.pop();
            System.out.println("removedItem = " + removedItem);
            System.out.println(deckOfPlates);


        }

     /*   //this is an example of reversing a string using Stack
        String string = "I am working on Collection Framework";
        System.out.println(string);
        Stack<Character> original = new Stack<>();
       // Character reversed[] = new Character[200];
        List<Character> chars = new ArrayList<Character>();

       //        Stack<Character> reversedStack = new Stack<>();
        for (int i=0;i<string.length();i++){

                original.push(string.charAt(i));
        }
        System.out.println(original);
        for (int i=0;i<string.length();i++) chars.set(i, original.pop());

        String s=new String(String.valueOf(chars));
        System.out.println(s);*/


    }
}
