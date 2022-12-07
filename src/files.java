import java.util.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
public class files {
MonthReport monthReport = new MonthReport();
        public List<String> readFileContents(String file) {   //данный метод отвечает за считывание информации из файла

            try {
                return Files.readAllLines(Path.of(file));  //считывание файла
            } catch (IOException e) {
                System.out.println("Невозможно прочитать файл с отчётом. Возможно файл не находится в нужной директории.");
                return Collections.emptyList();
            }
        }

        public void fileName(){ // Данный метод автоматическки создает название файла и передает его в метод считывания файла

            for (int i=1; i<=3;i++) {  //цикл для создания названия
                String fileName = "resources/m.20210" + i + ".csv";
                workWithFilesMonth(fileName);
                System.out.println(fileName);
            }
        }



         public  ArrayList<Item> workWithFilesMonth(String fileName) {   // Данный метод вызывается из меню и передает название файла в метод считывания информации

                ArrayList<Item> itemArray = new ArrayList<>();
                List<String> lines = readFileContents(fileName);

                for (int i = 1; i < lines.size(); i++) { // цикл для разделения строк на элементы
                    String line = lines.get(i);
                    String[] items = line.split(",");
                    System.out.println(String.join(",", items));
                    Item item = new Item(items[0], items[2], items[3], items[1]);
                    itemArray.add(item);
                }
                return itemArray;
         }

    }


