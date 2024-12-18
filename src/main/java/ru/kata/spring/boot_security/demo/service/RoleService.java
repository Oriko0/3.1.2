package ru.kata.spring.boot_security.demo.service;

import ru.kata.spring.boot_security.demo.model.Roles;

import java.util.List;



public interface RoleService {

    List<Roles> getAllRoles();

    Roles getRoleByRoleType(String roleType);

    void saveRole(Roles role);
}
