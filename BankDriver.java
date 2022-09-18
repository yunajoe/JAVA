public class BankDriver {
    public static void main(String[] args) {
        // 사람생성
        Person p1 = new Person();
        p1.name = "yuna";
        p1.age = 30;
        p1.cashAmount = 300000;

        // 은행 계좌 생성
        BankAccount acc1 = new BankAccount();
        acc1.balance = 100000;

        // 두 객체 관계 설정
        p1.account = acc1;
        acc1.owner = p1;

        // 테스트
        // System.out.println(p1.name + "의 계좌 잔액" + p1.account.balance);

        Person p2 = new Person();
        p2.name = "조연아";
        p2.age = 30;
        p2.cashAmount = 100000;
        BankAccount acc2 = new BankAccount();
        acc2.balance = 500000;

        p2.account = acc2;
        acc2.owner = p2;

        acc2.deposit(30000);
        acc2.withdraw(170000);
        acc2.deposit(620000);
        acc2.withdraw(890000);
    }

}