package collections;

public interface Calculator<T, R> {
	//In this case the interface just provides a template because it is a generic interface
	R doCalculate(T t);
	

}
