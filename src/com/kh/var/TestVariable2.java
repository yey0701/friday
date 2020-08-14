// 1. 패키지 : 특정 기능과 관련있는 클래스들을 
//           하나로 묶어 놓은 것
package com.kh.var;

// 2. 클래스 : (앞글자는 대문자로!)
//    - 하나의 패키지에 같은 이름의 클래스는 사용할 수 없다.
//    - 클래스의 이름과 파일의 이름이 동일해야 한다.
public class TestVariable2 {
	// 전역 변수 (멤버변수 / 필드(Field))와 지역 변수
	// 만약 사용하고자 하는 변수의 값을 여러 메소드가 공용으로
	// 사용해야 할 경우, 클래스 선언부 밑에 변수 선언을 하여
	// 해결할 수 있다.
	
	// - 전역변수(Global / Member / Field)
	// 전역 변수로 선언된 변수들은 Heap 메모리 영역에 담긴다.
	// Heap 영역에 담긴 변수들은 값을 직접 초기화 하지 않았을 경우
	// JVM에 의해 기존에 명시된 초시값으로 대입된다.
	int num1 = 10;
	final static double PI = 3.14; // (o) <--- static : 공유하다
	
	// 기능제공 메소드
	public void method1() {
		// - 지역변수
		// 메소드 안에 선언한 변수를 지역 변수라고 한다.
		// 지역 변수는 Stack 메모리 영역에 담기며,
		// 메소드가 호출될 때 만들어지고,
		// 메소드가 종료될 때 함께 소멸된다.
		int num2 = 100;
		
		System.out.println("전역변수 : " + num1);
		System.out.println("지역변수 : " + num2);
		
	}
	
	public void method2() {  // ~~~method2시작~
		// 전역변수는 여러 메소드들이 참조할 수 있으나 
		// 지역 변수는 선언한 메소드 바깥에서 쓸 수 없다!
		System.out.println("전역변수 테스트2 : " + num1);
		// System.out.println("지역변수 테스트2 : " + num2); -- ERROR!!
		
	} //  ~~~ method2 종료~~~
	
	public void method3() {  //   ~~~~ method3 시작~~~
		// 만약 전역변수와 지역 변수의 이름이 같다면 
		// 지역 변수가 우선시 된다!
		
		int num1 = 500;
		
		System.out.println("num1 값 : " + num1);
		
		
		
	} // ~~~method3 종료~~~
	
	public void method4() {
		// 변수와 상수 
		int radius = 3; // 반지름
	    // double pi = 1.414; // (x)
	    // PI = 1.123; 
	    
	    System.out.println(radius * radius * PI);
	    
			
	}
}
