package com.form.db.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.form.db.entity.FormEntity;
@Repository
public interface FormRepository extends JpaRepository<FormEntity, Integer> {

}
