package HelloAspectJ;

public class HelloWorld {
	public static void main(String[] args) {
		String msg = "Hello AspecftJ!";
		String name = "Casper";
		
		say(msg);
		sayToPerson(msg, name);
	}
	
    public static void say(String message) {
        System.out.println(message);
    }
    
    public static void sayToPerson(String message, String name) {
        System.out.println(name + ", " + message);
    }
}
