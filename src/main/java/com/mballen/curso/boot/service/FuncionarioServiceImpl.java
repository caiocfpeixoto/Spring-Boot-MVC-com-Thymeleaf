package com.mballen.curso.boot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mballen.curso.boot.dao.FuncionarioDao;
import com.mballen.curso.boot.domain.Funcionario;

@Service @Transactional(readOnly = true)
public class FuncionarioServiceImpl  implements FuncionarioDao{
	
	@Autowired
	private FuncionarioDao dao;
	
	@Transactional(readOnly = false)
	@Override
	public void save(Funcionario funcionario) {
		dao.save(funcionario);
	}
	
	@Transactional(readOnly = false)
	@Override
	public void update(Funcionario funcionario) {
		dao.update(funcionario);
	}
	
	@Transactional(readOnly = false)
	@Override
	public void delete(Long id) {
		dao.delete(id);
	}
	
	@Override
	public Funcionario findById(Long id) {
		return dao.findById(id);
	}

	@Override
	public List<Funcionario> findAll() {
		return dao.findAll();
	}

}
