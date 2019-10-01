package intbubblesort;

public class BubbleSorting {
    public int[] bSortMethod(int[] x){
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
        int a[]={5,4,3,2,1};
        BubbleSorting ref=new BubbleSorting();
        for(int i=0;i<a.length-1;i++){
            System.out.print(a[i]);
        }
        System.out.println(" ");
        a=ref.bSortMethod(a);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]);
        }

    }
}
