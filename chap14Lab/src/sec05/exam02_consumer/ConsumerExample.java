package sec05.exam02_consumer;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjIntConsumer;

public class ConsumerExample {
	public static void main(String[] args) {
		Consumer<String> consumer = t -> System.out.println(t + "8");
		consumer.accept("java");  // "java8"
		
		/*
		// 익명구현객체
		BiConsumer<String, String> bigConsumer = new BiConsumer<String, String>() {

			@Override
			public void accept(Object t, Object u) {
				System.out.println(t + u);
			}
		};
		*/
		
		// 람다식
		BiConsumer<String, String> bigConsumer = (t, u) -> System.out.println(t + u);
		bigConsumer.accept("Java", "8");  // "Java8"
		
		DoubleConsumer doubleConsumer = d -> System.out.println("Java" + d);
		doubleConsumer.accept(8.0);  // "Java8.0"
		
		ObjIntConsumer<String> objIntConsumer = (t, i) -> System.out.println(t + i);
		objIntConsumer.accept("Java", 8);  // "Java8"
	}
}
