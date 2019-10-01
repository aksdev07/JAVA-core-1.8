package stringbubblesort;


public class StringBubbleSort {
        public String[] bSortMethod(String[] x){
            String temp;

            for(int j=0;j<x.length;j++) {
                for (int i = j+1; i < (x.length) ; i++) {
                        if (x[i].compareToIgnoreCase(x[j])>0) {
                        temp = x[j];
                        x[j] = x[i];
                        x[i] = temp;
                    }




                }
            }
            return x;
        }

        public static void main(String[] args) {
            String[] a={"Now", "is", "time","for","all","good","men","to","come","to", "the"  ,"aid","of","their","country"};
            StringBubbleSort ref=new StringBubbleSort();
            for(int i=0;i<a.length;i++){
                //System.out.println(a[i]);
            }
            System.out.println(" ");
            a=ref.bSortMethod(a);
            for(int i=0;i<a.length;i++){
                System.out.println(a[i]);
            }

        }
    }


