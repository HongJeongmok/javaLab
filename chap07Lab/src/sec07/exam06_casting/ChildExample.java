package sec07.exam06_casting;

public class ChildExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent parent = new Child();  // �ڵ�����ȯ, �θ���<-�ڽ���
		parent.field1 = "data1";
		parent.method1();
		parent.method1();
		
		// ���������� ���
		// parent.field2;
		// parent.method3;
		
		// ��������ȯ�� �������� : ������ �ڵ�����ȯ(�ڽ�->�θ�)�� �θ������� �ڽ������� ��ȯ�� �� �ִ�. 
		Child child = (Child) parent;  // ��������ȯ, �θ���->�ڽ���
		// ���������� Ȯ��
		child.field2 = "yyy";
		child.method3();
		
		Parent p2 = new Parent();
		// Child child = (Child) p2;

	}

}