package winter;

public class RamdomNumber {
    public static void main(String args[]) {
        Scanner scanner=new
        int[] salary= new int[5];
        money[0] = 6000;
        money[1] = 6100;
        money[2] = 5900;
        money[3] = 8000;
        money[4] = 4000;
        for (int i = 0; i < 5; i++) {
            System.out.println(money[i]);
        }
        int max = 0;
        for (int m = 0; m < 5; m++) {
            if (max <= money[m]) {
                max = money[m];
            }
        }
        System.out.println(money[max]);
        int min = 0;
        for (int i = 0; i < 5; i++) {
            if (min >= money[i]) {
                min = money[i];
            }
        }
        System.out.println(money[min]);

        int sum=0;
        for (int i = 0; i <= 5; i++) {
            sum += money[i];
        }
        int average = sum / 5;


        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4 - i; i++)
                if (money[i] < money[j]) {
                    int a = 0;
                    a = money[i];
                    money[i] = money[i + 1];
                    money[i + 1] = a;
                }
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(money[i]);
        }


    }
}