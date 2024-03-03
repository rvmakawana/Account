package com.bank.accounts.dto;

import com.bank.accounts.entity.Accounts;
import jakarta.validation.constraints.*;
import lombok.Data;

@Data
public class CustomerDto {

    @NotEmpty(message = "Name cannot be empty or null" )
    @Size(min = 3, max = 20, message = "Name should be between between 3 and 20 characters long")
    private String name;

    @NotEmpty(message = "Email cannot be empty or null" )
    @Email(message = "Invalid email")
    private String email;

    @Pattern(regexp = "(^$|[0-9]{10})", message = "Mobile number must be 10 digits")
    private String mobileNumber;
    private AccountsDto accountsDto;
}
