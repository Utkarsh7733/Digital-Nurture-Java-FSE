package com.example;

public class CustomerRepositoryImpl implements CustomerRepository {

    @Override
    public void findCustomerById(int id) {

        System.out.println("Customer Found with ID : " + id);

    }

}