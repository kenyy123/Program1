package ds_order;

public class DatastructureSort1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {9,8,7,6,5,4,3,2};
		
//		bubbleSort1(array);
//		bubbleSort2(array);
//		insertSort1(array);
//		selectSort1(array);
//		shellSort1(array);
//		shellSort2(array);
//		shellSort3(array);
//		shellSort1a(array);
//		sort(array);
//		shellSort5(array);
//		quickSort(array, 0, array.length-1);
//		quickSort1(array, 0, array.length-1);
		
		shellSort2a(array);
//		shellSort6(array);
		
		for(int num : array){
			System.out.print(num + " ");
		}
	}
	
    ///////////////// insertSort /////////////////
	public static void bubbleSort1(int[] a){
		int start = 0;
		int end = a.length;
		for(int i=0; i<end; i++){
			for(int j=0; j<end-i-1; j++){
				if(a[j] > a[j+1]){
					swap(a, j, j+1);
				}
			}			
		}		
	}
	
	public static void swap(int array[], int a, int b){
		int tmp;
		if(a != b){
			tmp = array[a];
			array[a] = array[b];
			array[b] = tmp;
		}
	}
	
	public static void bubbleSort2(int array[]){
		int start = 0;
		int end = array.length;
		for(int i = 0; i<end; i++){
			for (int j = end-1; j > i; j--){
				if(array[j] < array[j-1]){
					swap(array, j-1, j);
				}
			}
		}
	}
	
	
     ///////////////// insertSort /////////////////
	public static void insertSort1(int[] a){
		int len = a.length;
		for(int i=1; i<len; i++){
			for(int j=i; j>0; j--){
				if(a[j] < a[j-1]){
					swap(a, j-1, j);
				}
			}
		}
	}
	
	
	///////////////// selectSort /////////////////
	public static void selectSort1(int[] a){
		int tmp;
		int len = a.length;
		for(int i=0; i<len; i++){
			int index = i;
			for(int j=i+1; j<len; j++){
				if(a[index] > a[j]){
					index = j;
				}
			}
		 	tmp = a[index];
			a[index] = a[i];
			a[i]= tmp;
		}
	}
	

	
   ////////////shellSort /////////// 
	public static void shellSort1(int[] a){
		int len = a.length;
		if(a == null || len <= 1){
			return;
		}
		
		int ic = len/2;
		while(ic >= 1){
			for(int i=0; i<len; i++){
				for(int j=i; j<len-ic; j=j+ic){
					if(a[j] > a[j+ic]){
//						swap(a, j, j+ic);
						 int temple = a[j];
	                        a[j] = a[j+ic];
	                        a[j+ic] = temple;
					}
				}
			}
		    ic = ic/2; 
		}
	}
	
	////////////shellSort /////////// 
	public static void shellSort1a(int[] a){
	int len = a.length;
	if(a == null || len <= 1){
		return;
	}
	
	 int ic = 1;  
     while (ic <= len / 3) {  
         ic = ic * 3 + 1;  
     }  
     
	while(ic > 0){
		for(int i=ic; i<len; i = i+ic){
			for(int j=i; j<len-ic; j=j+ic){
				if(a[j] > a[j+ic]){
	//				swap(a, j, j+ic);
					 int temple = a[j];
	                    a[j] = a[j+ic];
	                    a[j+ic] = temple;
				}
			}
		}
		ic = (ic - 1) / 3;  
	}
	}
	
	
      ////////////shellSort /////////// 
	public static void sort(int[] arrays){
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
	
	
	////////////shellSort /////////// 
		public static void shellSort2a(int[] a){
		int len = a.length;
		if(a == null || len <= 1){
			return;
		}
		
//		int ic = len/2;
		
		for (int ic = len / 2; ic > 0; ic /= 2)
			for(int i=ic; i<len; i++){
//				int tmp = a[i];
				for(int j = i + ic; j < len; j += ic){
					if(a[j] < a[j-ic]){
						int temp = a[j];						
						 int k = j - ic;
		                    while (k >= 0 && a[k] > temp) {
		                        a[k + ic] = a[k];
		                        k -= ic;
		                    }
		                    a[k + ic] = temp;
					
					}					
				}			
			}		   			
	 }
		
		  
   //////////// shell Sort /////////// 
    public static void shellSort6(int[] sortList) {
        int i, j, step;
        int len = sortList.length;
        // 步长除以2
        for (step = len / 2; step > 0; step /= 2)
            /**
            *  分别对每个分组进行直接插入排序
            */
            for (i = 0; i < step; i++)
            {
                for (j = i + step; j < len; j += step)
                    if (sortList[j] < sortList[j - step]) {
                        int temp = sortList[j];
                        int k = j - step;
                        while (k >= 0 && sortList[k] > temp) {
                            sortList[k + step] = sortList[k];
                            k -= step;
                        }
                        sortList[k + step] = temp;
                    }
            }
    }
		
		
     ////////////shellSort /////////// 
    static void shellSort3(int[] array) {  
        int out, in, tmp;  
        int len = array.length;  
        int h = 1;   
        while(h < len / 3) // 计算间隔h最大值  
            h = h * 3 + 1;  
          
        while(h > 0){ // 能否继续通过缩小间隔h来分割数据列的判定  
            /* 
             * out为什么从h开始？你分割后的第一子序列应该是这样一个序列，0, h, 2h, 3h, ... 
             * 插入排序的while循环是从1开始的，因为第一个数始终有序，不需要比较，这个需要了解插入排序的算法，所以比较是从第二个数据线，就是数组的第h个下标开始 
             * out的判定为什么是out < len？ 
             * 控制数组下标，下面的例子会说道 
             *  
             * 下面举一个例子来解释 
             * 假定有一个10个数据项的数组，数组下标从0 ~ 9 表示 
             * 当h = 4时的子序列情况是这样的，以下标表示 
             * （0 4 8）（1 5 9）（2 6）（3 7） 
             * 我第一次是这么理解的，真对每一组分别进行插入排序（当然也可以这样实现，但是下标不好控制），但是对下面的代码来说这是错误的理解。 
             * 正确的过程是这样的，外层for循环每次对每一分组的前两个数据项进行插入排序，然后前3个，然后前4个 ... 这个和子序列个数有关 
             * 排序过程只真对方括号进行 
             * 当out = 4时进行如下过程 （[0 4] 8） 
             * 当out = 5时（[1 5] 9） 
             * 当out = 6时（[2 6]） 
             * 当out = 7时（[3 7]） 
             * 当out = 8时（[0 4 8]） 
             * 当out = 9时（[1 5 9]） 
             * h = 4执行完毕，然后h = (h - 1) / 3 = 1开始新的for循环 
             * h = 1时执行过程和h = 4时一样，不过这时的子数列就是原始的数列，蜕变为一个简单的插入排序，这是数组基本有序，数据项移动次数会大大减少 
             *  
             */  
            for(out = h; out < len; out++){ // 外层通过out确定每组插入排序的第二个数据项  
                // 以下代码就是对子序列进行的插入排序算法  
                tmp = array[out];  
                in = out;  
                /* 
                 * 比较插入排序while循环的写法，这里的while循环与h有关，所以判定就与h有关，包括 in -= h语句 
                 * while(in > 0 && array[in - 1] > tmp){ 
                 * array[in] = array[in - 1]; 
                 * in--; 
                 * } 
                 * array[in] = tmp; 
                 *  
                 */  
                while(in > h -1 && array[in - h] >= tmp){  
                    array[in] = array[in - h];  
                    in -= h;  
                }  
                array[in] = tmp;  
//              for(int i = 0; i < len; i++)  
//                  System.out.print(array[i] + " ");  
//              System.out.println();  
                                  
            }  
              
            // 缩小间隔  
            h = (h - 1) / 3;  
        }  
    }  	
    
    ////////////shellSort /////////// 
    public static void shellSort5(int[] data) {  
        // 计算出最大的h值  
        int h = 1;  
        while (h <= data.length / 3) {  
            h = h * 3 + 1;  
        }  
        while (h > 0) {  
            for (int i = h; i < data.length; i += h) {  
                if (data[i] < data[i - h]) {  
                    int tmp = data[i];  
                    int j = i - h;  
                    while (j >= 0 && data[j] > tmp) {  
                        data[j + h] = data[j];  
                        j -= h;  
                    }  
                    data[j + h] = tmp;  
                    print(data);  
                }  
            }  
            // 计算出下一个h值  
            h = (h - 1) / 3;  
        }  
    }  
  
    public static void print(int[] data) {  
        for (int i = 0; i < data.length; i++) {  
            System.out.print(data[i] + "\t");  
        }  
        System.out.println();  
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
	    
	    
	    ////////////////////////////////////////
	    //////////////// quickSort //////////////
	    public static void quickSort1(int[] a, int low, int high){
	    	int start = low;
	    	int end = high;
	    	int key = a[low];
	    	
	    	while(end>start){
	    		while(end>start && a[end]>=key){
	    			end--;
	    		}
	    		if(a[end] <= key){
	    			swap(a, start, end);
	    		}
	    		while(end>start && a[start] <= key)
	    			start++;
	    		if(a[start] >= key){
	    			swap(a, start, end);
	    		}
	    	}
	    	
	    	if(start>low) sort1(a,low,start-1);//左边序列。第一个索引位置到关键值索引-1
	        if(end<high) sort1(a,end+1,high);//右边序列。从关键值索引+1到最后一个		
	    	
	    }
	    
	    public static int[] sort1(int[] num, int start, int end){
	    	int mid = (start + end)/2;
	    	if(start < end){
	    		sort1(num, start, mid);
	    		sort1(num, mid+1, end);
	    		merge(num, start, mid, end);
	    	}
	    	return num;
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
	    
	    
	  
	    
	    
	    
	    
	    
	    
    
}

