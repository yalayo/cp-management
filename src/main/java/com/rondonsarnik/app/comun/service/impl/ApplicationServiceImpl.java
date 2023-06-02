package com.rondonsarnik.app.comun.service.impl;

import java.util.List;

import com.rondonsarnik.app.comun.dao.ApplicationDao;
import com.rondonsarnik.app.comun.service.ApplicationService;

public class ApplicationServiceImpl implements ApplicationService {
	protected ApplicationDao applicationDao;
	
	public ApplicationServiceImpl() {
		super();
	}
	
	public void setApplicationDao(ApplicationDao applicationDao) {
		this.applicationDao = applicationDao;
	}	
	
	public void salvar(Object object) {
		applicationDao.salvar(object);
	}
	
	public void actualizar(Object object) {
		applicationDao.actualizar(object);
	}
	
	public void eliminar(Object object) throws Exception {
		applicationDao.eliminar(object);
	}

	public Object obtenerPorId(Integer id, Class<?> clazz) {
		return applicationDao.obtenerPorId(id, clazz);
	}

	public List<?> obtenerTodos(Class<?> clazz) {
		return applicationDao.obtenerTodos(clazz);
	}
}