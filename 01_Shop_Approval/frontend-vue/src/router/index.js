import Vue from "vue";
import VueRouter from "vue-router";

Vue.use(VueRouter);

const routes = [
  {
    path: "/",
    name: "home",
    component: () => import("../views/HomeView.vue"),
  },
  // 결재 버튼 메뉴
  {
    path: "/simple-order",
    name: "simple-order",
    component: () => import("@/views/shop/simple-product/SimpleOrderList.vue"),
  },
  {
    path: '/toss-check/:sono',
    component: () => import('@/views/shop/toss/CheckoutView.vue')
  },
  {
    path: '/success',
    component: () => import('@/views/shop/toss/SuccessView.vue')
  },
  {
    path: '/fail',
    component: () => import('@/views/shop/toss/FailView.vue')
  }
];

const router = new VueRouter({
  mode: "history",
  base: process.env.BASE_URL,
  routes,
});

export default router;