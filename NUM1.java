import java.util.Scanner;
public class NUM1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Vvedite razmer massiva: ");
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        System.out.println("Vvedite " + size + " elementov massiva:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i+1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        double average = (double) sum / numbers.length;

        System.out.println("Massiv chisel:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println("\nSumma elementov: " + sum);
        System.out.println("Srednee arifmeticheskoe: " + average);
        scanner.close();
    }
}
