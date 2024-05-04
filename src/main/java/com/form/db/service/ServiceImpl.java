package com.form.db.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.form.db.entity.FormEntity;
import com.form.db.repository.FormRepository;

@Service
public class ServiceImpl implements FormService {
	@Autowired
	private FormRepository formRepository;

	@Override
	public FormEntity create(FormEntity formEntity) {
		// TODO Auto-generated method stub
		return formRepository.save(formEntity);
	}

}
