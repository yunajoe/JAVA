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
    boolean deposit(int amount) {
        if (amount < 0 || owner.getCashAmount() < amount) {
            System.out.println("입금실패하였습니다. 잔고" + getBalance() + "현금" + owner.getCashAmount());
            return false;
        } else {
            // 변수를 재설정하려면 setter 메서드를 사용해야 한다
            owner.setCashAmount(owner.getCashAmount() - amount);
            setBalance(getBalance() + amount);
            System.out.println(amount + "입금하였습니다. 잔고:" + getBalance() + "현금:" + owner.getCashAmount());
            return true;
        }
    }
    // deposit 메서드가 하나 더 있지만은 parameter갯수로 구분이된다
    public boolean deposit(double amount, double exchangeRate){
        return deposit((int)(amount * exchangeRate));
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

    // 송금메소드 작성

    // 첫 번째 파라미터: 받는 사람의 계정 (BankAccount)
    // 두 번째 파라미터: 이체할 금액 (정수)
    // 리턴 : 성공여부 (불린)
    public boolean transfer(BankAccount to_person, int amount){
        boolean success;
        if(amount < 0 || amount> balance){
            success = false;
        }else{
            balance -= amount;
            to_person.balance += amount;
            success = true;
        }
        System.out.println(success + "from:" + owner.getName()+ "to: "
                + to_person.owner.getName()
                + "amount" + amount + "balance");
        return success;
    }

    // 첫 번째 파라미터: 받는 사람 (Person)
    // 두 번째 파라미터: 이체할 금액 (정수)
    // 리턴 : 성공여부 (불린)
    public boolean transfer(Person to_person, int amount){
        return transfer(to_person.getAccount(),amount);
    }


}