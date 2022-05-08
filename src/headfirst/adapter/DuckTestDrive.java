package headfirst.adapter;

public class DuckTestDrive {

	private static void testDuck(Duck duck) {
		duck.quack();
		duck.fly();
		System.out.println();
	}

	public static void main(String[] args) {
		MallardDuck duck = new MallardDuck();
 
		WildTurkey turkey = new WildTurkey();
		Duck turkeyAdapter = new TurkeyAdapter(turkey);
   
		System.out.println("The Turkey says...");
		turkey.gobble();
		turkey.fly();
		System.out.println();
 
		System.out.println("The Duck says...");
		testDuck(duck);
  
		System.out.println("The TurkeyAdapter says...");
		testDuck(turkeyAdapter);
	}
}