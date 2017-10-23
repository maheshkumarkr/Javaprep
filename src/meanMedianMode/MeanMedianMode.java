package meanMedianMode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MeanMedianMode {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MeanMedianMode mmm = new MeanMedianMode();
		mmm.init();
	}

	private void init(){
		Scanner in = new Scanner(System.in);
		System.out
				.println("Enter N = No of elements in Array");
		int n = in.nextInt();
		
		int arr[] = new int[n];
		
		System.out.println("Enter N elements one by one to store in Array");
		for(int i=0;i<n;i++)
			arr[i]=in.nextInt();
		
		// Mean of Array Elements
		
		int mean = findMean(arr);
		
		int median = findMedian(arr);
		
		int mode = findMode(arr);
		
		System.out.println("Mean ="+mean+" Median ="+median+" Mode ="+mode);
		
		in.close();
	}
	public int findMean(int[] arr){
		
		int sum = 0;
		int len = arr.length;
		for(int i=0;i<len;i++){
			sum += arr[i];
			//mean = sum/len;
		}
		return sum/len;
	}
	public int findMedian(int[] arr){
		// Sort the elements and find Middle element.
		int len = arr.length;
		Arrays.sort(arr);
		if (len % 2 == 0) {
			return (arr[(len / 2) - 1] + arr[len / 2]) / 2;
			} else {
			return arr[len / 2];
			}
	}
	public int findMode(int[] arr){
		Map<Integer,Integer> modMap= new HashMap<Integer,Integer>();
		int len = arr.length;
		int maxCount = 0;
		int maxVal = arr[0]; // initialize to first value of array
		for(int i=0;i<len;i++){
			if(modMap.containsKey(arr[i]))
			{
				int getCount = modMap.get(arr[i]);
				if(getCount > maxCount){
					maxCount = getCount;
					maxVal = arr[i];
				}
				modMap.put(arr[i], getCount+1);
			}
			else
			{
				modMap.put(arr[i], 1);
			}
		}
		
		
		return maxVal;
	}
	
	
}
