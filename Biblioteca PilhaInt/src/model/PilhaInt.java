package model;



public class PilhaInt
{
 No topo;
 public PilhaInt()
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

 public void push(int valor)
 {
 No elemento = new No();
 elemento.dado = valor;
 elemento.proximo = topo;
 topo = elemento;
 }
 
 public int pop() throws Exception
 {
if (isEmpty())
{
throw new Exception("Pilha Vazia");
}
int valor = topo.dado;
topo = topo.proximo;
return valor;
 }
 
 public int top() throws Exception
 {
if (isEmpty())
{
throw new Exception("Pilha Vazia");
}
int valor = topo.dado;
return valor;
 }
 
 public int size()
 {
int cta = 0;
if (!isEmpty())
{
No aux = topo;
cta = 1;
while (aux.proximo != null)
 {
cta++;
aux = aux.proximo;
 }
}
return cta;
 
 
 
  
  
 }
 
 private int maxV = 0;
 
 public int max() throws Exception
 {
	 
	 
	 if (!isEmpty())
		{
		 No aux = topo;
			
		
		while (aux != null)
		 {
			if(topo.dado > aux.dado && topo.dado > maxV)
			 {
				 maxV = topo.dado;
			 }else if (topo.dado < aux.dado && aux.dado > maxV)
			 {
				 maxV = aux.dado;
			 }
		aux = aux.proximo;
		 }
		}
	 return maxV;


 }

}