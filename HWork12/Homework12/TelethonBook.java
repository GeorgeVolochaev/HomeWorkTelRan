package homework12;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TelethonBook {
    private final ArrayList<TelephoneRecord> telBook;

    public TelethonBook(ArrayList<TelephoneRecord> telBook) {
        this.telBook = telBook;
    }

    public void addRecord(String secondName, String number){
        telBook.add(new TelephoneRecord(secondName, number));
    }

    public List<String> filterRecord(String secondName){
        return telBook.parallelStream()
                .filter(TelephoneRecord->TelephoneRecord.getSecondName().equals(secondName))
                .map(TelephoneRecord::getNumber)
                .collect(Collectors.toList());
    }

    @Override
    public String toString() {
        return "TelethonBook{" +
                "telBook=" + telBook +
                '}';
    }
}
