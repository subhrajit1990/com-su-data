/**
 * 
 */
package com.su.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.su.entities.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
}
