public class BankAccount {
    int balance;
    // Person 클래스를 자료형처럼 사용
    // owner변수는 Person타입을 갖게 된다
    Person owner;

    // 파라미터: 입금할 액수
    // 리턴: 성공여부(boolean)
    boolean deposit(int amount){
        if(amount < 0 || owner.cashAmount < amount){
            System.out.println("입금실패입니다");
            return false;
        }else{
            balance = balance + amount;
            owner.cashAmount = owner.cashAmount - amount;
            System.out.println(amount+"원 입금하였습니다. 잔고:" + balance + "현금: " + owner.cashAmount);
            return true;
        }
    }

    // 파라미터: 출금할 액수
    // 리턴: 성공여부(boolean)
    boolean withdraw(int amount){
        if(amount < 0 || amount > balance){
            System.out.println("출금실패입니다. 잔고:"+balance +"원, 현금:" + owner.cashAmount);
                return false;
        }else{
            balance = balance - amount;
            owner.cashAmount = owner.cashAmount + amount;
            System.out.println(amount +"원 출금하였습니다. 잔고:" + balance + "원, 현금" + owner.cashAmount);
                return true;
        }
    }


}