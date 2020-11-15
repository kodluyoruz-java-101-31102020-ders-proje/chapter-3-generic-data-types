package chapter3.generics.stack;

public class NumberStack <T extends Number> extends Stack<T>{

	// ikisi birbiriyle aynı!
	// <T extends Object>
	// <T>
	
	public NumberStack(int size) {
		super(size);
	}

}
