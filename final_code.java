class SY2022bit033{

  //function to check whether the given registration number is valid or not 
	public static boolean validRegistration(String registrations){
		String format = "\\d{4}[a-z]{3}\\d{3}";
		String branch_it = "bit";
 		String branch_cse = "bcs";
		String branch_chem = "bce";
		String branch_mech = "bme";
		if(!registrations.matches(format)){
			return false;
		}
		String validbranch = registrations.substring(4,7);
		return validbranch.equals(branch_it) || validbranch.equals(branch_cse) || validbranch.equals(branch_chem) || validbranch.equals(branch_mech);
	 }


//function to get count of valid registration numbers
	public static int getValidRegistrationCount(String[] registrations){
		int validcount = 0;
		for(String reg_no : registrations){
			if(validRegistration(reg_no)==true){
			 	validcount++;
				}
		}
		return validcount;
	}

//function to get count of valid registration number which is less than 50 with approach 1
	public static int getValidRegistrationCountLS50Approach1(String[] registrations){
		int validcount = 0;
		int num;
		for(String reg_no : registrations){
			String numbers = reg_no.substring(7,10);
			 num = Integer.parseInt(numbers);
			if(validRegistration(reg_no)==true && num <= 50){
					validcount++;					
			}
		}
	return validcount;
	}
	

//function to get count of valid registration number which is less than 50 with approach 2
	public static int getValidRegistrationCountLS50Approach2(String[] registrations){
	int validcount = 0;
	int num;
		for(String reg_no : registrations){
			String numbers = reg_no.substring(7,10);
			num = Integer.valueOf(numbers);
			if(validRegistration(reg_no)==true && num <= 50){
					validcount++;					
			}
		}
	return validcount;
	}


//function to get count of valid registration number which is less than 50 with approach 3
	public static int getValidRegistrationCountLS50Approach3(String[] registrations){
	int validcount = 0;
	int num;
		for(String reg_no : registrations){
			String numbers = reg_no.substring(7,10);
			num = Integer.decode(numbers);
			if(validRegistration(reg_no)==true && num <= 50){
					validcount++;					
			}
		}
	return validcount;
	}


//function to get count of valid registration number which is less than 50 with approach 4
		public static int getValidRegistrationCountLS50Approach4(String[] registrations) {
	    int validCount = 0;
	    for (String reg_no : registrations) {
		String number = reg_no.substring(7,10);
		char[] num = number.toCharArray(); 
		if ( validRegistration(reg_no)==true && num.length<= 50 ) {
		    validCount++;
		}
	    }
	    return validCount;
	}

	//main method
	public static void main(String[] args){
		String[]  registrations={"2022bit033","2023bin034","2022bme044","2023bit012","2023bcs134","2022bcs122","2022bce036" ,"2022bit501","2024bec123" , "2021bme001" , "2021bit1233"};
		
		 for (String reg_no : registrations) {
            if (validRegistration(reg_no)) {
                System.out.println(reg_no + " is valid");
            } else {
                System.out.println(reg_no + " is invalid");
            }
        }

        System.out.println("Count of valid registration numbers:  " +getValidRegistrationCount(registrations));
        System.out.println("Count of valid registration numbers which is less than or equal to 50:  " +getValidRegistrationCountLS50Approach1(registrations));


          //calculating average time required by all approaches when we run them 50,100,200,500 times simultaneously and check which approach takes less time
          long averagetime1ap1 = 0;
          long averagetime1ap2 = 0;
          long averagetime1ap3 = 0;
          long averagetime1ap4 = 0;
          long averagetime2ap1 = 0;
          long averagetime2ap2 = 0;
          long averagetime2ap3 = 0;
          long averagetime2ap4 = 0;
          long averagetime3ap1 = 0;
          long averagetime3ap2 = 0;
          long averagetime3ap3 = 0;
          long averagetime3ap4 = 0;
          long averagetime4ap1 = 0;
          long averagetime4ap2 = 0;
          long averagetime4ap3 = 0;
          long averagetime4ap4 = 0;


          //average time taken for approach 1 while running it 50 times 
          for(int i =0;i<50;i++){
           	   long startTime1ap1 = System.nanoTime();
		   getValidRegistrationCountLS50Approach1(registrations);
		   long endTime1ap1 = System.nanoTime();
		   long avgtime1ap1 = (endTime1ap1-startTime1ap1)/50;
		   averagetime1ap1 = avgtime1ap1; 
           }


          //average time taken for approach 1 while running it 100 times 
           for(int i=0;i<100;i++){
		   long startTime2ap1 = System.nanoTime();
		   getValidRegistrationCountLS50Approach1(registrations);
		   long endTime2ap1 = System.nanoTime();
		   long avgtime2ap1 = (endTime2ap1-startTime2ap1)/50;
		   averagetime2ap1 = avgtime2ap1; 
             }

          //average time taken for approach 1 while running it 200 times 
             for(int i=0;i<200;i++){
		   long startTime3ap1 = System.nanoTime();
		   getValidRegistrationCountLS50Approach1(registrations);
		   long endTime3ap1 = System.nanoTime();
		   long avgtime3ap1 =  (endTime3ap1-startTime3ap1)/50;
		   averagetime3ap1 = avgtime3ap1; 
             }

          //average time taken for approach 1 while running it 500 times 
             for(int i=0;i<500;i++){
		   long startTime4ap1 = System.nanoTime();
		   getValidRegistrationCountLS50Approach1(registrations);
		   long endTime4ap1 = System.nanoTime();
		   long avgtime4ap1 =  (endTime4ap1-startTime4ap1)/50;
		   averagetime4ap1 = avgtime4ap1; 
             }

          //average time taken for approach 2 while running it 50 times 
               for(int i =0;i<50;i++){
           	   long startTime1ap2 = System.nanoTime();
		   getValidRegistrationCountLS50Approach2(registrations);
		   long endTime1ap2 = System.nanoTime();
		   long avgtime1ap2 = (endTime1ap2-startTime1ap2)/50;
		   averagetime1ap2 = avgtime1ap2; 
           }


          //average time taken for approach 2 while running it 100 times 
           for(int i=0;i<100;i++){
		   long startTime2ap2 = System.nanoTime();
		   getValidRegistrationCountLS50Approach2(registrations);
		   long endTime2ap2 = System.nanoTime();
		   long avgtime2ap2 = (endTime2ap2-startTime2ap2)/50;
		   averagetime2ap2 = avgtime2ap2; 
             }


          //average time taken for approach 2 while running it 200 times 
             for(int i=0;i<200;i++){
		   long startTime3ap2 = System.nanoTime();
		   getValidRegistrationCountLS50Approach1(registrations);
		   long endTime3ap2 = System.nanoTime();
		   long avgtime3ap2 = (endTime3ap2-startTime3ap2)/50;
		   averagetime3ap2 = avgtime3ap2; 
             }


          //average time taken for approach 2 while running it 500 times 
             for(int i=0;i<500;i++){
		   long startTime4ap2 = System.nanoTime();
		   getValidRegistrationCountLS50Approach2(registrations);
		   long endTime4ap2 = System.nanoTime();
		   long avgtime4ap2 = (endTime4ap2-startTime4ap2)/50;
		   averagetime4ap2 = avgtime4ap2; 
             }


          //average time taken for approach 3 while running it 50 times 
               for(int i =0;i<50;i++){
           	   long startTime1ap3 = System.nanoTime();
		   getValidRegistrationCountLS50Approach3(registrations);
		   long endTime1ap3 = System.nanoTime();
		   long avgtime1ap3 = (endTime1ap3-startTime1ap3)/50;
		   averagetime1ap3 = avgtime1ap3; 
           }


          //average time taken for approach 3 while running it 100 times 
           for(int i=0;i<100;i++){
		   long startTime2ap3 = System.nanoTime();
		   getValidRegistrationCountLS50Approach3(registrations);
		   long endTime2ap3 = System.nanoTime();
		   long avgtime2ap3 = (endTime2ap3-startTime2ap3)/50;
		   averagetime2ap3 = avgtime2ap3; 
             }


          //average time taken for approach 3 while running it 200 times 
             for(int i=0;i<200;i++){
		   long startTime3ap3 = System.nanoTime();
		   getValidRegistrationCountLS50Approach3(registrations);
		   long endTime3ap3 = System.nanoTime();
		   long avgtime3ap3 =  (endTime3ap3-startTime3ap3)/50;
		   averagetime3ap3 = avgtime3ap3; 
             }


          //average time taken for approach 3 while running it 500 times 
             for(int i=0;i<500;i++){
		   long startTime4ap3 = System.nanoTime();
		   getValidRegistrationCountLS50Approach3(registrations);
		   long endTime4ap3 = System.nanoTime();
		   long avgtime4ap3 =  (endTime4ap3-startTime4ap3)/50;
		   averagetime4ap3 = avgtime4ap3; 
             }

          //average time taken for approach 4 while running it 50 times 
               for(int i =0;i<50;i++){
           	   long startTime1ap4 = System.nanoTime();
		   getValidRegistrationCountLS50Approach4(registrations);
		   long endTime1ap4 = System.nanoTime();
		   long avgtime1ap4 = (endTime1ap4-startTime1ap4)/50;
		   averagetime1ap4 = avgtime1ap4; 
           }


          //average time taken for approach 4 while running it 100 times 
           for(int i=0;i<100;i++){
		   long startTime2ap4 = System.nanoTime();
		   getValidRegistrationCountLS50Approach4(registrations);
		   long endTime2ap4 = System.nanoTime();
		   long avgtime2ap4 =(endTime2ap4-startTime2ap4)/50;
		   averagetime2ap4 = avgtime2ap4; 
             }


          //average time taken for approach 4 while running it 200 times 
             for(int i=0;i<200;i++){
		   long startTime3ap4 = System.nanoTime();
		   getValidRegistrationCountLS50Approach4(registrations);
		   long endTime3ap4 = System.nanoTime();
		   long avgtime3ap4 = (endTime3ap4-startTime3ap4)/50;
		   averagetime3ap4 = avgtime3ap4; 
             }


          //average time taken for approach 4 while running it 500 times 
             for(int i=0;i<500;i++){
		   long startTime4ap4 = System.nanoTime();
		   getValidRegistrationCountLS50Approach4(registrations);
		   long endTime4ap4 = System.nanoTime();
		   long avgtime4ap4 = (endTime4ap4-startTime4ap4)/50;
		   averagetime4ap4 = avgtime4ap4; 
             }

          //creating a table to compare average time taken by different approaches while run 50 ,100 ,200 ,500 times
            String[][] datas= { { "approaches","run 50 times" , "run 100 times" , "run 200 times" , "run 500 times"} };
            long[][] data1 = { 
             {1, averagetime1ap1 , averagetime2ap1 , averagetime3ap1 , averagetime4ap1},
             {2,averagetime1ap2 , averagetime2ap2 , averagetime3ap2 , averagetime4ap2},
             {3, averagetime1ap3 , averagetime2ap3 , averagetime3ap3 , averagetime4ap3},
             { 4, averagetime1ap4 , averagetime2ap4 , averagetime3ap4 , averagetime4ap4},		
              };
		printTable(datas);
              	printTable(data1);   	
    	}

      //function to print data
		  public static void printTable(long[][] data) {
        		for (int i = 0; i < data.length; i++) {
            			for (int j = 0; j < data[i].length; j++) {
               				 System.out.printf("%-20s", data[i][j]); // Adjust the width as needed
           			 }
           			 System.out.println(); // Move to the next line after printing each row
       			 }
    		}
    		public static void printTable(String[][] data) {
        		for (int i = 0; i < data.length; i++) {
            			for (int j = 0; j < data[i].length; j++) {
               				 System.out.printf("%-20s", data[i][j]); // Adjust the width as needed
           			 }
           			 System.out.println(); // Move to the next line after printing each row
       			 }
    		}
}

	
	
