<template>
  <div class="wrapper">
    <div class="box_section">
      <!-- 결제 UI -->
      <div id="payment-method"></div>
      <!-- 이용약관 UI -->
      <div id="agreement"></div>
      <!-- 결제하기 버튼 -->
      <button
        :disabled="!inputEnabled"
        @click="requestPayment"
        class="button"
        id="payment-button"
        style="margin-top: 30px"
      >
        결제하기
      </button>
    </div>
  </div>
</template>

<script>
import { loadPaymentWidget, ANONYMOUS } from "@tosspayments/payment-widget-sdk";

export default {
  data() {
    return {
      paymentWidget: null,
      paymentMethodWidget: null,
      // TODO: clientKey는 개발자센터의 결제위젯 연동 키 > 클라이언트 키로 바꾸세요.
      // TODO: customerKey는 구매자와 1:1 관계로 무작위한 고유값을 생성하세요.
      clientKey: "test_gck_docs_Ovk5rk1EwkEbP0W43n07xlzm",
      customerKey: this.$route.params.sono,       // 주문번호(고유값, 개발자코딩)
      amount: 0,
      inputEnabled: false,
    };
  },
  methods: {
    // TODO: 토스 API 결재 
    async requestPayment() {
      try {
        if (this.paymentWidget) {
          // TODO: 결재 요청 임시 정보
          let data = {
            orderId: this.$route.params.sono,                // 주문번호(개발자코딩), 필수
            orderName: "테스트 이름",                           // 주문명(개발자코딩) 필수
            successUrl: `${window.location.origin}/success`, // 성공 url, 필수
            failUrl: `${window.location.origin}/fail`,       // 실패 url, 필수
          };
          console.log(data);
          // ------ '결제하기' 버튼 누르면 결제창 띄우기 ------
          // 결제를 요청하기 전에 orderId, amount를 서버에 저장하세요.
          // 결제 과정에서 악의적으로 결제 금액이 바뀌는 것을 확인하는 용도입니다.
          // @docs https://docs.tosspayments.com/reference/widget-sdk#requestpayment결제-정보
          await this.paymentWidget.requestPayment(data);
        }
      } catch (error) {
        // 에러 처리하기
        console.error(error);
      }
    },
  },
  async mounted() {

    // TODO: 토스 API ------  결제위젯 초기화 ------
    // @docs https://docs.tosspayments.com/reference/widget-sdk#sdk-설치-및-초기화
    this.paymentWidget = await loadPaymentWidget(this.clientKey, ANONYMOUS);

    // TODO: 토스 API ------  결제 UI 렌더링 ------
    // @docs https://docs.tosspayments.com/reference/widget-sdk#renderpaymentmethods선택자-결제-금액-옵션
    this.paymentMethodWidget = this.paymentWidget.renderPaymentMethods(
      "#payment-method",
      { value: 13000 },                // 결재금액(개발자코딩)
      { variantKey: "DEFAULT" }
    );

    // TODO: 토스 API ------  이용약관 UI 렌더링 ------
    // @docs https://docs.tosspayments.com/reference/widget-sdk#renderagreement선택자-옵션
    this.paymentWidget.renderAgreement("#agreement", {
      variantKey: "AGREEMENT",
    });

    // TODO: 토스 API  
    this.paymentMethodWidget.on("ready", () => {
      this.inputEnabled = true;
    });
  },
};
</script>

<style>
@import "@/assets/css/style.css";
</style>
