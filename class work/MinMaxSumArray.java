/* write a program that takes an array of numbers, iterate through the array and adds every number in the array, except the one at a given index.
the program should return the minimum and maximum of the sums obtained. input: [8, 0, 1, 4, 9, 2]  output: [15, 24]
*/


public class MinMaxSumArray{

public static int [] sumMaxMin(int [] numbers){

int total = 0;
 int minSum = Integer.MAX_VALUE;
 int maxSum = Integer.MIN_VALUE;

for(int i =0; i< numbers.length; i++){
total += numbers[i];
}

//for()
 
  if(total > maxSum)
	maxSum = total;
  
  if(total < minSum)
        minSum = total;



return new int[] {minSum, maxSum};


	}


}
