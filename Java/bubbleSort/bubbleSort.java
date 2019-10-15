public class bubSort {
	public void bubbleSorting(int[] sortArr, int arrLength) {
		int tempVar = 0;
		
		for(int i = 0; i < arrLength; i++) {
			for (int j = 1; j < (arrLength-i); j++) {
				if (sortArr[j-1] > sortArr[j]) {
					tempVar = sortArr[j-1];
					sortArr[j-1] = sortArr[j];
					sortArr[j] = tempVar;
				}
			}
		}		
		for(int i:sortArr){    
            System.out.print(i + " ");    
        }
	}

}