package DEITEL.Chapter19;

// Fig. 19.7: SelectionSortTest.java
// Testing the selection sort class.
public class SelectionSortTest
{public static void main( String[] args )
{
// create object to perform selection sort
    SelectionSort sortArray = new SelectionSort( 10 );
    System.out.println( "Unsorted array:" );
    System.out.println( sortArray + "\n" ); // print unsorted array
    sortArray.sort(); // sort array
    System.out.println( "Sorted array:" );
    System.out.println( sortArray ); // print sorted array
} // end main
} // end class SelectionSortTest