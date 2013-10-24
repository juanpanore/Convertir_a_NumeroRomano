package co.udea.appEmpresariales.convertir_a_Romano;

public class Romano {

	public String cambiarARomano(String numero){
		int NumeroNormal =Integer.parseInt(numero);
		String Resultado="";
		int Valores[]={1000,900,500,400,100,90,50,40,10,9,5,4,1};
		String Romanos[]={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
		int i=0;
			while(NumeroNormal>0){// si al restarle el numero no es igual a cero quiere decir que todavia nos falta encontrar su equivalente en el arreglo
				while(NumeroNormal>=Valores[i]){// ciclo para contralar el valor correspondiente para el numero en el arreglo de Romanos
					Resultado=Resultado+Romanos[i];//Añadimos el valor al resultado
					NumeroNormal=NumeroNormal-Valores[i];//Restamos el valor al numero
				}
				i++;// Aumentamos el indice para buscar en el arreglo de Romanos el numero que le corresponde el numero
			}
		return Resultado;
		}
	}
