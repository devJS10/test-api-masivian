package com.test.masivian.testapi.repository;
import java.util.Map;
import com.test.masivian.testapi.entity.Roulette;
public interface RedisRepository {
	Map<String,Roulette> findAll();
	Roulette findById(String id);
	String save(Roulette roulette);
	void delete(String id);
}
