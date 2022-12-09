/*
import java.util.ArrayList;
import java.util.HashMap;

public class YearReport {
}

    HashMap<String, ArrayList<Item>> items = new HashMap<>();

    public void addMonth(String key, ArrayList<Item> value) { //Метод для сохранения данных за месяц
        items.put(key, value);
        System.out.println(items);
    }

    public void printReport(){

        System.out.println(itemsForPrint+"222222222222222222222222222222222222222222222");
        for (String monthNumber : items.keySet()) {
            ArrayList<Item> values = items.get(monthNumber);
            for (Item element : values) {
                System.out.println(element);
                if(element.isExpense){
                    System.out.println("огоооооооо"+element);
                }else {
                    System.out.println("мдяяяяяя");
                }
            }
        }
    }

}

 */