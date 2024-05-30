package com.example.simpledms.service.shop;

import com.example.simpledms.model.entity.shop.SimpleApproval;
import com.example.simpledms.repository.shop.SimpleApprovalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @fileName : SimpleApprovalService
 * @author : kangtaegyung
 * @since : 11/22/23
 * description :  결재 서비스
 */
@Service
public class SimpleApprovalService {

    @Autowired
    SimpleApprovalRepository simpleApprovalRepository;

    public void save(SimpleApproval simpleApproval) {
        simpleApprovalRepository.save(simpleApproval);
    }
}