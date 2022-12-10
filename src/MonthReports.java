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
        String maxName = null;
        double multiplicationForMin = 0;
        double minMultiplication = 0;
        String minName = null;
        if (items.size() != 0) {
            for (int monthNumber : items.keySet()) {
                ArrayList<Item> values = items.get(monthNumber);
                for (Item element : values) {
                    if (!element.isExpense) {
                        multiplication = element.quantity * element.sumOfOne;
                        if (maxMultiplication < multiplication) {
                            maxMultiplication = multiplication;
                            maxName = element.itemName;
                        }
                    } else {
                        multiplicationForMin = element.quantity * element.sumOfOne;
                        if (minMultiplication < multiplicationForMin) {
                            minMultiplication = multiplicationForMin;
                            minName = element.itemName;
                        }
                    }
                }
                System.out.println(" Месячный отчет:  Месяц: " + getMonthName(monthNumber));
                System.out.println("Самый прибыльный товар " + maxName + ":" + maxMultiplication);
                System.out.println("Самый затратный товар " + minName + ":" + multiplicationForMin);
            }
            }else{
                System.out.println("сначала загрузите отчеты (нажмите цифру 1)");
            }
        }


    public String getMonthName(int numberOfMonth) {
        String result;
        switch (numberOfMonth) {
            case 1:
                result="Январь";
                break;
            case 2:
                result="Февраль";
                break;
            case 3:
                result="Март";
                break;
            default:
                result="Не знаем такого месяца";
                break;
        }
        return result;
    }

}
