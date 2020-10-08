import java.util.Scanner;
/**
 * a program that will populate a 10 element array (put   * values into an array) with integers
 * @author Ahmad Zeshan
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //create a scanner 
		Scanner input = new Scanner(System.in);
		//output the message to user
		System.out.println("Please enter in 10 integers to put into the array");
		//make an array
		int [] integers = new int[10];
		//loops the code 10 times
		for(int i = 0; i < 10; i++){
			integers[i] = input.nextInt();
		}
		//output the message to user
		System.out.println("Please enter a number to find");
		//get input value
		int number = input.nextInt();
		//loops the code for how many times the value is in the code
    for(int j = 0; j < integers.length; j++){
			//if the integer is the same as the given number
			if (integers[j] == number){
				//print the location of the index number
				System.out.println(number + " is located at index " + j);
				//else skip the if statement
			} else {}
		}
  }
}
