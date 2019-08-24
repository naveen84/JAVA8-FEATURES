package com.naveen;

import java.util.Arrays;
import java.util.List;
import java.util.function.IntPredicate;

public class IntPredicateDemo {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(2,3,4,8,10);
		IntPredicate isEvenFunction = num -> num%2==0;
		for(int number : numbers){
			if(isEvenFunction.test(number)){
				System.out.println("EVEN NUMBERS ARE : "+number);
			}
		}
	}

}
//LIKE IntPredicate WE HAVE LongPredicate and DoublePredicate for primitive Predicate Functional Interface
