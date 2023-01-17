package com.carsapi.api.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carsapi.api.dto.CarsDTO;

@RestController
@RequestMapping("/api/create")
public class CarsController {
  @PostMapping
  public void create(@RequestBody CarsDTO req) {
    System.out.println("modelo: " + req.modelo() + "\n" +
        "fabricante: " + req.fabricante() + "\n" +
        "data de fabricação: " + req.dataFabricacao() + "\n" +
        "valor: " + req.valor() + "\n" +
        "ano do modelo: " + req.anoModelo());
  }
}
