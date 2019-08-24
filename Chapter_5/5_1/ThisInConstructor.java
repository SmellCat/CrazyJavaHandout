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
public class ThisInConstructor
{
	public int foo;
	public ThisInConstructor() 
	{
		int foo = 0;
		this.foo = 6;
	}
	public static void main(String[] args) 
	{
		System.out.println(new ThisInConstructor().foo);
	}
}
