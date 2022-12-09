import java.util.ArrayList;
import java.util.HashMap;

public class MonthReports {
    HashMap<Integer, ArrayList<Item>> items = new HashMap<>();

    public void addMonth(int key, ArrayList<Item> value) { //Метод для сохранения данных за месяц
        items.put(key, value);

    }

    public void printReport() {
        double multiplication = 0;
        double maxMultiplication = 0;

        for (int monthNumber : items.keySet()) {
            ArrayList<Item> values = items.get(monthNumber);
            for (Item element : values) {
                if (!element.isExpense) {
                    multiplication = element.quantity * element.sumOfOne;
                    if (maxMultiplication < multiplication) {
                        maxMultiplication = multiplication;
                        System.out.printf("""
                                Месячный отчет:
                                Месяц %s: %s %20.2f
                                %n""", getMonthName(monthNumber), element.itemName, maxMultiplication);
                    }

                } else {

                }
            }
        }
    }

    public String getMonthName(int numberOfMonth) {
        return switch (numberOfMonth) {
            case 1 -> "Январь";
            case 2 -> "Февраль";
            case 3 -> "Март";
            case 4 -> "Апрель";
            case 5 -> "Май";
            case 6 -> "Июнь";
            case 7 -> "Июль";
            case 8 -> "Август";
            case 9 -> "Сентябрь";
            case 10 -> "Октябрь";
            case 11 -> "Ноябрь";
            case 12 -> "Декабрь";
            default -> "Не знаем такого месяца";
        };
    }

}
