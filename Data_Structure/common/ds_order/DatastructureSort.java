package ds_order;

public class DatastructureSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
//		System.out.println("per_person_names_f_v".toUpperCase());
		int[] array= new int[]{8,7,6, 4,5};
//		bubble(c, 0, 4);
//		shellSort(array);
//		insertSort(array);
//		sort(array, 0, array.length-1);
//		quickSort(array, 0, array.length-1);
//		insertionSort(array);
//		simpleSelectdSort(array);
//		selectSort(array);
//		sort(array, 0, array.length-1);
		
//		printArray("����ǰ��",array);
//        MergeSort(array);
//        printArray("�����",array);
		
//        sort2(array, 0, array.length-1);
        
        mergeSort3(array, 0, array.length-1);
        
        
		for(int num:array){
	       System.out.print(num + " ");
	    }

		
		
//		for(int i = 0; i<array.length; i++){
//		System.out.println("i: " +  array[i]);		
//	}
      		
//		  int[] array={1,3,2,45,65,33,12};
//	        bubble1(array);
//	        for(int num:array){
//	            System.out.print(num+" ");
//	       }
//        
	        
//	        bubbleSort1();
//	        for(int num:array){
//	            System.out.print(num+" ");
//	        }    
	}
	
	 public static void bubble(Integer[] array, int from, int end) {     
	        //��array.length - 1�ֱȽ�     
	        for (int k = 1; k < end - from + 1; k++) {     
	            //ÿ��ѭ���д����һ��Ԫ�ؿ�ʼ��ǰ���ݣ�ֱ��i=kֹ����i�����ִ�ֹ     
	            for (int i = end - from; i >= k; i--) {     
	                //����һ�ֹ��򣨺���Ԫ�ز���С��ǰ��Ԫ�أ�����     
	                if ((array[i].compareTo(array[i - 1])) < 0) {     
	                    //�������Ԫ��С���ˣ���Ȼ�Ǵ��ڻ���С��Ҫ���Ƚ���ʵ���ˣ�ǰ���Ԫ�أ���ǰ�󽻻�     
	                    swap(array, i, i - 1); 
//	                    System.out.println("i: " +  array[i]);
	                }     
	            }     
	        }    
	   }
	 
	 public static void swap(Integer[] array, int i, int j) {     
	        if (i != j) {//ֻ�в���ͬһλ��ʱ���轻��     
	            Integer tmp = array[i];     
	            array[i] = array[j];     
	            array[j] = tmp;   
	        }     
	 }
	 
	 ////////////////////////////
	 public static void bubble1(int[] array) { 
		        //ѡ��������Ż�
		        for(int a = 0; a < array.length - 1; a++) {// ����i������
		            int k = a;
		            for(int  b= k + 1; b < array.length; b++){// ѡ��С�ļ�¼
		                if(array[b] < array[k]){ 
		                    k = b; //����Ŀǰ�ҵ�����Сֵ���ڵ�λ��
		                }
		            }
		            //���ڲ�ѭ��������Ҳ�����ҵ�����ѭ������С�����Ժ��ٽ��н���
		            if(a != k){  //����a[i]��a[k]
		                int temp = array[a];
		                array[a] = array[k];
		                array[k] = temp;
		            }    
		        }
		        System.out.println();
		        System.out.println("������");
		        for(int num:array){
		            System.out.print(num+" ");
		        }
		    }
	    
	 public static void bubbleSort1(){  
	     int a[]={49,38,65,7,6,13,2};  
	    int temp=0;  
	    for(int i=0;i<a.length-1;i++){  
	        for(int j=0;j<a.length-1-i;j++){  
	        if(a[j]>a[j+1]){  
	            temp=a[j];  
	            a[j]=a[j+1];  
	            a[j+1]=temp;  
	        }  
	        }  
	    }  
	    for(int i=0;i<a.length;i++)  
	        System.out.println(a[i]);     
	} 

	 ///////////////// insertSort /////////////////
	 /**  
	     * ��������
	     * 
	     * �ӵ�һ��Ԫ�ؿ�ʼ����Ԫ�ؿ�����Ϊ�Ѿ�������
	     * ȡ����һ��Ԫ�أ����Ѿ������Ԫ�������дӺ���ǰɨ�� 
	     * �����Ԫ�أ������򣩴�����Ԫ�أ�����Ԫ���Ƶ���һλ��  
	     * �ظ�����3��ֱ���ҵ��������Ԫ��С�ڻ��ߵ�����Ԫ�ص�λ��  
	     * ����Ԫ�ز��뵽��λ����  
	     * �ظ�����2  
	     * @param numbers  ����������
	     */  
	    public static void insertSort(int[] numbers)
	    {
	    int size = numbers.length;
	    int temp = 0 ;
	    int j =  0;
	    
	    for(int i = 0 ; i < size ; i++)
	    {
	        temp = numbers[i];
	        //����temp��ǰ���ֵС����ǰ���ֵ����
	        for(j = i ; j > 0 && temp < numbers[j-1] ; j --)
	        {
	        numbers[j] = numbers[j-1];
	        }
	        numbers[j] = temp;
	    }
	    } 
	
	/////////// insertionSort ////////////
	    
