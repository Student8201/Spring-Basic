package com.example.springbasic;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.springbasic.service.BinarySearchImpl;

@SpringBootApplication
public class SpringBasicApplication {

	//What are the beans?
	//What are the dependencies of a bean?
	//where to search for beans?
	public static void main(String[] args) {
		BinarySearchImpl binarySearch = new BinarySearchImpl(new BubbleSortAlgorithm());
	    
	    int result = binarySearch.binarySearch(new int[] { 2, 4, 8}, 3);
	    System.out.println("Hello");
		SpringApplication.run(SpringBasicApplication.class, args);
	}

}
