package com.oreilly.sdata.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.oreilly.sdata.domains.*;
import org.springframework.stereotype.Repository;

/**
 * Created by tm1c14 on 03/08/2016.
 */
@Repository
public interface RoleRepository  extends JpaRepository<Role,Long> {

    Role findByAuthority(String authority);
}
