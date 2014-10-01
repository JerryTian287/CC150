
public class test {
	public static void main(String [] args) {
		ThreeStack a = new ThreeStack();
		for (int i = 0; i < 3; i++) a.push(0, i);
		for (int i = 5; i < 10; i++) a.push(1, i);
		a.pop(0);
		a.push(2, 30);
		System.out.print(a.pop(1));
	}
}
