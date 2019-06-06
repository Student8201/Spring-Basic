package com.example.springbasic;

import org.springframework.stereotype.Component;

import com.example.springbasic.service.SortAlgorithm;

@Component
public class BubbleSortAlgorithm implements SortAlgorithm {
  
  public int[] sort(int[] numbers)  {
     // logic for Bubble Sort
	  System.out.println("logic bubble sort");
    return numbers;
  }
}