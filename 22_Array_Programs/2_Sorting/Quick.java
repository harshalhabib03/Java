class Quick{
	
	public static void main(String[] args) {
		int[] arr = {15,9,7,13,12,16,4,18,11};
		int leng = arr.length;	//to find length of array

		Quick q = new Quick();
		q.quickSortRecursion(arr, 0, leng-1);
		q.printArray(arr);
	}

	int partition(int[] arr, int low, int high){

		int pivot = arr[(low+high)/2];		//find middle of array

		while (low <= high) {		//i<=j
			
			while (arr[low] < pivot) {	//arr[i] < pivot
				low++;
			}
			while (arr[high] > pivot) {
				high--;
			}

			if (low <= high) {
				//this part is used for swapping
				int temp = arr[low];
				arr[low] = arr[high];
				arr[high]= temp;

				low++;
				high--;
			}
		}
		return low;
	}

	void quickSortRecursion(int[] arr, int low, int high){

		int pi = partition(arr, low, high);
		if (low < pi-1) {
			quickSortRecursion(arr, low, pi-1);
		}
		if (pi < high) {
			quickSortRecursion(arr, pi, high);
		}
	}

	void printArray(int[] arr){
		for (int i : arr) {
			System.out.print(i+" ");
		}
	}
}