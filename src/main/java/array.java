import java.util.Arrays;

public class array {

  public static void main(String[] args) {
    String[] car = {"toyota"};
    char[] string = {'s', 'o', 'm', 'e', ' ', 's', 't', 'r', 'i', 'n', 'g'};
    int[][] numbers = {{1, 2, 2}, {4, 5, 6}};

    int[] sortnum = {9, 8, 7, 6, 5, 4, 3, 2, 1};
    int[] sortnum_1 = new int[sortnum.length];

    int aa = sortnum.length%2 ;
    if(aa != 0){

      sortnum_1[sortnum.length-1] = sortnum[sortnum.length-1];
    }

    for (int i = 0; i < sortnum.length -1; i=i+2) {

      if (sortnum[i] > sortnum[i + 1]) {
        //        System.out.println(sortnum[i]);
        //        System.out.println("The left is greater than right");
        sortnum_1[i] = sortnum[i + 1];
        sortnum_1[i+1] = sortnum[i];
      }


    }

//    for (int j = 0; j < sortnum_1.length; j++) {
//      System.out.println(sortnum_1[j]);
//    }

    System.out.println(Arrays.toString(sortnum_1));
//    System.out.println(Arrays.sort(sortnum_1));

    String a = "Shankar";
    String b = "Shankar";

    Money income = new Money(55, "USD");
    Money expense = new Money(55, "USD");

    for (int i = 0; i < numbers.length; i++) {
      System.out.println();

      for (int j = 0; j < numbers[i].length; j++) {

        System.out.print(numbers[i][j] ^ 0);
      }
    }

    boolean balance = income.equals(expense);
    // boolean balance1 = a.equals(b);
    System.out.println(balance);
    //        System.out.println(balance1);

  }

  @Override
  public boolean equals(Object o) {

    if (o == this) {
      return true;
    }

    if (!(o instanceof Money)) {
      return false;
    }

    Money other = (Money) o;

    return super.equals(o);
  }

  static class Money {
    int amount;
    String currencyCode;

    public Money(int amount, String currencyCode) {
      this.amount = amount;
      this.currencyCode = currencyCode;
    }

    public int getAmount() {
      return amount;
    }

    public void setAmount(int amount) {
      this.amount = amount;
    }

    public String getCurrencyCode() {
      return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
      this.currencyCode = currencyCode;
    }
  }
}
