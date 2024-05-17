<template>
  <section v-if="confirmed">
    <div class="box_section" style="width: 600px">
      <img
        style="width: 100px"
        src="https://static.toss.im/illusts/check-blue-spot-ending-frame.png"
      />
      <h2>결제를 완료했어요</h2>

      <div class="p-grid typography--p" style="margin-top: 50px">
        <div class="p-grid-col text--left"><b>결제금액</b></div>
        <div class="p-grid-col text--right" id="amount">
          {{ jsonData.totalAmount }}원
        </div>
      </div>
      <div class="p-grid typography--p" style="margin-top: 10px">
        <div class="p-grid-col text--left"><b>주문번호</b></div>
        <div class="p-grid-col text--right" id="orderId">
          {{ jsonData.orderId }}
        </div>
      </div>
    </div>
  </section>
</template>

<script>
import { confirmPayment } from "@/utils/confirmPayment";
import SimpleApprovalService from '@/services/shop/SimpleApprovalService';

export default {
  data() {
    return {
      requestData: {
        orderId: this.$route.query.orderId, 
        amount: this.$route.query.amount, 
        paymentKey: this.$route.query.paymentKey, 
      },
      confirmed: false,
      jsonData: null,
    };
  },
  methods: {
    // TODO: 토스 결재 함수
    async confirm() {
      try {
        const { response, json } = await confirmPayment(this.requestData);
        console.log(json);
        if (!response.ok) {
          this.$router.push(`/fail?message=${json.message}&code=${json.code}`);
        } else {
          this.confirmed = true;
          this.jsonData = json;

          // 결재 저장 함수 실행(개발자코딩)
          this.confirmApproval()
        }
      } catch (e) {
        console.log(e);
      }
    },
    // 결재 저장 함수 정의(개발자코딩)
    async confirmApproval() {
      let now              = new Date();
      let yearMonthDay     = `${now.getFullYear()}-${now.getMonth()}-${now.getDate()}`;
      let hourMinuteSecond = `${now.getHours()}:${now.getMinutes()}:${now.getSeconds()}`;
      let dateFormat       = `${yearMonthDay} ${hourMinuteSecond}`;

      try {
        let approval = {
          sono: this.$route.query.orderId,          // 주문번호
          approvalDate: dateFormat,                 // 결재일
          approvalAmount: this.$route.query.amount, // 주문금액
        };
        let response = await SimpleApprovalService.create(approval);
        this.simpleApproval = response.data;
        
        console.log(response.data);
      } catch (e) {
        console.log(e);
      }
    },
  },
  mounted() {
    this.confirm();
  },
};
</script>

<style>
@import "@/assets/css/style.css";
</style>
