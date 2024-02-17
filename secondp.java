class SY2022bit033{
	//4-5 approaches for this code
	//using digit and char at use function for standard form inside for loop  for ex 501 = 5*100 + 0*10 + 1*1 also if 5<0 && 0<5 then valid
//	  public static native long currentTimeMillis();
//         public static native long nanoTime();

//start time = sop
//call aproach 1
//end time =sop
//total time taken

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
	 
	public static int getValidRegistrationCount(String[] registrations){
		int validcount = 0;
		for(String reg_no : registrations){
			if(validRegistration(reg_no)==true){
			 	validcount++;
				}
		}
		
		return validcount;
	}
	
	public static int getValidRegistrationCountLS50(String[] registrations){
	int validcount = 0;
		for(String reg_no : registrations){
			String numbers = reg_no.substring(7,10);
			int num = Integer.parseInt(numbers);
			if(validRegistration(reg_no)==true && num <= 50){
					validcount++;					
			}
		}
	return validcount;
	}
	
	public static int getValidRegistrationCountls50(String[] registrations){
	int validcount = 0;
		for(String reg_no : registrations){
			String numbers = reg_no.substring(7,10);
			int num = Integer.valueOf(numbers);
			if(validRegistration(reg_no)==true && num <= 50){
					validcount++;					
			}
		}
	return validcount;
	}
	
	public static int getValidRegistrationCountls50(String[] registrations){
	int validcount = 0;
		for(String reg_no : registrations){
			String numbers = reg_no.substring(7,10);
			int num = Integer.(numbers);
			if(validRegistration(reg_no)==true && num <= 50){
					validcount++;					
			}
		}
	return validcount;
	}
	
	
	public static void main(String[] args){
		String[]  registrations={"2022bit033","2023bin034","2021bec099","2022bme086","2023bit012","2023bcs134","2022bcs122","2022bce036"};
		
		 for (String reg_no : registrations) {
            if (validRegistration(reg_no)) {
                System.out.println(reg_no + " is valid");
            } else {
                System.out.println(reg_no + " is invalid");
            }
        }

        System.out.println("Count of valid registration numbers:  ");
        System.out.println(getValidRegistrationCount(registrations));
          System.out.println("Count of valid registration numbers which is less than or equal to 50:  ");
             System.out.println(getValidRegistrationCountLS50(registrations));
              System.out.println(getValidRegistrationCountls50(registrations));
    }
		
	}
	
	

