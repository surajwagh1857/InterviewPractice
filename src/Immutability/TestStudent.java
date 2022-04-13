package Immutability;

public class TestStudent {
public static void main(String[] args) {
	Address add=new Address(416110,"pune","india");
	Student std=new Student(100,"suraj",add);

	System.out.println("Befor changing"  +std);
	add.setCity("Mumbai");
	System.out.println("after changing"  +std);
}	
	
}
