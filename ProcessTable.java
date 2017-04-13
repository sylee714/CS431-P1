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
		Scanner sc = new Scanner(System.in);
		//System.out.println(sc.hasNext());
		System.out.println(sc.hasNextLine());
		/*
		boolean end = false;
		int ID = 0;
		String command;
		String name;
		String user;
		String checkInt;
		while (!end) {
			System.out.println("Enter a command: ");
			command = sc.next();
			
			switch(command) {
			case "fork":
				System.out.println(command);	
				if (sc.nextLine().isEmpty()) {
					System.out.println("Succes");
				} else  {
					System.out.println("Wrong command");
				}
				break;
			case "block":
				System.out.println(command);	
				if (sc.nextLine().isEmpty()) {
					System.out.println("Succes");
				} else  {
					System.out.println("Wrong command");
				}
				break;
			case "yield":
				System.out.println(command);	
				if (sc.nextLine().isEmpty()) {
					System.out.println("Succes");
				} else  {
					System.out.println("Wrong command");
				}
				break;
			case "exit":
				System.out.println(command);	
				if (sc.nextLine().isEmpty()) {
					System.out.println("Succes");
				} else  {
					System.out.println("Wrong command");
				}
				break;
			case "print":
				System.out.println(command);	
				if (sc.nextLine().isEmpty()) {
					System.out.println("Succes");
				} else  {
					System.out.println("Wrong command");
				}
				break;
			case "kill":
				System.out.println(command);
				checkInt = sc.nextLine();
				if (!checkInt.isEmpty()) {
					System.out.println("after if");
					try {
						ID = Integer.parseInt(checkInt);
						System.out.println("Parsing");
					} catch (NumberFormatException e) {
						System.out.println("Wrong command");
					}
					if (ID > 0) {
						if (sc.nextLine().isEmpty()) {
							System.out.println(ID);
							System.out.println("Succes");
						} else  {
							System.out.println("Wrong command");
						}
					}
					ID = 0;
				} else {
					System.out.println("Missing PID");
				}
				break;
			case "unblock":
				System.out.println(command);
				if (!sc.nextLine().isEmpty()) {
					try {
						ID = Integer.parseInt(sc.next());
						if (sc.nextLine().isEmpty()) {
							System.out.println(ID);
							System.out.println("Succes");
						} else  {
							System.out.println("Wrong command");
						}
					} catch (NumberFormatException ignore) {
						System.out.println("Wrong command");
					}
				} else  {
					System.out.println("Missing PID");
				}
				break;
			case "execve":
				System.out.println(command);	
				if (!sc.nextLine().isEmpty()) {
					name = sc.next();
					if (sc.nextLine().isEmpty()) {
						System.out.println("Missing user name");
					} else {
						user = sc.next();
						if (sc.nextLine().isEmpty()) {
							System.out.println(name);
							System.out.println(user);
							System.out.println("Succes");
						} else  {
							System.out.println("Wrong command");
						}
					}
				} else  {
					System.out.println("Missing program and user name");
				}
				break;
			case "quit":
				end = true;
				break;
			default:
				System.out.println("Wrong command");
				break;
			}
		}
		sc.close();
		*/
	}
	
}
