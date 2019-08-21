import java.util.Arrays;
public class ArrayTest
{
	public static void main(String[] args)
	{
		// 定义一个数组
		int[] a = new int[] {3, 4, 5, 6};
		// 定义一个a2数组
		int[] a2 = new int[] {3, 4, 5, 6};
		System.out.println("a数组和a2数组是否相等： " + Arrays.equals(a, a2));
		// 通过复制a数组，生成一个新的b数组
	}
}