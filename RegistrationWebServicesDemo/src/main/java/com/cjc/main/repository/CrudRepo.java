package com.cjc.main.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjc.main.model.Student;

@Repository
public interface CrudRepo  extends CrudRepository<Student, Integer>{
	public List<Student> findByUsernameAndPassword(String username, String password);
}
