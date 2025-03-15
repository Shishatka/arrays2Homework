//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int[] sum = {123, 202, 404, 673, 900};
        int total = 0;
        for (int current : sum) {
            total = total + current;
        }
        System.out.println("Сумма трат за месяц составила " + total + " рублей");


        int[] secondSum = {243, 1149, 4909, 129, 590};
        int max = -1;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < secondSum.length; i++) {
            if (secondSum[i] > max) {
                max = secondSum[i];
            }
            if (secondSum[i] < min) {
                min = secondSum[i];
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + min + " рублей");
        System.out.println("Максимальная сумма трат за неделю составила " + max + " рублей");

        int[] thirdSum = {490, 643, 530, 430, 875};
        total = 0;
        for (int current : thirdSum) {
            total = total + current;
        }
        int mean = total / 5;
        System.out.println("Средняя сумма трат за месяц составила " + mean + " рублей");

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        char[] fullName = new char[reverseFullName.length];
        int j = 0;
        for (int i = reverseFullName.length-1; i >= 0; i--) {
            fullName[j] = reverseFullName[i];
            j++;
        }
        System.out.println(fullName);
    }
}
