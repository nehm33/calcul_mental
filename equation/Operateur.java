package equation;

public enum Operateur {
	
	PLUS('+'),
	MOINS('-'),
	MULT('*'),
	DIV('/');
	
	private char op;
	
	Operateur(char op) {
		this.op = op;
	}
	
	public int evaluer(int a, int b) {
		switch(this.op) {
			case '+':
				return a+b;
			case '-':
				return a-b;
			case '*':
				return a*b;
			case '/':
				return a/b;
			default:
				return -1;
		}
	}
	
	public String toString() {
		return ""+this.op;
	}

}
