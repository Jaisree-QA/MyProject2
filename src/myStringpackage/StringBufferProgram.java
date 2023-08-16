package myStringpackage;

public class StringBufferProgram {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
StringBuffer ob=new StringBuffer("test");
System.out.println(ob.length());
ob.append("method");
System.out.println(ob);
int s1=ob.capacity();
System.out.println(s1);
ob.insert(3, 4);
System.out.println(ob);
System.out.println(ob.reverse());
ob.reverse();
System.out.println(ob);
ob.replace(3, 8, "Hello");
System.out.println(ob);
System.out.println(ob.delete(1, 3));
	}

}
