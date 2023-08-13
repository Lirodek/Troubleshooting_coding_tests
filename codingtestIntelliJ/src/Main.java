import java.util.Arrays;
import java.util.function.IntConsumer;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        int a[] = new int[]{1,2,3,4};
        int b[] = new int[]{-3,-1,0,2};
        System.out.println(solution(a, b));
    }

    private static int solution(int[] a, int[] b) {
        return IntStream.range(0, a.length).map(i->a[i]*b[i]).sum();
    }
}