package myStringpackage;

public class StringBuilderProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
StringBuilder s1=new StringBuilder();
String str=s1.toString();
System.out.println(str);

StringBuilder s2=new StringBuilder("Work");
System.out.println(s2.length());
System.out.println(s2.append(" Image"));
System.out.println(s2.capacity());
System.out.println(s2.replace(1, 3, "Employees"));
StringBuilder s3=new StringBuilder(25);
System.out.println(s3.length());
System.out.println(s3.capacity());
	}
}
