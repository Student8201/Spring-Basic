public class SpringApplication {
  
  // What are the beans?
  // What are the dependencies of a bean?
  // Where to search for beans?
  
  public static void main(String[] args) {
    
    BinarySearchImpl binarySearch = new BinarySearchImpl(new BubbleSortAlgorithm());
    
    int result = binarySearch.binarySearch(new int[] { 2, 4, 8}, 3);
    System.out.println("Hello");
  }
}