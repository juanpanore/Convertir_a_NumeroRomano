package co.udea.appEmpresariales.convertir_a_Romano;

public class Romano {

	public String cambiarARomano(String numero){
		int NumeroNormal =Integer.parseInt(numero);
		if(NumeroNormal>=4){
			if(NumeroNormal==9)
				return "IX";
			if(NumeroNormal==4)
				return "IV";
			else
				return "V".concat(sumarUnidades(NumeroNormal,6));//Para representer el 5 utilizamos V para los numeros siguientes (6,7,8) se representara sumando las unidades correspondientes
		}
		return sumarUnidades(NumeroNormal,1);// para 1,2,3 podemos representar el numero sumando la unidad q correspoda
	}
	/*El metodo sumar unidades es utilizado para sumar las unidades en romano representado por I, el 
	 metodo recibe los parametros numero(numero que se va convertir) y empieza, que el numero donde sumara  las unidadees necesarias para la correcta representacion */
	public String sumarUnidades(int numero,int empieza){
		String NumeroRomano="";
		for(int i=empieza;i<=numero;i++){
			NumeroRomano=NumeroRomano.concat("I");
		}
		return NumeroRomano;
	}
}
