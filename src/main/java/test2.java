@FunctionalInterface
interface CustomFunctionalInterface {

    void display();
}


public class test2 {

    public static void main(String[] args) {

        CustomFunctionalInterface test1 = new CustomFunctionalInterface() {
            @Override
            public void display() {

                System.out.println(" i am annonimious inner class");
            }
        };

        test1.display();
        CustomFunctionalInterface test2 = () -> {
            System.out.println("Display using Lamda experiance");
        };

        test2.display();


        String multilineString = "Baeldung helps \n \n developers \n explore Java.";

     

    }


}
