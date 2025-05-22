
public class ArraySort{

public static int [] sortingArray(int [] number){


for(int i = 0; i < number.length; i++){

 for(int j = i + 1; j < number.length; j++){

      if(number[i] > number[j]){

	int temp = number[i];
	number[i] = number[j];
	number[j] = temp;
		}

}

	}



	return number;


	}
}