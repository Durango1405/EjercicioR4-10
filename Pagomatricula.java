package Actividad2;

import java.util.Scanner;
public class Pagomatricula {
	public static void main(String[] args) {
		
		int numinscripcion;
		String nombre;
		int patrimonio;
		int estrato;
		int pagomatricula;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingrese numero de inscripcion:");
		numinscripcion = entrada.nextInt();
		
		Scanner entrada1 = new Scanner(System.in);
		System.out.println("Ingrese nombre estudiante:");
		nombre = entrada1.next();
		
		Scanner entrada2 = new Scanner(System.in);
		System.out.println("Ingrese patrimonio:");
		patrimonio = entrada2.nextInt();
		
		Scanner entrada3 = new Scanner(System.in);
		System.out.println("Ingrese estrato social:");
		estrato = entrada3.nextInt();
		
		if((patrimonio>2000000)&&(estrato>3)) {
			pagomatricula= 50000+(int)(patrimonio*0.03);
		}
		else {
			pagomatricula=50000;
		}
		System.out.println("el estudiante con numero de inscripcion "+numinscripcion+" y nombre "+nombre+" debe pagar $"+pagomatricula );
		
		
		entrada.close();
		entrada1.close();
		entrada2.close();
		entrada3.close();
	}
}
