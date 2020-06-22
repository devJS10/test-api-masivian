package com.test.masivian.testapi.repository;
import java.util.Map;
import java.util.UUID;
import javax.annotation.PostConstruct;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import com.test.masivian.testapi.entity.Roulette;

@Repository
public class RouletteRepository implements RedisRepository {
	private static final String KEY = "Roulette";
	private RedisTemplate<String, Roulette> redisTemplate;
	private HashOperations hashOperations;
	public RouletteRepository(RedisTemplate<String, Roulette> redisTemplate) {
		this.redisTemplate = redisTemplate;
	}
	@PostConstruct
	private void init() {
		hashOperations = redisTemplate.opsForHash();
	}
	@Override
	public Map<String, Roulette> findAll() {
		return hashOperations.entries(KEY);
	}
	@Override
	public Roulette findById(String id) {
		return (Roulette) hashOperations.get(KEY,id);
	}
	@Override
	public String save(Roulette roulette) {
		String id = UUID.randomUUID().toString();
		hashOperations.put(KEY,id,roulette);
		
		return id;
	}
	@Override
	public void delete(String id) {
		hashOperations.delete(KEY,id);
	}
}
