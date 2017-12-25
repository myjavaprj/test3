package ua.serg2.lesson04.lect.stream;

import java.util.Arrays;

public class StreamIntMain {

	public static void main(String[] args) {
		Integer[] iArr = {1,2,13,4,5,61,7,8,91,10};
		
		//System.out.println(Arrays.stream(iArr).skip(5).filter((p) -> p.intValue() % 2 == 0).count());
		System.out.println(Arrays.stream(iArr).filter((p) -> p.intValue() % 3 == 0).findFirst().orElse(66613));
	}

}