//	    public static void main(String[] args) {
//			// TODO Auto-generated method stub
//			  int[] a = { 49, 38, 65, 97, 76, 13, 27, 50 };
//		        insertionSort(a);
//		        for (int i : a)
//		            System.out.print(i + " ");
//		}
//		
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
	    
	///////////////// simple selected Sort ////////////////
		public static void simpleSelectdSort(int[] list) {
			for (int i = 0; i < list.length - 1; i++) {
			        int temp = 0;
			        int index = i; // ����������Сֵ������
			 
			        // Ѱ�ҵ�i��С����ֵ
			        for (int j = i + 1; j < list.length; j++) {
			            if (list[index] > list[j]) {
			                index = j;
			            }
			        }
			 
			        // ���ҵ��ĵ�i��С����ֵ���ڵ�i��λ����
			        temp = list[index];
			        list[index] = list[i];
			        list[i] = temp;
			 
//			        System.out.println(list[index]);
//			        System.out.println("�� %d ��:\t", i + 1);
//			        printAll(list);
			 }
		}	
		
	/////////////  selectSort /////////////
		private static void selectSort(int[] a) {  
	        for(int i=0;i<a.length;i++){  
	            int k=i;//k�����Сֵ�±ꡣÿ��ѭ����Сֵ�±�+1  
	            for(int j=i+1;j<a.length;j++){//�ҵ���Сֵ�±�  
	                if(a[k]>a[j])  
	                    k=j;  
	            }  
	            swap(a,k,i);//����Сֵ�ŵ����÷ŵ�λ����  
	        }  
	    }  
	    public void print(int a[]){  
	        for(int i=0;i<a.length;i++){  
	            System.out.print(a[i]+" ");  
	        }  
	    }  
	     public static void swap(int[] data, int i, int j) {    
	            if (i == j) {    
	                return;    
	            }    
	            data[i] = data[i] + data[j];    
	            data[j] = data[i] - data[j];    
	            data[i] = data[i] - data[j];    
	        }    
		
		
	    
	//////////// shellSort /////////// 
	 public static void shellSort(Integer[] arrays){
	        if(arrays == null || arrays.length <= 1){
	            return;
	        }
	        //����
	        int incrementNum = arrays.length/2;
	        while(incrementNum >=1){
	            for(int i=0;i<arrays.length;i++){
	                //���в�������
	                for(int j=i;j<arrays.length-incrementNum;j=j+incrementNum){
	                    if(arrays[j]>arrays[j+incrementNum]){
	                        int temple = arrays[j];
	                        arrays[j] = arrays[j+incrementNum];
	                        arrays[j+incrementNum] = temple;
	                    }
	                }
	            }
	            //�����µ�����
	            incrementNum = incrementNum/2;
	        }
	    }
	 
	    
   ////////////// quick sort ////////////////////
	 public static int partition(int []array,int lo,int hi){
	        //�̶����зַ�ʽ
	        int key=array[lo];
	        while(lo<hi){
	            while(array[hi]>=key&&hi>lo){//�Ӻ�벿����ǰɨ��
	                hi--;
	            }
	            array[lo]=array[hi];
	            while(array[lo]<=key&&hi>lo){
	            	//��ǰ�벿�����ɨ��
	                lo++;
	            }
	            array[hi]=array[lo];
	        }
	        array[hi]=key;
	        return hi;
	    }
	    
	    public static void sort(int[] array,int lo ,int hi){
	        if(lo>=hi){
	            return ;
	        }
	        int index=partition(array,lo,hi);
	        sort(array,lo,index-1);
	        sort(array,index+1,hi); 
	    }
	 
	 
	    //////////////// quickSort //////////////
	    public static void quickSort(int[] a,int low,int high){
	         int start = low;
	         int end = high;
	         int key = a[low];
																      
	         while(end>start){
	             //�Ӻ���ǰ�Ƚ�
	             while(end>start&&a[end]>=key)  //���û�бȹؼ�ֵС�ģ��Ƚ���һ����ֱ���бȹؼ�ֵС�Ľ���λ�ã�Ȼ���ִ�ǰ����Ƚ�
	                 end--;
	             if(a[end]<=key){
	                 int temp = a[end];
	                 a[end] = a[start];
	                 a[start] = temp;
	             }
	             //��ǰ����Ƚ�
	             while(end>start&&a[start]<=key)//���û�бȹؼ�ֵ��ģ��Ƚ���һ����ֱ���бȹؼ�ֵ��Ľ���λ��
	                start++;
	             if(a[start]>=key){
	                 int temp = a[start];
	                 a[start] = a[end];
	                 a[end] = temp;
	             }
	         //��ʱ��һ��ѭ���ȽϽ������ؼ�ֵ��λ���Ѿ�ȷ���ˡ�
		 //��ߵ�ֵ���ȹؼ�ֵС���ұߵ�ֵ���ȹؼ�ֵ�󣬵������ߵ�˳���п����ǲ�һ���ģ���������ĵݹ����
	         }
	         //�ݹ�
	         if(start>low) sort(a,low,start-1);//������С���һ������λ�õ��ؼ�ֵ����-1
	         if(end<high) sort(a,end+1,high);//�ұ����С��ӹؼ�ֵ����+1�����һ��															   							
	     }
	    
	    
	   ////////// Merge Sort  ///////////
	    /**
	     * �鲢����
	     * ���:�����������������ϣ������ϲ���һ���µ������ ���Ѵ��������з�Ϊ���ɸ������У�ÿ��������������ġ�Ȼ���ٰ����������кϲ�Ϊ������������
	     * ʱ�临�Ӷ�ΪO(nlogn)
	     * �ȶ�����ʽ
	     * @param nums ����������
	     * @return �����������
	     */
	    public static int[] sort1(int[] nums, int low, int high) {
	        int mid = (low + high) / 2;
	        if (low < high) {
	            // ���
	            sort1(nums, low, mid);
	            // �ұ�
	            sort1(nums, mid + 1, high);
	            // ���ҹ鲢
	            merge(nums, low, mid, high);
	        }
	        return nums;
	    }

	    /**
	     * ��������low��highλ�õ�����������
	     * @param nums ����������
	     * @param low ���ŵĿ�ʼλ��
	     * @param mid �����м�λ��
	     * @param high ���Ž���λ��
	     */
	    public static void merge(int[] nums, int low, int mid, int high) {
	        int[] temp = new int[high - low + 1];
	        int i = low;// ��ָ��
	        int j = mid + 1;// ��ָ��
	        int k = 0;

	        // �ѽ�С�������Ƶ���������
	        while (i <= mid && j <= high) {
	            if (nums[i] < nums[j]) {
	                temp[k++] = nums[i++];
	            } else {
	                temp[k++] = nums[j++];
	            }
	        }

	        // �����ʣ�������������
	        while (i <= mid) {
	            temp[k++] = nums[i++];
	        }

	        // ���ұ߱�ʣ�������������
	        while (j <= high) {
	            temp[k++] = nums[j++];
	        }

	        // ���������е�������nums����
	        for (int k2 = 0; k2 < temp.length; k2++) {
	            nums[k2 + low] = temp[k2];
	        }
	    }
	    
   //////////  Merge Sort  /////////// 
	    static int number=0;
