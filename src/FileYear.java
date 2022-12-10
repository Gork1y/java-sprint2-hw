import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FileYear {
    YearReport yearReport = new YearReport();
    public void YearfileName(){ // Данный метод задает название файла и передает его в метод считывания файла
        String fileName = "resources/y.2021.csv";
         readFileYear(fileName);
        ArrayList<ItemForYear> records =  workWithFilesYear(fileName);
        yearReport.printYear(records);
        workWithFilesYear(fileName);
    }
    public List<String> readFileYear(String fileName) {   //данный метод отвечает за считывание информации из файла
        try {
            return java.nio.file.Files.readAllLines(Path.of(fileName));  //считывание файла
        } catch (IOException e) {
            System.out.println("Невозможно прочитать файл с отчётом. Возможно файл не находится в нужной директории.");
            return Collections.emptyList();
        }
    }
    public  ArrayList<ItemForYear> workWithFilesYear(String fileName) {   // Данный метод вызывается из меню и передает название файла в метод считывания информации

        ArrayList<ItemForYear> itemArrayYears = new ArrayList<>();
        List<String> linesYear = readFileYear(fileName);

        for (int i = 1; i < linesYear.size(); i++) { // цикл для разделения строк на элементы
            String line = linesYear.get(i);
            String[] itemsYear = line.split(",");
            ItemForYear YearlyReport = new ItemForYear(itemsYear[0], itemsYear[1], itemsYear[2]);
            itemArrayYears.add(YearlyReport);
        }
        return itemArrayYears;
    }
}
