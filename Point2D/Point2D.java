package com.app.geometry;

public class Point2D {
	private double x;
	private double y;
	
	public Point2D() {
		//TODO
	}
	public Point2D(double x, double y) {
		this.x = x;
		this.y = y;
		
	}
	
	public String getDetails() {
		return "Point coordinates:\tx: " + x +"\ty: "+ y ;
	}
	
	public boolean isEqual(Point2D obj) {
		if(this.x == obj.x && this.y == obj.y) {
			return true;
		}else {
			return false;
		}
	}
	public double calculateDistance(Point2D obj) {
		double dx = this.x - obj.x;
		double dy =  this.y - obj.y;
		double distance = Math.sqrt(Math.pow(dx,2) +  Math.pow(dy,2));
		return distance;
	}
}
