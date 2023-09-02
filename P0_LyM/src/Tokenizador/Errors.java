package Tokenizador;

public class Errors 
{
	private final String valor, type;
	private final Tokens tipo;
	private final int linea, columna;
	
	public Errors (String valor, Tokens tipo, int linea, int columna, String type) 
	{
		this.columna = columna;
		this.linea = linea;
		this.tipo = tipo;
		this.valor = valor;
		this.type = type;
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
	
	public String getType()
	{
		return type;
	}
	
	public String toString()
	{
		return "Error ( valor = " + valor + ", tipo = " + tipo + ", linea = " + linea + ", columna = " + columna + ")";
	}	
}
