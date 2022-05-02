package Abstract;

import Entities.Customer;

public interface CustomerCheckService {
    public boolean checkIfRealCustomer(Customer customer);
}
