# Semi-Project
## 작성자 : 이호근

### 팀원
* 이호근 
* 박준혁 
* 박예빈
* 김가영
* 김종완

------------------------
## 프로젝트 기획 이유
> 현재 트랜드는 한개의 직업이 아닌 두 개 이상의 직업을 갖는 사람들이 늘고 있다.
> 주 업뿐 아니라 부업에서의 수입이 필수적인 요소로 자리잡고 있다.
> 주 전공이 아니더라도 부 전공으로 자신의 능력이 좋은 사람들이 넘치고 있다.
> 유트브에서도 요리법은 조회수가 날이가면 갈 수 록 높아지고 있다. 
> 이러한 이유로 자신의 재능을 배우고 늘리고 싶은 사람들에게 추천하고 있다.
> 요리를 배우고 싶은자와 요리를 알려주고 부업으로 돈을 벌고 싶은 사람들을 위한 
> 재능 마켓 웹페이지 입니다.

--------------------------
## 개발 환경
*	OS : Windows 10
*	DBMS/Server : Oracle 11, Tomcat 8.5
*	PlatForm : jQuery
*	개발 언어 : JAVA, JSP, JavaScript, SQL, HTML
*	개발 Tool :Eclipse, SQL Developer

------------------------
## 주요 테이블
* ALL_USER ( 회원 관리용 테이블 )
  * 시스템에 가입되어있는 회원의 정보를 저장하는 테이블
  * USER_ID COLUMN 을 Primary key로 사용
  * RESUME_YNP COLUMN 의 상태값을 사용하여 일반회원, 튜터회원의 상태를 구분 

* TUTOR_RESUME ( 튜터 이력서 관리 테이블)
  * 제출 이력서의 정보를 저장하는 테이블
  * 일반 회원에서 튜터 회원으로 전환을 원할 경우, 이력서를 작성하면 해당 테이블에 정보값이 입력
  * TUTOR_ID 값을 ALL_USER테이블에서 참조(Foreign key)하여 Primary key로 사용
  
* POINT_LOG ( 포인트 입출력 기록 테이블 )
  * 시스템 내에서 사용될 포인트를 충전 및 환전 시, 그 정보가 기록되는 테이블
  * 해당 테이블에 정보가 기록되면 ALL_USER의 포인트 총량 컬럼에 update가 되는 트리거가 대입되어있음
  * POINT_LOG의 고유 시퀀스값인 LOG_NO를 Primary key로 사용

* CS_BOARD ( 고객센터 게시판 관리 테이블 )
  * 고객센터 작성 글의 내용을 저장하는 테이블
  * 비밀글, 답변여부를 해당 컬럼으로 확인 가능
  * CS_BOARD의 고유 시퀀스값인 CS_NO를 Primary Key로 사용

* CLASS ( 등록된 수업 관리 테이블 )
  * 수업(클래스) 게시판에 등록된 수업의 정보를 저장하는 테이블
  * 해당 테이블에서 입력받은 수강 종료 날짜, 지원 종료 날짜는 Oracle schduler를 통해 종료 여부가 체크됨
  * CLASS의 고유 시퀀스값인 CLASS_NO를 Primary Key로 사용
-------------------------------------------------------------------------------------
## 주요 기능(작성자 본인이 구현 기능 이주로 작성되었습니다.) 

------------------------------------------------------
## 이 외 기능 구현기능
