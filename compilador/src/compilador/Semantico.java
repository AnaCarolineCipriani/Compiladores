package compilador;

import java.util.Stack;

public class Semantico implements Constants {
	
	private String operador = "";
	private String codigo;
	private Stack<String> pilhaTipos;

	public void executeAction(int action, Token token) throws SemanticError {
		System.out.println("Ação #" + action + ", Token: " + token);
	}
    
    public void doAcaoSemantica1() {
    	String tipo1 = pilhaTipos.peek();
    	String tipo2 = pilhaTipos.peek();
    	
    	String tipoFloat = "float64";
    	String tipoInt = "int64";
    	
		if (tipo1 == tipoFloat || tipo2 == tipoFloat) {
    		pilhaTipos.push(tipoFloat);
    	} else {
    		pilhaTipos.push(tipoInt);
    	}
    	// TODO codigo.adiciona(add);

    }
    
    public void doAcaoSemantica2() {
    	
    }
}
