import java.util.Scanner;

public class BankAccount {
    int amount=500;
    String name="";
    int accNum=0;

    public BankAccount(String name1,int accNumber){
       this.accNum=accNumber;
       this.name=name1;
    }
    public void details(){
        System.out.println(this.amount);
    }


    public  void depositeAmount()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount you want to deposite: ");
        int a=input.nextInt();
        this.amount+=a;
        System.out.println(this.amount);
    }
    public  void  withdrawAmount()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount you want to withdraw: ");
        int a=input.nextInt();
        int balance=this.amount;
        balance-=a;
        if(a>=this.amount){
            System.out.println("min Balance Should be less than "+this.amount);
        }
        if (balance<=500){
            System.out.println("Min balance should be 500");
        }
       else{
            this.amount-=a;
        }
        System.out.println(this.amount);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Name: ");
        String name1 = input.nextLine();

        System.out.print("Enter Your Account: ");
        int account = input.nextInt();
       BankAccount b=new BankAccount(name1,account);

        boolean start=true;
       while(start){
           System.out.println("Bank"
                   + "1)Deposite Amount \n"
                   + "2)Withdraw Amount \n"
                   + "3)Display Balance \n"
                    +"4)Exit");
           int choice = input.nextInt();
           switch(choice){
               case 1:b.depositeAmount();
                   break;
               case 2:b.withdrawAmount();
                   break;
               case 3:b.details();
                   break;
               case 4:start=false;
               break;
               default: System.out.println("Invalid Input");
           }
       }

    }
}
