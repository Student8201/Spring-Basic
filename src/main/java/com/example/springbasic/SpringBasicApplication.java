package com.example.springbasic;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.springbasic.service.BinarySearchImpl;

@SpringBootApplication
public class SpringBasicApplication {

	//What are the beans?
	//What are the dependencies of a bean?
	//where to search for beans?
	public static void main(String[] args) {
		// BinarySearchImpl binarySearch = new BinarySearchImpl(new BubbleSortAlgorithm());
	    // Application Context
		ApplicationContext applicationContext = SpringApplication.run(SpringBasicApplication.class, args);
		
		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
	    int result = binarySearch.binarySearch(new int[] { 2, 4, 8}, 3);
	    
	    System.out.println(result);
//		SpringApplication.run(SpringBasicApplication.class, args);
	}

}
/**
 * Create instance of bean 'binarySearchImpl'
 * Create instance of bean 'bubbleSortAlgorithm'
 * Finished creating instance of bean name 'binarySearchImpl'
 * via constructor to bean named 'bubbleSortAlgorithm'
 * Finished creating instance of bean 'binarySearchImpl'
 */
