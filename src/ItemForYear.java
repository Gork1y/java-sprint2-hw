
public class ItemForYear {
    int month;
    int amount;
    boolean isExpense;

    public ItemForYear(String month, String amount, String isExpense) {
        this.month = Integer.parseInt(month);
        this.amount = Integer.parseInt(amount);
        this.isExpense = Boolean.parseBoolean(isExpense);
    }

    @Override
    public String toString() {
        return "ItemForYear{" +
                "month=" + month +
                ", amount=" + amount +
                ", isExpense=" + isExpense +
                '}';
    }
}


