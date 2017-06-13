package ds_order;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int[] a = { 49, 38, 65, 97, 76, 13, 27, 50 };
	        insertionSort(a);
	        for (int i : a)
	            System.out.print(i + " ");
	}
	
	public static void insertionSort(int[] a) {
        int tmp;
        for (int i = 1; i < a.length; i++) {
            for (int j = i; j > 0; j--) {
                if (a[j] < a[j - 1]) {
                    tmp = a[j - 1];
                    a[j - 1] = a[j];
                    a[j] = tmp;
                }
            }
        }
    }

}


