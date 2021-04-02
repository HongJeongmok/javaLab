package sec02.exam02_generic_type;

public class BoxExample {
	public static void main(String[] args) {
		Box<String> box1 = new Box<String>();
		box1.set("hello");
		String str = box1.get();

		Box<Integer> box2 = new Box<Integer>();
		box2.set(6);  // Boxing, int -> Integer
		int value = box2.get();  // Unboxing, int -> Integer
	}
}
