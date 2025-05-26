
		public class Assignment{

	
	// Question 1;
	public static int findMultiple(int number){
        return (number * 5) ;
		
	}


 
	 Question 2
	public static void displayPrimeNumbers() {
	int counter = 0;
    for(int i = 2; ; i++) {
	int count = 0;
    for(int j = 1; j <= i; j++) {
	   if( i % j == 0) {
	    count++;
	  }
	  }
	 if(count == 2) {
	System.out.print(i + " ");
	  counter++;
	  }
	if(counter == 50) {
	  break;
}



      }
          
	
	//Question 3
	public static void displayAge(int ageYears){
	 int  years = ageYears;
	 int months = ageYears * 12;
	 int days  = ageYears * 365;
	 int minutes = days * 24 * 60;
	 int seconds = minutes * 60;
	
	System.out.println("Age is:"+years+" years, "+months+" Months, "+days+" 	Days, "+minutes+" Minutes, "+seconds+" Seconds");

         
	} 
		
	
	// Question 4

	public static String displayDogAge(String name, int humanYears) {
	String dogName = name;
	int dogYear = 7;
	int result = dogYear * humanYears;
			
 	System.out.println("The name of the dog is " +dogName+" and the dog age is "+result);
 	}



	// Question 5
	public static String findMultiplesOf7Not5(int number) { 			
 	if (number < 2000 || number > 3200) {
  	return " insert number between that range";
 
  	} else if (number % 7 == 0 && number % 5 != 0) {
 		
 	return "number is divisible by 7 and not divisible by 5";
 	}else{
 	return "number is not a multiple of 5";
 				}
 				
}


	// Question 6	
	 public static int computeSumOfNumber(int number){ 
		
		int sum = 0;
		for(int count = 1; count <= number; count++){
		sum = sum + count;
		  }	 
		
		return (sum);
	}

	
	// Question 7
	public static boolean isLeapYear(int year){

		if(year % 400 == 0){
			return true;
				}

			if(year % 100 == 0){
				return false;
				
					}

				if(year % 4 == 0){
					return true;
						}
				return false;
	}	

 




}