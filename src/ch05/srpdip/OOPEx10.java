package ch05.srpdip;

interface CanAble{
	public abstract void talk();
}

abstract class Ȧ���� implements CanAble{
	abstract void û��();
	
	@Override
	public void talk() {
		System.out.println("�մ԰� ��ȭ");
		
	}
}

abstract class ������ extends Ȧ����{
	void �����ϱ�() {
		System.out.println("�����ϱ�");
	}
//	void �ֹ��ޱ�() {
//		System.out.println("�ֹ��ޱ�");
//	}
}

abstract class ĳ�� extends Ȧ����{
	void �����ϱ�() {
		System.out.println("���� �����ϱ�");
	}
	void ����ϱ�() {
		System.out.println("ī�� ����ϱ�");
	}
}
abstract class �丮��{
	abstract void �丮();
}
class ȫ�浿 extends ������{
	
	�丮�� j; // ������ ���� ��Ģ

	@Override
	void û��() {
		System.out.println("ȭ��� û��");
		
	}
	
}
class �Ӳ��� extends ������{
	
	�丮�� j;

	@Override
	void û��() {
		System.out.println("�ֹ� û��");
		
	}
	
}
class ������ extends ĳ��{

	@Override
	void û��() {
		System.out.println("Ȧ û��");
		
	}
	
}
class �̸��� extends ĳ��{

	@Override
	void û��() {
		System.out.println("���̺� û��");
		
	}
	
}
//class �庸�� extends �丮��{
//
//	@Override
//	void �丮() {
//		System.out.println("���");
//		
//	}
//	
//}

class ������ extends �丮��{

	@Override
	void �丮() {
		System.out.println("���");
		
	}
}
class �̼��� extends �丮��{

	@Override
	void �丮() {
		System.out.println("�ѽ�");
		
	}
	
}

public class OOPEx10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}