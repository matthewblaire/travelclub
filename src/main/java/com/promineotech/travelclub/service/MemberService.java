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

	public Iterable<Member> getAllMembers() {
		return memberRepository.findAll();
	}

	public void deleteAllMembers() {
		memberRepository.deleteAll();
	}

	public Member updateMemberInformation(Member member, Long id) throws Exception {

		Member foundMember = memberRepository.findById(id).get();

		if (foundMember == null) {
			throw new Exception("Member not found");

		}

		foundMember.setFirstName(member.getFirstName());
		foundMember.setMiddleName(member.getMiddleName());
		foundMember.setLastName(member.getLastName());
		foundMember.setLoyaltyclubs(member.getLoyaltyclubs());
		foundMember.setMiles(member.getMiles());
		foundMember.setPhoneNumber(member.getPhoneNumber());
		foundMember.setEmail(member.getEmail());
		foundMember.setItineraries(member.getItineraries());

		return memberRepository.save(foundMember);
	}

}
