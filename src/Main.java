import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FilesMonth file = new FilesMonth();
        FileYear fileYear = new FileYear();
        YearReport yearReport = fileYear.yearReport;
        MonthReports monthReports= file.monthReport;

        printMenu();
        int userInput = scanner.nextInt();

        while (userInput != 0) {
            if (userInput==1){
                System.out.println("Считывание месячных отчетов");
                file.fileName();

            }
            else if (userInput==2){
                System.out.println("Считывание годового отчета");
                fileYear.YearfileName();

            }
            else if (userInput==3){

            }
            else if (userInput==4){
                System.out.println("Вывод информации по месяцам:");
                monthReports.printReport();
            }
            else if (userInput==5){
                System.out.println("Вывод информации по году:");
                yearReport.printReport();


            }
            else{System.out.println("Такой команды нет");
            }
            printMenu(); // печатаем меню ещё раз перед завершением предыдущего действия
            userInput = scanner.nextInt(); // повторное считывание данных от пользователя
        }
    }

        private static void printMenu () {
            System.out.println("1 Считать все месячные отчёты");
            System.out.println("2 Считать годовой отчёт");
            System.out.println("3 Сверить отчёты");
            System.out.println("4 Вывести информацию о всех месячных отчётах");
            System.out.println("5 Вывести информацию о годовом отчёте");
            System.out.println("0 Завершение работы");
        }

}
