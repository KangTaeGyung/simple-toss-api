package com.example.simpledms.controller.shop;

import com.example.simpledms.model.entity.shop.SimpleApproval;
import com.example.simpledms.service.shop.SimpleApprovalService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
/**
 * packageName : com.example.simpledms.controller.shop
 * fileName : SimpleApprovalController
 * author : kangtaegyung
 * date : 11/22/23
 * description : 결재 컨트롤러
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 11/22/23         kangtaegyung          최초 생성
 */
@Slf4j
@RestController
@RequestMapping("/api/shop")
public class SimpleApprovalController {

    @Autowired
    SimpleApprovalService simpleApprovalService;

    //    저장 함수
    @PostMapping("/simple-approval")
    public ResponseEntity<Object> create(@RequestBody SimpleApproval simpleApproval) {

        try {
            SimpleApproval simpleApproval2 = simpleApprovalService.save(simpleApproval);

            return new ResponseEntity<>(simpleApproval2, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
