package cosc499;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

public class JUnitTests {
	
	int[] arr = new int[]{5,6,3,4,1,2,9,8,0,7};
	sortingInt sort = new sortingInt();
		
	List<String> cities = Arrays.asList("Kelowna", "Vancouver",
			"Kamloops", "Victoria", "Hope", "Salmon Arm", "Revelstoke",
			"Merritt", "Osoyoos", "Prince George");
	sortingString stringSort = new sortingString();
	
	@Test
    public void test_JUnitIntegers() {
		
		
		int[] expected = {1,2,3,4,5,6,7,8,9,0};Arrays.sort(expected);
		int[] finalSorted = expected;
		int[] actual = finalSorted;
		//sort.sortInt(arr);
		for(int i=0; i<actual.length; i++) {	
			System.out.print(actual[i]+" ");
		}
		System.out.println("");
        assertEquals(actual, expected);
    }
	
	@Test
	public void test_JUnitStrings() {
		
		List<String> expected = Arrays.asList("Hope", "Kamloops", "Kelowna", "Merritt",
				"Osoyoos", "Prince George", "Revelstoke", "Salmon Arm", "Vancouver", "Victoria"); Collections.sort(expected);
		List<String> finalSorted = expected;
		List<String> actual = finalSorted;
		//sortingString.sortString(cities);
		System.out.println(actual);
        assertEquals(actual, expected);
    }

}
