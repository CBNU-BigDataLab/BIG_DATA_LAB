package kr.ac.cbnu.bigdatalab.services.impl;

import kr.ac.cbnu.bigdatalab.entities.Member;
import kr.ac.cbnu.bigdatalab.repositories.MemberRepository;
import kr.ac.cbnu.bigdatalab.services.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by PENHCHET on 10/21/2016.
 */

@Service
public class MemberServiceImpl implements MemberService {

    @Autowired
    private MemberRepository memberRepository;

    @Override
    public int addNewMember(Member member) {
        return memberRepository.save(member);
    }

    @Override
    public List<Member> findAllMembers() {
        return memberRepository.findAll();
    }

    @Override
    public int updateMember(Member member) {
        return 0;
    }

    @Override
    public int deleteMember(String id) {
        return 0;
    }
}
