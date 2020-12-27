package com.promineotech.travelclub.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Object> deleteMember(@PathVariable Long id) {
		try {
			memberService.deleteMember(id);

			return new ResponseEntity<Object>("Successfully deleted customer with id : " + id, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<Object>(e.getMessage(), HttpStatus.NOT_FOUND);
		}

	}

}
