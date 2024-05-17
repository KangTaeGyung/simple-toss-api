package com.example.simpledms.repository.shop;

import com.example.simpledms.model.entity.shop.SimpleApproval;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * packageName : com.example.simpledms.repository.shop
 * fileName : SimpleApprovalRepository
 * author : kangtaegyung
 * date : 11/22/23
 * description :  주문 레포지토리
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 11/22/23         kangtaegyung          최초 생성
 */
@Repository
public interface SimpleApprovalRepository extends JpaRepository<SimpleApproval, Integer> {
}
