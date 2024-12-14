class Merge{
	int[] array;
	int[] tempMergeArray;
	int length;
	
	public static void main(String[] args) {
		

		int[] inputArr = {48,36,13,52,19,94,21};
		Merge s = new Merge();
		s.Sort(inputArr);

		for (int i : inputArr) {
			System.out.print(i+" ");
		}
	}

	public void Sort(int inputArr[]){			//array is given to Sort()
		this.array=inputArr;
		this.length=inputArr.length;			//find length of array
		this.tempMergeArray=new int[length];	//array length stored here
		divideArray(0, length-1);				//divideArray() is called & calculated length is passed
	}

	public void divideArray(int lowerIndex, int higherIndex){
		
		//in this part list will goes under dividing
		//recursive method is used for recursion
		if (lowerIndex < higherIndex) {
			int middle = lowerIndex+(higherIndex - lowerIndex)/2;	//middle = 0+(6-0)/2 = 3

			//it will sort the left side of an array
			divideArray(lowerIndex, middle);

			//it will sort the rigth side of an array
			divideArray(middle+1, higherIndex);

			mergeArray(lowerIndex, middle, higherIndex);
		}
	}
	public void mergeArray(int lowerIndex, int middle, int higherIndex){
		
		//in this part we will merge array
		for (int i=lowerIndex; i<=higherIndex; i++) {
			tempMergeArray[i] = array[i];		//all array ele will put in tempMergeArray				
		}

		int i = lowerIndex;
		int j = middle+1;
		int k = lowerIndex;
		while (i <= middle+1 && j <= higherIndex) {
			
			if (tempMergeArray[i] <= tempMergeArray[j]) {
				array[k] = tempMergeArray[i];
				i++;
			}
			else {
				array[k] = tempMergeArray[j];
				j++;
			}
			k++;
		}

		while (i <= middle) {
			array[k] = tempMergeArray[i];
			k++;
			i++;
		}
	}

}