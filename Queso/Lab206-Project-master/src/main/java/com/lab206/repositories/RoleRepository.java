package com.lab206.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.lab206.models.Role;

@Repository
public interface RoleRepository extends CrudRepository<Role, Long> {

}
