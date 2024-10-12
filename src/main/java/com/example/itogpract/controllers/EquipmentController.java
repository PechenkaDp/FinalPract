package com.example.itogpract.controllers;

import com.example.itogpract.entity.Equipment;
import com.example.itogpract.services.EquipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/equipments")
public class EquipmentController {
    @Autowired
    private EquipmentService equipmentService;

    @GetMapping
    public String getAllEquipments(Model model) {
        List<Equipment> equipments = equipmentService.findAll();
        model.addAttribute("equipments", equipments);
        return "equipments/list";
    }

    @GetMapping("/new")
    public String createEquipmentForm(Model model) {
        model.addAttribute("equipment", new Equipment());
        return "equipments/new";
    }

    @PostMapping
    public String createEquipment(@ModelAttribute Equipment equipment) {
        equipmentService.save(equipment);
        return "redirect:/equipments";
    }

    @GetMapping("/{id}/edit")
    public String editEquipmentForm(@PathVariable Long id, Model model) {
        Equipment equipment = equipmentService.findById(id).orElseThrow(() -> new RuntimeException("Equipment not found"));
        model.addAttribute("equipment", equipment);
        return "equipments/edit";
    }

    @PostMapping("/{id}")
    public String updateEquipment(@PathVariable Long id, @ModelAttribute Equipment equipment) {
        equipment.setId(id);
        equipmentService.save(equipment);
        return "redirect:/equipments";
    }

    @GetMapping("/{id}/delete")
    public String deleteEquipment(@PathVariable Long id) {
        equipmentService.deleteEquipment(id);
        return "redirect:/equipments";
    }
}
