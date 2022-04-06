import java.util.*;

public class Main {

    static final int MAX_VALUE = 1024;

    public static void main(String[] args) {
        Logger logger = Logger.getInstance();

        logger.log("Программа запущена.");
        Scanner scanner = new Scanner(System.in);
        logger.log("Создан объект \"scanner\".");
        System.out.println("Введите размер списка.");
        logger.log("Просом пользователя ввести размер списка.");
        int n;
        while (true) {
            try {
                n = scanner.nextInt();
                logger.log("Пользователь ввёл число " + n);
                break;
            } catch (RuntimeException exception) {
                System.out.println("Введите число.");
                logger.log("Пользователь ввёл не число");
            } finally {
                scanner.nextLine();
            }
        }

        List<Integer> list = new ArrayList<>();
        logger.log("Создан пустой список.");
        Random random = new Random();
        logger.log("Создан объект \"random\".");
        for (int i = 0; i < n; i++) {
            int element = random.nextInt(MAX_VALUE);
            list.add(element);
            logger.log("В список добавлено число " + element);
        }

        System.out.println("Введите число для фильтрации списка.");
        logger.log("Просом пользователя ввести критерий фильтрации списка.");
        int treshold;
        while (true) {
            try {
                treshold = scanner.nextInt();
                logger.log("Пользователь ввёл число " + treshold);
                break;
            } catch (RuntimeException exception) {
                System.out.println("Введите число.");
                logger.log("Пользователь ввёл не число");
            } finally {
                scanner.nextLine();
            }
        }

        Filter filter = new Filter(treshold);
        logger.log("Создан объект \"filter\".");
        List<Integer> filteredList = new ArrayList<>();
        logger.log("Создан пустой отфильтрованый список.");
        filteredList = filter.filterOut(list);
        logger.log("Список отфильтрован.");
        System.out.println(filteredList);
        logger.log("Список выведен на экран.");
    }
}