 /*
Professor - Icaro de Paula
Autor - James Souza
Data - 27/02/2022
Objetivo - Faça uma função recursiva que calcula o resto de uma divisão usando subtrações sucessivas. int mod (int a, int b);
 */
package Ex01;

import javax.swing.JOptionPane;

public class tarefa01_ex01
{

	public static void main(String[] args)
	{
	
		int dividendo;
		int divisor;
		
		dividendo = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do : "));
		divisor = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do Divisor: "));
		
		mod(dividendo, divisor);
		
		
	}

	static int mod(int a, int b) //a == Dividendo b == divisor;
	{
		if (a < b) 
		{
			return 0;
		}
		else 
		{
			a -= b;
			
		return 1 + mod(a, b);
		}
		
	}

	
	
}
