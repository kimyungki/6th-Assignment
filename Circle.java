package test;

public  class Circle extends Shape{ 
 	private int radius=5; 
	public Circle(int x, int y){ 
 		super(x,y); 
 	} 
 	public void draw(){ 
 		System.out.println("Circle Draw"); 
 		System.out.println("x="+x+" y="+y+ " radius="+radius); 
 		} 
 
 } 
 