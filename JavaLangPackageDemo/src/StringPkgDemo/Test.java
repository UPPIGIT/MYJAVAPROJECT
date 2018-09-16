package StringPkgDemo;

public class Test {
	
	private int i;
	public Test(int i) {
		// TODO Auto-generated constructor stub
		
		this.i=i;
	}
	
	public Test modift(int i) {
		
		if (this.i==i) {
			return this;
		} else {
			return new Test(i);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test t1= new Test(10);
		Test t2=t1.modift(100);
		Test t3=t1.modift(10);
		
		System.out.println(t1==t2);
		System.out.println(t1==t3);

	}

}
