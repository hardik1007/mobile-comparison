package com.dango.Comparison.repository;

import com.dango.Comparison.domain.entity.AddressEntity;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "addresses",
        path = "addresses")
public interface AddressRepository extends PagingAndSortingRepository<AddressEntity,Integer> {
}
