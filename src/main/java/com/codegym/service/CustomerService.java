package com.codegym.service;

import com.codegym.model.Customer;

import java.util.*;

public class CustomerService implements ICustomerService {
    static private final Map<Integer,Customer> customers;
    static {
        customers = new HashMap<>();
        customers.put(0, new Customer(0,"John", "john@codegym.vn", "Ha Noi"));
        customers.put(1, new Customer(1,"Bill", "bill@codegym.vn", "Hai Phong"));
        customers.put(2, new Customer(2,"Alex", "alex@codegym.vn", "Sai Gon"));
        customers.put(3, new Customer(3,"Adam", "adam@codegym.vn", "Beijing"));
        customers.put(4, new Customer(4,"Sophia", "sophia@codegym.vn", "Miami"));
        customers.put(5, new Customer(5,"Rose", "rose@codegym.vn", "NewYork"));
    }

    @Override
    public List<Customer> findAll() {
        return new ArrayList<>(customers.values());
    }

    @Override
    public Customer findById(int id) {
        return customers.get(id);
    }

    @Override
    public void save(Customer customer) {
        customers.put(customer.getId(), customer);
    }

    @Override
    public void update(Customer customer) {
        customers.put(customer.getId(), customer);
    }

    @Override
    public void delete(int id) {
        customers.remove(id);
    }
}
