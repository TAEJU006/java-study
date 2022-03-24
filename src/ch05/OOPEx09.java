package ch05;

interface MoveAble{
	// public abstract가 생략
	void 위();
	void 아래();
	void 왼쪽();
	void 오른쪽();
	void 냄새맡기();
}

interface MoveAble2{
	// public abstract가 생략
	void 위();
	void 아래();
	void 왼쪽();
	void 오른쪽();
	void 땅바닥숨기();
}


abstract class 사나운동물 implements MoveAble{
	abstract void 공격(); // 미완성 메서드
	@Override
	public void 위() {
		System.out.println("위로 이동");
		
	}
	@Override
	public void 아래() {
		System.out.println("아래로 이동");
		
	}
	@Override
	public void 오른쪽() {
		System.out.println("오른쪽으로 이동");
		
	}
	@Override
	public void 왼쪽() {
		System.out.println("왼쪽으로 이동");
		
	}
	@Override
	public void 냄새맡기() {
		System.out.println("냄새 맡기");
		
	}
}

abstract class 온순한동물 implements MoveAble2{
	abstract void 채집();
	@Override
	public void 땅바닥숨기() {
		System.out.println("땅바닥으로숨기");
		
	}
	@Override
	public void 아래() {
		System.out.println("아래로 이동");
		
	}
	@Override
	public void 오른쪽() {
		System.out.println("오른쪽으로 이동");
		
	}
	@Override
	public void 왼쪽() {
		System.out.println("왼쪽으로 이동");
		
	}
	@Override
	public void 위() {
		System.out.println("위로 이동");
		
	}
	
}

// 구현이 자식 클래스로 위임(위, 아래, 왼쪽, 오른쪽)
class 원숭이 extends 온순한동물 implements MoveAble2{

	@Override // 어노테이션 = JVM이 실행시에 분석해서 확인 = JVM의 힌트
	void 채집() {
		System.out.println("바나나 채집");
		
}
}
class 소 extends 온순한동물 implements MoveAble2{

	@Override
	void 채집() {
		System.out.println("풀 채집");
		
	}
}
class 호랑이 extends 사나운동물{

	@Override
	void 공격() {
		System.out.println("이빨로 공격");
		
	}
	
}
class 코뿔소 extends 사나운동물{

	@Override
	void 공격() {
		System.out.println("몸으로 공격");
		
	}
		
}

// 신입아 말 (상속 온순한 동물)
class 말 extends 온순한동물{

	@Override
	void 채집() {
		System.out.println("풀을 먹다");
		
	}
	
}

public class OOPEx09 {
	
	static void 조이스틱(온순한동물 u1) {
		u1.채집();
		u1.땅바닥숨기();
		u1.위();
		u1.아래();
		u1.오른쪽();
		u1.왼쪽();
	}
	
	static void 조이스틱(사나운동물 u1) {
		u1.공격();
		u1.위();
		u1.아래();
		u1.오른쪽();
		u1.왼쪽();
		u1.냄새맡기();
	}

	public static void main(String[] args) {
		소 u1 = new 소();
		조이스틱(u1);
		원숭이 u2 = new 원숭이();
		조이스틱(u2);
		호랑이 u3 = new 호랑이();
		조이스틱(u3);
		코뿔소 u4 = new 코뿔소();
		조이스틱(u4);
	}

}
