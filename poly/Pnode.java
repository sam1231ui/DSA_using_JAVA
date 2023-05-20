package assign.poly;
 

public class Pnode {

	int  base;
	int power;
	Pnode next;
	
	
	public Pnode(int base,int  power) {
		this.base = base;
		this.power = power;
		next = null; 
	}

	@Override
	public String toString() {
		return "(" + this.base + "^" + this.power + ")";
	}
	
	
}

