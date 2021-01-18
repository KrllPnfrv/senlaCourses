package senlaCourse;


public class Main {
	byte a;
    short b;
    int c;
    long d;
    float e;
    double f; 
    char g;
    

	public static void main(String[] args) {
		Number number = new Number();
		number.setA((byte) 12);
		number.setB((short) 20);
		number.setC((int) 300);
		number.setD((long) 2333333);
		number.setE((float) 54595347);
		number.setF((double) 30.2);
		number.setG((char) 1); // с чар не пойму почему в консоль не выводит
		
		System.out.println(number.getA());
		System.out.println(number.getB());
		System.out.println(number.getC());
		System.out.println(number.getD());
		System.out.println(number.getE());
		System.out.println(number.getF());
		System.out.println(number.getG());
		
		
		
		
		
		
	       byte a = 5;
	       short b = 7;
	       int c = 129;
	       long d = 12222;
	       float e = 3214350;
	       double f = 24.5;
	       char g = 1;
	       String n = "name";
	       
	       
	       
	       byte x =(byte) c;
	       System.out.println(x);
	       
	       int z = (int) f;
	       System.out.println(z);
	       
	       long v = (long) c;
	       System.out.println(v);
	       
	       int w = (short) e;
	       System.out.println(w);
	       double r = (double) w;
	       System.out.println(r);
	       
	       
	       
	       
	       Integer i = 200;
	       double u = Double.valueOf(i);
	       System.out.println(u);
	       
	       
	       String s = "200";
	       double m = Double.parseDouble(s);
	       System.out.println(m);
	       
	       
	       Integer l = new Integer (128);
	       l.parseInt("128");
	       System.out.println(l);
	       
	       
	       
	       
	       
	       
	       

	}

}
