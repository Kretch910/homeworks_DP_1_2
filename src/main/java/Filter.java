import java.util.ArrayList;
import java.util.List;

public class Filter {
    protected int treshold;

    public Filter(int treshold) {
        this.treshold = treshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();
        List<Integer> result = new ArrayList<>();

        for (Integer element : source) {
            if (element > treshold) {
                result.add(element);
                logger.log("Элемент " + "\"" + element + "\"" + " подходит.");
            } else {
                logger.log("Элемент " + "\"" + element + "\"" + " не подходит.");
            }
        }
        return result;
    }
}