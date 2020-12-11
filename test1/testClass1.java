package test1;

import java.util.Arrays;

public class testClass1 {
	
	public boolean isPrime(int n) {
		
		for(int i=2; i<n;i++) {
			if(n%i==0 && i!=n)  
				return false;
		}
		return true;
	}
	
	public int fib(int n) {
		if(n==0 || n==1)
			return n;
		else
			return fib(n-1) + fib(n-2);
	}
	
	int searchIndex(int searchElem) {
		int[] numbers = {3, 22, 27, 47, 57, 67, 89, 91, 95, 99, 73, 482, 11, 1, 21, 33,3};
		int index = Arrays.binarySearch(numbers, searchElem);
		return index;
	}
}