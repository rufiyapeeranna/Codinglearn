import java.util.Arrays;

public class LearnArrays {
    public static void secondminimun(int[] b)

    {
      int secelementt= Arrays.stream(b).boxed().sorted((Integer val1,Integer val2) -> val2-val1).
        skip(1).findFirst().orElseThrow();
        System.out.println(secelementt);

    }

    public static void main(String[] args) {
        int a[] ={23,43,2,11,33};
        secondminimun(a);
    }
}
