import jnr.ffi.annotations.In;

public class test16 {


    public Integer Recurssion(Integer number){


        return rec(number--);
    }

    private Integer rec(Integer number) {

        Integer mult = 1;


        while(number > 0 ){


            number--;
            mult = mult*rec(number);
        }

        return mult;
    }
}
