package constructor;

public class ExecutionSequence {

	public static void main(String[] args) {
		System.out.println("Main Method");
		ExecutionSequence obj = new ExecutionSequence();
		obj.display();

	}
	
	ExecutionSequence(){
		System.out.println("Constructor Block");
	}
	
	public void display() {
		System.out.println("Non-static Display method");
	}
	
	static {
		System.out.println("Static block");
	}
	
	{
		System.out.println("Block");
	}

}
