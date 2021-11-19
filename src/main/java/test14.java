import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public final class test14 {

    public boolean anagram(String input1 , String input2 ){

        char[]  input1toArray = input1.toCharArray();
        char[]  input2toArray = input2.toCharArray();

    Arrays.sort(input1toArray);
    Arrays.sort(input2toArray);

    //List<Character> aa = (List<Character>) Stream.of(input1toArray);




        if(input1toArray == input2toArray){

            return true;
        } else {
            return false;
        }



    //int cmp = Arrays.compare(input1toArray,input2toArray);
//
//        for(char c:input1toArray){
//
//            if(input2toArray[i])
//        }
//        boolean allValid = false;
//
//        for(int i=0;i<input1toArray.length;i++){
//
//            if(input1toArray[i] == input2toArray[i]){
//                allValid = true;
//            }else {
//                allValid = false;
//            }
//
//        }
//
//    if(allValid){
//        return true;
//    } else {
//        return false;
//    }


        //Given a number and need to find idf divisble by 9

        // will add 9 in a recussive mode till it matches the given number OR its greater than the provided number.
        //9 == number
        // if(total < number
        // 9+9 == number
        //add 7854  .. 7+8+5+4 =
        //mod / div
        //


    }


}
