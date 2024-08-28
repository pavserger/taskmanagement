package com.example.taskmanagement;

import com.example.taskmanagement.model.User;
import com.example.taskmanagement.model.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CrudService {

    @Autowired
    private UserRepository crudRepository;

    public List<User> getUsersList() {
        return crudRepository.findAll();
    }
/*
    public Parcel getCompanyById(Long id) {
        return crudRepository.findById(id).get();
    }

    public void saveOrUpdateCompany(Parcel parcel) {
        crudRepository.save(parcel);
    }

    public void deleteCompany(Long id) {
        crudRepository.deleteById(id);
    }
*/
}
