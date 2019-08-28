package profile;

public class Greeter {
	
	private String name;
	
	Greeter(String name) {
		this.name = name;
	}
	
	public String sayHello() {
		return "Hello " + this.name + " !";
	}

}
