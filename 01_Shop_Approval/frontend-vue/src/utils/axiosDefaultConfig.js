import axios from "axios";

// axios 기본 설정
export default axios.create({
  baseURL: "http://localhost:8000/api",
  headers: {
    "Content-Type": "application/json"
  }
});
