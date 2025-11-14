import java.util.Scanner;

public class NUM2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Vvedite razmer massiva: ");
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        System.out.println("Vvedite " + size + " elementov massiva:");
        int i = 0;
        do {
            System.out.print("Element " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
            i++;
        } while (i < size);
        int sum = 0;
        int j = 0;
        while (j < numbers.length) {
            sum += numbers[j];
            j++;
        }
        int max = numbers[0];
        int min = numbers[0];
        for (int k = 1; k < numbers.length; k++) {
            if (numbers[k] > max) {
                max = numbers[k];
            }
            if (numbers[k] < min) {
                min = numbers[k];
            }
        }
        double average = (double) sum / numbers.length;
        System.out.println("\nMassiv chisel:");
        for (int k = 0; k < numbers.length; k++) {
            System.out.print(numbers[k] + " ");
        }
        System.out.println("\n\nResults:");
        System.out.println("Summa: " + sum);
        System.out.println("Srednee arifmeticheskoe: " + average);
        System.out.println("Max element: " + max);
        System.out.println("Min element: " + min);
        scanner.close();
    }
}
