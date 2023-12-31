package com.springcore.expressionLanguage;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
	@Value("#{20+1+4}")
   private int x;
	
	
	@Value("#{10+2+10+10}")
   private int y;
	
	@Value("#{T(java.lang.Math).sqrt(25)}")
	private Double z;
	
	
	@Value("#{T(java.lang.Math).PI}")
	private double e;
	
	@Value("#{new java.lang.String('Dinesh Marasini')}")
	private String name;
	@Value("#{ 9>5}")
	private boolean isActive;
	
public int getX() {
	return x;
}
public void setX(int x) {
	this.x = x;
}
public int getY() {
	return y;
}
public void setY(int y) {
	this.y = y;
}


public Double getZ() {
	return z;
}
public void setZ(Double z) {
	this.z = z;
}
@Override
public String toString() {
	return "Demo [x=" + x + ", y=" + y + ", z=" + z + ", e=" + e + ", name=" + name + ", isActive=" + isActive + "]";
}
 
 

}
