package com.leju.onetomanymanytoone.repository;

import com.leju.onetomanymanytoone.model.Permission;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PermissionRepository extends JpaRepository<Permission,String> {
}
