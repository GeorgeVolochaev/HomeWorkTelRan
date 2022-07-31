package homework12;

public class TelephoneRecord {
    private final String secondName;
    private final String number;

    public TelephoneRecord(String secondName, String number) {
        this.secondName = secondName;
        this.number = number;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getNumber() {

        return number;
    }

    @Override
    public String toString() {
        return "TelephoneRecord{" +
                "firstName='" + secondName + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}
