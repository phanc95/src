/*
 * testSelectionSort.java
 *
* To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;

public class testSelectionSort1 {
	@Test
	public void test() {
		testPositive();
		testNegative();
		testMixed();
		testDuplicates();
	}

    public testSelectionSort1() {
    }

<<<<<<< HEAD

    public void testMixed(){
    	 int[] arr = new int[5];
         arr[0] = -8;
         arr[1] = 9;
         arr[2] = 7;
         arr[3] = -10;
         arr[4] = -2;

         int[] Sortedarr = new int[5];
         Sortedarr[0] = -10;
         Sortedarr[1] = -8;
         Sortedarr[2] = -2;
         Sortedarr[3] = 7;
         Sortedarr[4] = 9;

         SelectionSort temp = new SelectionSort();

         arr = temp.basicSelectionSort(arr);

         for(int i = 0; i<=4; ++i) {
         	assertTrue("Comparing", arr[i] == Sortedarr[i]);

         }

        /** Test data contains with both positive, negative and zeros **/
    }

    public void testDuplicates(){
    	 int[] arr = new int[5];
         arr[0] = -8;
         arr[1] = 7;
         arr[2] = 7;
         arr[3] = -10;
         arr[4] = -2;

         int[] Sortedarr = new int[5];
         Sortedarr[0] = -10;
         Sortedarr[1] = -8;
         Sortedarr[2] = -2;
         Sortedarr[3] = 7;
         Sortedarr[4] = 7;

         SelectionSort temp = new SelectionSort();

         arr = temp.basicSelectionSort(arr);

         for(int i = 0; i<=4; ++i) {
         	assertTrue("Comparing", arr[i] == Sortedarr[i]);

         }
        /** Test data contains duplicates **/
    }
}
=======
    public void testPositive(){
        int[] arr = new int[5];
        arr[0] = 8;
        arr[1] = 9;
        arr[2] = 7;
        arr[3] = 10;
        arr[4] = 2;

        int[] Sortedarr = new int[5];
        Sortedarr[0] = 2;
        Sortedarr[1] = 7;
        Sortedarr[2] = 8;
        Sortedarr[3] = 9;
        Sortedarr[4] = 10;

        SelectionSort temp = new SelectionSort();

        arr = temp.basicSelectionSort(arr);

        for(int i = 0; i<=4; ++i) {
        	assertTrue("Comparing", arr[i] == Sortedarr[i]);

        }
        /** add tests to check for this unit test **/
    }

    public void testNegative(){
        int[] arr = new int[5];
        arr[0] = -8;
        arr[1] = -9;
        arr[2] = -7;
        arr[3] = -10;
        arr[4] = -2;

        int[] Sortedarr = new int[5];
        Sortedarr[0] = -10;
        Sortedarr[1] = -9;
        Sortedarr[2] = -8;
        Sortedarr[3] = -7;
        Sortedarr[4] = -2;

        SelectionSort temp = new SelectionSort();

        arr = temp.basicSelectionSort(arr);

        for(int i = 0; i<=4; ++i) {
        	assertTrue("Comparing", arr[i] == Sortedarr[i]);

        }

        /** Test data contains negative values only **/
    }
>>>>>>> PosNeg
