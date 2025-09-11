import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConvertArraystoArrayList {

    public static void main(String[] args) {

       Integer  a [] ={1,23,4,6,6};
       ArrayList<Integer> a1=new ArrayList<>(Arrays.asList(a));
        System.out.println("before removing" +a1);
        a1.remove(4);
        System.out.println(" after remove" + a1);

    }
}
