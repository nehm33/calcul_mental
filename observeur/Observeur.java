package observeur;

import equation.Operation;

public interface Observeur {
	
	public void update(boolean valid, Operation new_o);

}
