public class Sorts
{
	public Sorts()
	{
  
    }
	   public static void selectionSort (int[] numbers)
	   {
	      int min, temp;

	      for (int index = 0; index < numbers.length-1; index++)
	      {
	         min = index;
	         for (int scan = index+1; scan < numbers.length; scan++)
	            if (numbers[scan] < numbers[min])
	               min = scan;

	         // Swap the values
	         temp = numbers[min];
	         numbers[min] = numbers[index];
	         numbers[index] = temp;
	      }
	   }
}
