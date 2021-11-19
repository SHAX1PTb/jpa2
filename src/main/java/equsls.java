public class equsls {


    //WrongVoucher voucher = new WrongVoucher(42, "USD", "Amazon");


    public static void main(String[] args) {

        Money income = new Money(55, "USD");
        Money expense = new Money(55, "USD");


        Money cash = new Money(42, "USD");


        boolean balanced = income.equals(expense);
        System.out.println(balanced);


    }


}


class Money {

    int amount;
    String currencyCode;

    public Money(int amount, String currencyCode) {
        this.amount = amount;
        this.currencyCode = currencyCode;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Money))
            return false;
        Money other = (Money) o;
        boolean currencyCodeEquals = (this.currencyCode == null && other.currencyCode == null)
                || (this.currencyCode != null && this.currencyCode.equals(other.currencyCode));
        return this.amount == other.amount && currencyCodeEquals;
    }


    class WrongVoucher extends Money {

        private String store;

        public WrongVoucher(int amount, String currencyCode) {
            super(amount, currencyCode);
        }

        @Override
        public boolean equals(Object o) {
            if (o == this)
                return true;
            if (!(o instanceof WrongVoucher))
                return false;
            WrongVoucher other = (WrongVoucher) o;
            boolean currencyCodeEquals = (this.currencyCode == null && other.currencyCode == null)
                    || (this.currencyCode != null && this.currencyCode.equals(other.currencyCode));
            boolean storeEquals = (this.store == null && other.store == null)
                    || (this.store != null && this.store.equals(other.store));
            return this.amount == other.amount && currencyCodeEquals && storeEquals;
        }
    }
}
