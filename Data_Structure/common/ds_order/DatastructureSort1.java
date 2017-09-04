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
        // ��������2
        for (step = len / 2; step > 0; step /= 2)
            /**
            *  �ֱ��ÿ���������ֱ�Ӳ�������
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
        while(h < len / 3) // ������h���ֵ  
            h = h * 3 + 1;  
          
        while(h > 0){ // �ܷ����ͨ����С���h���ָ������е��ж�  
            /* 
             * outΪʲô��h��ʼ����ָ��ĵ�һ������Ӧ��������һ�����У�0, h, 2h, 3h, ... 
             * ���������whileѭ���Ǵ�1��ʼ�ģ���Ϊ��һ����ʼ�����򣬲���Ҫ�Ƚϣ������Ҫ�˽����������㷨�����ԱȽ��Ǵӵڶ��������ߣ���������ĵ�h���±꿪ʼ 
             * out���ж�Ϊʲô��out < len�� 
             * ���������±꣬��������ӻ�˵�� 
             *  
             * �����һ������������ 
             * �ٶ���һ��10������������飬�����±��0 ~ 9 ��ʾ 
             * ��h = 4ʱ������������������ģ����±��ʾ 
             * ��0 4 8����1 5 9����2 6����3 7�� 
             * �ҵ�һ������ô���ģ����ÿһ��ֱ���в������򣨵�ȻҲ��������ʵ�֣������±겻�ÿ��ƣ������Ƕ�����Ĵ�����˵���Ǵ������⡣ 
             * ��ȷ�Ĺ����������ģ����forѭ��ÿ�ζ�ÿһ�����ǰ������������в�������Ȼ��ǰ3����Ȼ��ǰ4�� ... ����������и����й� 
             * �������ֻ��Է����Ž��� 
             * ��out = 4ʱ�������¹��� ��[0 4] 8�� 
             * ��out = 5ʱ��[1 5] 9�� 
             * ��out = 6ʱ��[2 6]�� 
             * ��out = 7ʱ��[3 7]�� 
             * ��out = 8ʱ��[0 4 8]�� 
             * ��out = 9ʱ��[1 5 9]�� 
             * h = 4ִ����ϣ�Ȼ��h = (h - 1) / 3 = 1��ʼ�µ�forѭ�� 
             * h = 1ʱִ�й��̺�h = 4ʱһ����������ʱ�������о���ԭʼ�����У��ɱ�Ϊһ���򵥵Ĳ�����������������������������ƶ������������ 
             *  
             */  
            for(out = h; out < len; out++){ // ���ͨ��outȷ��ÿ���������ĵڶ���������  
                // ���´�����Ƕ������н��еĲ��������㷨  
                tmp = array[out];  
                in = out;  
                /* 
                 * �Ƚϲ�������whileѭ����д���������whileѭ����h�йأ������ж�����h�йأ����� in -= h��� 
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
              
            // ��С���  
            h = (h - 1) / 3;  
        }  
    }  	
    
    ////////////shellSort /////////// 
    public static void shellSort5(int[] data) {  
        // ���������hֵ  
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
            // �������һ��hֵ  
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
	    	
	    	if(start>low) sort1(a,low,start-1);//������С���һ������λ�õ��ؼ�ֵ����-1
	        if(end<high) sort1(a,end+1,high);//�ұ����С��ӹؼ�ֵ����+1�����һ��		
	    	
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
	    
	    
	  
	    
	    
	    
	    
	    
	    
    
}

