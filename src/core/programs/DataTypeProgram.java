package core.programs;

public class DataTypeProgram {

	public static void main(String[] args) {
		boolean status = true;
		System.out.println("i am printing status " +  status);
        char gender = 'm';
        System.out.println("i am printing gender " + gender);
        int age = 15;
        System.out.println("i am printing age " + age);
        long distance = 34567567565L;
        System.out.println("i am printing long " + distance);
        double pi = 3.145635353;
        System.out.println("i am printing pi "  + pi);
        float percentage = 56.89F;
        System.out.println("i am printing float " + percentage);
        
        int i = 100;
        long l =i;
        System.out.println("long value " + 1);
        
        int o = (int) 1;
        System.out.println("int value " + 0);
        
        char t=(char) i;
        System.out.println("char value " + t);
        
        double d= 19067566565868.007969847578776565675;
        float r= (float) d;
        System.out.println("float value " + r);
        System.out.println("double value " + d);
        
        double d2 =19067566565868.00796984757877;
        long l2 = (long)d2;
        int i2 =(int)12;
        System.out.println("double value " +d2);
        System.out.println("long value " +l2);
        System.out.println("int value  " +i2);
        
        float f =1;
        System.out.println("float value " + f);
        
        byte b;
        int ii =257;
        double dd =323.142;
        
        System.out.println("conversion of int to byte. ");
        b = (byte) ii;
        System.out.println("ii = " + ii + " b = " +b);
        
        System.out.println ("implicit type casting");
        char a='A';
        System.out.println("value of a: "+a);
        
        int c=a;
        System.out.println("value of b: "+b);
        
        float d= a;
        System.out.println(" value of d: "+d);
        
        
        
        
        
        
        
        
        
        
        
	}

}
