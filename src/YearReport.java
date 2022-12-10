
import java.util.ArrayList;

public class YearReport {
    ArrayList<ItemForYear> itemForPrint = new ArrayList<>();

    public void printYear(ArrayList<ItemForYear> records) {
        itemForPrint = records;

    }

    public void printReport() {

        if (itemForPrint.size() != 0) {
            System.out.println("Данный отчет составлен за 2021 год.");
            System.out.println(itemForPrint);
            int getName = 0;
            for (ItemForYear element : itemForPrint) {

                if (!element.isExpense) {
                    getName = element.month;

                } else {

                }
                System.out.println(getName);
            }

        } else {
            System.out.println("Список не был загружен (Нажмите цифру 2)");
        }
    }

    public String getMonthNameForYear(int month) {
        String result;
        switch (month) {
            case 1:
                result = "Январь";
                break;
            case 2:
                result = "Февраль";
                break;
            case 3:
                result = "Март";
                break;
            default:
                result = "Не знаем такого месяца";
                break;
        }
        return result;
    }
}
