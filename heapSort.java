public class heapSort{
    public void sort(int arr[]){
        int x = arr.length;

        for(int i=x/2-1; i>=0; i--)
            heapify(arr,x,i);

        for(int i=x-1; i>=0; i--){
            int y = arr[0];
            arr[0] = arr[i];
            arr[i] = y;
            heapify(arr,i,0);
        }
    }
    
    void heapify(int arr[],int x,int i){
        int max = i;
        int l = 2*i+1;
        int r = 2*i+2;
        if (l < x && arr[l] > arr[max])
            max = l;
        if (r < x && arr[r] > arr[max])
            max = r;
        if (max != i)
            {
                int swap = arr[i];
                arr[i] = arr[max];
                arr[max] = swap;
                heapify(arr, x, max); //recursion
            }
    }

    static void print(int arr[]){
        int l = arr.length;
        for (int i=0; i<l; ++i)
            System.out.print(arr[i]+" ");
    }
    public static void main(String args[]){
        //used this to test sort function, run Java to test.
        int arr[] = {28,12,88,23,291,32,91,3};
  
        heapSort heap = new heapSort();
        heap.sort(arr);
  
        System.out.println("heap sorted array:");
        print(arr);
    }
}