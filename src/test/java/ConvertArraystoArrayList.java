import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConvertArraystoArrayList {

    public static void main(String[] args) {

       int a [] ={1,23,4,6,6};

    // using streams

     List<Integer> list1=  Arrays.stream(a).boxed().collect(Collectors.toList());
        System.out.println(list1);
    }
}
