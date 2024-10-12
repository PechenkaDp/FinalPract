package com.example.itogpract.controllers;

import com.example.itogpract.entity.ShootingRange;
import com.example.itogpract.services.ShootingRangeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/shootingRanges")
public class ShootingRangeController {
    @Autowired
    private ShootingRangeService shootingRangeService;

    @GetMapping
    public List<ShootingRange> getAllShootingRanges() {
        return shootingRangeService.findAll();
    }

    @PostMapping
    public ShootingRange createShootingRange(@RequestBody ShootingRange shootingRange) {
        return shootingRangeService.save(shootingRange);
    }

    @GetMapping("/{id}")
    public ShootingRange getShootingRangeById(@PathVariable Long id) {
        return shootingRangeService.findById(id).orElse(null);
    }

    @PutMapping("/{id}")
    public ShootingRange updateShootingRange(@PathVariable Long id, @RequestBody ShootingRange shootingRange) {
        shootingRange.setId(id);
        return shootingRangeService.save(shootingRange);
    }

    @DeleteMapping("/{id}")
    public void deleteShootingRange(@PathVariable Long id) {
        shootingRangeService.deleteShootingRange(id);
    }
}
