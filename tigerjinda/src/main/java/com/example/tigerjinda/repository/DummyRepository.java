package com.example.tigerjinda.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.tigerjinda.dto.DummyDto;

public interface DummyRepository extends JpaRepository<DummyDto, Integer>{

}
