/**
 * Description:
 * <br/>
 * <br/>
 * <br/>
 * <br/>Program Name:
 * <br/>Date:
 * @author Atituiset Atituiset@163.com
 * @version 1.0
 */
 public class ReturnThis
{
	public int age;
	public ReturnThis grow()
	{
		age++;
		return this;
	}
	public static void main(String[] args) 
	{
		ReturnThis rt = new ReturnThis();
		rt.grow()
			.grow()
			.grow();
		System.out.println("rt的age成员变量值是：" + rt.age);
	}
}
