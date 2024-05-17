<template>
  <div>
    <nav class="navbar navbar-expand-lg bg-light">
      <div class="container-fluid">
        <a class="navbar-brand" href="#">
          <img :src="navImg" alt="" width="24" height="24" />
          &nbsp;&nbsp;Simple Coding
        </a>
        <button
          class="navbar-toggler"
          type="button"
          data-bs-toggle="collapse"
          data-bs-target="#navbarSupportedContent"
          aria-controls="navbarSupportedContent"
          aria-expanded="false"
          aria-label="Toggle navigation"
        >
          <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
          <!-- {/* 1st ul 시작 */} -->
          <ul class="navbar-nav me-auto mb-2 mb-lg-0">
            <!-- {/* 홈 */} -->
            <li class="nav-item ms-2">
              <a class="nav-link active" aria-current="page" href="/"> Home </a>
            </li>
            
            <!-- {/* 기초 예제 */} -->
            <li class="nav-item dropdown ms-2">
              <a
                class="nav-link dropdown-toggle"
                href="#"
                role="button"
                data-bs-toggle="dropdown"
                aria-expanded="false"
              >
                MSA 예제
              </a>
              <ul class="dropdown-menu">
                <li>
                  <a class="dropdown-item" href="/simple-order"> Simple Order </a>
                </li>
              </ul>
            </li>
          </ul>
        </div>
      </div>
    </nav>
  </div>
</template>
<script>
export default {
  data() {
    return {
      navImg: require("../../assets/img/simple-coding2.png"),
    };
  },
};
</script>
<style lang=""></style>
