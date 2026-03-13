# Spring Advanced - Cloud Architecture

본 프로젝트는 Spring Boot 애플리케이션을 Docker 컨테이너로 빌드하고, GitHub Actions와 AWS EC2를 활용해 자동 배포(CI/CD)까지 구성한 예제 프로젝트이다.

---

### AWS Budgets 화면

<img width="1370" height="735" alt="Image" src="https://github.com/user-attachments/assets/d86e7797-9273-4c0a-8a73-02f67b63865f" />

---

### EC2 배포 정보
- **퍼블릭 IP**: `3.39.227.80`
- **Health Check URL**: http://3.39.227.80:8080/actuator/health

#### EC2 인스턴스
<img width="1644" height="557" alt="Image" src="https://github.com/user-attachments/assets/e63564a4-0c6f-428d-a504-e5eeffdfe190" />

#### Actuator Health Check
<img width="802" height="352" alt="Image" src="https://github.com/user-attachments/assets/7df44ec3-b5ba-4405-a878-2aed05bc1a5e" />

---

### RDS 배포 정보
- **Actuator Info URL**: http://3.39.227.80:8080/actuator/info

#### RDS 보안 그룹 인바운드 규칙
<img width="1655" height="478" alt="Image" src="https://github.com/user-attachments/assets/b08890fa-3cea-4c96-a00d-04fd433bd119" />

---

### Presigned URL