//	    public static void main(String[] args) {
//	        int[] a = {26, 5, 98, 108, 28, 99, 100, 56, 34, 1 };
//	        printArray("����ǰ��",a);
//	        MergeSort(a);
//	        printArray("�����",a);
//	    }

	    private static void printArray(String pre,int[] a) {
	        System.out.print(pre+"\n");
	        for(int i=0;i<a.length;i++)
	            System.out.print(a[i]+"\t");    
	        System.out.println();
	    }

	    private static void MergeSort(int[] a) {
	        // TODO Auto-generated method stub
	        System.out.println("��ʼ����");
	        Sort2(a, 0, a.length - 1);
	    }

	    private static void Sort2(int[] a, int left, int right) {
	        if(left>=right)
	            return;
	    
	        int mid = (left + right) / 2;
	        //��·�鲢��������������Sort����·�鲢��������д���Sort�Ϳ�����
	        Sort2(a, left, mid);
	        Sort2(a, mid + 1, right);
	        merge1(a, left, mid, right);

	    }


	    private static void merge1(int[] a, int left, int mid, int right) {
	    
	        int[] tmp = new int[a.length];
	        int r1 = mid + 1;
	        int tIndex = left;
	        int cIndex=left;
	        // ����鲢
	        while(left <=mid && r1 <= right) {
	            if (a[left] <= a[r1]) 
	                tmp[tIndex++] = a[left++];
	            else
	                tmp[tIndex++] = a[r1++];
	        }
	            // �����ʣ��Ĺ鲢
	            while (left <=mid) {
	                tmp[tIndex++] = a[left++];
	            }
	            // ���ұ�ʣ��Ĺ鲢
	            while ( r1 <= right ) {
	                tmp[tIndex++] = a[r1++];
	            }
	            
	           
	            
	            System.out.println("��"+(++number)+"������:\t");
	            // TODO Auto-generated method stub
	            //����ʱ���鿽����ԭ����
	             while(cIndex<=right){
	                    a[cIndex]=tmp[cIndex];
	                    //����м�鲢������
	                    System.out.print(a[cIndex]+"\t");
	                    cIndex++;
	                }
	             System.out.println();
	        }
	    

	      /////////////  Merge Sort    //////////////////
	    /** 
	     * �鲢���� 
	     * ���:�����������������ϣ������ϲ���һ���µ������ ���Ѵ��������з�Ϊ���ɸ������У�ÿ��������������ġ�Ȼ���ٰ����������кϲ�Ϊ������������ 
	     * ʱ�临�Ӷ�ΪO(nlogn) 
	     * �ȶ�����ʽ 
	     * @param nums ���������� 
	     * @return ����������� 
	     */  
	    public static int[] sort2(int[] nums, int low, int high) {  
	        int mid = (low + high) / 2;  
	        if (low < high) {  
	            // ���  
	            sort2(nums, low, mid);  
	            // �ұ�  
	            sort2(nums, mid + 1, high);  
	            // ���ҹ鲢  
	            merge2(nums, low, mid, high);  
	        }  
	        return nums;  
	    }  
	  
	    public static void merge2(int[] nums, int low, int mid, int high) {  
	        int[] temp = new int[high - low + 1];  
	        int i = low;// ��ָ��  
	        int j = mid + 1;// ��ָ��  
	        int k = 0;  
	  
	        // �ѽ�С�������Ƶ���������  
	        while (i <= mid && j <= high) {  
	            if (nums[i] < nums[j]) {  
	                temp[k++] = nums[i++];  
	            } else {  
	                temp[k++] = nums[j++];  
	            }  
	        }  
	  
	        // �����ʣ�������������  
	        while (i <= mid) {  
	            temp[k++] = nums[i++];  
	        }  
	  
	        // ���ұ߱�ʣ�������������  
	        while (j <= high) {  
	            temp[k++] = nums[j++];  
	        }  
	  
	        // ���������е�������nums����  
	        for (int k2 = 0; k2 < temp.length; k2++) {  
	            nums[k2 + low] = temp[k2];  
	        }  
	    }  
	  
	      
	    // �鲢�����ʵ��  
