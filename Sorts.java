public class Sorts{
    /**Bubble sort of an int array. 
    *@postcondition The array will be modified such that the elements will be in increasing order.
    *@param data  the elements to be sorted.
    */
    public static void bubbleSort(int[] data){
        for (int i = 0; i < data.length; i++) {
            int a = 0;
            int b = 0;
            int c = 0;
            for (int j = 0; j < data.length-i-1; j++) {
                a = data[j];
                b = data[j+1];
                if (a > b) {
                    c = data[j+1];
                    data[j+1] = a;
                    data[j] = c;
                }
            }
        }
    }

    public static void main(String[] args) {
        // int[] a = new int[]{2,3,4,5,1};
        // for (int i = 0; i < 5; i++) {
        //     System.out.print(a[i] + " ");
        // }
        // bubbleSort(a);
        // System.out.println();
        // for (int i = 0; i < 5; i++) {
        //     System.out.print(a[i] + " ");
        // }

        
        // int[] b = new int[]{23,12,90,3,4};
        // for (int i = 0; i < 5; i++) {
        //     System.out.print(b[i] + " ");
        // }
        // bubbleSort(b);
        // System.out.println();
        // for (int i = 0; i < 5; i++) {
        //     System.out.print(b[i] + " ");
        // }
    }
  }