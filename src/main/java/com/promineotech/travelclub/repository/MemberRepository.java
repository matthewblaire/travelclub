package com.promineotech.travelclub.repository;

import org.springframework.data.repository.CrudRepository;

import com.promineotech.travelclub.entity.Member;

public interface MemberRepository extends CrudRepository<Member, Long> {

}
