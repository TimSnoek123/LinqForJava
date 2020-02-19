import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        LinqList<String> list = new LinqList<>();
        list.add("test1");
        list.add("test2");
        list.add("test3");
        list.add("test4");


        List<String> list1 = new ArrayList<>();

        System.out.print(list.takeLast());

    }
}
