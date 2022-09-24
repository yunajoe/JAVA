public class Person{
    private String name;
    private int age;
    private int cashAmount;
    private BankAccount account;

    // 이름
    public void setName(String pName){
        name = pName;
    }

    public String getName(){
        return name;
    }
    // 나이
    public void setAge(int pAge){
        age= pAge;
    }
    public int getAge(){
        return age;
    }
    // 현금
    public void setCashAmount(int pCashAmount){
        cashAmount = pCashAmount;
}
    public int getCashAmount(){
        return cashAmount;
    }

    // 잔액
    public void setAccount(BankAccount pAccount){
        account = pAccount;
    }
    public BankAccount getAccount(){
        return account;
    }

    // transfer 메서드는 account와 account 간의 거래이다
    // Person to의 정보를 to의 account 정보로 바꾸어 호출
    public boolean transfer(Person to_person, int amount){
        return account.transfer(to_person.getAccount(), amount);
    }
    public boolean transfer(BankAccount to_person, int amount){
        return account.transfer(to_person, amount);
    }




}