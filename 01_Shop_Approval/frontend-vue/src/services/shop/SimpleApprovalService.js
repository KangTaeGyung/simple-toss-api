import axiosDefault from "@/utils/axiosDefaultConfig";

class SimpleApprovalService {

  create(data) {
    return axiosDefault.post("/shop/simple-approval", data);
  }
}

export default new SimpleApprovalService();
