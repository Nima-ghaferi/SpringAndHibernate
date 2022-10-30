package com.nemo.springdemo.dao;

import com.nemo.springdemo.entity.Customer;

import java.util.List;

public interface CustomerDAO {
    List<Customer> getCustomers();
}
