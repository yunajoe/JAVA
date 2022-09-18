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


}