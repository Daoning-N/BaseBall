# Baseball Fan Page

한 줄 소개: 야구 팬들을 위한 커뮤니티 사이트
진행 기간: 2023/06/15 → 2023/07/17
Skills: CSS, HTML, JS, Java, MySQL, Spring Boot, Tomcat, VSCode
팀 구성: Front-End 1

### 🔗 Link

[https://twinbears.shop](https://twinbears.shop/)

**Source**

[https://github.com/Daoning-N/baseball](https://github.com/Daoning-N/baseball)

## ✍️ 요약

![Home](https://github.com/Daoning-N/mbtiPJ/assets/121539291/e0030452-8c23-4c50-bc49-abe666cff639)


Home

![응원 게시판](https://github.com/Daoning-N/mbtiPJ/assets/121539291/1fd02cb4-6c5f-44d5-88e9-542cfe0500c7)

응원 게시판

![구단 Main](https://github.com/Daoning-N/mbtiPJ/assets/121539291/cb231788-423f-4651-9f07-c400c858e056)

구단 Main

## 🛠 사용 기술 및 라이브러리

- Java
- Spring Boot
- MySQL
- JS, HTML, CSS
- AWS의 RDS
- GitHub
- VSCode

## 🖥 담당한 기능 (**Back-End**)

- 야구 게시판(룰, 용어) CRUD
- 응원의 한마디 CRUD
- 로그인 CRUD
- Entity를 이용한 DB생성
- AWS의 RDBS와 프로젝트 연결

## 💡 느낀점

- Spring Boot를 처음 사용해 보았는데 Spring보다 더욱 편리한 기능들이 많음을 느꼈으나
편리한 만큼 제대로 기능을 숙지하지 못하면 응용하기 힘들다고 느꼈습니다.
- CRUD 기능을 다시 한번 구현하면서 기능에 대한 이해도가 향상됐습니다.
- 기존 프로젝트에서 제대로 사용해 보지 못했던 GitHub를 사용하며 Git 사용방법에 대한 능력이 향상됐습니다.
- Mapper가 아닌 Entity를 통해 속성들을 연결하여 프로젝트를 진행했습니다. 그러나 이 방식은 주로 테스트 단계에서 사용을 한다는 것을 뒤늦게 알게 돼서 미숙한 방법으로 프로젝트를 진행한 점이 아쉬움이 큽니다.
- 경기 정보 페이지에 크롤링 기능을 적용하였으나 오류가 발생하여 완벽하게 구현해 내지 못한 점이 아쉽습니다.

- **더 자세한 프로젝트 설명이 궁금하시면❓**
    
    **Team Member
    Back-End**
    
    2023.06. - 2023.07.
    
    ### 기능 설명

    # 1
    - Home, 구단 Main
    Home
    ![ㅁㄴㅇ.png](https://github.com/Daoning-N/mbtiPJ/assets/121539291/b7e04006-5690-43f7-a5c2-b363e2d03110)
    
    LG
    ![스크린샷(522).png](https://github.com/Daoning-N/mbtiPJ/assets/121539291/847144f0-a8a9-41dc-bef5-ccee1f8f5abb)

    두산
    ![스크린샷(521).png](https://github.com/Daoning-N/mbtiPJ/assets/121539291/575af88a-0aa8-4895-97f7-5c2970cbb7ba)

    ### 1. 설명
    - Home에서 응원하는 구단 선택
    - 각 구단 별 Main 중앙에 크롤링을 통해 실시간 순위 업데이트 적용

    # 2
    선수정보
    ![스크린샷(523).png](https://github.com/Daoning-N/mbtiPJ/assets/121539291/c2c1dc40-619d-4558-b7d3-c1b69b8931b5)
    
    야구 용어
    ![스크린샷(525).png](https://github.com/Daoning-N/mbtiPJ/assets/121539291/be6a9439-ee20-4ea7-83db-0cb1c8aa2169)
  
    경기규칙
    ![스크린샷(526).png](https://github.com/Daoning-N/mbtiPJ/assets/121539291/d8c4fcd4-cd21-44ae-b881-2849ec17c7c1)
    
    예매방법
    ![스크린샷(528).png](https://github.com/Daoning-N/mbtiPJ/assets/121539291/0962e3d7-8f03-444c-a8ad-825c9c6cdcfb)
    
    ### 2. 설명
     - 각 카테고리별 페이지

    # 3
    게시글 등록
    ![스크린샷(529).png](https://github.com/Daoning-N/mbtiPJ/assets/121539291/ee3563e2-204f-4576-8942-03a4849ab394)
    
    관리자 로그인
    ![스크린샷(530).png](https://github.com/Daoning-N/mbtiPJ/assets/121539291/fd27619c-b1e7-4cbd-abda-f6f808ef3cb5)
    ![스크린샷(532).png](https://github.com/Daoning-N/mbtiPJ/assets/121539291/3492ccc5-65f6-4669-b7c7-ec1f81e121bc)

    ### 3. 설명
    - 게시글 등록 시 비밀번호 입력해야 등록 가능(별도의 회원가입 없이 익명으로 게시글 등록하는 방법이라 비밀번호 입력 방식 사용)
    - 삭제, 수정 시 등록했던 비밀번호 입력해야 삭제, 수정이 되도록 함
    - 각 페이지 푸터 Welcome을 누르면 관리자 로그인이 가능하며 관리자로 로그인 시 모든 카테고리별 게시글 관리 가능
    
    
