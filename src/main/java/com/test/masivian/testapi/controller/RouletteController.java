package com.test.masivian.testapi.controller;

import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.test.masivian.testapi.entity.Roulette;
import com.test.masivian.testapi.repository.RouletteRepository;
@RestController
@RequestMapping("/api")
public class RouletteController {
	@Autowired
	private RouletteRepository rouletteRepository;
	@GetMapping("/roulettes")
	public Map<String, Roulette> findAll() {
		return rouletteRepository.findAll();
	}
	@GetMapping("/roulettes/{id}")
	public Roulette findById(@PathVariable String id) {
		return rouletteRepository.findById(id);
	}
	@PostMapping("/roulettes")
	public String createRoulette(@RequestBody Roulette roulette) {
		return rouletteRepository.save(roulette);
	}
	@DeleteMapping("/roulettes/{id}")
	public void deleteRoulette(@PathVariable String id) {
		 rouletteRepository.delete(id);
	}
}
