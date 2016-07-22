/* Oscar Hedblad
 * COP3330, 0001
 * 
 * DESCRIPTION: Prints every Kth element from an array.
 * The code takes input from the user, first the length of the array, then the 
 * actual values to be stored in the array, and lastly the value for k. 
 */

// Import scanner.
import java.util.Scanner;

public class ElementK {

		// Main function
	public static void main(String[] args) {

		// Creates a scanner named "input"
		Scanner input = new Scanner(System.in);
		// Asks the user to enter the size of an array.
		System.out.println("Enter the size of an array: ");
		// Creates an int[] array and gets the input from the user.
		int[] list = new int[input.nextInt()];
		// While the length of the list does NOT equal to zero, enter loop.
		while(list.length != 0){
			// Asks user to enter the elements of the array.
			System.out.println("Enter the elements of the array: ");
			// for-loop that runs until i is no longer less than the length of list.
			for(int i = 0; i < list.length; i++){
				// list at index [i] gets the next integer entered and stores in"input".
				list[i] = input.nextInt();
			}
			// Asks user to enter value for k.
			System.out.println("Enter a value for K: ");
			// integer k is created and set to the next integer entered by user.
			int k = input.nextInt();
			// String str gets created and set equal to list at index [k-1]. Value of k, minus one.
			String str = "" + list[k-1];
			
			//for-loop that runs until (k-1) + (i*k) is less than the length of list. 
			for(int i = 1; ((k-1) + (i*k)) < list.length; i++){
				/* str = str + list at index (k-1) + (i*k). This yields the correct array numbers
				 * to be printed. If k is 2 and the array is 1,2,3,4. It will print 2 & 4.
				 */
				
				str += " " + list[(k-1) + (i*k)];
			}
			// Print out what is stored in "str"
			System.out.println(str);
			// Asks the user again to enter another array size.
			System.out.println("Enter the size of another array: ");
			// Stores the new input from user in list.
			list = new int[input.nextInt()];
		}
		// Exits the program.
		System.exit(0);
	}



}
