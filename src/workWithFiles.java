public class workWithFiles {
    String file ="";
    public void workWithFilesMonth(int a) {

 if (a==1){
     file= "resources/m.202101.csv";
 }
        files readFile = new files();

 readFile.readFileContents(file);


        for (int i = 0; i <12 ; i++) {
           // String[] items = readFile.readFileContents[i].split(",");
        }
        System.out.println("I'm life!");

    }

}
