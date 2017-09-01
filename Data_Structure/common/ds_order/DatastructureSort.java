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
		
//		printArray("排序前：",array);
//        MergeSort(array);
//        printArray("排序后：",array);
		
        sort2(array, 0, array.length-1);
        
        
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
	        //需array.length - 1轮比较     
	        for (int k = 1; k < end - from + 1; k++) {     
	            //每轮循环中从最后一个元素开始向前起泡，直到i=k止，即i等于轮次止     
	            for (int i = end - from; i >= k; i--) {     
	                //按照一种规则（后面元素不能小于前面元素）排序     
	                if ((array[i].compareTo(array[i - 1])) < 0) {     
	                    //如果后面元素小于了（当然是大于还是小于要看比较器实现了）前面的元素，则前后交换     
	                    swap(array, i, i - 1); 
//	                    System.out.println("i: " +  array[i]);
	                }     
	            }     
	        }    
	   }
	 
	 public static void swap(Integer[] array, int i, int j) {     
	        if (i != j) {//只有不是同一位置时才需交换     
	            Integer tmp = array[i];     
	            array[i] = array[j];     
	            array[j] = tmp;   
	        }     
	 }
	 
	 ////////////////////////////
	 public static void bubble1(int[] array) { 
		        //选择排序的优化
		        for(int a = 0; a < array.length - 1; a++) {// 做第i趟排序
		            int k = a;
		            for(int  b= k + 1; b < array.length; b++){// 选最小的记录
		                if(array[b] < array[k]){ 
		                    k = b; //记下目前找到的最小值所在的位置
		                }
		            }
		            //在内层循环结束，也就是找到本轮循环的最小的数以后，再进行交换
		            if(a != k){  //交换a[i]和a[k]
		                int temp = array[a];
		                array[a] = array[k];
		                array[k] = temp;
		            }    
		        }
		        System.out.println();
		        System.out.println("交换后：");
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
	     * 插入排序
	     * 
	     * 从第一个元素开始，该元素可以认为已经被排序
	     * 取出下一个元素，在已经排序的元素序列中从后向前扫描 
	     * 如果该元素（已排序）大于新元素，将该元素移到下一位置  
	     * 重复步骤3，直到找到已排序的元素小于或者等于新元素的位置  
	     * 将新元素插入到该位置中  
	     * 重复步骤2  
	     * @param numbers  待排序数组
	     */  
	    public static void insertSort(int[] numbers)
	    {
	    int size = numbers.length;
	    int temp = 0 ;
	    int j =  0;
	    
	    for(int i = 0 ; i < size ; i++)
	    {
	        temp = numbers[i];
	        //假如temp比前面的值小，则将前面的值后移
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
			        int index = i; // 用来保存最小值得索引
			 
			        // 寻找第i个小的数值
			        for (int j = i + 1; j < list.length; j++) {
			            if (list[index] > list[j]) {
			                index = j;
			            }
			        }
			 
			        // 将找到的第i个小的数值放在第i个位置上
			        temp = list[index];
			        list[index] = list[i];
			        list[i] = temp;
			 
//			        System.out.println(list[index]);
//			        System.out.println("第 %d 趟:\t", i + 1);
//			        printAll(list);
			 }
		}	
		
	/////////////  selectSort /////////////
		private static void selectSort(int[] a) {  
	        for(int i=0;i<a.length;i++){  
	            int k=i;//k存放最小值下标。每次循环最小值下标+1  
	            for(int j=i+1;j<a.length;j++){//找到最小值下标  
	                if(a[k]>a[j])  
	                    k=j;  
	            }  
	            swap(a,k,i);//把最小值放到它该放的位置上  
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
	        //增量
	        int incrementNum = arrays.length/2;
	        while(incrementNum >=1){
	            for(int i=0;i<arrays.length;i++){
	                //进行插入排序
	                for(int j=i;j<arrays.length-incrementNum;j=j+incrementNum){
	                    if(arrays[j]>arrays[j+incrementNum]){
	                        int temple = arrays[j];
	                        arrays[j] = arrays[j+incrementNum];
	                        arrays[j+incrementNum] = temple;
	                    }
	                }
	            }
	            //设置新的增量
	            incrementNum = incrementNum/2;
	        }
	    }
	 
	    
   ////////////// quick sort ////////////////////
	 public static int partition(int []array,int lo,int hi){
	        //固定的切分方式
	        int key=array[lo];
	        while(lo<hi){
	            while(array[hi]>=key&&hi>lo){//从后半部分向前扫描
	                hi--;
	            }
	            array[lo]=array[hi];
	            while(array[lo]<=key&&hi>lo){
	            	//从前半部分向后扫描
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
	             //从后往前比较
	             while(end>start&&a[end]>=key)  //如果没有比关键值小的，比较下一个，直到有比关键值小的交换位置，然后又从前往后比较
	                 end--;
	             if(a[end]<=key){
	                 int temp = a[end];
	                 a[end] = a[start];
	                 a[start] = temp;
	             }
	             //从前往后比较
	             while(end>start&&a[start]<=key)//如果没有比关键值大的，比较下一个，直到有比关键值大的交换位置
	                start++;
	             if(a[start]>=key){
	                 int temp = a[start];
	                 a[start] = a[end];
	                 a[end] = temp;
	             }
	         //此时第一次循环比较结束，关键值的位置已经确定了。
		 //左边的值都比关键值小，右边的值都比关键值大，但是两边的顺序还有可能是不一样的，进行下面的递归调用
	         }
	         //递归
	         if(start>low) sort(a,low,start-1);//左边序列。第一个索引位置到关键值索引-1
	         if(end<high) sort(a,end+1,high);//右边序列。从关键值索引+1到最后一个															   							
	     }
	    
	    
	   ////////// Merge Sort  ///////////
	    /**
	     * 归并排序
	     * 简介:将两个（或两个以上）有序表合并成一个新的有序表 即把待排序序列分为若干个子序列，每个子序列是有序的。然后再把有序子序列合并为整体有序序列
	     * 时间复杂度为O(nlogn)
	     * 稳定排序方式
	     * @param nums 待排序数组
	     * @return 输出有序数组
	     */
	    public static int[] sort1(int[] nums, int low, int high) {
	        int mid = (low + high) / 2;
	        if (low < high) {
	            // 左边
	            sort1(nums, low, mid);
	            // 右边
	            sort1(nums, mid + 1, high);
	            // 左右归并
	            merge(nums, low, mid, high);
	        }
	        return nums;
	    }

	    /**
	     * 将数组中low到high位置的数进行排序
	     * @param nums 待排序数组
	     * @param low 待排的开始位置
	     * @param mid 待排中间位置
	     * @param high 待排结束位置
	     */
	    public static void merge(int[] nums, int low, int mid, int high) {
	        int[] temp = new int[high - low + 1];
	        int i = low;// 左指针
	        int j = mid + 1;// 右指针
	        int k = 0;

	        // 把较小的数先移到新数组中
	        while (i <= mid && j <= high) {
	            if (nums[i] < nums[j]) {
	                temp[k++] = nums[i++];
	            } else {
	                temp[k++] = nums[j++];
	            }
	        }

	        // 把左边剩余的数移入数组
	        while (i <= mid) {
	            temp[k++] = nums[i++];
	        }

	        // 把右边边剩余的数移入数组
	        while (j <= high) {
	            temp[k++] = nums[j++];
	        }

	        // 把新数组中的数覆盖nums数组
	        for (int k2 = 0; k2 < temp.length; k2++) {
	            nums[k2 + low] = temp[k2];
	        }
	    }
	    
   //////////  Merge Sort  /////////// 
	    static int number=0;
//	    public static void main(String[] args) {
//	        int[] a = {26, 5, 98, 108, 28, 99, 100, 56, 34, 1 };
//	        printArray("排序前：",a);
//	        MergeSort(a);
//	        printArray("排序后：",a);
//	    }

	    private static void printArray(String pre,int[] a) {
	        System.out.print(pre+"\n");
	        for(int i=0;i<a.length;i++)
	            System.out.print(a[i]+"\t");    
	        System.out.println();
	    }

	    private static void MergeSort(int[] a) {
	        // TODO Auto-generated method stub
	        System.out.println("开始排序");
	        Sort2(a, 0, a.length - 1);
	    }

	    private static void Sort2(int[] a, int left, int right) {
	        if(left>=right)
	            return;
	    
	        int mid = (left + right) / 2;
	        //二路归并排序里面有两个Sort，多路归并排序里面写多个Sort就可以了
	        Sort2(a, left, mid);
	        Sort2(a, mid + 1, right);
	        merge1(a, left, mid, right);

	    }


	    private static void merge1(int[] a, int left, int mid, int right) {
	    
	        int[] tmp = new int[a.length];
	        int r1 = mid + 1;
	        int tIndex = left;
	        int cIndex=left;
	        // 逐个归并
	        while(left <=mid && r1 <= right) {
	            if (a[left] <= a[r1]) 
	                tmp[tIndex++] = a[left++];
	            else
	                tmp[tIndex++] = a[r1++];
	        }
	            // 将左边剩余的归并
	            while (left <=mid) {
	                tmp[tIndex++] = a[left++];
	            }
	            // 将右边剩余的归并
	            while ( r1 <= right ) {
	                tmp[tIndex++] = a[r1++];
	            }
	            
	           
	            
	            System.out.println("第"+(++number)+"趟排序:\t");
	            // TODO Auto-generated method stub
	            //从临时数组拷贝到原数组
	             while(cIndex<=right){
	                    a[cIndex]=tmp[cIndex];
	                    //输出中间归并排序结果
	                    System.out.print(a[cIndex]+"\t");
	                    cIndex++;
	                }
	             System.out.println();
	        }
	    

	      /////////////  Merge Sort    //////////////////
	    /** 
	     * 归并排序 
	     * 简介:将两个（或两个以上）有序表合并成一个新的有序表 即把待排序序列分为若干个子序列，每个子序列是有序的。然后再把有序子序列合并为整体有序序列 
	     * 时间复杂度为O(nlogn) 
	     * 稳定排序方式 
	     * @param nums 待排序数组 
	     * @return 输出有序数组 
	     */  
	    public static int[] sort2(int[] nums, int low, int high) {  
	        int mid = (low + high) / 2;  
	        if (low < high) {  
	            // 左边  
	            sort2(nums, low, mid);  
	            // 右边  
	            sort2(nums, mid + 1, high);  
	            // 左右归并  
	            merge2(nums, low, mid, high);  
	        }  
	        return nums;  
	    }  
	  
	    public static void merge2(int[] nums, int low, int mid, int high) {  
	        int[] temp = new int[high - low + 1];  
	        int i = low;// 左指针  
	        int j = mid + 1;// 右指针  
	        int k = 0;  
	  
	        // 把较小的数先移到新数组中  
	        while (i <= mid && j <= high) {  
	            if (nums[i] < nums[j]) {  
	                temp[k++] = nums[i++];  
	            } else {  
	                temp[k++] = nums[j++];  
	            }  
	        }  
	  
	        // 把左边剩余的数移入数组  
	        while (i <= mid) {  
	            temp[k++] = nums[i++];  
	        }  
	  
	        // 把右边边剩余的数移入数组  
	        while (j <= high) {  
	            temp[k++] = nums[j++];  
	        }  
	  
	        // 把新数组中的数覆盖nums数组  
	        for (int k2 = 0; k2 < temp.length; k2++) {  
	            nums[k2 + low] = temp[k2];  
	        }  
	    }  
	  
	      
	    // 归并排序的实现  
//	    public static void main(String[] args) {  
//	  
//	        int[] nums = { 2, 7, 8, 3, 1, 6, 9, 0, 5, 4 };  
//	  
//	        MergeSort.sort(nums, 0, nums.length-1);  
//	        System.out.println(Arrays.toString(nums));  
//	    }  
	    
	 
	

}
