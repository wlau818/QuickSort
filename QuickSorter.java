
public class QuickSorter {

	public static void quickSort(int[] arr, int lo, int hi) {
		if (lo < hi) {
			int pivotIndex = partition(arr, lo, hi);
			quickSort(arr, lo, pivotIndex - 1);
			quickSort(arr, pivotIndex + 1, hi);
		}
		/*
		 * Implement the quick sort algorithm on the integer array arr[]
		 * starting at index lo and ending at index hi.
		 */
	}
	
	public static int partition(int[] arr, int lo, int hi) {
		int pivot = arr[lo];
		int i = lo + 1;
		int j = hi;
		int temp;
		int index = 0;
		while (i < j) {
			while (arr[i] <= pivot && i < j) { // && i <= j
				i ++;
			} 
			while (arr[j] >= pivot && j >= i) { //&& j >= i
				j --;
			} 			
			
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
					
		}
		
		arr[0] = arr[j];
		arr[j] = pivot;
		index = j;
		
		return index;
		/*
		 * Partition the integer array arr[] from lo to hi.
		 * Should return the index of the pivot element.
		 */
	}
	
}
