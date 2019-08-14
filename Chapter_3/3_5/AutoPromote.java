public class AutoPromote
{
	/*
		· 所有的byte类型、short类型和char类型将被自动提升到int类型
		· 整个算是表达式的数据类型自动提升到与表达式中最高等级操作数同样的类型	
	*/
	public static void main(String[] args)
	{
		// 定义一个short类型变量
		short sValue = 5;
		// 表达式中的sValue将自动提升到int类型，则右边的表达式类型是int
		// 将一个int类型值赋给short类型变量将发生错误
		// sValue = sValue - 2;
		byte b = 40;
		char c= 'a';
		int i = 23;
		double d = .314;
		double result = b + c + i + d;
		System.out.println(result);
		
	}
}