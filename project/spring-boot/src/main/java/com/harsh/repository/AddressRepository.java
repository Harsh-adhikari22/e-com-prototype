package com.harsh.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.harsh.model.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
