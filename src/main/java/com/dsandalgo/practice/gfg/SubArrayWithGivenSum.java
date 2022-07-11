package com.dsandalgo.practice.gfg;

public class SubArrayWithGivenSum {

	public static void main(String[] args) {

//		int arr[] = { 135, 101, 170, 125, 79, 159, 163, 65, 106, 146, 82, 28, 162, 92, 196, 143, 28, 37, 192, 5, 103,
//				154, 93, 183, 22, 117, 119, 96, 48, 127, 172, 139, 70, 113, 68, 100, 36, 95, 104, 12, 123, 134 };
//		SubArrayWithGivenSum subArrayWithGivenSum = new SubArrayWithGivenSum();
//		subArrayWithGivenSum.subArrayWithGivenSum(arr, 468);

		int arr[] = { 1, 2, 3, 4 };
		SubArrayWithGivenSum subArrayWithGivenSum = new SubArrayWithGivenSum();
		subArrayWithGivenSum.subArrayWithGivenSum(arr, 0);
	}

	public void subArrayWithGivenSum(int arr[], int sum) {

		int arraySum = 0;
		int lowerBound = 0;
		int higherBound = 0;
		boolean arrayExists = false;

		for (int i = 0; i < arr.length; i++) {

			if (arraySum == sum && sum != 0) {
				arrayExists = true;
				break;
			} else {
				arraySum = arraySum + arr[i];
				higherBound = i;
				if (arraySum > sum && higherBound != arr.length && sum != 0 ) {
					do {
						arraySum = arraySum - arr[lowerBound];
						lowerBound++;
					} while (arraySum > sum);
				}
			}

		}
		if (arraySum == sum) {
			System.out.print(lowerBound + " " + higherBound);
			arrayExists = true;
		}

		if (!arrayExists) {
			System.out.print("-1");
		}
	}

}
