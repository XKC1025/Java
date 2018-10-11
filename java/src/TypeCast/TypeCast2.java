/*
	强制转换
	目标类型 变量名 = (目标类型)（被转化的数据）;
	数据做运算, 结果应该是什么类型就用什么类型接收，不能随便强制转换。
*/

public class TypeCast2 {
	public static void main(String[] args) {
		int a = 10;
		byte b = 20;

		int c = a + b;
		//强制转换  
		byte d = (byte)(a + b);

		System.out.println(c);
		System.out.println(d);

		int D = 1000;
		long l = 100000000L;

		long R = D + l;
		System.out.println(R);

		int r = (int)(l + D);
		System.out.println(r);
	}
}