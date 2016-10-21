package kr.ac.cbnu.bigdatalab.repositories;

import kr.ac.cbnu.bigdatalab.entities.Member;
import org.apache.ibatis.annotations.Select;
import org.hibernate.validator.constraints.CreditCardNumber;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by PENHCHET on 10/21/2016.
 */
@Repository
public interface MemberRepository {

    public List<Member> findAll();
}
