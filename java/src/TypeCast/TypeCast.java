/*

	算数运算时, 一般要求参与运算的数据类型保持一致

	数据类型不一致, 隐式转换:
		byte/short/char 转换成 int-->long-->float-->double
	

*/


public class TypeCast {
	public static void main(String[] args) {
		// 相同数据类型
		int a = 10;
		int b = 20;
		int c;

		c = a + b;
		System.out.println(c);

		// 类型不一致
		byte aa = 1;
		int bb = 2;
		System.out.println(aa + bb); 

		byte dd = aa + bb;
		int ee = aa + bb;
		// System.out.println(dd); 
		System.out.println(ee); 


	}
}