package com.example.springbasic;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.example.springbasic.service.SortAlgorithm;

@Component
@Primary
public class QuickSortAlgorithm implements SortAlgorithm {
  
  public int[] sort(int[] numbers) {
    // logic for Quick Sort
	  System.out.println("logic quick sort");
    return numbers;
  }
}