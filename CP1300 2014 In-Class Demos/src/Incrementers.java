/**
 * Quick test to see how pre- and post-increment work
 * @author Lindsay Ward
 * For CP1300 Townsville, 7th August, 2014
 *
 */
public class Incrementers {

	public static void main(String[] args) {
		int x = 0;
		System.out.println(x);
		++x; // x = 1
		System.out.println(++x); // ?
		int y = ++x; // y = x+1, x++
		int z = x++; // z = x,   x++
		System.out.println(x); // 2 
	}
}
