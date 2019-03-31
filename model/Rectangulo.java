package model;

import java.lang.Math;

public class Rectangulo{

	private double lado1;
	private double lado2;
	private double lado3;
	private double lado4;

	public Rectangulo(double a,double b,double c, double d){
		lado1=a;
		lado2=b;
		lado3=c;
		lado4=d;
	}

	public double darArea(){
		double area=0;
		if(lado1!=lado2){
			area=lado1*lado2;
		}
		else{
			area=lado1*lado3;
		}
		return area;
	}

	public double darPerim(){
		double perimetro=lado1+lado2+lado3+lado4;
		return perimetro;
	}

	public double darDiagon(){
		double diagonal=0;
		if(lado1!=lado2){
			diagonal=lado1*lado1+lado2*lado2;
			diagonal=Math.sqrt(diagonal);
		}
		else{
			diagonal=lado1*lado1+lado3+lado3;
			diagonal=Math.sqrt(diagonal);
		}
		return diagonal;
	}
}