package compilador;
public class SyntaticError extends AnalysisError
{
	private String lexema;
	
    public SyntaticError(String msg, int position, String lexema)
	 {
        super(msg, position);
        this.lexema = lexema;
    }

    public SyntaticError(String msg)
    {
        super(msg);
    }
    
    public String getLexema() {
		return lexema;
	}
}
