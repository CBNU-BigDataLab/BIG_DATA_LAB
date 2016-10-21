package kr.ac.cbnu.bigdatalab.controllers;

import kr.ac.cbnu.bigdatalab.entities.Member;
import kr.ac.cbnu.bigdatalab.repositories.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by PENHCHET on 10/21/2016.
 */
@RestController
@RequestMapping(value = "/v1/api/members")
public class MemberRestController {

    @Autowired
    private MemberRepository memberRepository;

    @RequestMapping(method = RequestMethod.GET)
    public List<Member> findAllMembers() {
        return memberRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    public Member addNewMember(@RequestBody Member member) {
        memberRepository.save(member);
        return member;
    }

}
