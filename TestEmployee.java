
public class TestEmployee {
	public static void main(String[] args) {
		Employee ram = new Employee();
		System.out.println("Id is "+ram.id);
		System.out.println("ram is "+ram.salary);
		ram.id = 1001;
		ram.firstName = "ram";
		ram.salary = 9999;
		
		System.out.println("Id is "+ram.id);
		System.out.println("Name is "+ram.firstName);
		System.out.println("Name is "+ram.salary);
	}

}
