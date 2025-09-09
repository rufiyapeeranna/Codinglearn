import java.util.Arrays;

public class LearnArrays {
    public static void secondmaxelement(int[] b)

    {
      int secmaxelementt= Arrays.stream(b).boxed().sorted((Integer val1,Integer val2) -> val2-val1).
        skip(1).findFirst().orElseThrow();
        System.out.println(secmaxelementt);

    }

    public static void main(String[] args) {
        int a[] ={23,43,2,11,33};
        secondmaxelement(a);
    }
}
