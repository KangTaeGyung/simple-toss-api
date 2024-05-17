<template>
  <div>
    <!-- 결재 버튼 -->
    <div class="row d-flex justify-content-end">
      <button type="button" @click="goApproval" class="btn btn-warning w-25">
        Go Approval
      </button>
    </div>
  </div>
</template>
<script>
export default {
  data() {
    return {
      // 주문번호 샘플(6자리이상 : 토스 결재 API 필수자리수) : 주문번호는 고유한 값으로 테스트 할것
      sono: 222231
    }
  },
  methods: {
    // 토스 결재페이지로 이동
    goApproval() {
      this.$router.push("/toss-check/" + this.sono);
    },
  },
};
</script>
<style></style>
