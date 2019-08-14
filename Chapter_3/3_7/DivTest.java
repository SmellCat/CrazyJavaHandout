public class DivTest
{
	public static void main(String[] args)
	{
		double a = 5.2;
		double b = 3.1;
		double div = a/ b;
		System.out.println(div);  // 1.6774193548387097
		System.out.println("5除以0.0的结果是：" + 5 / 0.0); // 5除以0.0的结果是：Infinity
		System.out.println("-5除以0.0的结果是：" + -5 / 0.0); // -5除以0.0的结果是：-Infinity
		System.out.println("-5.0除以0的结果是：" + -5.0 / 0); // -5.0除以0的结果是：-Infinit
		System.out.println("-5除以0的结果是：" + -5 / 0); 	// Exception in thread "main" java.lang.ArithmeticException: / by zero
															// at DivTest.main(DivTest.java:11)
	}
}