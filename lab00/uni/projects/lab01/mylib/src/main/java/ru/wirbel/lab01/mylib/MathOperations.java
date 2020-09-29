package ru.wirbel.lab01.mylib;

import java.util.Locale;
import java.util.PropertyResourceBundle;
import java.util.ResourceBundle;
public class MathOperations {
	//private  double arg1 {get; set;} 
	//private static double arg2 {get; set;} 
	//public MathOperations (double a, double b){
	//	arg1=a; arg2=b;
	//}
	
	public static double substract(double x, double y){
		return x-y;
	}
    public static double add(double a, double b){
		return a+b;
	}
	public static double multiply (double a, double b){
		return a*b;
	}
	public static double divide (double a, double b){
		return a/b;
	}
}