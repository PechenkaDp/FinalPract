package com.example.itogpract.services;

import com.example.itogpract.entity.ShootingRange;
import com.example.itogpract.repository.ShootingRangeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ShootingRangeService {
    @Autowired
    private ShootingRangeRepository shootingRangeRepository;

    public List<ShootingRange> findAll() {
        return shootingRangeRepository.findAll();
    }

    public Optional<ShootingRange> findById(Long id) {
        return shootingRangeRepository.findById(id);
    }

    public ShootingRange save(ShootingRange shootingRange) {
        return shootingRangeRepository.save(shootingRange);
    }

    public void deleteShootingRange(Long id) {
        shootingRangeRepository.deleteById(id);
    }
}
