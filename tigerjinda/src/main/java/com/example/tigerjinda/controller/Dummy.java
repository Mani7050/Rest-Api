package com.example.tigerjinda.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.tigerjinda.dto.DummyDto;
import com.example.tigerjinda.service.DummyService;

@RestController
@RequestMapping("/dummies")
public class Dummy {
	
	@Autowired
	DummyService dummyService;
	
	@PostMapping
	public String insert(@RequestBody DummyDto dummyDto) {
	//System.out.println(dummyDto);
	//return "data inserted";
		return dummyService.insert(dummyDto);
	}
	
	@GetMapping("/{id}")
	public DummyDto getById(@PathVariable int id) {
		return dummyService.getById(id);
	}
	
	@GetMapping
	public List<DummyDto> getall(){
		return dummyService.getall();
	}
	
	@DeleteMapping("/{id}")
	public String deleteById(@PathVariable int id) {
		return dummyService.deleteById(id);
	}
	
	@DeleteMapping
	public String deleteAll() {
		return dummyService.deleteAll();
		
	}
}
