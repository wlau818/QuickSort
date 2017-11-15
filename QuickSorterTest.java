import static org.junit.Assert.*;

import org.junit.Test;

public class QuickSorterTest {

	@Test
	public void testPartition() {
		int[] array1 = {4, 1, 8, 3, 2};
		int i = QuickSorter.partition(array1, 0, 4);
		assertTrue(i == 3);
		
		int[] array2 = {1, 5, 2, 9, 4};
		i = QuickSorter.partition(array2, 0, 4);
		assertTrue(i == 0);
		
		int[] array3 = {7, -3, 2, 1, -6};
		i = QuickSorter.partition(array3, 0, 4);
		assertTrue(i == 4);
		//fail("Not yet implemented");
	}

}
