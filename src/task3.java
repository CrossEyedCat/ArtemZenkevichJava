public class task3 {
    public static void main(String[] args) {
        int[] array = {3, 5, 9, 11, 15, 17, 21};

        System.out.println("Элементы массива, кратные 3:");
        for (int num : array) {
            if (num % 3 == 0) {
                System.out.println(num);
            }
        }
    }
}