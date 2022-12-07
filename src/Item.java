public class Item {
    String itemName;
    int quantity;
    double sumOfOne;
    Boolean isExpense;
    public Item(String itemName,String quantity, String sumOfOne, String isExpense){
        this.itemName=itemName;
        this.quantity=Integer.parseInt(quantity);
        this.sumOfOne=Double.parseDouble(sumOfOne);
        this.isExpense=Boolean.parseBoolean(isExpense);
    }
}
