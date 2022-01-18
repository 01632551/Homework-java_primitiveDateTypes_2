public class main {
    public static void main(String[] args) {
        int InitialBalance = 100;
        int AmountToppingUpTheBalance = 1100;
        int BonusRubles = AmountToppingUpTheBalance > 1000 ? AmountToppingUpTheBalance / 100 : 0;
        int FinishBalance = InitialBalance + AmountToppingUpTheBalance + BonusRubles;
        System.out.println(FinishBalance);
    }
}
