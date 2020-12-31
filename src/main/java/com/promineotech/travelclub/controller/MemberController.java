package com.promineotech.travelclub.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.promineotech.travelclub.entity.Member;
import com.promineotech.travelclub.service.MemberService;

@RestController
@RequestMapping("/members")
public class MemberController {

	@Autowired
	private MemberService memberService;

	@PostMapping("/register")
	public ResponseEntity<Object> registerMember(@RequestBody Member member) {
		Member newMember = memberService.createMember(member);
		ResponseEntity<Object> responseEntity = new ResponseEntity<Object>(newMember, HttpStatus.CREATED);

		return responseEntity;

	}

	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Object> deleteMember(@PathVariable Long id) {
		try {
			memberService.deleteMember(id);

			return new ResponseEntity<Object>("Successfully deleted member with id : " + id, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<Object>(e.getMessage(), HttpStatus.NOT_FOUND);
		}

	}

	@GetMapping(path = "/{id}")

	public ResponseEntity<Object> getmemberInformation(@PathVariable Long id) {

		Member member = memberService.getMemberInfo(id);
		ResponseEntity<Object> responseEntity = new ResponseEntity<Object>(member, HttpStatus.OK);

		return responseEntity;

	}

	@GetMapping()

	public ResponseEntity<Object> getAllMembers() {

		Iterable<Member> members = memberService.getAllMembers();
		ResponseEntity<Object> responseEntity = new ResponseEntity<Object>(members, HttpStatus.OK);

		return responseEntity;

	}

	@DeleteMapping()
	public ResponseEntity<Object> deleteAllMembers() {
		try {
			memberService.deleteAllMembers();
			return new ResponseEntity<Object>("Successfully deleted all members", HttpStatus.OK);

		} catch (Exception e) {
			return new ResponseEntity<Object>(e.getMessage(), HttpStatus.OK);

		}
	}

	@PutMapping(path = "/{id}")

	public ResponseEntity<Object> updateMember(@PathVariable Long id, @RequestBody Member member) {

		ResponseEntity<Object> responseEntity;

		try {
			Member updatedMember = memberService.updateMemberInformation(member, id);

			responseEntity = new ResponseEntity<Object>(updatedMember, HttpStatus.OK);

		} catch (Exception e) {

			return new ResponseEntity<Object>(e.getMessage(), HttpStatus.BAD_REQUEST);

		}
		return responseEntity;

	}

}
