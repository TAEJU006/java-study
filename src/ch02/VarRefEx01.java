package ch02;

// new�� �Ǿ ���� �Ҵ��� �ɶ� ����� �� �� �ִ� (���α׷��� ����Ǿ����� = Runtime)
class MyData{
	int id = 1; // 4Byte
	int price = 1000; //4Byte
}

//���۷���(����) ����, �Ϲ� ����
public class VarRefEx01 {
	
	public static void main(String[] args) {
		//Ÿ�� ����; int num; ������ �����Ѵ�
		//Ÿ�� ���� = ��; int num = 10; ������ �ʱ�ȭ(�޸𸮿� �Ҵ�)�Ѵ�
		int num = 10; //�Ϲݺ���(ũ�Ⱑ ������ �ִ� �� = ������ ����)
		MyData d = new MyData();//���۷��� ����(ũ�Ⱑ ������ ���� ���� �� = ������ ����)

		System.out.println(num);
		System.out.println(d.id);
		System.out.println(d.price);
	}
}