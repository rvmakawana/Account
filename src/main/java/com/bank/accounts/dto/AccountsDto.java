package com.bank.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
@Schema(name = "Accounts")
public class AccountsDto {

    @NotEmpty(message = "Account number must not be empty or null")
    private Long accountNumber;

    @NotEmpty(message = "Account type must not be empty or null")
    private String accountType;

    @NotEmpty(message = "Branch address must not be empty or null")
    private String branchAddress;
}
