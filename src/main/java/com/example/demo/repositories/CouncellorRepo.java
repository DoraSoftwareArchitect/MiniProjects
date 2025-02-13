package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.CouncellorEntity;

public interface CouncellorRepo extends JpaRepository<CouncellorEntity, Integer> {

	public CouncellorEntity findByEmailAndPwd(String email, String pwd);

	public CouncellorEntity findByEmail(String email);

}
