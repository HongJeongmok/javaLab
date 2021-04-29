package sec14.exam_date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {

	public static void main(String[] args) {
		Date now = new Date();
		String strNow1 = now.toString();
		System.out.println(strNow1);  // ex) Wed Mar 31 16:13:21 KST 2021
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd�� hh�� mm�� ss��");
		String strNow2 = sdf.format(now);
		System.out.println(strNow2);  // ex) 2021�� 03�� 31�� 04�� 15�� 29��
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy - MM - dd a hh : mm : ss");
		String strNow3 = sdf1.format(now);
		System.out.println(strNow3);  // ex) 2021 - 03 - 31 ���� 04 : 18 : 06

	}

}
