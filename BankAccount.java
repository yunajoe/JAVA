public class BankAccount {
    private int balance;
    private Person owner;

    public void setBalance(int pBalance){
        balance = pBalance;
    }
    public int getBalance(){
        return balance;
    }

    public void setOwner(Person pOwner){
        owner = pOwner;
    }
    public Person getOwner(){
        return owner;
    }

    // 파라미터: 입금할 액수
    // 리턴: 성공여부(boolean)
    boolean deposit(int amount){
      if(amount < 0 || owner.getCashAmount() < amount){
          System.out.println("입금실패하였습니다. 잔고" + getBalance() + "현금" + owner.getCashAmount());
          return false;
      }else{
        // 변수를 재설정하려면 setter 메서드를 사용해야 한다
          owner.setCashAmount(owner.getCashAmount()-amount);
          setBalance(getBalance() + amount);
          System.out.println(amount + "입금하였습니다. 잔고:" + getBalance() + "현금:" + owner.getCashAmount());
          return true;
      }
    }

    // 파라미터: 출금할 액수
    // 리턴: 성공여부(boolean)
    boolean withdraw(int amount){
        if(amount < 0 || amount > getBalance()){
            System.out.println("출금실패입니다. 잔고:"+ getBalance() +"원, 현금:" + owner.getCashAmount());
                return false;
        }else{
            setBalance(getBalance()-amount);
            owner.setCashAmount(owner.getCashAmount()+amount);
            System.out.println(amount +"원 출금하였습니다. 잔고:" + getBalance() + "원, 현금" + owner.getCashAmount());
                return true;
        }
    }


}