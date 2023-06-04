package compilador;

import java.util.Stack;

public class Semantico implements Constants {

	private static final String tipoFloat = "float64";
	private static final String tipoInt = "int64";
	private static final String tipoBoolean = "bool";

	private String operador = "";
	private String codigo = "";
	private Stack<String> pilhaTipos = new Stack<String>();

	public String getOperador() {
		return operador;
	}
	
	public String getCodigo() {
		return codigo;
	}
	
	public void executeAction(int action, Token token) throws SemanticError {
		System.out.println("Ação #" + action + ", Token: " + token);
		switch (action) {
		case 1:
			doAcaoSemantica1();
			break;
		case 2:
			//doAcaoSemantica2();
			break;
		case 3:
			doAcaoSemantica3();
			break;
		case 4:
			doAcaoSemantica4();
			break;
		case 5:
			doAcaoSemantica5(token);
			break;
		case 6:
			doAcaoSemantica6(token);
			break;
		case 8:
			//doAcaoSemantica8();
			break;
		case 9:
			doAcaoSemantica9(token);
			break;
		case 10:
			doAcaoSemantica10();
			break;
		case 11:
			//doAcaoSemantica11();
			break;
		case 12:
			doAcaoSemantica12();
			break;
		case 13:
			//doAcaoSemantica13();
			break;
		case 14:
			doAcaoSemantica14();
			break;
		case 15:
			//doAcaoSemantica15();
			break;
		case 16:
			//doAcaoSemantica16();
			break;
		case 17:
			doAcaoSemantica17();
			break;
		case 18:
			doAcaoSemantica18();
			break;
		case 19:
			//doAcaoSemantica19();
			break;
		case 20:
			doAcaoSemantica20(token);
			break;
		}
	}

	public void doAcaoSemantica1() {
		String tipo1 = pilhaTipos.pop();
		String tipo2 = pilhaTipos.pop();

		if (tipo1 == tipoFloat || tipo2 == tipoFloat) {
			pilhaTipos.push(tipoFloat);
		} else {
			pilhaTipos.push(tipoInt);
		}
	}

	public void doAcaoSemantica3() {
		String tipo1 = pilhaTipos.pop();
		String tipo2 = pilhaTipos.pop();

		if (tipo1 == tipoFloat || tipo2 == tipoFloat) {
			pilhaTipos.push(tipoFloat);
		} else {
			pilhaTipos.push(tipoInt);
		}
		codigo += "mul";
	}

	public void doAcaoSemantica4() {
		String tipo1 = pilhaTipos.pop();
		String tipo2 = pilhaTipos.pop();

		if (tipo1 == tipoFloat || tipo2 == tipoFloat) {
			pilhaTipos.push(tipoFloat);
		} else {
			pilhaTipos.push(tipoInt);
		}
		codigo += "div";
	}

	public void doAcaoSemantica5(Token token) {
		pilhaTipos.push(tipoInt);
		codigo += "ldc.i8" + token.getLexeme();
		codigo += "conv.r8";
	}
	
	public void doAcaoSemantica6(Token token) {
		pilhaTipos.push(tipoFloat);
		codigo += "ldc.r8" + token.getLexeme();
	}

	public void doAcaoSemantica9(Token token) {
		operador += token.getLexeme();
	}

	public void doAcaoSemantica10() {
		//String tipo1 = pilhaTipos.pop();
		//String tipo2 = pilhaTipos.pop();
		if (operador == ">") {
			codigo += "cgt";
		} else if (operador == ">") {
			codigo += "clt";
		} else if (operador == "==") {
			codigo += "ceq";
		}
	}
	public void doAcaoSemantica12() {
		pilhaTipos.push(tipoBoolean);
		codigo += "ldc.i4.0";
	}
	
	public void doAcaoSemantica14() {
		String tipo = pilhaTipos.pop();
		if (tipo.equals(tipoInt)) {
			codigo += "conv.i8";
		} else {
			codigo += ("call void [mscorlib]System.Console::Write(" + tipo + ")");
		}
	}
	
	public void doAcaoSemantica17() {
        codigo += "\n";
	}

	public void doAcaoSemantica18() {
		String tipo1 = pilhaTipos.pop();
		String tipo2 = pilhaTipos.pop();
		if (tipo1 == tipoBoolean && tipo2 == tipoBoolean) {
			pilhaTipos.push(tipoBoolean);
			codigo += "and";
		}
	}
	
	public void doAcaoSemantica20(Token token) {
		pilhaTipos.push(tipoInt);
		codigo += "ldc.i8" + token.getLexeme();
		codigo += "conv.r8";
	}

}
