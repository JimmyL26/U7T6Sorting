import java.util.Arrays;

public class SortTester
{
  public static void main(String[] args)
  {
    /* --- SELECTION SORT --- */
    int[] arr1 = {9, 15, 20, 29, 38, 53, 54, 34, 64, 70, 75, 80, 81, 83, 94, 96, 97, 99};
    Sort.selectionSort(arr1);
    System.out.println(Arrays.toString(arr1));
 
    /* --- INSERTION SORT --- */ 
    int[] arr2 = {9, 15, 20, 29, 38, 53, 54, 34, 64, 70, 75, 80, 81, 83, 94, 96, 97, 99};
    Sort.insertionSort(arr2);
    System.out.println(Arrays.toString(arr2));

//    Arrays.sort(arr1);
//    System.out.println(Arrays.toString(arr1));
//    Arrays.sort(arr2);
//    System.out.println(Arrays.toString(arr2));

    Sort.selectionSortDescending(arr1);
    System.out.println(Arrays.toString(arr1));
    Sort.insertionSortDescending(arr2);
    System.out.println(Arrays.toString(arr2));
  }
}
