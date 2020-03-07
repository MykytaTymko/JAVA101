//сортировка методом Шелла

package Objectives;

public class Objective_4
{
      	public static void main(String[] args)
        {
		int[] array = {30, 2, 10, 4, 6, 5};
		int length = array.length;
                int step, j, k, tmp;
               
                for (step = length / 2; step > 0; step /= 2)
                    for (k = step; k < length; k++)
                        for(j = k - step; j >= 0 && array[j] > array[j + step]; j -= step)
                        {
                            tmp = array[j];
                            array[j] = array[j + step];
                            array[j + step] = tmp;
                        }

		for (int i = 0; i < length; i++) {
			System.out.print(array[i] + " ");
		}
	}
}  
