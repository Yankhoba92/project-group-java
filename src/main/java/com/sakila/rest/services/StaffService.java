package com.sakila.intro.services;

import com.sakila.intro.entities.Staff;

public interface StaffService extends IService<Staff, Integer> {
    byte[] getPicture(Integer id)   ;
}
