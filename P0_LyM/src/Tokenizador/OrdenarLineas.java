package Tokenizador;

import java.util.Comparator;

public class OrdenarLineas implements Comparator<Tokenizer>
{
	public int compare(Tokenizer o1, Tokenizer o2) 
	{
		if(o1.getLinea() < o2.getLinea())
			return -1;
		else if(o1.getLinea() < o2.getLinea())
			return 0;
		else
			return 1;
	} 
}
