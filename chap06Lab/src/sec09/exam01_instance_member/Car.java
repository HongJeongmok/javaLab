package sec09.exam01_instance_member;

public class Car {
	// 1. �ʵ�
	String model;
	int speed;
	
	
	// 2. ������
	Car(String model) {
		this.model = model;  // this.model�� �ν��Ͻ�(��ü) �ʵ��̴�.
	}
	
	// 3. �޼ҵ�
	void setSpeed(int speed) {
		this.speed = speed;  // this.speed�� �ν��Ͻ�(��ü) �ʵ��̴�.
	}
	
	void run() {
		for(int i=10; i<=50; i+=10) {
			this.setSpeed(i);
			System.out.println(this.model+"�� �޸��ϴ�.(�ü�"+this.speed+"km/h)");
		}
	}

}
