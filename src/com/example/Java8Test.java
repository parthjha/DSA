package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static java.util.stream.Collectors.toList;

public class Java8Test {

	public interface Predicate<T> {
		public boolean test();
	}


	public static List<Apple> filterApples(List<Apple> list, Predicate<Apple> p) {
		List<Apple> result = new ArrayList<>();
		for (Apple apple : list) {
			if (p.test()) {
				result.add(apple);
			}
		}
		return result;
	}

	public static void main(String[] args) {
		List<Apple> list = new ArrayList<>();

		Apple apple=new Apple();
		apple.setColor("green");
		apple.setWeight(200);
		list.add(apple);
		apple=new Apple();
		apple.setColor("green");
		apple.setWeight(200);
		list.add(apple);
		apple=new Apple();
		apple.setColor("green");
		apple.setWeight(100);
		list.add(apple);
		apple=new Apple();
		apple.setColor("yellow");
		apple.setWeight(200);
		list.add(apple);
		
		List<Apple> result= list.stream().filter((Apple a)-> "green".equals(a.getColor())).collect(toList());
		
		result.forEach(a->System.out.println(a.toString()));
		
			
		//filter(list,(Apple a)-> "green".equals(a.getColor()));
		
		
		
	}
}

class Apple {
	private String color;
	private int weight;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	public static boolean isGreen(Apple apple) {
		return apple.getColor().equals("green");
	}

	public static boolean isHeavy(Apple apple) {
		return apple.getWeight() > 150;
	}

	@Override
	public String toString() {
		return "Apple [color=" + color + ", weight=" + weight + "]";
	}

}
