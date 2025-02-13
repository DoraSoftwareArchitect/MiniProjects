package com.example.demo.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.bindings.CouncellorDto;
import com.example.demo.entity.CouncellorEntity;
import com.example.demo.repositories.CouncellorRepo;

@Service
public class CouncellorsServiceImpl implements CouncellorService {

	@Autowired
	private CouncellorRepo councellorRepo;

	@Override
	public CouncellorDto logIn(CouncellorDto councellorDTO) {

		CouncellorEntity entity = councellorRepo.findByEmailAndPwd(councellorDTO.getEmail(), councellorDTO.getPwd());

		if (entity != null) {

			// Here copy entity object and return dto object data.
			CouncellorDto dto = new CouncellorDto();
			BeanUtils.copyProperties(entity, dto);
			return dto;

		}

		return null;
	}

	@Override
	public boolean uniqueEmailCheck(String email) {

		CouncellorEntity entity = councellorRepo.findByEmail(email);

		if(entity==null) {
			return true;
			
		}
		
		return false;
	}



	

	@Override
	public boolean register(CouncellorDto councellorDto) {

		CouncellorEntity entity = new CouncellorEntity();

		BeanUtils.copyProperties(councellorDto, entity);

		CouncellorEntity savedEntity = councellorRepo.save(entity);

		// Here in the save method we are copying data object and we are performing the
		// operatins.

		return null != savedEntity.getCounsellorId();
	}
}
//	
//	
//	// So here in the above method we are going to checking the the details with the help of id who gone a register the service.
//
//}
