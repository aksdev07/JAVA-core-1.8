package WAP.JPMC;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindSumCombination {
    public int c=0;

    public List<List<Integer>> combinationSum(int[] n, int target){
        if(n==null)
            return null;
        List<List<Integer>> result= new ArrayList<>();
        getCombinations(n,0,target,new ArrayList<>(), result);
        System.out.println( Arrays.stream(result.stream().toArray()).count());
        return result;
    }

    public void getCombinations(int[] n, int index, int target, List<Integer> current, List<List<Integer>> result){
          if(target==0){
              result.add(new ArrayList<>(current));
              return;
          }

          for (int i=index; i<n.length;i++){
               if (i>index && n[i]==n[i-1]){
                   continue;
               }
              if(n[i]<=target){
                  current.add(n[i]);
                  getCombinations(n,i+1,target-n[i],current,result);
             current.remove(current.size()-1);
             c++;
              }
          }
        //System.out.println(c);
    }

    public static void main(String[] args) {
       // int[] n = {-3,-5,1,3,2,4,8,5,6};
        int[] n = {-1,3,2,9,-1};
        FindSumCombination obj = new FindSumCombination();
        System.out.println( obj.combinationSum(n,2));

    }
}
