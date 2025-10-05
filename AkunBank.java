public class AkunBank {
private int saldo;

   public AkunBank(int saldo){
    this.saldo = saldo;
   }
   public void setSaldo(int saldo){
    this.saldo = saldo;
   }
   public int getSaldo(){
    return this.saldo;
   }
   public int menabung(int saldo){
    return this.saldo +=saldo;
   }
   public void tarikTunai(int saldo){
    this.tarikTunai(50000);         //tidak boleh minus
   }                                      //minimal tersisa 10

   }

