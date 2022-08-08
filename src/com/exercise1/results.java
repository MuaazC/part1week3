package com.exercise1;

public class results {
public double biology;
public double chemistry;
public double physics; 
public double total;
public double percentage;



public void Score(double biology, double chemistry, double physics)
 
{
	total = biology + chemistry + physics; 
	System.out.print(" they got " + biology +" for bio " +chemistry+" for chem "
		+physics+ " for physics "	);
	System.out.println(" total score is " +total+"");
}
public double Percentage() {
	return percentage = (total * 100)/450;
}
}