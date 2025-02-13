package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.bindings.EnquiryDTO;
import com.example.demo.entity.EnquiryEntity;

public interface EnquiriesRepo extends JpaRepository<EnquiryEntity, Integer> {

	// In the jpa select * from enq_table where councellor_id=givenId;
	public List<EnquiryEntity> findByCouncellorCounsellorId(Integer councellorId);

	
	// Here we can able to write the councellorId directly because in the entity class we do not have the entity class.
	// So that is the reason we are using Councellor Entity along with the Id IN THE declaration of the method.
	// If we have a variable we can directly specify that the method.
	
	
}
