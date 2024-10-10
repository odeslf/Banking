public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("Santander");

        bank.addBranch("Carioca");

        bank.addCustomer("Carioca", "José", 50.05);
        bank.addCustomer("Carioca", "Betty", 175.34);
        bank.addCustomer("Carioca", "Maria", 220.12);

        bank.addCustomerTransaction("Carioca", "José", 44.22);
        bank.addCustomerTransaction("Carioca", "Betty", 12.44);
        bank.addCustomerTransaction("Carioca", "Maria", 1.65);

        bank.listCustomers("Carioca", true);
        bank.listCustomers("Carioca", false);
    }
}