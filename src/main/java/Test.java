import javax.persistence.criteria.CriteriaBuilder;
import javax.security.sasl.SaslException;
import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {

    public static void main(String[] args) {

        ArrayList a = new ArrayList();
        List b = new ArrayList();

        a.add(2);
        a.add(1);
        a.add(3);
        a.add(3);

        b = method(a);
        System.out.println(b);
    }

    private static List<Integer>  method(ArrayList a) {




        TreeSet<Integer> c = new TreeSet<>();
        c.addAll(a);

        reverse1(c);
        List<Integer> z = c.stream().sorted().collect(Collectors.toList());
        Collections.sort(a,Collections.reverseOrder());

//
//        System.out.println(c);
        System.out.println(a);

        return a;
    }

    private static void reverse1(TreeSet<Integer> c) {


    }


}
