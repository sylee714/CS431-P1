/**
 * 
 */

/**
 * @author MingKie
 *
 */
public class ProcessControlBlock {
	private int ID;
	private String name;
	private String user;
	private int status;
	private int pc;
	private int sp;
	private int r0;
	private int r1;
	private int r2;
	private int r3;
	public ProcessControlBlock(int ID, String name, String user, int status, int pc, int sp, int r0, int r1, int r2,
			int r3) {
		super();
		this.ID = ID;
		this.name = name;
		this.user = user;
		this.status = status;
		this.pc = pc;
		this.sp = sp;
		this.r0 = r0;
		this.r1 = r1;
		this.r2 = r2;
		this.r3 = r3;
	}
	public int getID() {
		return ID;
	}
	public void setID(int ID) {
		this.ID = ID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public int getPc() {
		return pc;
	}
	public void setPc(int pc) {
		this.pc = pc;
	}
	public int getSp() {
		return sp;
	}
	public void setSp(int sp) {
		this.sp = sp;
	}
	public int getR0() {
		return r0;
	}
	public void setR0(int r0) {
		this.r0 = r0;
	}
	public int getR1() {
		return r1;
	}
	public void setR1(int r1) {
		this.r1 = r1;
	}
	public int getR2() {
		return r2;
	}
	public void setR2(int r2) {
		this.r2 = r2;
	}
	public int getR3() {
		return r3;
	}
	public void setR3(int r3) {
		this.r3 = r3;
	}
	
}
