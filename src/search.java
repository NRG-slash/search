import java.util.Scanner;
/**
 * 
 */

/**
*
* Name: Laturski, Garrett William
* Teacher: Mr.Hardman
* Assignment # I don't know
* Date Last Modified: 11/21/2016
*
*/
public class search {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner userInput = new Scanner(System.in);
		
		int[] array = {1,2,3,4,5,6,7,8,9,10};
		int index = -1;
		int userValue;
		
		
		
		
		for(int i = 0; i < array.length; i++){
			
			System.out.print(array[i] + "   ");
			
		}
		
		System.out.println();
		System.out.println("What value do you want the index of? ");
		userValue = userInput.nextInt();
		
		for(int i = 0; i< array.length; i++){
			if(array[i] == userValue){
				index = i;
			}
		}
		
		if(index == -1){
			System.out.println("This is not in the array!");
		}else {
			System.out.println(userValue + " is at index " + index);
		}
		
		
		userInput.close();
		
	}

}