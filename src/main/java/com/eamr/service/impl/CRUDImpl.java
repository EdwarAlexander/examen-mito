package com.eamr.service.impl;

import com.eamr.repo.IGenericRepo;
import com.eamr.service.ICRUD;

import java.util.List;

public abstract class CRUDImpl <T,ID> implements ICRUD<T,ID> {

    protected abstract IGenericRepo<T, ID> getRepo();
    @Override
    public T create(T t) throws Exception {
        return getRepo().save(t);
    }

    @Override
    public T update(T t) throws Exception {
        return getRepo().save(t);
    }

    @Override
    public List<T> readAll() throws Exception {
        return getRepo().findAll();
    }

    @Override
    public T readById(ID id) throws Exception {
        return getRepo().findById(id).orElse(null);
    }

    @Override
    public void delete(ID id) throws Exception {
        getRepo().deleteById(id);
    }
}
