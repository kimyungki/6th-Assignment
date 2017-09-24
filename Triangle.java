package test;

public class Triangle extends Shape{ 
 	private int base=3, height=3; 
 	public Triangle(int x, int y){ 
 		super(x,y); 
	} 
 	public void draw(){ 
 		System.out.println("Triangle Draw"); 
 		System.out.println("x="+x+" y="+y+ " base="+base+" height="+height); 
		
 	} 
 	
 }  