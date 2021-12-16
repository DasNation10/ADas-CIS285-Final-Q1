import static org.junit.Assert.*;

import java.util.Arrays;
import org.junit.Assert;
import org.junit.Test;

public class testSelectionSort {
	
	@Test
	public void test() {
		testPositive();
		testNegatives();
		testMixed();
	}
	
	public void testPositive() {
		int[] arr = new int[5];
		arr[0] = 8;
		arr[1] = 9;
		arr[2] = 7;
		arr[3] = 10;
		arr[4] = 2;
		
		SelectionSort temp1 = new SelectionSort();
		int maxValue = temp1.selectionSort(arr);
		assertEquals("Wrong answer", maxValue);
	}
	public void testNegatives() {
		int[] arr = new int[5];
		arr[0] = -8;
		arr[1] = -9;
		arr[2] = -7;
		arr[3] = -10;
		arr[4] = -2;
		
		SelectionSort temp1 = new SelectionSort();
		int maxValue = temp1.selectionSort(arr);
		assertEquals("Wrong answer", maxValue);
	}
	public void testMixed() {
		int[] arr = new int[5];
		arr[0] = 8;
		arr[1] = -9;
		arr[2] = 7;
		arr[3] = -10;
		arr[4] = 2;
		
		SelectionSort temp1 = new SelectionSort();
		int maxValue = temp1.selectionSort(arr);
		assertEquals("Wrong answer", maxValue);
	}
}
	
