package com.example.taskmanagement.controllers;

import com.example.taskmanagement.CrudService;
import com.example.taskmanagement.model.Role;
import com.example.taskmanagement.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RolesController {

    @Autowired
    private CrudService crudService;
    @GetMapping("/roles")
    public ResponseEntity<List<Role>> getRolesList() {
        return new ResponseEntity<List<Role>>(crudService.getRolesList(), HttpStatus.OK);
    }
    @PostMapping("/role/add")
    public ResponseEntity<Void> saveRole(@RequestBody Role role) {
        crudService.addRole(role);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @DeleteMapping("/role/delete/{id}")
    public ResponseEntity<Void> deleteOwner(@PathVariable Long id) {
        crudService.deleteRole(id);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

/*
    @PostMapping("owner/save")
    public ResponseEntity<Void> saveOrUpdateOwners(@RequestBody Landowner landowner) {
      //  crudService.saveOrUpdateOwners(landowner);
        Parcel parcel = crudService.getParcelById(landowner.getNumparcel());
        landowner.setParcel(parcel);
        crudService.saveOrUpdateOwners(landowner);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

 */
}
