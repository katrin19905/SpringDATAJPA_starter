package com.work.service;

import com.work.entity.HumanResources;
import com.work.repository.HRRepository;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Getter
@Setter
@RequiredArgsConstructor

public class HRService {
    @Autowired
    private HRRepository hrRepository;

//    public Optional<HumanResources> findByEmail(String email) {
//        return hrRepository.findByEmail(email);
//    }
}
