package com.oreilly.sdata.services;

import com.oreilly.sdata.domains.AccountBand;
import com.oreilly.sdata.repositories.AccountBandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by tm1c14 on 04/08/2016.
 */
@Service
public class AccountBandService {

    @Autowired
    private AccountBandRepository accountBandRepository;

    public List<AccountBand> findAll() {
        return accountBandRepository.findAll();
    }
}
