package ch05;

public class StringEx1 {
	public void stringEx1() {
//		String Ÿ���� ���� Ÿ������ new Ű���带 ����Ͽ� ������ �����ؾ� �Ѵ�. 
//		�ΰ��� String ������ ������ ���� �Է��ص� String ������ �����ϴ� ���� ���� �ƴ϶� �޸��� �ּ��̱� ������ �ܼ��񱳽� ���� �ٸ��ٰ� ��µ� 
		String str1 = new String("�ȳ��ϼ���");
		String str2 = new String("�ȳ��ϼ���");
		
		System.out.println("String ���� str1 �� : "+ str1);
		System.out.println("String ���� str2 �� : "+ str2);
		
		if (str1 ==str2) {
			System.out.println("str1 �� str2�� ���� �����ϴ�.");
		}
		else {
			System.out.println("str1�� str2�� ���� �ٸ��ϴ�.");
		}
		
		if (str1.equals(str2)) {
			System.out.println("str1 �� str2�� ���� �����ϴ�.");
		}
		else {
			System.out.println("str1�� str2�� ���� �ٸ��ϴ�.");
		}
		
		
		
		int intArr[] = new int [5];
		intArr [0] = 100;
		intArr [1] = 200;
		intArr [2] = 300;
		intArr [3] = 400;
		intArr [4] = 500;
			
		System.out.println("�迭�� 4�� index�� ��� : " + intArr[4]);
		
//		intArr = null;
//		intArr [5] = 600;
//		System.out.println("�迭�� 4�� index�� ��� : " + intArr[5]);
		
	}
	
	public void stringEx2() {
//		������ �ҽ������� String ������ ������ ���� �⺻Ÿ��ó�� �������� ��� ������ �޸� �ּҸ� ������. 
		String name1 = "�����";
		String name2 = "�����";
		
		if (name1 == name2) {
			System.out.println("���� name1�� name2�� ���� ����.");
		}
		else {
			System.out.println("���� name1�� name2�� ���� �ٸ���.");
		}
		
//		new Ű���带 ����ϸ� ������ ���� ����Ǿ�� ���� �޸� ���������� ���� �ٸ� �޸� ��ġ�� ������ �Ǳ� ������ �ٸ� ������ �ν��Ѵ�. 
		String name3 = new String("�����");
		if (name1 == name3) {
			System.out.println("���� name1 �� name3�� ���� ����.");
		}
		else {
			System.out.println("���� name1�� name3 �� ���� �ٸ���.");
		}
		
		
		
	}
}
