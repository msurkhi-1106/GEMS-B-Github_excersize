import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;


public class insertionSort {

    public int[] insertionInt(int arr[]){
        for(int i = 0; i < 5; i++) {
            int item = arr[i];
            int pos = i;
            while(pos > 0 && item < arr[pos-1]) {
                arr[pos] = arr[pos-1];
                pos--;
            }
            arr[pos] = item;
        }  
        return arr;
    }
    
}