//	    public static void main(String[] args) {  
//	  
//	        int[] nums = { 2, 7, 8, 3, 1, 6, 9, 0, 5, 4 };  
//	  
//	        MergeSort.sort(nums, 0, nums.length-1);  
//	        System.out.println(Arrays.toString(nums));  
//	    }  
	    
	 
	/////////////////////////////
	    
	    /**
	     * �鲢����
	     * ƽ��O(nlogn),���O(nlogn),�O(nlogn);�ռ临�Ӷ�O(n);�ȶ�;�ϸ���
	     * @author zeng
	     *
	     */
	 
	    
	        public static void merge3(int[] a, int start, int mid, int end) {
	            int[] tmp = new int[a.length];
	            System.out.println("merge " + start + "~" + end);
	            int i = start, j = mid + 1, k = start;
	            while (i != mid + 1 && j != end + 1) {
	                if (a[i] < a[j])
	                    tmp[k++] = a[i++];
	                else
	                    tmp[k++] = a[j++];
	            }
	            while (i != mid + 1)
	                tmp[k++] = a[i++];
	            while (j != end + 1)
	                tmp[k++] = a[j++];
	            for (i = start; i <= end; i++)
	                a[i] = tmp[i];
	            for (int p : a)
	                System.out.print(p + " ");
	            System.out.println();
	        }
	     
	       public static void mergeSort3(int[] a, int start, int end) {
	            if (start < end) {
	                int mid = (start + end) / 2;
	                mergeSort3(a, start, mid);// �������
	                mergeSort3(a, mid + 1, end);// �ұ�����
	                merge3(a, start, mid, end);
	            }
	        }
	     
//	        public static void main(String[] args) {
//	            int[] b = { 49, 38, 65, 97, 76, 13, 27, 50 };
//	            mergeSort(b, 0, b.length - 1);
//	        }
	        
	        
	        

}
