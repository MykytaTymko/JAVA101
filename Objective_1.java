package Objectives;

public class Objective_1 
{
    public static void main(String[] args)
    {
	double a = 3;
	double b = 2.5;
	double c = -0.5;
        
        double n1 = Math.pow(b, 2);
        double n2 = Math.sqrt((n1 - 4*a*c));
        
        double x1 = (-b + n2)/(2*a) ;
        double x2 = (-b - n2)/(2*a) ;
   
        System.out.println("x1=" + x1);
        System.out.println("x2=" + x2);     
    }
}
    
