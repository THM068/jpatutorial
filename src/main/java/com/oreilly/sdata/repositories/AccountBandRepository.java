package com.oreilly.sdata.repositories;

import com.oreilly.sdata.domains.AccountBand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by tm1c14 on 04/08/2016.
 */
@Repository
public interface AccountBandRepository extends JpaRepository<AccountBand, Long> {
}
