package com.prodian.task.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {
		
		Integer[] array1 = {1,2,3,4,5,6,6,7};
		
		Integer[] array2 = {1,3,4,5,6,7};
		
		Set<Integer> set1 = new HashSet<Integer>();
		
		Set<Integer> set2 = new HashSet<Integer>();
		
		set1.addAll(Arrays.asList(array1));
		
		set2.addAll(Arrays.asList(array2));
		
		System.out.println(set1);
		
		System.out.println(set1.contains(1));
		
		System.out.println(set2.isEmpty());
		
		System.out.println(set1.size());
		//System.out.println(set2.);
		System.out.println();
		
		
		System.out.println(set2);

		Set<Integer> union = new HashSet<Integer>(set1);
		union.addAll(Arrays.asList(12,23,32));
		union.addAll(set2);
		System.out.println(union);
		
		Set<Integer> inter = new HashSet<Integer>(set1);
		
		inter.retainAll(set2);
		System.out.println(inter);
		
		Set<Integer> diff = new HashSet<Integer>(set1);
		
		diff.removeAll(set2);
		System.out.println(diff);
	}
}
