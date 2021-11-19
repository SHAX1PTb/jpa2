public class gpact {


    private static StringBuilder s2 = new StringBuilder();


    public static void main(String[] args) {

        String s1 = "GADAG";

        checkpalindrome(s1);

    }

    private static void checkpalindrome(String s1) {


        for (int i = s1.length(); i > 0; i--) {


            s2 = s2.append(s1.charAt(i-1));

        }

        String s3 = s2.toString();
        System.out.println(s3);
        if (s1.equalsIgnoreCase(s3)) {
            System.out.println("palindrome");

        }else{
            System.out.println("not a palindrome");
        }


    }


}
