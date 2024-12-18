package ru.kata.spring.boot_security.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.kata.spring.boot_security.demo.model.Roles;


@Repository
public interface RoleRepository extends JpaRepository<Roles, Integer> {
    Roles findOneByRoleType(String type);
}
