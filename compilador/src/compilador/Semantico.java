package compilador;

import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.Stack;

public class Semantico implements Constants {

	private static final String tipoFloat = "float64";
	private static final String tipoInt = "int64";
	private static final String tipoBoolean = "bool";
	private static final String tipoString = "string";
	
	private int rotulo = 0;
	private String operador = "";
	private String listaId = "";
	private StringBuilder codigo = new StringBuilder();
	private Stack<String> pilhaTipos = new Stack<String>();
	private Stack<String> pilha_rotulos = new Stack<String>();
	private LinkedHashMap<String, String> tabelaSimbolos = new LinkedHashMap<String, String>();
		
	public void executeAction(int action, Token token) throws SemanticError {
		System.out.println("AÃ§Ã£o #" + action + ", Token: " + token);
		switch (action) {
		case 1:
			doAcaoSemantica1();
			break;
		case 2:
			doAcaoSemantica2();
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
			doAcaoSemantica8();
			break;
		case 9:
			doAcaoSemantica9(token);
			break;
		case 10:
			doAcaoSemantica10();
			break;
		case 11:
			doAcaoSemantica11();
			break;
		case 12:
			doAcaoSemantica12();
			break;
		case 13:
			doAcaoSemantica13();
			break;
		case 14:
			doAcaoSemantica14();
			break;
		case 15:
			doAcaoSemantica15();
			break;
		case 16:
			doAcaoSemantica16();
			break;
		case 17:
			doAcaoSemantica17();
			break;
		case 18:
			doAcaoSemantica18();
			break;
		case 19:
			doAcaoSemantica19();
			break;
		case 20:
			doAcaoSemantica20(token);
			break;
		case 21:
			doAcaoSemantica21();
			break;
		case 22:
			doAcaoSemantica22(token);
			break;
		case 23:
			doAcaoSemantica23(token);
			break;
		case 24:
			doAcaoSemantica24(token);
			break;
		case 25:
			doAcaoSemantica25();
			break;
		case 26:
			doAcaoSemantica26();
			break;
		case 27:
			doAcaoSemantica27();
			break;
		case 28:
			doAcaoSemantica28();
			break;
		case 29:
			doAcaoSemantica29();
			break;
		case 30:
			doAcaoSemantica30();
			break;
		case 31:
			doAcaoSemantica31();
			break;
		case 32:
			doAcaoSemantica32();
			break;
		case 33:
			doAcaoSemantica33();
			break;
		}
	}

	public void doAcaoSemantica1() {
		String tipo1 = pilhaTipos.pop();
		String tipo2 = pilhaTipos.pop();

		if (tipo1.equals(tipoFloat) || tipo2.equals(tipoFloat)) {
			pilhaTipos.push(tipoFloat);
		} else {
			pilhaTipos.push(tipoInt);
		}
		codigo.append("add \n");
	}

	public void doAcaoSemantica2() {

		String tipo1 = pilhaTipos.pop();
		String tipo2 = pilhaTipos.pop();

		if (tipo1.equals(tipoFloat) || tipo2.equals(tipoFloat)) {
			pilhaTipos.push(tipoFloat);
		} else {
			pilhaTipos.push(tipoInt);
		}
		codigo.append("sub \n");
	}

	public void doAcaoSemantica3() {
		String tipo1 = pilhaTipos.pop();
		String tipo2 = pilhaTipos.pop();

		if (tipo1.equals(tipoFloat) || tipo2.equals(tipoFloat)) {
			pilhaTipos.push(tipoFloat);
		} else {
			pilhaTipos.push(tipoInt);
		}
		codigo.append("mul \n");
	}

	public void doAcaoSemantica4() {
		String tipo1 = pilhaTipos.pop();
		String tipo2 = pilhaTipos.pop();

		if (tipo1.equals(tipoFloat) || tipo2.equals(tipoFloat)) {
			pilhaTipos.push(tipoFloat);
		} else {
			pilhaTipos.push(tipoInt);
		}
		codigo.append("div \n");
	}

	public void doAcaoSemantica5(Token token) {
		pilhaTipos.push(tipoInt);
		codigo.append("ldc.i8\t");
		String lexeme = token.getLexeme().replace(".", "");
		codigo.append(lexeme + " \n");
		codigo.append("conv.r8 " + " \n");
	}

	public void doAcaoSemantica6(Token token) {
		pilhaTipos.push(tipoFloat);
		String lexeme = token.getLexeme().replace(".", "");
		lexeme = lexeme.replace(",", ".");
		codigo.append("ldc.r8\t" + lexeme + " \n");
	}

	public void doAcaoSemantica8() {
		codigo.append("ldc.i8 -1 \n");
		codigo.append("conv.r8 \n");
		codigo.append("mul \n");
	}

