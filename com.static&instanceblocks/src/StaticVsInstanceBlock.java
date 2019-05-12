/**
 * @author msfata ProgrammingHelp
 *
 */
public class StaticVsInstanceBlock {
	/*
	 * instance block called when object of this class instantiates
	 */
	{
		System.out.println("hi from instance block");
	}
	/*
	 * static block called on every executions
	 */
	static {
		System.out.println("hi from static block");
	}

	/*
	 * main to test
	 */
	public static void main(String[] args) {
		new StaticVsInstanceBlock();
		new StaticVsInstanceBlock();
	}
}
