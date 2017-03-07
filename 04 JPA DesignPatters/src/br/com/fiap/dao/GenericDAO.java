package br.com.fiap.dao;

import br.com.fiap.exception.CommitException;
import br.com.fiap.exception.EntityNotFoundException;

public interface GenericDAO<T,K> {
	void insert(T entity);
	void update(T entity);
	T findById(K id);
	void delete(K id) throws EntityNotFoundException;
	void save() throws CommitException;
}
