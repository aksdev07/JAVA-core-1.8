package WAP;

import java.util.ArrayList;

public class PrintTheDifference {
    //asked on 5th Aug 2024 PS
    public static void main ( String[] args ) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(7);
        list2.add(1);
        list2.add(6);
        list2.add(8);
        for(int i=0;i<list1.size();i++){
            if((list1.get(i)==list2.get(i) )){

            }else
            {
                System.out.println(list1.get(i)+" , "+list2.get(i));
            }
        }

    }
}
