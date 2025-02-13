package exercise;

public class MethodObject {

    class Account {
        private int delta() {
            return 10;
        }

        // Refactored: Instead of implementing the logic here, delegate it to GammaCalculator
        public int gamma(int inputVal, int quantity, int yearToDate) {
            return new GammaCalculator(this, inputVal, quantity, yearToDate).compute();
        }
    }

    // New Class to encapsulate the logic of gamma method
    class GammaCalculator {
        private final Account account;
        private final int inputVal;
        private final int quantity;
        private final int yearToDate;
        private int importantValue1;
        private int importantValue2;
        private int importantValue3;

        public GammaCalculator(Account account, int inputVal, int quantity, int yearToDate) {
            this.account = account;
            this.inputVal = inputVal;
            this.quantity = quantity;
            this.yearToDate = yearToDate;
        }

        public int compute() {
            importantValue1 = (inputVal * quantity) + account.delta();
            importantValue2 = (inputVal * yearToDate) + 100;
            if ((yearToDate - importantValue1) > 100) {
                importantValue2 -= 20;
            }
            importantValue3 = importantValue2 * 7;
            return importantValue3 - 2 * importantValue1;
        }
    }

    private void test() {
        Account account = new Account();
        System.out.println(account.gamma(15, 10, 2010));
    }

    public static void main(String[] args) {
        MethodObject p = new MethodObject();
        p.test();
    }
}
