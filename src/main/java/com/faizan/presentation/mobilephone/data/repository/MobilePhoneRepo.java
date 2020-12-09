package com.faizan.presentation.mobilephone.data.repository;

import com.faizan.presentation.mobilephone.data.entity.MobilePhone;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MobilePhoneRepo extends CrudRepository<MobilePhone, Long> {
    List<MobilePhone> findByMakeAndAndModel(String make, String model);
}
