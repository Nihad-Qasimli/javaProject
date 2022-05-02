package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager{

    private CustomerCheckService customerCheckService;


    public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
        this.customerCheckService = customerCheckService;
    }
    @Override
    public void save(Customer customer) {
        if (customerCheckService.checkIfRealCustomer(customer)){
            super.save(customer);
        }else {
            System.out.println("not a valid customer");
        }

    }


}