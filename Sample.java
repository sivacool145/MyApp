package rajulapati16;


class PClass{

	public void m1(int x) {
		System.out.println("Pclass m1():");
		System.out.println("The value of x:"+ x);
	}

	public void m2(int y) {
		System.out.println("Pclass m2():");
		System.out.println("The value of y:"+ y);
	}
}
public class AnnonymousInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		PClass ob = new PClass()
		{
			public void m1(int x) {

				System.out.println("Cclass m1()");
				System.out.println("The value of x:"+x);

			}

			public void m3(int z) {

				System.out.println("CClass m():");
				System.out.println("The value of z:"+z);
			}

		};


		System.out.println("===Display Ob ====");
		ob.m1(121);
		ob.m2(123);
		//ob.m3(124); generalization
		//CClass ob = new CClass(); its normal inheritance process where one reference is created and it will be binded with all the members of pclass and cclass
		//PClass ob = new CClass(); its generalization process where one reference is created and it will bind with all the members of pclass and overriding members of cclass
		//PClass ob = new PClass(){}; this is anonymous inner class as class extension which is used to achieve generalization process.
		//CClass ob = new PClass(); it is used in type casting

	}	
}

