package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import com.example.demo.bindings.DashBoardResponseDTO;
import com.example.demo.bindings.EnquiryDTO;
import com.example.demo.bindings.EnquiryFilterDto;
import com.example.demo.entity.CouncellorEntity;
import com.example.demo.entity.EnquiryEntity;
import com.example.demo.repositories.CouncellorRepo;
import com.example.demo.repositories.EnquiriesRepo;

@Service
public class EnquiryServiceImpl implements EnquiryService {

	@Autowired
	private EnquiriesRepo enquiryRepo;

	@Autowired
	private CouncellorRepo councellorRepo;

	@Override
	public DashBoardResponseDTO getDashBoardInfo(Integer councellorId) {

		DashBoardResponseDTO dto = new DashBoardResponseDTO();

		List<EnquiryEntity> enqList = enquiryRepo.findByCouncellorCounsellorId(councellorId);

		// dto.setTotalEnqCount((long) enqList.size()); // Here the size will return the
		// data of int but we have the data
		// stored in the form of long so we have done typecasting here
		// so that all the int transferred into the form of the long

		// Colllections are used to store the data streams are used to process the data.

		int openCount = enqList.stream().filter(enq -> enq.getEnqStatus().equals("Open")).collect(Collectors.toList())
				.size();

		dto.setOpenEnquiryCount(openCount);

		int lostCount = enqList.stream().filter(enq -> enq.getEnqStatus().equals("Lost")).collect(Collectors.toList())
				.size();
		dto.setLostEnquiryCount(lostCount);

		int enrolledCount = enqList.stream().filter(enq -> enq.getEnqStatus().equals("Enrolled"))
				.collect(Collectors.toList()).size();
		dto.setEnrolledEnquiryCount(enrolledCount);

		int totalSize = enqList.stream().filter(enq -> enq.getEnqStatus().equals("TotalCount"))
				.collect(Collectors.toList()).size();

		dto.setTotalEnqCount(totalSize);

		return dto;
	}

	@Override
	public boolean addEnquiry(EnquiryDTO enqDTO, Integer councellorId) {

		EnquiryEntity entity = new EnquiryEntity();
		BeanUtils.copyProperties(enqDTO, entity);

		EnquiryEntity save = enquiryRepo.save(entity);

		// here setting foriegn key to the enquiry object.

		Optional<CouncellorEntity> byId = councellorRepo.findById(councellorId);

		if (byId.isPresent()) {
			CouncellorEntity councellorEntity = byId.get();
			entity.setCouncellor(councellorEntity);
		}

		return save.getEnqId() != null;
	}

	@Override
	public List<EnquiryDTO> getEnquiries(Integer councellorId) {

		List<EnquiryDTO> dtos = new ArrayList<>();

		List<EnquiryEntity> enqList = enquiryRepo.findByCouncellorCounsellorId(councellorId);

		for (EnquiryEntity entity : enqList) {
			EnquiryDTO dto = new EnquiryDTO();
			BeanUtils.copyProperties(entity, dto);
			dtos.add(dto); // Here we are adding the data to the entities.

		}

		return dtos;

	}

	@Override
	public List<EnquiryDTO> getEnquiries(EnquiryFilterDto enquiryFilterDto, Integer councellorId) {

		EnquiryEntity dto = new EnquiryEntity();

		if (enquiryFilterDto.getClassMode() != null && enquiryFilterDto.getClassMode().equals(" ")) {

			dto.setClassMode(enquiryFilterDto.getClassMode());

		}

		if (enquiryFilterDto.getCourse() != null && enquiryFilterDto.getCourse().equals("")) {
			dto.setCourse(enquiryFilterDto.getCourse());
		}

		if (enquiryFilterDto.getEnqStatus() != null && enquiryFilterDto.getEnqStatus().equals("")) {
			dto.setEnqStatus(enquiryFilterDto.getEnqStatus());
		}

		CouncellorEntity councellorEntity = new CouncellorEntity();
		councellorEntity.setCounsellorId(councellorId);

		dto.setCouncellor(councellorEntity);
		
		Example<EnquiryEntity> of = Example.of(dto);
		
		List<EnquiryEntity> all = enquiryRepo.findAll(of);
		
		
		
		List<EnquiryDTO> enqDtosList=new ArrayList<>();
		
		for(EnquiryEntity entity:all) {
			EnquiryDTO dto1=new EnquiryDTO();
			BeanUtils.copyProperties(dto, dto1);
			enqDtosList.add(dto1);
			
			
		}

		return enqDtosList;
	}

	@Override
	public EnquiryDTO getEnquiryById(Integer enqId) {

		Optional<EnquiryEntity> byId = enquiryRepo.findById(enqId);
		if (byId.isPresent()) {
			EnquiryEntity enquiryEntity = byId.get();
			EnquiryDTO dto = new EnquiryDTO();
			BeanUtils.copyProperties(enquiryEntity, dto);
			return dto;

		}

		return null;
	}

//	@Override
//	public DashBoardResponseDTO getDashBoardInfo(Integer councellorId) {
//		DashBoardResponseDTO dto = new DashBoardResponseDTO();
//
//		List<EnquiryEntity> enqList = enquiryRepo.findByCouncellorCounsellorId(councellorId);
//
//		// dto.setTotalEnqCount((long) enqList.size()); // Here the size will return the
//		// data of int but we have the data
//		// stored in the form of long so we have done typecasting here
//		// so that all the int transferred into the form of the long
//
//		// Colllections are used to store the data streams are used to process the data.
//
//		int openCount = enqList.stream().filter(enq -> enq.getEnqStatus().equals("Open")).collect(Collectors.toList())
//				.size();
//
//		dto.setOpenEnquiryCount(openCount);
//
//		int lostCount = enqList.stream().filter(enq -> enq.getEnqStatus().equals("Lost")).collect(Collectors.toList())
//				.size();
//		dto.setLostEnquiryCount(lostCount);
//
//		int enrolledCount = enqList.stream().filter(enq -> enq.getEnqStatus().equals("Enrolled"))
//				.collect(Collectors.toList()).size();
//		dto.setEnrolledEnquiryCount(enrolledCount);
//
//		int totalSize = enqList.stream().filter(enq -> enq.getEnqStatus().equals("TotalCount"))
//				.collect(Collectors.toList()).size();
//
//		dto.setTotalEnqCount(totalSize);
//
//		return dto;
//	}

}
