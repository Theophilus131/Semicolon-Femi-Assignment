
		public class Assignment{

	
	public static int findMultiple(int number){

          return (number * 5) ;

}
      /*
	public static int displayPrimeNumbers(int number){

	for(int count = 1; count <= number; count++ ){

            return ( number % 2 ==1 && number % 3 == 1 || number % 3 == 2 );
      }
          
	*/

	public static String displayAge(int ageYears){
	 int  years = ageYears;
	 int months = ageYears * 12;
	 int days  = ageYears * 365;
	 int minutes = days * 24 * 60;
	 int seconds = minutes * 60;

		return "+ years +"  " + months +" "+ days +" "+ minutes + " " + seconds + " ;	
         

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