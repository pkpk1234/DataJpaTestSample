package com.example;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by pkpk1234 on 2017/5/3.
 */
@Repository
public interface PersonRepostroy extends JpaRepository<Person,Long> {
}
