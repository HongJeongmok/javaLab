package sec08.exam02_abstract_method;

public class AnimalExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		dog.sound();
		cat.sound();
		System.out.println("--------");
		
		// 변수 자동타입 변환
		Animal animal = null;
		animal = new Dog();
		animal.sound();
		animal = new Cat();
		animal.sound();
		System.out.println("--------");
		
		// 매개변수의 자동타입 변환
		animalSound(dog);
		animalSound(cat);
		

	}
	
	public static void animalSound(Animal animal) {
		animal.sound();
	}

}
