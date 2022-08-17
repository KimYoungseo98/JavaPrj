import javax.swing.plaf.synth.SynthSeparatorUI;

public class SomeClass {
	static int count=0;
	final int DATA1=10;
	final int DATA2;
	SomeClass(){
		this.DATA2=20;
	}
	void doIt() {
		System.out.println("doIt");
	}
	void doSomething() {
		System.out.println("doSomething");
		//같은 클래스 내의 다른 메서드 호출 시
		doIt();
	}
	static void doAnything() {
		System.out.println("doAnything");
	}
}
