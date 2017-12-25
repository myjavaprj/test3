package ua.serg2.lesson04.lect.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApp {

	public static void main(String[] args) {
		String[] strArr = {"ab","abc","df","ag","hjk"};
		List<String> strList = new ArrayList<>(Arrays.asList(strArr));
		
		System.out.println(strList.stream().filter(s -> s.contains("a")).count());
		
		System.out.println(strList.stream().filter(s -> s.contains("a")).collect(Collectors.toList()));
		
		strList.stream().forEach(System.out::println);
		// or
		strList.stream().forEach((p) -> System.out.println(p));
	}

}
