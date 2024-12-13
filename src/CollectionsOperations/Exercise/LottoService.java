package CollectionsOperations.Exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LottoService {
    private List<Integer> numbers;

    public LottoService() {
        this.numbers = new ArrayList<>();
    }

    public void generate(){
        numbers.clear();
        for (int i = 1; i <= 49; i++) {
            numbers.add(i);
        }        
    }

    public void randomize(){
        Collections.shuffle(numbers);
    }

    public int checkResult(List<Integer> userNumbers){
        int matches = 0;
        List<Integer> winingNumbers = numbers.subList(0, 6);
        for (Integer number : userNumbers) {
            if (winingNumbers.contains(number)) {
                matches++;
            }
        }
        return matches;
    }

    public List<Integer> getWinningNumbers() {
        return numbers.subList(0, 6);
    }
}
