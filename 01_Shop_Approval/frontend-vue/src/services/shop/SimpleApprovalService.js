import http from "@/utils/http-common";

class SimpleApprovalService {

  create(data) {
    return http.post("/shop/simple-approval", data);
  }
}

export default new SimpleApprovalService();
