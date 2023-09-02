package Tokenizador;

public class Tokenizer 
{
	private final String valor;
	private final Tokens tipo;
	private final int linea, columna;
	
	public Tokenizer (String valor, Tokens tipo, int linea, int columna) 
	{
		this.columna = columna;
		this.linea = linea;
		this.tipo = tipo;
		this.valor = valor;
	}
	
	public String getValor() 
	{
		return valor;
	}
	
	public Tokens getTipo()
	{
		return tipo;
	}
	
	public int getLinea()
	{
		return linea;
	}
	
	public int getColumna()
	{
		return columna;
	}
	
	public String toString()
	{
		return "Tokenizer ( valor = " + valor + ", tipo = " + tipo + ", linea = " + linea + ", columna = " + columna + ")";
	}
}

