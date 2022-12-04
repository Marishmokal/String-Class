package com.stringclass.methods;

public class StringBufferMethods {
public static void main(String[] args) {
	//methods of StringBuffer
	
	
	//public String append(String s)
	//eg.I]
	StringBuffer sb=new StringBuffer("Abhishek");
	System.out.println(sb.append(" bacchan"));//abhishek bacchan
	
	//eg.II]
	StringBuffer sb1=new StringBuffer("Vidya");
	System.out.println(sb1.append(" balan"));//vidya balan
	
	//eg.III]
	StringBuffer sb3=new StringBuffer(3);
	//System.out.println(sb3.append(15).append(15));
	System.out.println(sb3.append(3.14)==sb3.append("3.14"));
	System.out.println(sb3.capacity());//it gives the string re[representation ]
	
	
	//public int capacity()
	StringBuffer sb2=new StringBuffer("Javed");
	System.out.println(sb2.capacity());//21
	
	StringBuffer j=new StringBuffer("bhaskramRamchandram");
	System.out.println(j.capacity());//35

	//public StringBuffer delete(int begin,int end)
	StringBuffer k=new StringBuffer("KartikiGaikwad");
	System.out.println(k.delete(3,8));//Karaikwad
	
	StringBuffer m=new StringBuffer("himanshuKharera");
	System.out.println(m.delete(2,7));//hiuKharera
	
	
	//public StringBuffer insert(int index,String s)
	StringBuffer n=new StringBuffer("NIKIL");
	System.out.println(n.insert(3,'H'));//NIKHIL
	
	StringBuffer l=new StringBuffer("Durgabhai");
	System.out.println(l.insert(2,"wa"));//Duwargabhai
	
	//public String reverse();
	StringBuffer y=new StringBuffer("rupun");
	System.out.println(y.reverse());//nupur
	
	StringBuffer z=new StringBuffer("pranav");
	System.out.println(z.reverse());//vanarp
	
	//public int length();
	StringBuffer a=new StringBuffer("Laxminarayan");
	System.out.println(a.length());//12
	
	StringBuffer b=new StringBuffer("qwertyuiopasdfghjklzcxvbnm");
	System.out.println(b.length());//26
	
	//public char charAt();
	StringBuffer c=new StringBuffer("Marsh");
	System.out.println(c.charAt(0));//M
	
	StringBuffer d=new StringBuffer("mnbvcxzasdfghjklpoiuytrewq");
	System.out.println(d.charAt(17));//o
	
	//public void setCharAt(int index,char new char)
	StringBuffer e=new StringBuffer("JAVA");
	e.setCharAt(0,'Y');
	System.out.println(e);//YAVA
	
	StringBuffer f=new StringBuffer("MARJSH");
	f.setCharAt(3,'I');
	System.out.println(f);//MARISH
	
	
	//public StringBuffer deleteCharAt(int index)
	StringBuffer g=new StringBuffer("ABCDEFG");
	System.out.println(g.deleteCharAt(3));//ABCEFG
	
	StringBuffer h=new StringBuffer("Jalindher");
	System.out.println(h.deleteCharAt(6));//Jalinder
	
	
	//public void setLength(int length)
	StringBuffer i=new StringBuffer("AishwaryaAbhishek");
	i.setLength(9);
	System.out.println(i);//Aishwarya
	
	StringBuffer o=new StringBuffer("Jadugar");
	o.setLength(4);
	System.out.println(o);//Jadu
	
	
	//public void ensureCapacity(int capacity)
	StringBuffer s=new StringBuffer("");
	System.out.println(s.capacity());//16
	s.ensureCapacity(1000);
	System.out.println(s.capacity());//1000
	
	StringBuffer t=new StringBuffer("");
	System.out.println(t.capacity());//16
	t.ensureCapacity(100);
	System.out.println(t.capacity());//100
	
	//public void trimToSize();
	StringBuffer v=new StringBuffer(1000);
	v.append("ABC");
	System.out.println(v.capacity());//1000
	v.trimToSize();
	System.out.println(v.capacity());//3
	
	
	StringBuffer w=new StringBuffer(100);
	w.append("XYZLM");
	System.out.println(w.capacity());//100
	w.trimToSize();
	System.out.println(w.capacity());//5
	
}
}
