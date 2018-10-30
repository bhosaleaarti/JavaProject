/**
 * 
 */

/**
 * @author EQW 3
 *
 */
public class test {

	int x,y;
	
	test(int theX, int theY) {
		x = theX;
		y = theY;
	}
	
	public int getArea() {
		return x*y;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		test t1 = new test(10,20);
		
		
		System.out.println("Area is " + t1.getArea());
	}

}
