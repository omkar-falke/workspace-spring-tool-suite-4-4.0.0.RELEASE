package com.cjc.main;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Student, Long> {
	
	Student findByUsername(String username);

}
