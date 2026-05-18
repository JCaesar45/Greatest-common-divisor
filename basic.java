// Java. Static method like they usually want in these leetcode-style things. 
// Used int, assuming fits. If they throw longs later I'd swap but tests are small.
public class GCD {
    public static int gcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
