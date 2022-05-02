import Abstract.BaseCustomerManager;
import Concrete.CustomerCheckManager;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {


    public static void main(String[] args) {

        Customer customer=new Customer(1,"Aysel","W92kl92");

        BaseCustomerManager customerManager = new NeroCustomerManager();
        BaseCustomerManager customerManager1=new StarbucksCustomerManager(new CustomerCheckManager());
        customerManager.save(customer);
        customerManager1.save(customer);


    }

}