class SY2022bit033{
	
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
	
	public static void main(String[] args){
		String[]  registrations={"2022bit033","2022bin034","2022bec099","2022bme086","2022bcs122","2022bce036"};
		
		 for (String reg_no : registrations) {
            if (validRegistration(reg_no)) {
                System.out.println(reg_no + " is valid");
            } else {
                System.out.println(reg_no + " is invalid");
            }
        }

        System.out.println("Count of valid registration numbers:  ");
        System.out.println(getValidRegistrationCount(registrations));
    }
		
	}
