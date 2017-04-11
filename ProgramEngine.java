import java.util.Random;

/**
 * 
 */

/**
 * @author MingKie
 *
 */
public class ProgramEngine {
	private final int RUNNING = 0;
	private final int READY = 1;
	private final int BLOCKED = 2;
	private int[] currentRegisters;
	private ProcessControlBlock initProcess;
	private ProcessControlBlock currentProcess;
	private ProcessControlBlock[] table;
	private int size;
	private int currentID;
	
	public ProgramEngine() {
		size = 0;
		currentID = 1;
		currentRegisters = new int[6];
		table = new ProcessControlBlock[100];
		initProcess = new ProcessControlBlock(currentID, "init", "root", RUNNING, 
				generateRegVal(), generateRegVal(), generateRegVal(), 
				generateRegVal(), generateRegVal(), generateRegVal());
		table[size] = initProcess;
		size = size + 1;
		currentProcess = initProcess;
		setCurrent(initProcess);
	}
	
	public void setCurrent(ProcessControlBlock process) {
		currentProcess = process;
		currentRegisters[0] = process.getPc();
		currentRegisters[1] = process.getSp();
		currentRegisters[2] = process.getR0();
		currentRegisters[3] = process.getR1();
		currentRegisters[4] = process.getR2();
		currentRegisters[5] = process.getR3();
	}
	
	public int generateRegVal() {
		Random rand = new Random();
		int value = rand.nextInt(2147483647);
		return value;
	}
	
	public void fork() {
		currentID = currentID + 1;
		ProcessControlBlock copyProcess = new ProcessControlBlock(currentID, currentProcess.getName(), 
				currentProcess.getUser(), READY, currentProcess.getPc(), currentProcess.getSp(), 
				currentProcess.getR0(), currentProcess.getR1(), currentProcess.getR2(), currentProcess.getR3());
		table[size] = copyProcess;
		size = size + 1;
	}
	
	public void kill(int ID) {
		
	}
	
	public void execve(String name, String user) {
		
	}
	
	public void block() {
		int PID = currentProcess.getID();
		for(int i = 0; i < size; ++i) {
			if(table[i].getID() == PID) {
				table[i].setStatus(BLOCKED);
			}
		}
		randSelect();
	}
	
	public void yield() {
		int PID = currentProcess.getID();
		for(int i = 0; i < size; ++i) {
			if(table[i].getID() == PID) {
				table[i].setStatus(READY);
			}
		}
		randSelect();
	}
	
	public void exit() {
		int PID = currentProcess.getID();
		int index = 0;
		for(int i = 0; i < size; ++i) {
			if(table[i].getID() == PID) {
				table[i] = null;
				index = i;
			}
		}
		shiftLeft(index);
		randSelect();
	}
	
	public void print() {
		System.out.println("CPU:");
		System.out.println(" PID = " + currentProcess.getID());
		System.out.println(" PC = " + currentProcess.getPc() + "   SP = " + currentProcess.getSp());
		System.out.println(" R0 = " + currentProcess.getR0() + "   R1 = " + currentProcess.getR1());
		System.out.println(" R2 = " + currentProcess.getR2() + "   R3 = " + currentProcess.getR3());
		System.out.println();
		System.out.println("Process Table:");
		System.out.printf("%4s %13s %9s %7s %11s %11s %11s %11s %11s %11s", "PID", "Program",
				"User", "Status", "PC", "SP", "R0", "R1", "R2", "R3");
		System.out.println();
		for (int i = 0; i < size; ++i) {
			System.out.printf("%4d %13s %9s %7d %11d %11d %11d %11d %11d %11d", table[i].getID(), 
					table[i].getName(), table[i].getUser(), table[i].getStatus(), table[i].getPc(),
					table[i].getSp(), table[i].getR0(), table[i].getR1(), table[i].getR2(), table[i].getR3());
			System.out.println();	
		}
		System.out.println();
		//System.out.println(Integer.toHexString(table[0].getPc()));
	}
	
	public void unblock(int ID) {
		boolean found = false;
		for (int i = 0; i < size; ++i) {
			if (table[i].getID() == ID) {
				if (table[i].getStatus() == BLOCKED) {
					table[i].setStatus(READY);
					found = true;
				} else {
					System.out.println("Selected process is not blocked.");
				}
			}
		}
		if (!found) {
			System.out.println("Enter a correct PID.");
		}
	}
	
	public void randSelect() {
		boolean foundReady = false;
		Random rand = new Random();
		int randVal;
		while (!foundReady) {
			randVal = rand.nextInt(size);
			if(table[randVal].getStatus() == READY) {
				currentProcess = table[randVal];
				table[randVal].setStatus(RUNNING);
				foundReady = true;
			}
		}
	}
	
	public void shiftLeft(int index) {
		for (int i = index; i < size; ++i) {
			if (i == size - 1) {
				table[i] = null;
			} else {
				table[i] = table[i + 1];
			}
		}
		size = size - 1;
	}
	
}
