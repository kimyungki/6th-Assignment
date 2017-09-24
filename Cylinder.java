package test;

public class Cylinder extends Shape{ 
 	private int radius=7, height=7; 
 	public Cylinder (int x, int y){ 
 		super(x,y); 
	} 
 	public void draw(){ 
 		System.out.println("Cylinder Draw"); 
 		System.out.println("x="+x+" y="+y+ " radius:"+radius+" height:"+height); 
 		
 	} 
 	
 } 