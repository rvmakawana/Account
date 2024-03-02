package com.bank.accounts.service;

import com.bank.accounts.dto.CustomerDto;


public interface IAccountService {

    /**
     *
     *
     * @param customerDto
     */
    void createAccount(CustomerDto customerDto);

    CustomerDto fetchAccount(String mobileNumber);

    boolean updateAccount(CustomerDto customerDto);

    boolean deleteAccount(String mobileNUmber);


}
