public class BinarySearchImpl {
  
  private SortAlgorithm sortAlgorithm;
  
  public BinarySearchImpl(SortAlgorithm sortAlgorithm){
    super();
    this.sortAlgorithm = sortAlgorithm;
  }
  
  public int binarySearch(int[] numbers, int numberToSearchFor) {
    
    int[] sortedNumber = sortAlgorithm.sort(numbers);
    
    System.out.println(sortAlgorithm);
    
    return 0;
  }
}