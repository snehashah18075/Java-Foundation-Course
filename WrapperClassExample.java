
public class WrapperClassExample1 {

	public static void main(String[] args) {
		int a = 10; // Primitive Value
		Integer obj = a;  // Integer Object
		System.out.println(obj);
		int new_a = obj;

		float f = 3.14f; // float primitive value
		Float fobj = new Float(f); // Float Object
		System.out.println(fobj);
		float new_f =fobj.floatValue();
		
	}

}