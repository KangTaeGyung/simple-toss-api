package com.example.simpledms.model.entity.shop;

import lombok.*;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;

/**
 * packageName : com.example.simpledms.model.entity.shop
 * fileName : SimpleApproval
 * author : kangtaegyung
 * date : 11/22/23
 * description : 결재
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 11/22/23         kangtaegyung          최초 생성
 */
@Entity
@Table(name = "TB_SIMPLE_APPROVAL")
@SequenceGenerator(
        name = "SQ_SIMPLE_APPROVAL_GENERATOR"
        , sequenceName = "SQ_SIMPLE_APPROVAL"
        , initialValue = 1
        , allocationSize = 1
)
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@DynamicInsert
@DynamicUpdate
public class SimpleApproval {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE
            , generator = "SQ_SIMPLE_APPROVAL_GENERATOR"
    )
    private Integer sano;             // 결재번호, 기본키, 시퀀스

    private String  approvalDate;     // 결재일

    private Integer approvalAmount;   // 결재금액

}