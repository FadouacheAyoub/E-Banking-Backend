package me.fadouache.ebankingbackend.dtos;

import lombok.Data;
import me.fadouache.ebankingbackend.enums.AccountStatus;

import java.util.Date;

@Data
public class SavingAccountDTO extends BankAccountDTO {
    private String id;
    private double Balance;
    private Date CreateDate;
    private AccountStatus status;
    private CustomerDTO customer;
    private double interestRate;
}