	public void doAcaoSemantica9(Token token) {
		operador = token.getLexeme();
	}

	public void doAcaoSemantica10() throws SemanticError {
		pilhaTipos.pop();
		pilhaTipos.pop();

		pilhaTipos.push(tipoBoolean);

		switch (operador) {

		case "==":
			codigo.append("ceq \n");
			break;
		case "<":
			codigo.append("clt \n");
			break;
		case ">":
			codigo.append("cgt \n");
			break;
		case ">=":
			codigo.append("clt \n");
			codigo.append("ldc.i4.0 \n");
			codigo.append("ceq \n");
			break;
		case "<=":
			codigo.append("cgt \n");
			codigo.append("ldc.i4.0 \n");
			codigo.append("ceq \n");
			break;
		case "!=":
			codigo.append("ceq \n");
			codigo.append("ldc.i4.0 \n");
			codigo.append("ceq \n");
			break;
		default:
			break;
		}
	}

	public void doAcaoSemantica11() {
		pilhaTipos.push(tipoBoolean);
		codigo.append("ldc.i4.1 \n");
	}

	public void doAcaoSemantica12() {
		pilhaTipos.push(tipoBoolean);
		codigo.append("ldc.i4.0 \n");
	}

	public void doAcaoSemantica13() {
		codigo.append("ldc.i4.1 \n");
		codigo.append("xor \n");
	}

	public void doAcaoSemantica14() {
		String tipo = pilhaTipos.pop();
		if (tipo.equals(tipoInt)) {
			codigo.append("conv.i8 \n");
		}

		codigo.append(("call void [mscorlib]System.Console::Write(" + tipo + ") \n"));

	}

	public void doAcaoSemantica15() {
		codigo.append((".assembly extern mscorlib{} \n.assembly _codigo_objeto{} \n.module _codigo_objeto.exe  "
				+ "\n.class public _UNICA{ \n.method static public void _principal(){ \n.entrypoint \n"));
	}

	public void doAcaoSemantica16() {
		codigo.append("ret \n} \n}");
	}

	public void doAcaoSemantica17() {
		codigo.append("ldstr " + "\"\\n\"\n");
		codigo.append("call void [mscorlib]System.Console::Write(string) \n");
	}

	public void doAcaoSemantica18() {
		String tipo1 = pilhaTipos.pop();
		String tipo2 = pilhaTipos.pop();
		if (tipo1.equals(tipoBoolean) && tipo2.equals(tipoBoolean)) {
			pilhaTipos.push(tipoBoolean);
			codigo.append("and ");
		}
	}

	public void doAcaoSemantica19() {
		String tipo1 = pilhaTipos.pop();
		String tipo2 = pilhaTipos.pop();
		if (tipo1.equals(tipoBoolean) && tipo2.equals(tipoBoolean)) {
			pilhaTipos.push(tipoBoolean);
			codigo.append("or ");
		}
	}

	public void doAcaoSemantica20(Token token) {
		pilhaTipos.push(tipoString);
		codigo.append("ldstr\t" + token.getLexeme() + " \n");
	}
	
	public void doAcaoSemantica21() {
		codigo.append(".locals(int64 _temp_int, float64 _temp_float,\r\n"
				+ " string _temp_str, bool _temp_bool) ");
	}
	
	public void doAcaoSemantica22(Token token) {
		addListaId(token.getLexeme());
	}
	
	public void doAcaoSemantica23(Token token) throws SemanticError {
		boolean encontrou = false;
		codigo.append("ldloc " + token.getLexeme() + " \n");

		String lexeme = token.getLexeme();
		for (String identificador : tabelaSimbolos.keySet()) {
			if (lexeme.equals(identificador)) {
				encontrou = true;
				String tipoIdentificador = tabelaSimbolos.get(identificador);
				if (tipoIdentificador != null && tipoIdentificador.equals(tipoInt)) {
					codigo.append("conv.r8 \n");
				}
				pilhaTipos.push(tipoIdentificador);
				break;
			}
		}
		if (!encontrou) {
			throw new SemanticError("identificador " + token.getLexeme() + " nÃ£o declarado");
		}

		
	}

	private String[] getIdentificadores() {
		String[] identificadores = getListaId().split(" ");
		return identificadores;
	}
	
	public void doAcaoSemantica24(Token token) {
		String tipo1 = pilhaTipos.pop();
		
		String[] identificadores = getIdentificadores();
		int n = identificadores.length -1 ;
		
		for (int i = 0; i < n; i++) {
			codigo.append("dup \n");
		}
		
		for (String string : identificadores) {
			String id = tabelaSimbolos.get(token.getLexeme());
			if (id == null) {
				tabelaSimbolos.put(string, tipo1);
				codigo.append(".locals (" + tipo1 + " " + string + ") \n");
			}
			
			if (tipo1.equals(tipoInt)) {
				codigo.append("conv.i8 \n");
			}
			
			codigo.append("stloc " + string + " \n"); 
				
		}
		
		
		
		clearIdentificadores();
		
	}
	
