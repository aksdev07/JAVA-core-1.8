package WAP;

import java.util.ArrayList;
import java.util.HashMap;

public class FindCommonInArrayList {
    public static void main(String[] args) {
            ArrayList<Integer> arrayList = new ArrayList<>();
            ArrayList<Integer> arrayList2 = new ArrayList<>();

            arrayList.add(1);
            arrayList.add(2);
            arrayList.add(3);
            arrayList2.add(1);
            arrayList2.add(2);
            arrayList2.add(3);
            HashMap<Integer,Integer> hm = new HashMap<>();
            for (int x:arrayList){
                hm.put(x,1);

            }
            for (int x: arrayList2){
                if(hm.containsKey(x)){
                    hm.put(x,hm.get(x)+1);

                }else {
                    hm.put(x,1);
                    System.out.println("2");
                }
            }

        for (int m : hm.keySet()){
            if (hm.get(m)>=2){
                System.out.println(m);
            }
        }
    }
}
