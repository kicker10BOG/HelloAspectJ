package HelloAspectJ;

public class HelloWorld {
	private String str;
	
	public static void main(String[] args) {
		HelloWorld hw = new HelloWorld();
		hw.exec();
	}
	
	public void exec() {
		String msg = "Hello AspecftJ!";
		String name = "Casper";
		this.str = "hw";
		say(msg);
		sayToPerson(msg, name);
		System.out.println();
		this.str = "hw2";
		say(msg);
		sayToPerson(msg, name);
	}
	
    public static void say(String message) {
        System.out.println(message);
    }
    
    public static void sayToPerson(String message, String name) {
        System.out.println(name + ", " + message);
    }
    
    public String getStr() {
    	return this.str;
    }
}
