package academy.ObjectOrientedProgramming.Classes1;

public class Main {
    public static void main(String[] args) {
//        Car porsche = new Car();
//        Car holden = new Car();
//        porsche.setModel("911");
//        System.out.println("Model is " + porsche.getModel());
//
BankAccount bobsAccount = new BankAccount();

        System.out.println(bobsAccount.getAccountNumber());
        System.out.println(bobsAccount.getBalance());
        bobsAccount.withdrawal(100);
        bobsAccount.depositFunds(546);
        bobsAccount.withdrawal(340);

        BankAccount timsAccount = new BankAccount("Tim", "tim@email.com", "12345");
        System.out.println(timsAccount.getAccountNumber() + " name " + timsAccount.getCustomerName());

//        Person person = new Person();
//        person.setLastName("Smith");
//        person.setFirstName("John");
//        person.setAge(-5);
//        System.out.println("This persons name is " + person.getFullName());
//        System.out.println("This person's age is " + person.getAge());



    }

}
