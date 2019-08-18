public class ArrayTest
{
	public static void main(String[] args)
	{
		int[] intArr;
		// 使用静态初始化， 初始化数组时只指定数组的初始值，不能指定数组长度
		intArr = new int[] {5, 6, 8, 20};
		Object[] objArr;
		// 使用静态初始化，初始化数组时数组元素的类型是
		// 定义数组时所指定的数组元素类型的子类
		objArr = new String[] {"Java", "李刚"};
		Object[] objArr2;
		objArr2 = new Object[] {"Java", "李刚"};
		System.out.println(objArr[0]);
		System.out.println(objArr[1]);
		
		// 数组的定义和初始化同时完成，使用动态初始化语法
		int[] prices = new int[5];
		// 数组 的定义和初始化同时完成， 初始化数组时元素的类型是定义数组时元素类型的子类
		Object[] books = new String[4];
		for (int i = 0; i < prices.length; i++)
		{
			System.out.println(prices[i]);
		}
		for (int i = 0; i < books.length; i++)
		{
			System.out.println(books[i]);
		}
		books[0] = "疯狂Java讲义";
		books[1] = "轻量级Java EE企业应用实战";
		for (int i = 0; i < books.length; i++)
		{
			System.out.println(books[i]);
		}
	}
}