package example;
import method_overload.methods;
public class first {
	public static void main(String []args) {
		double A=methods.add(20.3, 22.0);
		System.out.println(A);
		methods m = new methods();
		System.out.println(m.subract(200,22));
	}
}
