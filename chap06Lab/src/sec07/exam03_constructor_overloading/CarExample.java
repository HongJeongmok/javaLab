package sec07.exam03_constructor_overloading;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car();
		System.out.println("car.company="+car1.company);
		System.out.println("car.model="+car1.model); // null
		
		Car car2 = new Car("자가용");
		System.out.println("car2.company="+car2.company);
		System.out.println("car2.model="+car2.model);
		System.out.println("car2.color="+car2.color); // null
		
		Car car3 = new Car("자가용", "빨강");
		System.out.println("car3.company="+car3.company);
		System.out.println("car3.model="+car3.model);
		System.out.println("car3.color="+car3.color); // "빨강"
		System.out.println("car3.maxSpeed="+car3.maxSpeed); // 0
		
		Car car4 = new Car("택시", "검정", 200);
		System.out.println("car4.company="+car4.company);
		System.out.println("car4.model="+car4.model); // "택시"
		System.out.println("car4.color="+car4.color);  // "검정"
		System.out.println("car4.maxSpeed="+car4.maxSpeed); // 200

	}

}
