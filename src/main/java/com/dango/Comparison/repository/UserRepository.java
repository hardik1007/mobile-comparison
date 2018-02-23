package com.dango.Comparison.repository;

import com.dango.Comparison.domain.entity.UserEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource (collectionResourceRel = "users",
        path = "users")
public interface UserRepository extends PagingAndSortingRepository<UserEntity,String> {

    @Override
    Page<UserEntity> findAll(Pageable pageable);

    @Override
    UserEntity findOne(String s);

    UserEntity findByUserName(@Param("user_name") String userName);
}
