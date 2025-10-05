public class AkunBankTest{
    
    public static void main(String[] args) {
        
        AkunBank akun1 = new AkunBank(50000);
        AkunBank akun2 = new AkunBank(10000);
        AkunBank akun3 = new AkunBank(3000);
        
        akun1.setSaldo(50000);
        System.out.println("saldo akun1: "+ akun1.getSaldo());

        akun2.setSaldo(10000);
        System.out.println("saldo akun2: "+ akun2.getSaldo());

        akun3.setSaldo(3000);
        System.out.println("saldo akun3: "+ akun3.getSaldo());
    }
}