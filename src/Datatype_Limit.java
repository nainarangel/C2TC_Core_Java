
public class Datatype_Limit {

	public static void main(String[] args) {
		byte maxbyte=127;
		byte minbyte=-128;
		
		System.out.println("The min range of byte is : " + minbyte);
		System.out.println("The max range of byte is : " + maxbyte);
		
		short maxshort=32767;
		short minshort=-32768;
		System.out.println("The min range of short is : " + minshort);
		System.out.println("The max range of short is : " + maxshort);
		
		int maxint=2147483647;
		int minint=-2147483648;
		System.out.println("The min range of int is : " + minint);
		System.out.println("The max range of int is : " + maxint);
		
		long maxlong=9223372036854775807L;
		long minlong=-9223372036854775807L;
		System.out.println("The min range of long is : " + minlong);
		System.out.println("The max range of long is : " + maxlong);

		float f=3234.141245678345f;
		double d=3456.141245678345;
		System.out.println("The range of float is : " + f);
		System.out.println("The range of double is : " + d);
	}

}
