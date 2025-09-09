import java.util.Arrays;

public class LearnArrays {
    public static void removeduplicate(int[] b)

    {
      Arrays.stream(b).distinct().forEach( c-> System.out.println(c));


    }

    public static void main(String[] args) {
        int a[] ={23,43,23,11,33};
        removeduplicate(a);
    }
}
