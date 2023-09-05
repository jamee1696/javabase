//这是java的快速入门
public class Hello{
	public static void main(String[] args) {
		System.out.println("hello,world~");
		System.out.println("小王 is studying java!");
	}
}

//一个源文件最多只能有一个public类，其他类的个数不限
//如果源文件包含一个public类，则文件名必须按该类名命名
class Dog{
	public static void main(String[] args) {
		System.out.println("hello,小狗狗~");
	}
}

class Tiger{
	public static void main(String[] args) {
		System.out.println("hello,小老虎~");
	}
}