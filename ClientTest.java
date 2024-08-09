package com.infotech.client;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ClientTest {

	public static void main(String[] args) {
		// Creating EnumSet using range
		EnumSet<WeekDay> weekDaySet = EnumSet.range(WeekDay.MONDAY, WeekDay.FRIDAY);
		System.out.println("Using for each:Iterating EnumSet");
		for (WeekDay weekDay : weekDaySet) {
			System.out.println("WeekDay: " + weekDay);
		}
		System.out.println("------------------------------------------------------");
		// Another way of Creating EnumSet using of Method
		// EnumSet<WeekDay> weekEndSet = EnumSet.of(WeekDay.SATURDAY, WeekDay.SUNDAY);

		// Creating EnumSet using complementOf method, The created
		// set will contain all elements of the Enum not contained in the specified set
		EnumSet<WeekDay> weekEndSet = EnumSet.complementOf(weekDaySet);
		System.out.println("Using itertor:Iterating weekEndSet");
		Iterator<WeekDay> itr = weekEndSet.iterator();
		while (itr.hasNext()) {
			System.out.println("WeekDay: " + itr.next());
		}
		System.out.println("------------------------------------------------------");
		System.out.println("Need to work? " + isWorkingDay(weekDaySet, WeekDay.MONDAY));
		System.out.println("Need to work? " + isWorkingDay(weekDaySet, WeekDay.SATURDAY));
		System.out.println("Need to work? " + isWorkingDay(weekDaySet, WeekDay.SUNDAY));

		Set<String> daysOfWeek = new HashSet<>();
		daysOfWeek.add("Monday");
		daysOfWeek.add("Tuesday");
		daysOfWeek.add("Wednesday");
		daysOfWeek.add("Thursday");
		daysOfWeek.add("Friday");
		daysOfWeek.add("Saturday");
		daysOfWeek.add("Sunday");

		// Adding duplicate record will be removed

		daysOfWeek.add("Monday");
		System.out.println(daysOfWeek);

		List<Integer> numbersDivisibleBy5 = new ArrayList<>();
		numbersDivisibleBy5.add(5);
		numbersDivisibleBy5.add(10);
		numbersDivisibleBy5.add(15);
		numbersDivisibleBy5.add(20);
		numbersDivisibleBy5.add(25);

		List<Integer> numbersDivisibleBy3 = new ArrayList<>();
		numbersDivisibleBy3.add(3);
		numbersDivisibleBy3.add(6);
		numbersDivisibleBy3.add(9);
		numbersDivisibleBy3.add(12);
		numbersDivisibleBy3.add(15);

		// Creating a HashSet from another collection (ArrayList)
		Set<Integer> numbersDivisibleBy5Or3 = new HashSet<>(numbersDivisibleBy5);

		// Adding all the elements from an existing collection to a HashSet
		numbersDivisibleBy5Or3.addAll(numbersDivisibleBy3);

		// Adding all the elements from an existing collection to a HashSet
		numbersDivisibleBy5Or3.addAll(numbersDivisibleBy3);

		System.out.println(numbersDivisibleBy5Or3);

		Set<Customer> customers = new HashSet<>();
		customers.add(new Customer(101, "Rajeev"));
		customers.add(new Customer(102, "Sachin"));
		customers.add(new Customer(103, "Chris"));

		/*
		 * Iterating over Hash Set
		 */

		Set<String> programmingLanguages = new HashSet<>();
		programmingLanguages.add("C");
		programmingLanguages.add("C++");
		programmingLanguages.add("Java");
		programmingLanguages.add("Python");
		programmingLanguages.add("PHP");
		programmingLanguages.add("Ruby");

		programmingLanguages.forEach(programmingLanguage -> {
			System.out.println(programmingLanguage);
		});

		/*
		 * 
		 * Using Iterator
		 */
		Iterator<String> programmingLanguageIterator = programmingLanguages.iterator();
		while (programmingLanguageIterator.hasNext()) {
			String programmingLanguage = programmingLanguageIterator.next();
			System.out.println(programmingLanguage);
		}

		for (String programmingLanguage : programmingLanguages) {
			System.out.println(programmingLanguage);
		}

	}

	private static boolean isWorkingDay(Set<WeekDay> daysSet, WeekDay day) {
		return daysSet.contains(day);

	}

}
