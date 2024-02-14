class Father{
	int balance = 100;
	public static String surname;
	
	public static void main(String[] args){
		Father son = new Father();
		System.out.println(son.balance);
		System.out.println(son);
		System.out.println(son.fun(10,20,30));
	}
	public int fun(int a,int... b){
		System.out.println(a);
		System.out.println(b);
		return 0;
	}
	
	public int sum(long a,int b){
		System.out.println("inside sum(long,int)");
		return a+b;
	}
}

