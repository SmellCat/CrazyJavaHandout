public class IntegerValTest
{
	public static void main(String[] args) 
	{
		// 下面代码是正确的，系统会自动把56当成byte处理
		byte a = 56;
		/*
		  下面代码是错误的，系统不会把99999999999999当成long类型处理
		  所以超过int的表数范围，从而引起错误

		 IntegerValTest.java:11: 错误: 过大的整数: 99999999999999
		long bigValue = 99999999999999;
		                ^
		1 个错误		
		
		
		*/
		// long bigValue = 99999999999999;  
		// 下面的代码是正确的，在巨大的整数值后使用L后缀，强制使用long类型
		long bigValue2 = 9223372036854775807L;
		// 以0开头的整数值是八进制的整数
		int octalValue = 013;
		System.out.println(octalValue);
		
	}
} 