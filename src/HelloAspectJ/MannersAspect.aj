package HelloAspectJ;

public aspect MannersAspect {
	pointcut hasBall(HelloWorld hw) : this(hw) && if(hw.getStr().equals("hw"));
	pointcut callSayMessage(HelloWorld hw) :
		this(hw)
		&& call(public static void HelloWorld.say*(..));
	before(HelloWorld hw, HelloWorld hw2) : callSayMessage(hw) && hasBall(hw2) {
		System.out.println("Good day! hw:"+hw.getStr());
	}
	after(HelloWorld hw, HelloWorld hw2) : callSayMessage(hw) && hasBall(hw2) {
		System.out.println("Thank you! hw: "+hw.getStr());
	}
}
