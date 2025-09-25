package edu.cit.agramon.vicci.campusequimentloan.user.Repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.cit.agramon.vicci.campusequimentloan.user.Entity.userEntity;
;

@Repository
public interface userRepo extends JpaRepository<userEntity, Long>{

    Optional<userEntity> findByEmail(String email);

}
