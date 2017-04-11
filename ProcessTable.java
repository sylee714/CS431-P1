import java.util.Scanner;

/**
 * 
 */

/**
 * @author MingKie
 *
 */
public class ProcessTable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ProgramEngine program = new ProgramEngine();
		program.print();
		System.out.println("fork");
		program.fork();
		program.print();
		System.out.println("fork");
		program.fork();
		program.print();
		System.out.println("fork");
		program.fork();
		program.print();
		System.out.println("yield");
		program.yield();
		program.print();
		System.out.println("block");
		program.block();
		program.print();
		System.out.println("exit");
		program.exit();
		program.print();
	}
	
	
	

}
