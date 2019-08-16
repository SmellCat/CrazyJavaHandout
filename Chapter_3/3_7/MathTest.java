public class MathTest
{
	public static void main(String[] args)
	{
		double a = 3.2; 
		double b = Math.pow(a, 5);
		System.out.println(b); // 335.5443200000001
		double c = Math.sqrt(a);
		System.out.println(c); // 1.7888543819998317
		double d = Math.random();
		System.out.println(d); // 0.9038390827090939
		double e = Math.sin(1.57);
		System.out.println(e); // 0.9999996829318346
	}
}