- **URL**: [URL](https://my-profile-bucket-despis221.s3.ap-northeast-2.amazonaws.com/uploads/40ee09cd-40ac-4d90-8c15-74bd95eb9aac_%E1%84%8E%E1%85%AC%E1%84%80%E1%85%B3%E1%86%AB%20%E1%84%89%E1%85%A1%E1%84%8C%E1%85%B5%E1%86%AB%20%E1%84%87%E1%85%A9%E1%84%80%E1%85%B5.png?X-Amz-Security-Token=IQoJb3JpZ2luX2VjEKn%2F%2F%2F%2F%2F%2F%2F%2F%2F%2FwEaDmFwLW5vcnRoZWFzdC0yIkYwRAIgd7w4gi9oCaWGpCrf8DyWApvgzp6cOrCpG5r5v97QZW4CIGdOvtDPh41dcOqszKTDVcoAH7v1CTvymiLcqCEgCYUNKsgFCHIQABoMMDcwNjM4NjM0MjIzIgxHF%2BwxZ%2BQGRM5bVfUqpQV4iXcGEg9wn0uPPxU2YRyovpEjBkaiEWq8ExuiiT%2BzvHC9yNtGOI%2BLt0seuoaV8V2DVkuiz8NGTXe9W1NPPRe9Zm5SH2J5EkS5JjudzUTxPT2%2BFi2lLXVdaEPlJAm969VWC424exBtIzRCVmicHBSNX7gx066mpbL7gh2mhODvcGoxO%2FsEtA401nYBBb3%2F2DolvBnZKkGoBpbyoeV8uEJTWw8CjmaM8JlpFKgVmpoTC0fJq5Vm8YOnDrDDR40TYsME%2BGIH%2FTCenMXjWnKkkmbfMej7U812bACT7BSoQTnGcVG5ApcSJJVeXvPR7BwqeasGLkvqY0KqCGQkooaqxrw39DDQl7vtJzXlK58M1q1wltSqIFRuhwCIGYq0lQNtlf%2BjnPlveJAuI1wNoBgKsHMHDxlVJGichLWdJQ45vs84SH7rBzm0TM9gZxvfn%2BMdcbNOg41IUMmPwQe6tj3K0dSkYP%2FvXTDtrfC4a7HGjyy6ee2PuCeciZbbC2A49cnXw164pq6gp3P2c18%2BKY3uV5IVBQ8O9MQI1ZFzAIffmy4YOorv3nA7tfsNPVn%2FXS0qHC%2F6rUNahhGGmY9RaE1BkRfrT3L1tL%2BhZ437CorAr3L%2BCpHhtG4LLKoZmdICWYXM4DlgKZi1EaMRCgL%2BJmGBHfu2HKY5%2B2wOz2w8EOe5IkP4paOM5%2Fw%2BONbE6jpapk%2FhiRvFpHrhROT8MrMo%2FGRQitvPyNlBoKlM4DTQ8zgqtCXDydZk%2Fp6880dYVYbj6hfsov%2FL26svr7zCPr9OPGFEG34%2BmeRps%2Bip61dC49QYcCi0pPTwO2N%2BNnMt4ImdviL7wYWBVI1vv1hgiIheLE2i8L4fCmcCfgdV8IAnqPLy0j4NzgG5P9xo8lXOKKuzm7UMHtoHx1GC8DCG88nNBjqyAREPNZgogem%2BBSl0oElgcO7bLyN0hplryOd9YzCvBNk%2FoOnwv39FSp6rorf7%2F6OvCCS4rChQAts1ozqrux7%2BXNtZjNmWsUYXnec3U92CzQbrKYdzskr6uoJcx%2FrzN93%2BAW0%2FpizXeg6dKqWs9cf2mubyLpko%2BaxbuD%2Bh6cVDHePcBO3bUpILbR3NB0lstK9t0avEUs%2FNq0lLFAq%2BWSPCpwTKu7gATrHEPeOM%2B2i9eC4i7BY%3D&X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Date=20260312T091001Z&X-Amz-SignedHeaders=host&X-Amz-Credential=ASIARA4TEATXXEP3PC2E%2F20260312%2Fap-northeast-2%2Fs3%2Faws4_request&X-Amz-Expires=604800&X-Amz-Signature=577f99e59da47bec411ece9a9680acf768cd8fa89ab8a684c1b75e4944a413a4)
```
https://my-profile-bucket-despis221.s3.ap-northeast-2.amazonaws.com/uploads/40ee09cd-40ac-4d90-8c15-74bd95eb9aac_%E1%84%8E%E1%85%AC%E1%84%80%E1%85%B3%E1%86%AB%20%E1%84%89%E1%85%A1%E1%84%8C%E1%85%B5%E1%86%AB%20%E1%84%87%E1%85%A9%E1%84%80%E1%85%B5.png?X-Amz-Security-Token=IQoJb3JpZ2luX2VjEKn%2F%2F%2F%2F%2F%2F%2F%2F%2F%2FwEaDmFwLW5vcnRoZWFzdC0yIkYwRAIgd7w4gi9oCaWGpCrf8DyWApvgzp6cOrCpG5r5v97QZW4CIGdOvtDPh41dcOqszKTDVcoAH7v1CTvymiLcqCEgCYUNKsgFCHIQABoMMDcwNjM4NjM0MjIzIgxHF%2BwxZ%2BQGRM5bVfUqpQV4iXcGEg9wn0uPPxU2YRyovpEjBkaiEWq8ExuiiT%2BzvHC9yNtGOI%2BLt0seuoaV8V2DVkuiz8NGTXe9W1NPPRe9Zm5SH2J5EkS5JjudzUTxPT2%2BFi2lLXVdaEPlJAm969VWC424exBtIzRCVmicHBSNX7gx066mpbL7gh2mhODvcGoxO%2FsEtA401nYBBb3%2F2DolvBnZKkGoBpbyoeV8uEJTWw8CjmaM8JlpFKgVmpoTC0fJq5Vm8YOnDrDDR40TYsME%2BGIH%2FTCenMXjWnKkkmbfMej7U812bACT7BSoQTnGcVG5ApcSJJVeXvPR7BwqeasGLkvqY0KqCGQkooaqxrw39DDQl7vtJzXlK58M1q1wltSqIFRuhwCIGYq0lQNtlf%2BjnPlveJAuI1wNoBgKsHMHDxlVJGichLWdJQ45vs84SH7rBzm0TM9gZxvfn%2BMdcbNOg41IUMmPwQe6tj3K0dSkYP%2FvXTDtrfC4a7HGjyy6ee2PuCeciZbbC2A49cnXw164pq6gp3P2c18%2BKY3uV5IVBQ8O9MQI1ZFzAIffmy4YOorv3nA7tfsNPVn%2FXS0qHC%2F6rUNahhGGmY9RaE1BkRfrT3L1tL%2BhZ437CorAr3L%2BCpHhtG4LLKoZmdICWYXM4DlgKZi1EaMRCgL%2BJmGBHfu2HKY5%2B2wOz2w8EOe5IkP4paOM5%2Fw%2BONbE6jpapk%2FhiRvFpHrhROT8MrMo%2FGRQitvPyNlBoKlM4DTQ8zgqtCXDydZk%2Fp6880dYVYbj6hfsov%2FL26svr7zCPr9OPGFEG34%2BmeRps%2Bip61dC49QYcCi0pPTwO2N%2BNnMt4ImdviL7wYWBVI1vv1hgiIheLE2i8L4fCmcCfgdV8IAnqPLy0j4NzgG5P9xo8lXOKKuzm7UMHtoHx1GC8DCG88nNBjqyAREPNZgogem%2BBSl0oElgcO7bLyN0hplryOd9YzCvBNk%2FoOnwv39FSp6rorf7%2F6OvCCS4rChQAts1ozqrux7%2BXNtZjNmWsUYXnec3U92CzQbrKYdzskr6uoJcx%2FrzN93%2BAW0%2FpizXeg6dKqWs9cf2mubyLpko%2BaxbuD%2Bh6cVDHePcBO3bUpILbR3NB0lstK9t0avEUs%2FNq0lLFAq%2BWSPCpwTKu7gATrHEPeOM%2B2i9eC4i7BY%3D&X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Date=20260312T091001Z&X-Amz-SignedHeaders=host&X-Amz-Credential=ASIARA4TEATXXEP3PC2E%2F20260312%2Fap-northeast-2%2Fs3%2Faws4_request&X-Amz-Expires=604800&X-Amz-Signature=577f99e59da47bec411ece9a9680acf768cd8fa89ab8a684c1b75e4944a413a4
```
<img alt="Image" src="https://github.com/user-attachments/assets/deeb562f-0f26-4799-aeb6-c652601584ba" />

- **만료 시간**: 2026-03-19 17:57 (KST)

---

### GitHub Actions CI/CD

#### GitHub Actions 성공
<img width="1133" height="549" alt="Image" src="https://github.com/user-attachments/assets/199ad490-7b06-434c-8199-f08e693c3b91" />

#### EC2 docker ps
<img width="1266" height="58" alt="Image" src="https://github.com/user-attachments/assets/7faa621e-4cb6-474b-a11e-3faff0ca7e3b" />

---

## 개발 환경

- **Language**: Java 17
- **Framework**: Spring Boot 4.0.3
- **Database**: MySQL
- **ORM**: Spring Data JPA
- **Infra**: AWS Budgets, EC2, RDS, S3, GitHub Actions, Docker
- **IDE**: IntelliJ

---

**Base URL**: http://3.39.227.80:8080

| 기능 | Method | URL |
|-----|-----|-----|
| 팀원 생성 | POST | `/api/members` |
| 팀원 단건 조회 | GET | `/api/members/{id}` |
| 프로필 이미지 업로드 | POST | `/api/members/{id}/profile-image` |
| 프로필 이미지 Presigned URL 조회 | GET | `/api/members/{id}/profile-image` |
<br>

### 1. 팀원

#### 1-1. 팀원 생성
- Method: `POST`
- URL: `/api/members`
- Content-Type: `application/json`
- Status Code: `201 Created`

#### Request Body
```json
{
  "name": "이름",
  "age": 23,
  "mbti": "MBTI"
}
```
#### Response Body
```json
{
  "message": "저장 성공",
  "data": {
    "id": 1,
    "name": "이름",
    "age": 23,
    "mbti": "MBTI",
    "profileImageUrl": null
  }
}
```

#### 1-2. 팀원 단건 조회
- Method: `GET`
- URL: `/api/members/{id}`
- Status Code: `200 OK`

#### Response Body
```json
{
  "message": "조회 성공",
  "data": {
    "age": 23,
    "id": 1,
    "mbti": "MBTI",
    "name": "이름",
    "profileImageKey": "uploads/70242a0e-ac75-4a41-9ffa-a43d0b6621a6_SCR-20260312-kpot.png"
  }
}
```
<br>

### 2. 프로필 이미지

#### 2-1. 프로필 이미지 업로드
- Method: `POST`
- URL: `/api/members/{id}/profile-image`
- Content-Type: `multipart/form-data`
- Status Code: `201 Created`

#### Request (Postman 예시)
- Body 탭에서 form-data 선택
- 아래와 같이 설정

| Key | Type | Value |
| --- | --- |-------|
| file | file | 프로필 사진.png |

#### Response Body
```json
{
  "message": "프로필 이미지 업로드 성공",
  "data": null
}
```

#### 2-2. 프로필 이미지 Presigned URL 조회
- Method: `GET`
- URL: `/api/members/{id}/profile-image`
- Status Code: `200 OK`

#### Response Body
```json
{
  "message": "Presigned URL 조회 성공",
  "data": "https://my-profile-bucket-despis221.s3.ap-northeast-2.amazonaws.com/uploads/....?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=...&X-Amz-Expires=..."
}
```

- data 필드에는 일정 시간 동안만 유효한 S3 Presigned URL이 들어 있으며,
클라이언트는 이 URL을 사용해 직접 이미지를 조회할 수 있다.
<br>

### 3. Actuator 모니터링

build.gradle에 spring-boot-starter-actuator 의존성이 추가되어 있고,
application.properties에서 아래와 같이 health, info 엔드포인트만 외부로 노출하도록 설정되어 있다.

```
management.endpoints.web.exposure.include=health,info
```
application-prod.properties에서 info 엔드포인트에 노출할 팀 정보를 지정한다.
```
management.info.env.enabled=true
info.app.team-name=${team-name}
```

#### 3-1. 헬스 체크
- Method: `GET`
- URL: `/actuator/health`
- Status Code: `200 OK`

#### Response Body
```json
{
  "groups": [
    "liveness",
    "readiness"
  ],
  "status": "UP"
}
```
- status: 전체 애플리케이션 상태 (UP이면 정상)

#### 3-2. 애플리케이션 정보
- Method: `GET`
- URL: `/actuator/info`
- Status Code: `200 OK`

#### Response Body
```json
{
  "app": {
    "team-name": "팀이름"
  }
}
```
- team-name 값은 application-prod.properties의 info.app.team-name=${team-name} 설정과
  Parameter Store에 설정된 team-name 값으로부터 주입된다.