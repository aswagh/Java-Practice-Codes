import java.util.ArrayList;

class Animal{
		public void category() {
			System.out.println("Animals Category");
		}
}
class Monkey extends Animal{

	public Monkey() {
		// TODO Auto-generated constructor stub
	}
}
class Dog{
	
}
public class BoundedGenerics <T extends Animal>{
	T t;
	public BoundedGenerics(T t) {
		this.t = t;
	}
	public void displayData() {
		System.out.println(this.t);
	}

	public static void main(String[] args) {
//		As we set boundary <T extends Animal> the generic class will only accept Animal type of data	
		
//		BoundedGenerics<Integer> buBoundedGenerics = new BoundedGenerics<Integer>(50);
//		buBoundedGenerics.displayData();
		

		ArrayList<Monkey> listMonkey = new ArrayList<Monkey>();
		listMonkey .add(new Monkey());
		
		BoundedGenerics<Monkey> monkey = new BoundedGenerics<Monkey>(listMonkey.get(0));
		monkey.displayData();
	}
}
