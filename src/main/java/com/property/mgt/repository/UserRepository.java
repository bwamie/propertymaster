package com.property.mgt.repository;

import com.property.mgt.domain.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * Created by Alex_Xie on 20/03/2017.
 */
@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

    @Query("select u from User u where u.username = :username")
    User getUserByUsername(@Param("username") String username);

}
