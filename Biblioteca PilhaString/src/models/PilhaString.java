package models;

public class PilhaString 
{
	 Node topo;
	 public PilhaString()
	 {
	topo = null;
	 }


	public boolean isEmpty()
	{
	if (topo == null)
	{
	return true;
	}
	return false;
	}

	 public void pushS(String palavra)
	 {
	 Node elemento = new Node();
	 elemento.noun = palavra;
	 elemento.proximo = topo;
	 topo = elemento;
	 }
	 
	 public String popS() throws Exception
	 {
	if (isEmpty())
	{
	throw new Exception("Pilha Vazia");
	}
	String palavra = topo.noun;
	topo = topo.proximo;
	return palavra;
	 }
	 
	 public String topS() throws Exception
	 {
	if (isEmpty())
	{
	throw new Exception("Pilha Vazia");
	}
	String palavra = topo.noun;;
	return palavra;
	 }
	 
	 public int size()
	 {
	int cta = 0;
	if (!isEmpty())
	{
	Node aux = topo;
	cta = 1;
	while (aux.proximo != null)
	 {
	cta++;
	aux = aux.proximo;
	 }
	}
	return cta;
	 }
}