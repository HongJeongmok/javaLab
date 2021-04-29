package sec09.exam01_instance_member;

public class Car {
	// 1. 필드
	String model;
	int speed;
	
	
	// 2. 생성자
	Car(String model) {
		this.model = model;  // this.model은 인스턴스(객체) 필드이다.
	}
	
	// 3. 메소드
	void setSpeed(int speed) {
		this.speed = speed;  // this.speed는 인스턴스(객체) 필드이다.
	}
	
	void run() {
		for(int i=10; i<=50; i+=10) {
			this.setSpeed(i);
			System.out.println(this.model+"가 달립니다.(시속"+this.speed+"km/h)");
		}
	}

}
