package com.stringclass.methods;

public class SplitMethod {
public static void main(String[] args) {
	String name="India is my country";
	
	String []parts=name.split(" ");
	for(int i=0;i<parts.length;i++)
	{
		System.out.println(parts[i]);
	}
}
}
