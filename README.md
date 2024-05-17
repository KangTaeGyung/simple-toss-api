# simple-toss-api
toss api 를 이용한 주문 - 결재 처리 샘플

# Frontend : 
### 토스 결재 api 설치
npm i @tosspayments/payment-widget-sdk

### axios 설치
npm i axios

# Backend :

### build.gradle 패키지 추가

### 오라클 라이브러리( 19c )
	implementation 'com.oracle.database.jdbc:ucp:19.14.0.0'
	implementation 'com.oracle.database.security:oraclepki:19.14.0.0'
	implementation 'com.oracle.database.security:osdt_cert:19.14.0.0'
	implementation 'com.oracle.database.security:osdt_core:19.14.0.0'

### logback , log4jdbc 설정
	implementation 'org.bgee.log4jdbc-log4j2:log4jdbc-log4j2-jdbc4.1:1.16'
	implementation 'ch.qos.logback:logback-classic:1.2.11'
	implementation 'org.slf4j:slf4j-api:1.7.36'
	implementation 'org.slf4j:jcl-over-slf4j:1.7.36'