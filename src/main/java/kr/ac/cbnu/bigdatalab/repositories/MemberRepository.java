package kr.ac.cbnu.bigdatalab.repositories;

import kr.ac.cbnu.bigdatalab.entities.Member;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by PENHCHET on 10/21/2016.
 */
@Repository
public interface MemberRepository {

    public List<Member> findAll();

    public int save(Member member);
/*
    public int update(Member member);

    public int delete(String id);*/

}
