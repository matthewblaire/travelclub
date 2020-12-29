package com.promineotech.travelclub.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.promineotech.travelclub.entity.Member;
import com.promineotech.travelclub.repository.MemberRepository;

@Service

public class MemberService {
	@Autowired
	private MemberRepository memberRepository;

	public Member createMember(Member member) {
		return memberRepository.save(member);
	}

	public void deleteMember(Long id) {
		memberRepository.deleteById(id);

	}

	public Member getMemberInfo(Long id) {
		return memberRepository.findById(id).get();
	}

}
