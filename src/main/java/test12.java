import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class test12 {

//  public static void main(String[] args) {
//    // Find the Biggest Sum of 3 Consecutive numbers, given a list of Integers
//    // For example {1, 2, 10, 4, 5, 6, 7, 2}, biggest sum would be 10+4+5=19
//    // Test String {10, 23, 45, 56, 5, 4, 101}
//      //Time complexity and Memory Com
//
//


    public  Integer sumMethod(List<Integer> a) {
      int j=0;
      int k=0;
      int l=0;

      Integer tempSum =0;
      Integer sum =0;

        for(int i =0 ;i<a.size()-2;i++ ){
            j=i+1;
            k=i+2;

            sum = a.get(i)+a.get(j)+a.get(k);
            i++;
            j++;
            k++;

            //2 <3
            //3 <2
            if(tempSum < sum){
                tempSum = sum;
            }

        }

        return tempSum;
    }
}
