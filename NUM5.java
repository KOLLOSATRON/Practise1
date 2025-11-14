public class NUM5 {
    static long fact(int n) {
        long f = 1;
        for (int i = 2; i <= n; i++) {
            f = f * i;
        }
        return f;
    }
    public static void main(String[] args) {
        System.out.println("Факториал 5: " + fact(5));
        System.out.println("Факториал 6: " + fact(6));
        System.out.println("Факториал 7: " + fact(7));
    }
}
