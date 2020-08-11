package prob2;

public class SmartPhone extends MusicPhone {

	//상위 클래스인 Phone과 MusicPhone에서 execute 메서드를 재정의 하여 오버라이딩
	public void execute(String function) {
		if(function.equals("앱")) {
			playApp();
			return;
		}
		//상위 클래스로부터 상속받은 execute 메소드를 하위클래스에서 참조하는데 사용하는 super()메서드
		//super키워드는 자식 클래스에서 상위 클래스의 메소드를 사용하고자 할 때 사용한다. 
		//상위 클래스와 하위 클래스의 이름이 같은 경우 super키워드를 사용하여 구별가능함
		//상위 클래스의 모든 멤버변수까지 포함되어 있다. 
		//하위 클래스에서 부모클래스를 재정의 하면 상위 클래스이 메소드를 사용할 수 없게 되어 나온 것이 super키워드
		super.execute(function);
	}
	
	protected void playApp() {
		System.out.println("앱을 실행합니다.");
	}
	
}
