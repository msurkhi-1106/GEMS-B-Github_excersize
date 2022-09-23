public class heapSort{
    public void sort(int arr[]){
        int n = arr.length;

        for(int i=n/2-1; i>=0; i--)
            heapify(arr,n,1);

        for(int i=n-1; i>=0; i--){
            int x = arr[0];
            arr[0] = arr[i];
            arr[i] = x;
            heapify(arr,i,0);
        }
    }
    
    void heapify(int arr[], int n, int i){
        int max = i;
        int l = 2*i+1;
        int r = 2*i+2;
        if (l < n && arr[l] > arr[max])
            max = l;
        if (r < n && arr[r] > arr[max])
            max = r;
        if (max != i)
            {
                int swap = arr[i];
                arr[i] = arr[max];
                arr[max] = swap;
                heapify(arr, n, max); //recursion
            }
    }

    static void print(int arr[]){
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
    public static void main(String args[]){
        //used this to test sort function
        int arr[] = {12, 11, 13, 5, 6, 7};
        int n = arr.length;
  
        heapSort ob = new heapSort();
        ob.sort(arr);
  
        System.out.println("Sorted array is");
        print(arr);
    }
}