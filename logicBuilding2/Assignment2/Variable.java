class VariableHolder{
	byte a;
	short b;
	int c;
	long d;
	float e;
	double f;
	char g;
	boolean h;
}


public class Variable{
	public static void main(String[]args){
		VariableHolder obj = new VariableHolder();
		
		//obj.a = 1;
		System.out.println("byte a :"+obj.a);
		//obj.b = 2;
		System.out.println("short b :"+obj.b);
		//obj.c = 4 ; 
		System.out.println("int c :"+obj.c);
		//obj.d = 8;
		System.out.println("long d :"+obj.d);
		//obj.e = 4;
		System.out.println("float e:"+obj.e);
		//obj.f = 8;
		System.out.println("double f :"+obj.f);
		//obj.g = 2;
		System.out.println("char g :"+obj.g);
		System.out.println("boolean h :"+obj.h);
	}
}