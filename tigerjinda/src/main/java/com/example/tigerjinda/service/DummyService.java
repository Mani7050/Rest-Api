package com.example.tigerjinda.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.tigerjinda.dao.DummyDao;
import com.example.tigerjinda.dto.DummyDto;

@Service
public class DummyService {

@Autowired	
DummyDao dummyDao;
	
	   public String insert(DummyDto dummydto) {
		   return dummyDao.insert(dummydto);
	   }
	   
	   public DummyDto getById(int id) {
			return dummyDao.getById(id);
	   }
	   
	   public List<DummyDto> getall(){
			return dummyDao.getall();
	   }
	   
	   public String deleteById(int id) {
			dummyDao.deleteById(id);
			return "data deleted";
			
	   }
	   
	   public String deleteAll() {
		   return dummyDao.deleteall();
	   }
}
