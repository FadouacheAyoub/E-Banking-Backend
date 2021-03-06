package me.fadouache.ebankingbackend.mappers;

import me.fadouache.ebankingbackend.dtos.AccountOperationDTO;
import me.fadouache.ebankingbackend.dtos.CurrentAccountDTO;
import me.fadouache.ebankingbackend.dtos.CustomerDTO;
import me.fadouache.ebankingbackend.dtos.SavingAccountDTO;
import me.fadouache.ebankingbackend.entities.AccountOperation;
import me.fadouache.ebankingbackend.entities.CurrentAccount;
import me.fadouache.ebankingbackend.entities.Customer;
import me.fadouache.ebankingbackend.entities.SavingAccount;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
// MapStruct : un mapper
@Service
public class BankAccountMapperImpl {
    public CustomerDTO fromCustomer(Customer customer)
    {
        CustomerDTO customerDTO = new CustomerDTO();
        // customerDTO.setNom(customer.getNom());
        // customerDTO.setId(customer.getId());
        // customerDTO.setEmail(customer.getEmail());
        BeanUtils.copyProperties(customer, customerDTO);
        return customerDTO;
    }
    public Customer fromCustomerDTO(CustomerDTO customerDTO)
    {
        Customer customer = new Customer();
        BeanUtils.copyProperties(customerDTO, customer);
        return customer;
    }

    public SavingAccountDTO fromSavingAccount(SavingAccount account)
    {
        SavingAccountDTO savingAccountDTO = new SavingAccountDTO();
        BeanUtils.copyProperties(account, savingAccountDTO);
        savingAccountDTO.setCustomer(fromCustomer(account.getCustomer()));
        savingAccountDTO.setType(account.getClass().getSimpleName());
        return savingAccountDTO;
    }

    public SavingAccount fromSavingAccountDTO(SavingAccountDTO savingAccountDTO)
    {
        SavingAccount account = new SavingAccount();
        BeanUtils.copyProperties(savingAccountDTO, account);
        account.setCustomer(fromCustomerDTO(savingAccountDTO.getCustomer()));
        return account;
    }


    public CurrentAccountDTO fromCurrentAccount(CurrentAccount account)
    {
        CurrentAccountDTO currentAccountDTO = new CurrentAccountDTO();
        BeanUtils.copyProperties(account, currentAccountDTO);
        currentAccountDTO.setCustomer(fromCustomer(account.getCustomer()));
        currentAccountDTO.setType(account.getClass().getSimpleName());
        return currentAccountDTO;
    }

    public CurrentAccount fromCurrentAccountDTO(CurrentAccountDTO currentAccountDTO)
    {
        CurrentAccount account = new CurrentAccount();
        BeanUtils.copyProperties(currentAccountDTO, account);
        account.setCustomer(fromCustomerDTO(currentAccountDTO.getCustomer()));
        return account;
    }

    public AccountOperationDTO fromAccounOperation(AccountOperation accountOperation)
    {
        AccountOperationDTO operationDTO = new AccountOperationDTO();
        BeanUtils.copyProperties(accountOperation, operationDTO);
        return operationDTO;
    }

}
