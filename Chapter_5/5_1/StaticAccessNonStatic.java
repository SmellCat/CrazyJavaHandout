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
public class StaticAccessNonStatic
{
	public void info()
	{
		System.out.println("简单的info方法");
	}
	public static void main(String[] args) 
	{
		// info();
		// this.info();
		new StaticAccessNonStatic().info();
		// System.out.println("Hello World!");
	}
}
