package verify;

public class SumAvg {

	public static void main(String[] args) {
		int sum = 0;
		double avg = 0;
		
		for(int i=1; i<=100; i++) {
			sum += i;
			avg = (double)sum/100;  // sum / 100.0 �Ҽ���
		}
		System.out.println("1���� 100������ �� : "+ sum);
		System.out.printf("1���� 100������ ��� : "+ "%.2f%n",  avg);  // �Ҽ��� ���ڸ����� ��Ÿ����
		System.out.println("1���� 100������ ��� : "+ (String.format("%.2f",  avg)));  // �Ҽ��� ���ڸ����� ��Ÿ����
		
		}

	}


