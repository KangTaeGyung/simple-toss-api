package com.example.simpledms.repository.shop;

import com.example.simpledms.model.entity.shop.SimpleApproval;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @fileName : SimpleApprovalRepository
 * @author : kangtaegyung
 * @since : 11/22/23
 * description :  주문 레포지토리
 */
@Repository
public interface SimpleApprovalRepository extends JpaRepository<SimpleApproval, Integer> {
}
