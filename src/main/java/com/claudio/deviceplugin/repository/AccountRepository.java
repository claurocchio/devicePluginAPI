package com.claudio.deviceplugin.repository;

import com.claudio.deviceplugin.domain.Account;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AccountRepository extends MongoRepository<Account, String> {
}
