class FindPeakElement
{
	
static int peakElement(int arr[], int n)
{
   int low = 0;
   int high = n-1;

   while(low<=high){
       int mid = (low+high)/2;

       if(
          (mid==0 || arr[mid]>=arr[mid-1]) &&
          (mid == n-1 || arr[mid]>=arr[mid+1])
         ){
             return mid;
         }
        else if(arr[mid]<=arr[mid+1]){
            low = mid+1;
        }else{
            high = mid-1;
        }
   }

   return -1;
}
	
	public static void main(String[] args)
	{
	int[] arr={1,20,4,3,88,90};
	int index=peakElement(arr, arr.length);
	System.out.println("Index: "+index+", Element: "+arr[index]);
		
	}
}
