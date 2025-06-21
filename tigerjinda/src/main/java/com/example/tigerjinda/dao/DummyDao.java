package com.example.tigerjinda.dao;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.tigerjinda.dto.DummyDto;
import com.example.tigerjinda.repository.DummyRepository;

@Repository
public class DummyDao {
    
	@Autowired
	DummyRepository dummyRepository;
	
	public String insert(DummyDto dto) {
		dummyRepository.save(dto);
		return "data inserted";
	}
	
	public DummyDto getById(int id) {
		Optional<DummyDto> odto = dummyRepository.findById(id);
		if(odto.isPresent()) {
			return odto.get();
		}
		else {
			return null;
		}
	}
	public List<DummyDto> getall(){
		List<DummyDto> list = dummyRepository.findAll();
		if(list.isEmpty()) {
			return null;
		}else {
			return list;
		}
	}
	public String deleteById(int id) {
		Optional<DummyDto> odto = dummyRepository.findById(id);
		if(odto.isPresent()) {
			dummyRepository.delete(odto.get());
			return "data deleted";
		}else {
			return "no data found";
		}
	}
	public String deleteall(){
		List<DummyDto> list = dummyRepository.findAll();
		if(list.isEmpty()) {
			return "data not exist";
		}else {
			dummyRepository.deleteAll();
			return "all data deleted";
		}
	}
	
}
