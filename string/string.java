class string{
	public static void main(String[] args){
	String s1 = "pranali";
	String s2 = "sawadh";
	System.out.println("length of the given String is " +s1.length());		 
	System.out.println("method to check if the string is empty or not  " +s1.isEmpty());
	System.out.println("the charachter at the given number is  " +s1.charAt(3));
	System.out.println("it will point the code at postion 2  " +s1.codePointAt(2));		
	System.out.println("convert the given String to lowercase  " +s1.toLowerCase());
        System.out.println("convert the given String to uppercase  "+s1.toUpperCase());
        System.out.println("trim the given string  "+s1.trim());
        System.out.println("print the value of s1  "+s1.valueOf(s1));
	System.out.println("check if the string is blans1k or not  "+s1.isBlank());
	System.out.println("print the value of s given times in the function  "+s1.repeat(2));
	System.out.println("hashcode of s1  "+s1.hashCode());
	System.out.println("check if the string ends with the given charachter  "+s1.endsWith("i"));
	System.out.println("check if the string starts with the given charachter  "+s1.startsWith("p"));
	System.out.println("merge two Strings  "+s1.concat(s2));
	System.out.println("Checks whether a string contains a sequence of characters  " +s1.contains("prana"));
	System.out.println("replace n with j  "+s1.replace("n","j"));
	System.out.println("replace pranali with vaishali"+s1.replaceAll("pranali","vaishali"));
	System.out.println("compare the two strings" + s1.compareTo(s2));
	System.out.println("split string into substring "+s1.split(s1,3));
	System.out.println("returns the bytes requires for each charachter  "+s1.getBytes());
	}
}
