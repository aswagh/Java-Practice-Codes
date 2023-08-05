import java.util.ArrayList;


class Cat{
	String name;
	Cat(String name){
		this.name = name;
	}
	@Override
	public String toString() {
		return "Cat [name=" + name + "]";
	}
	
}
class PrintData <T> //Generic Class
{
	
	T data;
	PrintData(T data){
		this.data = data;
	}
	
	public void show() {
		System.out.println(data);
	}
}
public class GenericsInJava {

	public static void main(String[] args) {
		
		ArrayList<Cat> cats = new ArrayList<>();
		cats.add(new Cat("Rino"));
		cats.add(new Cat("Wino"));
		
		PrintData<Cat> printData = new PrintData<Cat>(cats.get(1));
		printData.show();

		PrintData<Integer> printInt = new PrintData<Integer>(30);
		printInt.show();
		
}
	
}
