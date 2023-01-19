package com.arrays.method;

import java.util.Arrays;
import java.util.List;

public class ArraysClassMethodImpl {
public static void main(String args[])
{
	
	//asLeast();
	Integer[]x= {10,20,30,40,50};
	System.out.println(Arrays.asList(x));//[10, 20, 30, 40, 50]
	
	String[]j= {"marish","yashwant","mokal"};//[marish, yashwant, mokal]
	System.out.println(Arrays.asList(j));
	
	
	//binary Search();
	Integer[]a= {12,5,47,20,9,58};
	Arrays.sort(a);
	System.out.println(Arrays.binarySearch(a,20));//3
	
	String[]b= {"marish","yashwant","mokal"};
	Arrays.sort(b);
	System.out.println(Arrays.binarySearch(b,"mokal"));//1
	
	
	//copyOf();
	Integer[]c= {10,20,30,45,55,50};
	System.out.println(	Arrays.toString( Arrays.copyOf(c,6)));//[10, 20, 30, 45, 55, 50]
	
	
	String[]d= {"vaibhav","pranav","marish","shree","rushikesh"};//[vaibhav, pranav, marish, shree, rushikesh, null]
	System.out.println(Arrays.toString(Arrays.copyOf(d,6)));
	
	
	//copyOfRange();
	Integer[]e= {15,45,20,38,58,72};
	Arrays.sort(e);
	System.out.println(Arrays.toString(Arrays.copyOfRange(e,1,4)));//[20, 38, 45]
	
	
	String[]f= {"marish","pratik","krishna","rudra"};
	Arrays.sort(f);
	System.out.println(Arrays.toString(Arrays.copyOfRange(f,0,2)));//[krishna, marish]
	
	
	//equals();
	Integer[]g= {12,101,45,72,4,51};
	Integer[]h= {15,52,41,9,97,82};
	System.out.println(Arrays.equals(g,h));//false
	
	
	Integer[]i= {12,101,45,72,4,51};
	Integer[]k= {12,101,45,72,4,51};
	System.out.println(Arrays.equals(i,k));//true
	
	
	//hashcode();
	Integer[]p= {12,72,45,89,69,36};
	System.out.println(Arrays.hashCode(p));//1298975304
	
	
	
	//sort(original array);
	Integer[]q= {9,12,5,77,20,91,48,4};
	Arrays.sort(q);
	System.out.println(Arrays.toString(q));//[4, 5, 9, 12, 20, 48, 77, 91]
	
	
	
	String[]l= {"marish","pratik","krishna","rudra"};
	Arrays.sort(l);
	System.out.println(Arrays.toString(l));//[krishna, marish, pratik, rudra]
	
	
	
	//sort(original array,from index,end index)
	Integer[]z= {15,72,45,86,23,32};
	Arrays.sort(z,1,3);
	System.out.println(Arrays.toString(z));//[15, 45, 72, 86, 23, 32]
	
	
	
	//toString();
	Integer[]y= {42,15,78,93,65};
	System.out.println(Arrays.toString(y));//[42, 15, 78, 93, 65]
	
	
	
}
}
