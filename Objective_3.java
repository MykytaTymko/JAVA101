//Метод пузырька

package Objectives;

public class Objective_3 
{
    	public static void main(String[] args)
        {
		int[] array = {30, 2, 10, 4, 6};
		int length = array.length;
                boolean isSorted = false;
                int temp;
                
                while(!isSorted)
                {
                    isSorted = true;
                    
                    for ( int j = 0; j < array.length - 1; j++)
                    {
                        if(array[j] > array[j+1])
                        {
                            isSorted = false;
                            temp = array[j];
                            array[j] = array[j+1];
                            array[j+1] = temp;
                        }
                    }
                }

		for (int i = 0; i < length; i++) {
			System.out.print(array[i] + " ");
		}
	}
}
