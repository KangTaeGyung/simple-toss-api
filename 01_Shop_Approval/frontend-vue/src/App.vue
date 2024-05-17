<template>
  <div id="app">
    <!-- 메뉴 -->
    <HeaderCom />

    <!-- 본문 -->
    <div class="container mt-3">
      <router-view />
    </div>
  </div>
</template>

<script>
import HeaderCom from "./components/common/HeaderCom.vue";

export default {
  components: {
    HeaderCom,
  },
};
</script>

<style>
@import "@/assets/css/app.css";
</style>
