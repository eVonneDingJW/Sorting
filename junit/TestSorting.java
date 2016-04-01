import static org.junit.Assert.*;

import org.junit.Test;


public class TestSorting {

	@Test
	public void testInsertionSort() {
		
		int numbers[] = {2,3,9,0,5,6,4,8};
		Sorting s = new Sorting();
		s.insertionSort(numbers);
		
	}


	@Test
	public void testQuicksort() {
		int numbers[] = {1,3,9,0,5,6,4,80};
		Sorting s = new Sorting();
		s.insertionSort(numbers);
		s.quicksort(numbers);
		assertEquals(true,s.isSorted(numbers));
		
	}

	@Test
	public void testSwapReferences() {
		Object numbers[] = {2,3,9,0,5,6,4,8};
		Sorting s = new Sorting();
		s.swapReferences(numbers, 3, 1);
		
	}

	@Test
	public void testSwap() {
		int numbers[] = {2,3,9,0,5,6,4,8};
		Sorting s = new Sorting();
		s.swap(numbers, 2, 4);
	}
	
	@Test
	public void testIsSorted() {
		int numbers[] = {1,3,9,0,5,6,4,8};
		Sorting s = new Sorting();
		s.isSorted(numbers);
	}
	
	@Test
	public void testAll(){
		Sorting s = new Sorting();
		int a1[] = {1,3,9,2,4,8,0};
		int a2[] = {3,3,3,3,0,0,0,0,0,0,0,1,2,3};
		int a3[] = {2,3,4,1,1,1,1,11,1,1,1,11};
		int a4[] = {66,66,3,6,7,3,3,3,3,3,3,10,10,-4};
		int a5[] = {1,2,3};
		Object numbers[] = {2,3,9,0,5,6,4,8};
		
		s.insertionSort(a1);
		s.isSorted(a2);
		s.isSorted(a5);
		Sorting.quicksort(a1);
		Sorting.quicksort(a2);
		Sorting.quicksort(a3);
		Sorting.quicksort(a4);
		Sorting.swapReferences(numbers,1,2);
		Sorting.swap(a1,1,2);
		
		assertEquals(false,s.isSorted(a1));
		assertEquals(true,s.isSorted(a2));
		assertEquals(true,s.isSorted(a3));
		assertEquals(true,s.isSorted(a4));
		assertEquals(true,s.isSorted(a5));

	}

}
