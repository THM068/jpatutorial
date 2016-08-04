package com.oreilly.sdata.repositories;

import com.oreilly.sdata.domains.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by tm1c14 on 04/08/2016.
 */
@Repository
public interface UserRepository extends JpaRepository<User,Long> {

    User findByUsername(String username);

    List<User> findByEmailLike(String email);

    List<User> findByEmailContaining(String email);

    List<User> findByEmailStartingWith(String email);

    List<User> findByEmailEndingWith(String email);

    List<User> findByEmailIgnoreCase(String email);


     //relational operators
    public List<User> findByPageCountEquals(int pageCount);

    public List<User> findByPageCountGreaterThan(int pageCount);

}
