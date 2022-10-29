
public class PrintData {
	private String name;
	private int age;
	
	PrintData(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void printData() {
		System.out.println("私の名前は" + this.name + "です");
		System.out.println("年齢は" + this.age + "歳です");
	}	
}
