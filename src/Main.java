
public class Main {

	static Bus cdb = new Bus();	
	static Bus ndb = new Bus();	
	
	static Load load = new Load(3);
	static Store store = new Store(3);
	static ADD add = new ADD(3);
	static MUL mul = new MUL(3);
	static ROB rob = new ROB(6);
	static Instructions instructions = new Instructions(ndb,load,add,mul,rob);
	
	static Thread thLoad = new Thread(load);
	static Thread thStore = new Thread(store);
	static Thread thAdd = new Thread(add);
	static Thread thMul = new Thread(mul);
	static Thread thInstruction = new Thread(instructions);

	public static void main (String [ ] args) {
		//System.out.println("Tomasulo begging...");
		thLoad.start();
		thStore.start();
		thAdd.start();
		thMul.start();
		System.out.println(
				instructions.getNext()[0] + " " +
				instructions.getNext()[1] + " " +
				instructions.getNext()[2] + " " +
				instructions.getNext()[3]
				);
		
		
    }
	
	
}
