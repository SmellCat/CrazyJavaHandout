public class ForInsteadWhile
{
	public static void main(String[] args)
	{
		int count = 0;
		for (; count < 10;)
		{
			System.out.println(count);
			count++;
		}
		System.out.println(count);
		
		for (int i = 0; i < 20; i++){
			continue;
		}
		// System.out.println(i); 作用域已经不存在i了
	}
}