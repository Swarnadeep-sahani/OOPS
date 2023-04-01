class account{
    public String accno;
    public String name;
    public String ph;
    public String address;
    public String dob;
    public double balance;
    public double loan;
    void getData(String accno,String name,String ph,String address,String dob,double balance)
    {
        this.accno=accno;
        this.name=name;
        this.ph=ph;
        this.address=address;
        this.dob=dob;
        this.balance=balance;
    }
}
class saving extends account{
    public void deposit(double val)
    {
        balance+=val;
    }
    public void withdraw(double val)
    {
        balance-=val;
    }
    public void checkbalance()
    {
        System.out.println("Acc.no. = "+accno+" Name = "+name);
        System.out.println("Ph.no. = "+ph+" Address = "+address);
        System.out.println("D.O.B = "+dob);
        System.out.println("Balance = "+balance);
    }

}
class loanAccount extends account{
    void getLoan(double val)
    {
        loan=val;
    }
    void payEMI(double val)
    {
        loan-=val;
    }
    void topupLoan(double val)
    {
        loan+=val;
    }
    void repayMent()
    {
        loan=0.0;
    }
    void checkStatus()
    {
        System.out.println("Acc.no. = "+accno+" Name = "+name);
        System.out.println("Ph.no. = "+ph+" Address = "+address);
        System.out.println("D.O.B = "+dob);
        System.out.println("Loan Balance = "+loan);
    }
}
class bank{
    public static void main(String[] args) {
        saving sv=new saving();
        sv.getData("10000", "Swarnadeep Sahani", "23445693282", "Dhanbad", "01-01-2003", 50000.0);
        sv.checkbalance();
        System.out.println("-----------------------------");
        sv.deposit(1000);
        sv.withdraw(5000);
        sv.checkbalance();
    }
}