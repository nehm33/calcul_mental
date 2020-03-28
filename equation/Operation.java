package equation;

public class Operation {
	
	private Operateur op;
	private int opGauche;
	private int opDroite;
	
	public Operation(Operateur op, int opGauche, int opDroite) {
		this.op = op;
		this.opGauche = opGauche;
		this.opDroite = opDroite;
	}

	public Operateur getOp() {
		return op;
	}

	public int getOpGauche() {
		return opGauche;
	}

	public int getOpDroite() {
		return opDroite;
	}
	
	public int getResultat() {
		return op.evaluer(opGauche, opDroite);
	}

	@Override
	public String toString() {
		return "" + opGauche + " " + op + " " + opDroite + " = ";
	}
}
