import java.util.ArrayList;
import java.util.List;

public class Generator {
    private List<Integer> pickedNumber = new ArrayList<>();

    public List<Integer> pickedNumber() {
        while(pickedNumber.size() < 3) {
            int number = randNumberExcludeZero();

            if(!containsNumber(number)) {
                pickedNumber.add(number);
            }
        }

        return pickedNumber;
    }

    private int randNumberExcludeZero() {
        return (int) (Math.random() * 10 + 1) % 9;
    }

    private boolean containsNumber(int number) {
        return pickedNumber.contains(number);
    }

}