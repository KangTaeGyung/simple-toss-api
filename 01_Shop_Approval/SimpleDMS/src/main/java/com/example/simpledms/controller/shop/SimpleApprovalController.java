package com.example.simpledms.controller.shop;

import com.example.simpledms.model.entity.shop.SimpleApproval;
import com.example.simpledms.service.shop.SimpleApprovalService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
/**
 * @fileName : SimpleApprovalController
 * @author : kangtaegyung
 * @since : 11/22/23
 * description : 결재 컨트롤러
 */
@Slf4j
@RestController
@RequestMapping("/api/shop")
public class SimpleApprovalController {

    @Autowired
    SimpleApprovalService simpleApprovalService;

    @PostMapping("/simple-approval")
    public ResponseEntity<Object> create(@RequestBody SimpleApproval simpleApproval) {

        try {
            simpleApprovalService.save(simpleApproval);

            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
