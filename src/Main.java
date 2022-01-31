public class Main {
    public static void main(String[] args) {
        int initialBalance = 100;
        int amountToppingUpTheBalance = 1100;
        int bonusRubles = amountToppingUpTheBalance > 1000 ? amountToppingUpTheBalance / 100 : 0;
        int finishBalance = initialBalance + amountToppingUpTheBalance + bonusRubles;
        System.out.println(finishBalance);
    }
}