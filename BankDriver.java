public class BankDriver {
    public static void main(String[] args) {
        // 사람생성
        Person p1 = new Person();
        p1.setName("yunajoe");
        p1.setAge(30);
        p1.setCashAmount(300000);

        // 은행 계좌 생성
        BankAccount acc1 = new BankAccount();
        acc1.setBalance(100000);

        // 두 객체 관계 설정
        p1.setAccount(acc1);
        acc1.setOwner(p1);

        Person p2 = new Person();
        p2.setName("조연아");
        p2.setAge(30);
        p2.setCashAmount(100000);

        BankAccount acc2 = new BankAccount();
        acc2.setBalance(500000);

        p2.setAccount(acc2);
        acc2.setOwner(p2);

        acc2.deposit(30000);
        acc2.withdraw(170000);
        acc2.deposit(620000);
        acc2.withdraw(890000);
    }

}