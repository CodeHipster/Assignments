/*
 * Commando set voor de virtuele CPU
 */
public enum VirtualCPU {
	LD ,

	MV ,
	
	ADD,
	
	OUT;
	
	public void exec(CPUState state, int oper1, int oper2) {
		switch(this){
			case LD:
				state.setRegister(oper1, oper2);
				return;
			case MV:
				state.setRegister(oper1, state.getRegister(oper2));
				return;
			case ADD:
				int dst = state.getRegister(oper1);
				int src = state.getRegister(oper2);
				int sum = dst + src;

				dst = sum & 0x000000ff;
				state.setRegister(oper1, dst);
				int overload = state.getRegister(oper1 + 1) | ((sum & 0x0000ff00) >> 8);
				state.setRegister(oper1+1, overload);
				return;
			case OUT:
				state.setPort(oper2, state.getRegister(oper1));
				return;

		}
	}
}
