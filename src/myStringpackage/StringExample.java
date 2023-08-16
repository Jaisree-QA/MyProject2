package myStringpackage;

public class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1="Hello";//stores in string pool
System.out.println(s1);
String s2=new String("hello");//stores in heap memory
System.out.println(s2);
String s3="Hello";
System.out.println(s1==s3);//true - same memory location
System.out.println(s1==s2);//False - heap and pool
System.out.println(s1.equals(s3)); //true both value is same
System.out.println(s1.equals(s2));//false s2 is heap characters
System.out.println(s1.equalsIgnoreCase(s3));//false check same value - ignore case
s1.concat(s3);
System.out.println(s1);//s1 is immutable
s1=s1.concat(" "+s3);
System.out.println(s1);
s1=s1.concat("How are you");
System.out.println(s1);
int length=s3.length();
System.out.println(length);
String s4=" ";
System.out.println(s4.isEmpty());
System.out.println(s4.isBlank());
String s5=s1.substring(1,2);
System.out.println(s5);

	}
}
