package com.claudio.deviceplugin.service;

import com.claudio.deviceplugin.domain.Account;
import com.claudio.deviceplugin.repository.AccountRepository;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;
import java.util.Optional;

@Service
public class AccountService {

    private final AccountRepository accountRepository;

    @Inject
    public AccountService(AccountRepository accountRepository){
        this.accountRepository = accountRepository;
    }

    public boolean accountExists(String accountCode){
        List<Account> accountList = accountRepository.findAll();
        Optional<Account> account = accountList
                .stream()
                .filter(e -> e.getAccountCode().equals(accountCode))
                .findAny();
        return account.isPresent();
    }

    public Optional<Account> getAccount(String accountCode){
        List<Account> accountList = accountRepository.findAll();
        Optional<Account> account = accountList
                .stream()
                .filter(e -> e.getAccountCode().equals(accountCode))
                .findAny();
        return account;
    }
}
