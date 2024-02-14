public class character { 
	public static void main(String[] args) { 
	char a = 'a';
	char Z = 'Z';
		System.out.println(Character.isLowerCase('a')); 
		System.out.println(Character.getNumericValue('a')); 
		System.out.println(Character.getType('Z')); 
		System.out.println(Character.getDirectionality('a')); 
		System.out.println(Character.isMirrored('Z')); 
		System.out.println(Character.isLetter('A')); 
		System.out.println(Character.isTitleCase('a')); 
		System.out.println(Character.toLowerCase(Z)); 
		System.out.println(Character.toUpperCase(a)); 
		System.out.println(Character.isSpace('a')); 
		System.out.println(Character.isSpaceChar('a')); 
		System.out.println(Character.isWhitespace('a'));
		System.out.println(Character.isSpaceChar(' ')); 
		System.out.println(Character.isWhitespace(' ')); 
		System.out.println(Character.toString('a')); 
		System.out.println(Character.hashcode()); 
		System.out.println(Character.compare('a','b')); 
		System.out.println(Character.MIN_VALUE()); 
		System.out.println(Character.MAX_VALUE()); 
		
	} 
}
