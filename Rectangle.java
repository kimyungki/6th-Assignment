package test;

public  class Rectangle extends Shape{ 
	 
	private int width=1, height=1; 
	public Rectangle(int x, int y){ 
		super(x,y); 
	} 
	public void draw(){ 
		System.out.println("Rectangle Draw"); 
		System.out.println("x="+x+" y="+y); 
		System.out.println("width="+width+" height="+height); 
	} 
	
} 