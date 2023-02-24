package Java.daily.day3.oop.calcualtor_Banking;

public class BankingSystem {
    int id;
    String name;
    int amount;

    public BankingSystem(int id, String name, int amount) {
        this.id = id;
        this.name = name;
        this.amount = amount;
    }

    void addAmount (int amt){
        amount+=amt;
    }

    void withDraw(int amt){
        if (amount<amt){
            System.out.println("Not Enough");
        } else
            amount-=amt;

    }

    public static void main(String[] args) {
        BankingSystem user1 = new BankingSystem(1,"Mg",10000);
        System.out.println("Original Amount for user1:"+user1.amount);
        user1.addAmount(30000);
        System.out.println("Total Amount for user1: "+user1.amount);
        user1.withDraw(100000);

        BankingSystem user2 = new BankingSystem(2,"Aung",1200);
        System.out.println("Original Amount for user2: "+ user2.amount);
        user2.addAmount(30000);
        System.out.println("AddAmount user2: "+ user2.amount);
        user2.withDraw(12000);
        System.out.println("This is with Draw for user2: "+ user2.amount);
    }
}
