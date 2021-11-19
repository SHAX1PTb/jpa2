import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class test5 {

  public static void main(String[] args) {

      List<employee> employeeList = new ArrayList<>();

      employeeList.add(new employee("3","Pradeep","Amex","2500"));

      employee e1 = new employee("1","Shankar","TCS","1800");

      employee e2 = new employee("2","Subhash","TCS","1800");


      employeeList.add(e1);
      employeeList.add(e2);
//
//      Map<String,List<String>> employeeList_withDept = employeeList.stream().collect(Collectors.groupingBy(w->w))


      HashMap<String,List<String>>  hashMap = new HashMap<>();

      for(int i =0;i<employeeList.size();i++){

          if(!hashMap.containsKey(employeeList.get(i).getDept() )){
              List<String> ee = new ArrayList<>();
              ee.add(employeeList.get(i).getName());

              hashMap.put(employeeList.get(i).getDept(),ee);
          }else{

              hashMap.get(employeeList.get(i).getDept()).add(employeeList.get(i).getName());
          }
      }


    System.out.println(hashMap);

      //
  }
}
