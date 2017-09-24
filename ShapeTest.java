package test;

public class ShapeTest { 
 	private static Shape arrayOfShapes[]; 
 	public static void main(String[] args) { 
 		init(); 
 		drawAll(); 
	} 
 	public static void init(){ 
		arrayOfShapes = new Shape[4]; 
		arrayOfShapes[0] = new Rectangle(1,1); 
 		arrayOfShapes[1] = new Triangle(3,3); 
 		arrayOfShapes[2] = new Circle(5,5); 
 		arrayOfShapes[3] = new Cylinder(7,7); 
 	} 
 	public static void drawAll(){ 
 		for(int i=0; i<arrayOfShapes.length;i++){ 
 			arrayOfShapes[i].draw(); 
 		} 	
 		} 
 } 
