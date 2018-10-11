/*
	标识符： 给包，类，方法，变量等起名字

	组成规则：　
		A.Unicode字符　　数字　字母　汉字
		B.下划线　　_
		C.美元符号　$

		不能以数字开头
		不能用java关键字作为变量名

	常见命名规则：
		包：用于管理类
			组成包的单词全部小写，　多级包用'.'隔开
			com.item

		类：一个单词首字母大写　　Studwnt
		   多个单词，每个单词首字母大写　驼峰法命名

		方法和变量：
			一个单词首字母小写　　age name
			多个单词。从第二个单词开始，字母大写　　maxAge   getAge  setAge
*/

public class IdChar {
	public static void main(String[] args) {
		// 数据类型　变量名　＝　初始化值;
		// int 2a = 20;

		int a;
		a = 10;
		System.out.println(a);

		short s = 100;
		System.out.println(s);

		// 默认int类型，　加上Ｌ标志 long类型
		long l = 100000000000000L;
		System.out.println(l);

		// 默认double类型, 加上F标志float类型, 会损失精度
		float f = 12.34F;
		System.out.println(f);

		double d = 12.34;
		System.out.println(d);

		char c = 'A';
		System.out.println(c);

		String ss = "ABC";
		System.out.println(ss);

		boolean b = true;
		System.out.println(b);

	}
}