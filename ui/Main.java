package ui;

import model.Rectangulo;
import java.util.Scanner;

public class Main{
	
	private Scanner read=new Scanner(System.in);

	public static void main(String[]args){
		Main m=new Main();
	}

	public Main(){
		menu();
	}

	public void menu(){
		System.out.println("Ingrese el alto.");
		double alto=read.nextDouble();
		System.out.println("Ingrese el ancho.");
		double ancho=read.nextDouble();
		Rectangulo rec=new Rectangulo(alto,ancho,alto,ancho);
		System.out.println("==========================================");
		System.out.println("El area del rectangulo ingresado es: "+rec.darArea()+"\nEl perimetro es: "+rec.darPerim()+"\nLa diagonal es: "+rec.darDiagon());
	}
}