package cosc499;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class sortingInt {

	public int[] sortInt(int[] arr) {
		int[] sorted = null;
		Arrays.sort(arr);
		for(int i=0; i<arr.length; i++) {
			sorted[i] = arr[i];
		}
		return sorted;//commen to demonstrate change
	}
    }