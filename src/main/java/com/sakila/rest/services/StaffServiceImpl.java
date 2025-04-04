package com.sakila.intro.services;

import com.sakila.intro.entities.Staff;
import com.sakila.intro.repositories.StaffRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StaffServiceImpl implements StaffService{

    private final StaffRepository repository;

    public StaffServiceImpl(StaffRepository repository) {
        this.repository = repository;
    }

    @Override
    public byte[] getPicture(Integer id) {
        return read(id).getPicture();
    }

    @Override
    public Staff create(Staff obj) {
        return null;
    }

    @Override
    public Staff read(Integer id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Staff update(Staff obj) {
        return null;
    }

    @Override
    public boolean delete(Integer id) {
        return false;
    }

    @Override
    public List<Staff> readAll() {
        return List.of();
    }
}
