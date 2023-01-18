package com.carsapi.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carsapi.api.dto.CarsDTO;
import com.carsapi.api.model.Cars;
import com.carsapi.api.repository.CarsRepository;

@RestController
@RequestMapping("/api/create")
public class CarsController {

  @Autowired
  private CarsRepository repository;

  @GetMapping
  public List<Cars> listAll(){
    return repository.findAll();
  }

  @PostMapping
  public void create(@RequestBody CarsDTO req) {
    repository.save(new Cars(req));
  }
}
