import java.util.*;

public class test1 {

  public static void main(String[] args) {
    //

    List<String> abc = new ArrayList<>(Arrays.asList("C"));
    List<String> abc1 = new LinkedList<>();
    List<String> abc2 = Collections.unmodifiableList(new ArrayList<>(Arrays.asList("A")));
    List<String> abc3 = Arrays.asList("A");

    abc.add("shankar");
    abc1.add("shankar");
    //      abc2.set(0,"C");
    abc3.set(0, "B");

    System.out.println(abc);
    System.out.println(abc1);
    System.out.println(abc2);
    System.out.println(abc3);

    String[] mystring = new String[10];
    mystring[0] = "shanakr";
    mystring[1] = "shanakr";

    System.out.println(mystring[1]);

    Character[] cc = new Character[1];
    cc[0] = 'c';
    System.out.println(cc[0]);

    char[] dd = new char[2];
    dd[0] = 'd';
    System.out.println(dd[0]);

    String input = "Shankar";

    char[] input2 = new char[input.length()];

    for (int i = 0; i < input.length(); i++) {

      input2[i] = input.charAt(i);


    }
      System.out.println(input2);


    Integer a = 123456;
    List<Integer> b = new ArrayList<>();
    Stack<Integer> c = new Stack<>();



    while(a>0){

      b.add(a%10);
      a=a/10;
      c.push(a);


    }
    System.out.println(c);
  }
}
