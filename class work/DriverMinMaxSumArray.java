import java.util.Scanner;
import java.util.Arrays;

public class DriverMinMaxSumArray{
public static void main(String [] args){

Scanner input = new Scanner(System.in);

System.out.println("Enter how many element you want: ");
 int numbers = input.nextInt();
 
 int[] element = new int[numbers];


for(int count = 0; count < element.length; count++){
	element[count] = input.nextInt();
	

	}

System.out.println(" total numbers in the array are: " + Arrays.toString(MinMaxSumArray.sumMaxMin(element)));

//System.out.println("min and max numbers in the array are: " + Arrays.toString(MinMaxSumArray.sumMaxMin(element)));

		}


	}