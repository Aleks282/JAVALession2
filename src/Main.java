public class Main {
    public static void main(String[] args) {

        int account = 100;
        int deposit = 3500;

        int bonus;
        if (deposit > 1000) {
            bonus = deposit / 100;
        } else {
            bonus = 0;
        }
        int totaLAmout = account + deposit + bonus;

        System.out.print("Итоговая сумма на счете: ");
        System.out.print(totaLAmout);
        System.out.print("P");
        System.out.print("В том числе бонус за пополнение: ");
        System.out.print(bonus);
        System.out.print("P");
        }
    }