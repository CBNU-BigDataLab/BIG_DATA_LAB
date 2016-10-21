package kr.ac.cbnu.bigdatalab.services;

import kr.ac.cbnu.bigdatalab.entities.Member;

import java.util.List;

/**
 * Created by PENHCHET on 10/21/2016.
 */
public interface MemberService {

    public List<Member> findAllMembers();

    public int addNewMember(Member member);

    public int updateMember(Member member);

    public int deleteMember(String id);
}
