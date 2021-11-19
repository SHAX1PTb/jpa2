//import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.*;
import java.util.stream.Collectors;

public class abcd {

  public static void main(String[] args) {

    System.out.println("hello world");

    ArrayList<String> abc= new ArrayList<>();
    List<String> aaa = new ArrayList<>();
    aaa.add("shankR");

    System.out.println(aaa);

    abc.add("apple");
    abc.add("banana");
    abc.add("orange");
    abc.add("grapes");
    abc.add("watermellon");



    for(int i=0;i<abc.size();i++){
      System.out.println(abc.get(i));
    }

    // get the size of the array; Divivde it 2 and if the remainder is zero, Thre is no middle one.
    //Else there is a middle element and it will be size/2
    Integer size = abc.size() % 2;

    if(size == 0){
      System.out.println("there is no middle element");
    }else{
      System.out.println("there is  middle element");
    }

    ArrayList<Integer> abcd= new ArrayList<>();

    abcd.add(7);
    abcd.add(19);
    abcd.add(-1);
    abcd.add(42);
    abcd.add(2005);
    //
    System.out.println(abcd.stream().sorted().collect(Collectors.toList()));
    System.out.println(abcd.stream().sorted().collect(Collectors.toList()));


Collections.sort(abcd);

    System.out.println(abcd);


    Integer inital = 1265;

    Integer UnitPlace = 1;
    Integer TensPlace = 10;
    Integer HundredPlace = 100;
    Integer ThousandPlace = 1000;

      LinkedList<Integer> stack = new LinkedList<>();

    while (inital >0){

      System.out.println(inital%10);
      stack.push(inital%10);
      inital = inital/10;
    }
//
//    while (!stack.isEmpty()){
//      System.out.println(stack.pop());
//    }




  }



}
