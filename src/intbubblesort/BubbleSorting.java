package intbubblesort;

public class BubbleSorting {
    private int[] bSortMethod(int[] x){
        int temp;

        for(int j=0;j<x.length-1;j++) {
            for (int i = 0; i < (x.length) - 1; i++) {

                if (x[i] > x[i + 1]) {
                    temp = x[i];
                    x[i] = x[i + 1];
                    x[i + 1] = temp;
                }
            }
        }
            return x;
    }


    public static void main(String[] args) {
        int[] a={5,4,4,3,2,1};
        BubbleSorting ref=new BubbleSorting();
    //This displays the initial array
        for(int b:a)
            System.out.print(b);
        System.out.println(" ");
        //This displays after being sorted
        for(int b:ref.bSortMethod(a))
        System.out.print(b);

    }
}
