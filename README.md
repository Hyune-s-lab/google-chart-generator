# google-chart-generator

> 사내 통계 자료 추출을 위한 프로젝트로 많은 부분이 하드 코딩 되어 있습니다.

### Environment

- spring boot 2.7.7, kotlin
- thymeleaf, google chart API

### boot script

```shell
> nohup ./gradlew bootRun > app.log 2>&1 &
> tail -f app.log
```

---

> http://localhost:8080/index

### 1. 차트 생성을 위한 데이터 입력

![image](https://user-images.githubusercontent.com/55722186/210039683-f8f1a106-db3f-4595-9bc2-ab799f71549b.png)

### 2. 차트 생성

![image](https://user-images.githubusercontent.com/55722186/210039751-25e81d7d-1353-4d9a-b4a2-6f75e9666ab5.png)

### 3. 예외 발생

![image](https://user-images.githubusercontent.com/55722186/210039776-5ef45482-a03a-4c5c-b805-9019e6cb36ae.png)
