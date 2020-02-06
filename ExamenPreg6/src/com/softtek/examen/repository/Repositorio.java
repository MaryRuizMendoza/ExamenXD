package com.softtek.examen.repository;

import java.util.List;

public interface Repositorio<T, K> {
	T getOne(final K id);
	List<T> list();
	int add(final T entity);
	int update(final T entity);
	int delete(final K id);
}
