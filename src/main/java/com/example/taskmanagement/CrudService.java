package com.example.taskmanagement;

import com.example.taskmanagement.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CrudService {

  //  @Autowired
    private UserRepository userRepository;
    private RoleRepository roleRepository;
    private TaskRepository taskRepository;

    public CrudService(
            UserRepository userRepository,
            RoleRepository roleRepository,
            TaskRepository taskRepository
    )
    {
        this.userRepository= userRepository;
        this.roleRepository = roleRepository;
        this.taskRepository = taskRepository;
    }
    public List<Role> getRolesList() {
         List<Role> lstRole;
        lstRole = roleRepository.findAll();;
        return roleRepository.findAll();
    }

    public void addRole(Role role) {
       roleRepository.save(role);
    }
    public void deleteRole(Long idRole) {
        //Long l = (Long)idRole;
        roleRepository.deleteById(idRole);
    }


    public List<User> getUsersList() {
        return userRepository.findAll();
    }

}
