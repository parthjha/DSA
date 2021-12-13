package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.*;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.stream.Stream;

public class CallableFutureTest {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		FutureTask[] randomNumberTasks = new FutureTask[5];
		for (int i = 0; i < 5; i++) {
			Callable callable = new CallbaleExample();

			// Create the FutureTask with Callable
			randomNumberTasks[i] = new FutureTask(callable);

			// As it implements Runnable, create Thread
			// with FutureTask
			Thread t = new Thread(randomNumberTasks[i]);
			t.start();
		}
		for (int i = 0; i < 5; i++) {
			System.out.println(randomNumberTasks[i].get());
		}
			
		
		List<Integer> list=new ArrayList<>();
	
		Stream<Integer> streams=list.stream();
		
		//
		int max=Integer.MIN_VALUE;
		for(int i=0;i<list.size();i++) {
			if(max<list.get(i)) {
				max=list.get(i);
			}
		}
		// Employee - emp_name , salary , deptt.
		
		// select emp_name ,max(salary) from empolyee ;
		
	}
	
}
class SingeltonExample{
	private static volatile SingeltonExample singeltonExample;
	private SingeltonExample() {
			
	}
	public static SingeltonExample getInstance() {
		if(singeltonExample==null) {
			synchronized (SingeltonExample.class) {
				singeltonExample=new SingeltonExample();
			}
		}
		return singeltonExample;
	}
	
}
class CallbaleExample implements Callable {

	@Override
	public Object call() throws Exception {
		Random generator = new Random();
		Integer randomNumber = generator.nextInt(5);

		Thread.sleep(randomNumber * 1000);

		return randomNumber;
	}

}
