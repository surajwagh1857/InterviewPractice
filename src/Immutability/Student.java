package Immutability;

public class Student {
private final int rollNo;
private final String name;
private final Address add;

public Student(int rollNo, String name, Address add) {
	super();
	this.rollNo = rollNo;
	this.name = name;
	Address addr=new Address();
	addr.setPin(add.getPin());
	addr.setCity(add.getCity());
	addr.setCountry(add.getCountry());
	
	this.add= addr;
}

public int getRollNo() {
	return rollNo;
}

public String getName() {
	return name;
}

public Address getAdd() {
	Address address=new Address();
	address.setPin(this.add.getPin());
	address.setCity(this.add.getCity());
	address.setCountry(this.add.getCountry());
	
	return address;
}

@Override
public String toString() {
	return "Student [rollNo=" + rollNo + ", name=" + name + ", add=" + add + "]";
}






}