	public void doAcaoSemantica25() {
		String tipoExpressao = pilhaTipos.pop();
		String temp = "";
		
		switch (tipoExpressao) {
		case tipoInt:
			codigo.append("conv.i8 \n");
			temp = "_temp_int \n";
			break;
		case tipoFloat:
			temp = "_temp_float \n";
			break;
		case tipoString:
			temp = "_temp_str \n";
			break;
		case tipoBoolean:
			temp = "_temp_bool \n";
			break;
		default:
			break;
		}
		
		addListaId(temp);
		codigo.append("stloc " + temp + " ");
		
	}
	
	public void doAcaoSemantica26() throws SemanticError {
		codigo.append("brfalse " + rotulo++ + " ");
		
		String[] identificadores = getIdentificadores();
		int posicao = identificadores.length -1;
		identificadores = new String[posicao];
		String tipoTemp = pilhaTipos.peek();
		
		codigo.append("ldloc ");
		
		for (int i = 0; i < posicao; i++) {
			codigo.append("dup \n");
		}
		
		for (String identificador : identificadores) {

			if (!tabelaSimbolos.containsKey(identificador)) {
				codigo.append(".locals (" + tipoTemp + " " + identificador + ") \n");
				tabelaSimbolos.put(identificador, tipoTemp);
			} else {
				String tipoId = tabelaSimbolos.get(identificador);
				
				if (!Objects.equals(tipoTemp, tipoId)) {
					throw new SemanticError("Tipos incompatÃ­veis em comando de atribuiÃ§Ã£o");
				}
				codigo.append("stloc " + identificador + " ");
			}
		}
		clearIdentificadores();
		pilha_rotulos.push("r" + rotulo);
	}
	
	public void doAcaoSemantica27() throws SemanticError {
		String[] identificadores = getIdentificadores();

		for (String identificador : identificadores) {
			String id = tabelaSimbolos.get(identificador);

			if (id == null) {
				throw new SemanticError("identificador " + identificador + " nÃ£o declarado.");
			}

			String tipoIdentificador = tabelaSimbolos.get(identificador);
			String classe = null;

			switch (tipoIdentificador) {
			case tipoBoolean:
				classe = "Boolean";
				break;
			case tipoFloat:
				classe = "Double";
				break;
			case tipoInt:
				classe = "Int64";
				break;
			}

			codigo.append("call string [mscorlib]System.Console::ReadLine() \n");
			if (!Objects.equals(tipoString, tipoIdentificador)) {
				codigo.append("call " + tipoIdentificador + " [mscorlib]System.");
				codigo.append(classe + "::Parse(string) \n");
			}

			codigo.append("stloc " + identificador + " \n");

		}
		clearIdentificadores();
	}
	
	public void doAcaoSemantica28() { // apÃ³s <expressao>
		pilhaTipos.pop();
		rotulo++;
		
		codigo.append("brfalse r"+rotulo+" \n");
		pilha_rotulos.push("r"+rotulo);
	}
	
	public void doAcaoSemantica29() {// apÃ³s o end
		codigo.append(pilha_rotulos.pop()+ ": ");
	}
	
	public void doAcaoSemantica30() {
		rotulo++;
		codigo.append("br r"+rotulo+" \n");
		String rotulo1 = pilha_rotulos.pop();
		codigo.append(rotulo1+": ");
		pilha_rotulos.push("r"+rotulo);
		
	}
	
	public void doAcaoSemantica31() { 
		rotulo++;
		codigo.append("r"+rotulo+": \n");
		pilha_rotulos.push("r"+rotulo);
	}
	
	public void doAcaoSemantica32() {
		rotulo++;
		if(pilhaTipos.peek().equals("false")) {
			codigo.append("brfalse r"+rotulo+" \n");
		}else {
			codigo.append("brtrue r"+rotulo+" \n");
		}
		pilha_rotulos.push("r"+rotulo);
	}
	
	public void doAcaoSemantica33() {
		String rotulo2 = pilha_rotulos.pop();
		String rotulo1 = pilha_rotulos.pop();
		
		codigo.append("br "+rotulo1+" \n");
		codigo.append(rotulo2 + ": ");
	}

	public String getCodigo() {
		String cod = this.codigo.toString();
		return cod;
	}
	
	public String getListaId() {
		return listaId;
	}
	
	public void addListaId(String listaId) {
		this.listaId += listaId + " ";
	}
	
	public void clearIdentificadores() {
		this.listaId = "";
	}
	
}
