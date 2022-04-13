package Immutability;

public class Employee {
private final int id;
private final String name;


public int getId() {
	return id;
}


public String getName() {
	return name;
}



public Employee(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}


@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + "]";
}


public static void main(String[] args) {
Employee emp1 = new Employee(100, "suraj");

System.out.println(emp1.getId());

}

}
