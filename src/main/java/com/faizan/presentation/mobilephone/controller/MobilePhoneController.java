package com.faizan.presentation.mobilephone.controller;

import com.faizan.presentation.mobilephone.data.entity.MobilePhone;
import com.faizan.presentation.mobilephone.data.repository.MobilePhoneRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/phone/mobile")
public class MobilePhoneController {

    @Autowired
    private MobilePhoneRepo repo;

    //CREATE
    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public MobilePhone create(@RequestBody MobilePhone mobilePhone) {
        return repo.save(mobilePhone);
    }

    //READ
    @GetMapping("/list")
    public Iterable findAll() {
        return repo.findAll();
    }
    //READ
    @GetMapping("/make/{make}/model/{model}")
    public List<MobilePhone> findByMakeAndModel(@PathVariable String make, @PathVariable String model) {
        return repo.findByMakeAndAndModel(make,model);
    }

    //UPDATE
    @PutMapping("/update/{id}")
    public MobilePhone updateMobilePhone(@RequestBody MobilePhone mobilePhone, @PathVariable Long id) {

        Optional<MobilePhone> mobilePhoneById = repo.findById(id);
        MobilePhone mobilePhoneToBeUpdated = mobilePhoneById.get();
        mobilePhoneToBeUpdated.setMake(mobilePhone.getMake());
        mobilePhoneToBeUpdated.setModel(mobilePhone.getModel());
        return repo.save(mobilePhoneToBeUpdated);
    }

    //DELETE
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) {
        repo.deleteById(id);
    }

}