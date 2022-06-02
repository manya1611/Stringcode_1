package StringPractice;

public class KeywordSyntax
{
public static void main(String[] args) {
	
	String a=new String ("Rasika");
	String b =new String ("rasika");
	String c=new String ("Manohar");
	String d=new String ("Rasika");
	String e=new String ("Manohar");
	String f= new String("manohar");
	
	
	 /*
	// value checking
	System.out.println(a.equals(d));
	System.out.println(c.equals(e));
	System.out.println(b.equals(f));
	System.out.println(c.equals(f));
	System.out.println(a.equals(b));
    */
	
	//double equals to
	System.out.println(a==d);
	System.out.println(c==e);
	System.out.println(b==f);
	System.out.println(c==f);
	System.out.println(a==b);
	
	
	
}
}
