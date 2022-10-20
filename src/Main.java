public class Main {
    public static void main(String[] args) {

        int[] arr = generateRandomArray();
        System.out.println("ЗАДАНИЕ 1");
        int total = 0;
        for (int i : arr) {
            total = total + i;
        }
        System.out.println("Сумма трат за месяц составила " + total + " рублей!");

        System.out.println("ЗАДАНИЕ 2");
        int max = arr[0];
        int min = arr[0];
        for (int n : arr) {
            if (max < n)
                max = n;
            if (min > n)
                min = n;
        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей. Максимальная сумма трат за день составила " + max + " рублей!");

        System.out.println("ЗАДАНИЕ 3");
        float averageSpend = 0;
        float totalSum = 0;
        for (int spend : arr) {
            totalSum = totalSum + spend;
        }
        averageSpend = totalSum / 30;
        System.out.println("Средняя сумма трат за месяц составила " + averageSpend + " рублей!");

        System.out.println("ЗАДАНИЕ 4");

    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}