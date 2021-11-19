//import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class test3 {

    public static void main(String[] args) {

        List<String> a = new ArrayList<String>();
        List<Integer> b = new ArrayList<Integer>();

        a.add("Shanka");

        test4 n = new test4();
        n.print1(Collections.singletonList(a));
//        n.print1(b);

    }

    static  class test4{

        public void print1(List<Object> a ){

            System.out.println(a.get(0));
            System.out.println("i am printing");
        }
    }
}
