package com.oreilly.sdata.repositories;

import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.Repository;

import java.io.Serializable;

/**
 * Created by tm1c14 on 04/08/2016.
 */
@NoRepositoryBean
public interface ReadOnlyRepository<T,ID extends Serializable>  extends Repository<T,ID> {

    T findOne(ID id);

    Iterable<T> findAll();
}
