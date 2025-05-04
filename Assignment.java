
		public class Assignment{

	
	public static int findMultiple(int number){

          return (number * 5) ;

}
      /*
	public static int displayPrimeNumbers(int number){



      }
          
	

	public static String displayAge(int ageYears){
	 int  years = ageYears;
	 int months = ageYears * 12;
	 int days  = ageYears * 365;
	 int minutes = days * 24 * 60;
	 int seconds = minutes * 60;

		return "+ years +"  " + months +" "+ days +" "+ minutes + " " + seconds + " ;	
         
	} 
		*/

public static String findMultiplesOf7Not5(int number) { 			
 if (number < 2000 || number > 3200) {
  return " insert number between that range";
 
  } else if (number % 7 == 0 && number % 5 != 0) {
 		
 return "number is divisible by 7 and not divisible by 5";
 }else{
 return "number is not a multiple of 5";
 				}
 				
}


	public static String displayDogAge(String name, int humanYears) {
 		return String.format("%s: %d dog year(s) old", name, humanYears * 7);
 	}


	 public static int computeSumOfNumber(int number){ 
		
		int sum = 0;
		for(int count = 1; count <= number; count++){
		sum = sum + count;
		  }	 
		
		return (sum);
	}


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