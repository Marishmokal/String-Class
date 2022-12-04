package com.stringclass.methods;

public class StringClassMethods
{
//methods of string class
	public static void main(String[] args) 
	{
		//public int length();
		//eg.I]
		String s="Marish";
		System.out.println(s.length());//6
		
		//eg.II]
		String m="India is my country";
		System.out.println(m.length());//19
		
		
		//public char chatAt();
		//eg.I]
		String j="Shrilanka";
		System.out.println(j.charAt(5));//a
		
		//eg II]
		String k="AishwaryaAbhi";
		System.out.println(k.charAt(9));//A
		
		//public string Substring(int begin)
		//eg I]
		String y="amitabhBacchan";
		System.out.println(y.substring(5));//bhBacchan
		
		//eg.II]
		String l="ABCDEFGH";
		System.out.println(l.substring(4));//EFGH
		
		//public string Substring(int begin,int end)
		//eg.I]
		String f="Deeptika";
		System.out.println(f.substring(2,4));//ep
		
		//eg.II]
		String r="RanveerBhai";
		System.out.println(r.substring(3,7));//veer
		
		//public string concat(String s)
		//eg.I]
		String s1="Shahrukh";
		s1=s1.concat("khan");
		System.out.println(s1);//ShahrukhKhan
		
		//eg.II]
		String s2="Boby";
		s2=s2.concat("deol");
		System.out.println(s2);//Bobydeol
		
		
		//public intern
		//eg.I]
		String k1=new String("JAYA");
		String k2="JAYA";
		System.out.println(k1==k2);//false
		k1=k1.intern();
		System.out.println(k1==k2);//true
		
		
		//eg.II]
		String j1=new String("rameshwar");
		String j2="rameshwar";
		System.out.println(j1==j2);//false
		j1=j1.intern();
		System.out.println(j1==j2);//true
		
		
		String f1=new String("rama");
		String f2="rama";
		System.out.println(f1.equals(f2));//content equality returns true
		f1=f1.intern();
		System.out.println(f1==f2);//reference equality returns true
		
		
		//public boolean equals(object o)
		//eg.I]
		String j5="Amirkhan";
		System.out.println(j5.equals("AMIRKHAN"));//false content equality
		
		//eg.II]
		String j6="AjayDevgan";
		System.out.println(j6.equals("AjayDevgan"));//true content equality
		
		
		//public boolean equalsIgnoreCase(String s)
		//eg.I]
		String j7="juhichawla";
		System.out.println(j7.equalsIgnoreCase("JUHICHAWLA"));//true
		
		//eg.II]
		String j8="jaggajasus";
		System.out.println(j8.equalsIgnoreCase("JAGGAJASUS"));//true
		
		
		//contains()
		//eg.I]
		String j9="MokalSnacks";
		System.out.println(j9.contains("Snacks"));//return true if specified ch.are there
		
		//eg.II]
		String f3="Mhatre";
		System.out.println(f3.contains("Mha"));//returns true
		
		
		//public boolean isEmpty();
		//eg.I]
		String f4=" ";
		System.out.println(f4.isEmpty());//true
		
		String f5="marish";
		System.out.println(f5.isEmpty());//false
		
		
		//public string trim();
		//eg.I]
		String f6=" marish mokal ";
		System.out.println(f6.trim());//trim the starting and ending spaces
		
		String f7=" 1 4 5 Marish ";
		System.out.println(f7.trim());
		
		
		//split(String)
		//eg.I]
		String f8="My-name-is-marish";
		String []p=f8.split("-");
		for(int i=0;i<p.length;i++)
		{
			System.out.println("---->"+p[i]);
		}
		
		
		//to charArray();
		//eg.I]
		String name="marish";
		char[]c=name.toCharArray();
		System.out.println(c);//given string converted into character array
		
	
		//valueOf();
		//eg.I]
		int a=10,b=20;
		String k3=String.valueOf(a);
		String k4=String.valueOf(b);
		System.out.println(k3+k4);
		
		
		//toUpperCase();
		String nm="salman khan";
		System.out.println(nm.toUpperCase());//SALMANKHAN
		
		//toLowerCase();
		String nm1="KARAN JOHAR";
		System.out.println(nm1.toLowerCase());//karan johar
		
		
		//public string replace(char oldchar,char Newchar)
		String jd="ABABABABAB";
		System.out.println(jd.replace('B','M'));//AMAMAMAMAM
		
		//public int indexOf(char ch);
		String kd="ABABABABABABAB";
		System.out.println(kd.indexOf('B'));//1
		
		
		//public int lastIndex(char ch)
		String rd="ABABABABAB";
		System.out.println(rd.lastIndexOf('A'));//8
	}
}
