package com.bank.accounts.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class AccountsDto {

    @NotEmpty(message = "Account number must not be empty or null")
    private Long accountNumber;

    @NotEmpty(message = "Account type must not be empty or null")
    private String accountType;

    @NotEmpty(message = "Branch address must not be empty or null")
    private String branchAddress;
}
