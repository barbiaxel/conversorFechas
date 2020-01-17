package conversorFechas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class conversor{
	public String normalToAmericano(String s){
		return s.substring(3,5)+"/"+s.substring(0,2)+"/"+s.substring(6);
	}
	public String americanoToNormal(String s){
		return s.substring(3,5)+"/"+s.substring(0,2)+"/"+s.substring(6);
	}

public static void main(String[] args) throws IOException {
	conversor s = new conversor();
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader buff = new BufferedReader(isr);
	
	System.out.println("Introduzca el la fecha en formato normal dd/mm/aaaa :");
	String fecha = buff.readLine();
	System.out.println(s.normalToAmericano(fecha));
	
	System.out.println("Introduzca el la fecha en formato americano mm/dd/aaaa :");
	String fecha1 = buff.readLine();
	System.out.println(s.americanoToNormal(fecha1));
	}
}