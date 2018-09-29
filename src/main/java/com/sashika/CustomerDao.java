package com.sashika;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

//@Component
public class CustomerDao {
    private static List customers;
    {
        customers = new ArrayList();
        customers.add(new Customer(101, "John", "Doe", "djohn@gmail.com", "121-232-3435"));
        customers.add(new Customer(201, "Russ", "Smith", "sruss@gmail.com", "343-545-2345"));
        customers.add(new Customer(301, "Kate", "Williams", "kwilliams@gmail.com", "876-237-2987"));
    }

    /**
     * Returns list of customers from dummy database.
     *
     * @return list of customers
     */
    public List list() {
        return customers;
    }

}
