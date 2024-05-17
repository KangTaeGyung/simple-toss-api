package com.example.simpledms.service.shop;

import com.example.simpledms.model.entity.shop.SimpleApproval;
import com.example.simpledms.repository.shop.SimpleApprovalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

/**
 * packageName : com.example.simpledms.service.shop
 * fileName : SimpleApprovalService
 * author : kangtaegyung
 * date : 11/22/23
 * description :  결재 서비스
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 11/22/23         kangtaegyung          최초 생성
 */
@Service
public class SimpleApprovalService {

    @Autowired
    SimpleApprovalRepository simpleApprovalRepository;

    //    저장함수
    public SimpleApproval save(SimpleApproval simpleApproval) {

        SimpleApproval simpleApproval2
                = simpleApprovalRepository.save(simpleApproval);

        return simpleApproval2;
    }
}
