package src.equation;

public enum Operateur {
	
	PLUS('+', 0.35),
	MOINS('-', 0.25),
	MULT('*', 0.23),
	DIV('/', 0.17);
	
	private char op;
	private double prob;
	
	Operateur(char op, double prob) {
		this.op = op;
		this.prob = prob;
	}
	
	public char getOp() {
		return op;
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
	
	public static Operateur opAleatoire(boolean plus, boolean moins, 
													boolean mult, boolean div) {
		double sum = 0;
		double randomValue = Math.random();
		double[] newProb = new double[4];
		
		if (plus) sum += Operateur.PLUS.prob;
		if (moins) sum += Operateur.MOINS.prob;
		if (mult) sum += Operateur.MULT.prob;
		if (div) sum += Operateur.DIV.prob;
		
		newProb[0] = Operateur.PLUS.prob/sum;
		newProb[1] = Operateur.MOINS.prob/sum;
		newProb[2] = Operateur.MULT.prob/sum;
		newProb[3] = Operateur.DIV.prob/sum;
		
		if (randomValue < newProb[0]) {
			return Operateur.PLUS;
		} else if (randomValue < newProb[0] + newProb[1]) {
			return Operateur.MOINS;
		} else if (randomValue < newProb[0] + newProb[1] + newProb[2]) {
			return Operateur.MULT;
		} else {
			return Operateur.DIV;
		}
	}

}
