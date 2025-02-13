package exercise;

public class ExtractClass {
    class Person {
        private String name;
        private TelephoneNumber telephoneNumber = new TelephoneNumber();

        public String getName() {
            return name;
        }

        public String getTelephoneNumber() {
            return telephoneNumber.getFormattedNumber();
        }

        public String getOfficeAreaCode() {
            return telephoneNumber.getAreaCode();
        }

        public void setOfficeAreaCode(String arg) {
            telephoneNumber.setAreaCode(arg);
        }

        public String getOfficeNumber() {
            return telephoneNumber.getNumber();
        }

        public void setOfficeNumber(String arg) {
            telephoneNumber.setNumber(arg);
        }
    }

    class TelephoneNumber {
        private String areaCode;
        private String number;

        public String getAreaCode() {
            return areaCode;
        }

        public void setAreaCode(String areaCode) {
            this.areaCode = areaCode;
        }

        public String getNumber() {
            return number;
        }

        public void setNumber(String number) {
            this.number = number;
        }

        public String getFormattedNumber() {
            return "(" + areaCode + ") " + number;
        }
    }
}
