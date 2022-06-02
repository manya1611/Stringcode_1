package StringPractice;

public class StringProblems 
{
	private static final CharSequence S = null;

	public static void main(String[] args) 
	{
		/*
	--->	String a= "Manya";
	--->	String b= "Rahul";
		
	\\// in that name declaration is same.
	\\// this time value and address is same.
	\\// and when declaration is different this time 
	\\// this time value and address is different also
		
	//	values 
	-->	boolean result = a.equals(b);
		System.out.println(result);
   //	 Address
	-->	boolean String =a==b;
		System.out.println(result);
	
		
	--->	String v=new String("Manya");
	--->	String z=new String("Manya");
	\\// when declaration is same this time value same bt address is compulsory different .
	\\// and different declaration diffenrt value.
		 
	\\// COMPULSARY ADDRESS IS DIFFERENT.
		 
		//Value check
	-->	 boolean result=v.equals(z);		
		System.out.println(result);
		// Address check
	-->	 boolean result1 = z==v;
		System.out.println(result1);
		
		
		
	>--> boolean result3=v.equals(a);
		System.out.println(result3);
		
	>--> boolean result4=a==v;
		System.out.println(result4);
		*/
		/*
	//	length method
		
		String m="Abhijeet";
		int v= m.length();
		System.out.println(v);
		
		String a="yogesh";
		int n=a.length();
		System.out.println(a);
		System.out.println(n);
		
   //   charAt
		
		String w="Sahil";
		char b=w.charAt(3);
		System.out.println(b);
		
//		String w="dipak";
//		char b= w.charAt(1);
//		System.out.println(b);
		*/
		
		/*
   //		concat
		
		String a="Abhijeet";
		String b=" Shewale";
		
		String c=a.concat(b);
		System.out.println(c);
		
		String e="Yogesh";
		String f=" Pawar";
		
		String g=e.concat(f);   use string as a data type in concat
		System.out.println(g + ". Fuktacha bhonga");
		*/
		/*
             String a="yogya";
             int b=98;
             int c=22;
             
             System.out.println(a+ b+c +" khula hay");
             
             String e="manya";
             char f='d';
             char g='a';
             char h='d';
             char i='a';
             
             System.out.println(e+f+g+h+i);
             
       */
       /*     
		// UPPERCASE and lowercase
		
		String k="RamCHanDrA";
		String q=" SwAmI";
		
	 int s=k.length();
	 System.out.println(s);
	 
	 char o=k.charAt(5);
	 System.out.println(o);
	 
	 String g=k.concat(q);
	 System.out.println(g);
	 
	 String result1=k.toUpperCase();
	 System.out.println(result1 +" SWAMI");
	 
	 String rs=q.toLowerCase();
	 System.out.println("ramchandra"+rs);
	 
	 String e=q.toUpperCase();
	 System.out.println(e);
	 
	 String f=k.toLowerCase();
	 System.out.println(f);
       
	 */
		/*
		//stratwith and endwith
		
		String m="MahendrasighDhoni";
             
		boolean n=m.startsWith("Mahendra"); // method 1
		System.out.println(n);
		
		//boolean s=m.endsWith("honi");
		System.out.println(m.endsWith("honi")); // method 2
		
		String d="AvinashShinde";
		 
		//case 1
		String f = d.substring(4);
		System.out.println(f);
		
		System.out.println(d.substring(7));
		
		System.out.println(d.substring(1, 7));
		
		String t = d.substring(7,13);
		System.out.println(t);
		*/
		
//		String k= "Mohan";
//		
//		String j ="mohan";
//				
//		 boolean g=j==(k);
//		System.out.println(j.equals(k));
//		
//		 boolean f= k.equalsIgnoreCase(j);
//		System.out.println(f);
//		
		//int d=k.compareToIgnoreCase(j);
		//System.out.println(d);
		
		// trim  -->use for indication of letters only...except spaces
		
		String r = " Swamini ";
		
		//String a = r.trim();
		System.out.println(r.length() );
		
		String result = r.trim();
		System.out.println(result);
		System.out.println(result.length());
		
		// Replace
		
		String b="Vai hnavi";
		//String p= "p van";
		
		String result4=b.replace( ' ', 's');
         System.out.println(result4  );		
		
		
		
	}
}
