public class ExceptionHandling {

    static void bagi(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Tidak bisa dibagi dengan nol!");
        }
        System.out.println("Hasil: " + (a / b));
    }

    public static void main(String[] args) {
        try {

            bagi(10, 0);  
        } 
        catch (ArithmeticException e) {
            System.out.println("Terjadi error: " + e.getMessage());
        } 
        finally {
            System.out.println("Blok finally selalu dijalankan.");
        }

        System.out.println("Program tetap berjalan setelah try-catch-finally.");
    }
}
