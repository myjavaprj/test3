package ua.serg2.lesson04.lect.stream;

import java.util.Arrays;
import java.util.Date;
import java.util.stream.Stream;

public class StreamTestSpead {

	public static void main(String[] args) {
		Integer[] arr = new Integer[500_000_000];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random()*100);
		}
		
		System.out.println("OLD Method: ");
		Date date = new Date();
		int even = 0;
		for (int i = arr.length/2; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				even++;
			}
		}
		System.out.println("Even count: " + even + "; Time: " + (new Date().getTime() - date.getTime()));
		
		System.out.println("Stream Method: ");
		Stream<Integer> stream = Arrays.stream(arr);
		date = new Date();
		System.out.println(stream.skip(arr.length/2).filter((e) -> e.intValue()%2==0).count());
		System.out.println("Time: " + (new Date().getTime() - date.getTime()));
	}

}
