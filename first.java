public class first {
	
	public static void myname(){
		System.out.println("hello world");
	}
	
	public static int task1(int [] args){
		return args[0];
	}
	
	public static int task2(int[] args){
		return args[args.length-1];
	}
	
	public static int task3(int[] args){
		return args[args.length-2];
	}
	
	public static int task4(int[] args){
		int sum=0;
		for(int i=0; i<args.length;i++){
			sum=sum+args[i];
		}
		return sum;
	}
	public static void main(String[] args){
		myname();
		int a1[] = {1,2,3,4,5};     
		System.out.println(task1(a1));
		System.out.println(task2(a1));
		System.out.println(task3(a1));
		System.out.println(task4(a1));
	}
}
