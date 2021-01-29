package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CollectionsDemo {

	public static void main(String[] args) {
		List <Integer> nums=Arrays.asList(5,10,25,3,6,3,5);
		
		Collections.sort(nums,(n1,n2)->n2-n1);
		nums.forEach(System.out::println);
		
//		for(int num:nums) {
//			System.out.println(num);
//		}
		
//		nums.forEach((n)-> System.out.println(n));
			
//		Stream<Integer> stream=nums.stream();
		
//	double avg =	stream.mapToInt(n->n).max().orElse(0);
//								
//	
//	
//	System.out.println(avg);
		
	}

}
