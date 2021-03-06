/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.57
 * Generated at: 2020-08-18 15:40:15 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.mypage.point;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import user.member.model.service.UserService;
import user.member.controller.*;
import user.vo.User;

public final class pointDeposit_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/views/common/footer.jsp", Long.valueOf(1597313680000L));
    _jspx_dependants.put("/WEB-INF/views/common/userHeader.jsp", Long.valueOf(1597763325162L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("user.member.controller");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("user.vo.User");
    _jspx_imports_classes.add("user.member.model.service.UserService");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    ");

	User memberLoggedIn = (User)session.getAttribute("memberLoggedIn");
    String adminGrade = UserService.USER_ADMIN;

	//쿠키확인 : 요청과 함께 전송된 쿠키확인
	boolean saveId = false;
	String userId = "";
	Cookie[] cookies = request.getCookies();
	if(cookies != null){
		for(Cookie c : cookies){
			String key = c.getName();
			String value = c.getValue();
			if("saveId".equals(key)){
				saveId = true;
				userId = value;
			}
		}
	}	

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title></title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath() );
      out.write("/css/header.css\" />\r\n");
      out.write(" <script src=\"");
      out.print( request.getContextPath() );
      out.write("/js/jquery-3.5.1.js\"></script>\r\n");
      out.write("    <script>\r\n");
      out.write("        $(function(){\r\n");
      out.write("\t$(\"#user-login-form\").submit(function(){\r\n");
      out.write("\t\tvar $userId = $(\"#input-login-id\");\r\n");
      out.write("\t\tvar $password = $(\"#input-login-password\");\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tif(/^.{4,}$/.test($userId.val()) == false){\r\n");
      out.write("\t\t\talert(\"유효한 아이디를 입력하세요.\");\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t    }\r\n");
      out.write("\t\tif(/^.{4,}$/.test($password.val()) == false){\r\n");
      out.write("\t\t\talert(\"유효한 패스워드를 입력하세요.\");\t\t\t\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t    }\r\n");
      out.write("\t\treturn true;\r\n");
      out.write("\t        });\r\n");
      out.write("        });\r\n");
      out.write("        \r\n");
      out.write("        // 로그인 드롭다운 \r\n");
      out.write("        function mypage(){\r\n");
      out.write("            $(\"#mypage-login\").slideToggle();    \r\n");
      out.write("        }\r\n");
      out.write("        // 비밀번호 변경 시 js 효과\r\n");
      out.write("/*         function lostPw(){\r\n");
      out.write("            $(\"#mypage-login\").slideUp();\r\n");
      out.write("            $(\"#mypage-lostpw\").slideDown('300', 'linear');\r\n");
      out.write("        }; */\r\n");
      out.write("        // 비밀번호 변경 시 정보 체크\r\n");
      out.write("        function infoChk(){\r\n");
      out.write("            var INFO = 1;\r\n");
      out.write("            if(INFO = 1){\r\n");
      out.write("                alert(\"비밀번호 변경이 완료되었습니다!\");\r\n");
      out.write("                 $(\"#mypage-lostpw\").slideUp();\r\n");
      out.write("                $(\"#mypage-lostpw\").css(\"display\", \"none.\");\r\n");
      out.write("                $(\"#mypage-login\").slideDown(); \r\n");
      out.write("\r\n");
      out.write("            }else{\r\n");
      out.write("                alert(\"입력하신 정보가 고객님의 회원 정보와 일치하지 않습니다.\\n다시 확인해 주세요.\");\r\n");
      out.write("            }\r\n");
      out.write("        };\r\n");
      out.write("\r\n");
      out.write("        $(function(){\r\n");
      out.write("        \t$(\"#logout\").click(function(){\r\n");
      out.write("        \t\t$(\"#mypage-login\").slideToggle();\r\n");
      out.write("        \t\tvar result = confirm(\"로그아웃 하시겠습니까?\");\r\n");
      out.write("            \tif(result){\r\n");
      out.write("            \t\tlocation.href = \"");
      out.print( request.getContextPath() );
      out.write("/user/logout\";\r\n");
      out.write("            \t\talert(\"성공적으로 로그아웃 되었습니다!\");\r\n");
      out.write("            \t}\r\n");
      out.write("        \t});\r\n");
      out.write("        });\r\n");
      out.write("        function adminLogout(){\r\n");
      out.write("        \tvar result = confirm(\"로그아웃 하시겠습니까?\");\r\n");
      out.write("        \tif(result){\r\n");
      out.write("        \t\tlocation.href = \"");
      out.print( request.getContextPath() );
      out.write("/user/logout\";\r\n");
      out.write("        \t\talert(\"성공적으로 로그아웃 되었습니다!\");\r\n");
      out.write("        \t}\r\n");
      out.write("        };\r\n");
      out.write("        \r\n");
      out.write("        //비밀번호 재설정\r\n");
      out.write("        function lostPw(){\r\n");
      out.write("        location.href = \"");
      out.print(request.getContextPath());
      out.write("/user/enroll\";\r\n");
      out.write("        \t\r\n");
      out.write("        };\r\n");
      out.write("    </script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<!-- 회원이 현재 로그인하지 않은 경우, 즉 비회원인 경우 -->\r\n");
 if (memberLoggedIn == null){ 
      out.write("\t\r\n");
      out.write("    <div class=\"wrapper-user-header\">\r\n");
      out.write("        <div class=\"user-header\">\r\n");
      out.write("            <div class=\"user-navbar\">\r\n");
      out.write("                <a href=\"#\"><button id=\"logo-btn\" class=\"logo-btn\">cooking-king</button></a>\r\n");
      out.write("                    <div class=\"navbar-user-menu\">\r\n");
      out.write("            <a href=\"#\"><button class=\"user-navbar1\" onclick=\"\">클래스</button></a>\r\n");
      out.write("            <a href=\"#\"><button class=\"user-navbar2\" onclick=\"\">내 스케줄</button></a>\r\n");
      out.write("            <a href=\"#\"><button class=\"user-navbar3\" onclick=\"msg();\">메세지</button></a>\r\n");
      out.write("            <a href=\"#\"><button class=\"user-navbar4\" id=\"mypage-btn\" onclick=\"mypage();\">마이페이지</button></a>\r\n");
      out.write("            <a href=\"#\"><button class=\"user-navbar5\" onclick=\"\">고객센터</button></a>\r\n");
      out.write("                    </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"mypage-login\" id=\"mypage-login\">\r\n");
      out.write("                <p id=\"welcome-back\" class=\"welcome-back\">WELCOME BACK!</p>\r\n");
      out.write("                <form class=\"user-login-form\" id=\"user-login-form\"\r\n");
      out.write("                action=\"");
      out.print( request.getContextPath() );
      out.write("/user/login\"\r\n");
      out.write("\t\t\t\t\t  method=\"POST\">\r\n");
      out.write("                    <input type=\"text\" class=\"input-login-id\" id=\"input-login-id\" name=\"userId\"\r\n");
      out.write("                        placeholder=\"아이디를 입력하세요.\" value=\"");
      out.print( saveId ? userId : "");
      out.write("\" required><br>\r\n");
      out.write("                    <input type=\"password\" class=\"input-login-password\" id=\"input-login-password\" name=\"password\"\r\n");
      out.write("                        placeholder=\"비밀번호를 입력하세요.\" required><br>\r\n");
      out.write("                        <a href=\"#\" id=\"lost-pw\" class=\"lost-pw\" onclick=\"lostPw();\">비밀번호를 잊으셨나요?</a>\r\n");
      out.write("                        <br />\r\n");
      out.write("   \t                    <a href=\"#\" id=\"lost-pw\" class=\"lost-pw\" onclick=\"lostPw();\">처음 방문 하셨나요?</a>\r\n");
      out.write("                    <input type=\"submit\" value=\"Login\" id=\"login-btn\" class=\"login-btn\" onclick=\"login();\" required><br>\r\n");
      out.write("               \r\n");
      out.write("                </form>\r\n");
      out.write("  ");
 } else if (memberLoggedIn != null && !memberLoggedIn.getCommGrade().equals(adminGrade)){ 
      out.write("\r\n");
      out.write("      <div class=\"wrapper-user-header\">\r\n");
      out.write("        <div class=\"user-header\">\r\n");
      out.write("            <div class=\"user-navbar\">\r\n");
      out.write("                <a href=\"#\"><button id=\"logo-btn\" class=\"logo-btn\">cooking-king</button></a>\r\n");
      out.write("                    <div class=\"navbar-user-menu\">\r\n");
      out.write("            <a href=\"#\"><button class=\"user-navbar1\" onclick=\"location.href='");
      out.print( request.getContextPath() );
      out.write("/board/list'\">클래스</button></a>\r\n");
      out.write("            <a href=\"#\"><button class=\"user-navbar2\" onclick=\"location.href='");
      out.print(request.getContextPath());
      out.write("/member/schedule'\">내 스케줄</button></a>\r\n");
      out.write("            <a href=\"#\"><button class=\"user-navbar3\" onclick=\"msg();\">메세지</button></a>\r\n");
      out.write("            <a href=\"#\"><button class=\"user-navbar4\" id=\"mypage-btn\" onclick=\"mypage();\">마이페이지</button></a>\r\n");
      out.write("            <a href=\"#\"><button class=\"user-navbar5\" onclick=\"\">고객센터</button></a>\r\n");
      out.write("                    </div>\r\n");
      out.write("            </div>\r\n");
      out.write("      <div class=\"mypage-login\" id=\"mypage-login\">\r\n");
      out.write("   \t\t<div class=\"hello\" id=\"hello\">\r\n");
      out.write("   \t\t\t<p class=\"hello-p\">");
      out.print( memberLoggedIn.getUserName() );
      out.write("님, 안녕하세요.</p>\r\n");
      out.write("   \t\t</div>\r\n");
      out.write("        <div class=\"mypage\" id=\"mypage\">\r\n");
      out.write("            <button class=\"mypages\" id=\"myinfo\" onclick=\"location.href='");
      out.print( request.getContextPath());
      out.write("/user/view?userId=");
      out.print(memberLoggedIn.getUserId());
      out.write("'\">내 정보 수정</button><br />\r\n");
      out.write("            <button class=\"mypages\" id=\"point-charge\" onclick=\"location.href='");
      out.print(request.getContextPath());
      out.write("/point/pointManagement'\">포인트 관리</button><br />\r\n");
      out.write("            <button class=\"mypages\" id=\"write-review\">리뷰 작성</button><br />\r\n");
      out.write("            <button class=\"mypages\" id=\"write-resume\" onclick=\"location.href='");
      out.print(request.getContextPath());
      out.write("/tutor/writerResume?userId=");
      out.print( memberLoggedIn.getUserId());
      out.write("'\">이력서 작성</button><br />\r\n");
      out.write("            <button class=\"mypages\" id=\"logout\" onclick=\"location.href='");
      out.print(request.getContextPath());
      out.write("/member/logout'\">로그아웃</button>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>    \r\n");
      out.write("        ");
 } else if (memberLoggedIn != null && memberLoggedIn.getCommGrade().equals(adminGrade)){ 
      out.write("\r\n");
      out.write("    \t    <div class=\"wrapper-admin-header\">\r\n");
      out.write("       \t\t\t <div class=\"admin-header\">\r\n");
      out.write("          \t\t\t  <div class=\"admin-navbar\">\r\n");
      out.write("                <a href=\"\"><button id=\"logo-btn\" class=\"logo-btn\">cooking-king</button></a>\r\n");
      out.write("                    <div class=\"navbar-admin-menu\">\r\n");
      out.write("            <button class=\"admin-navbar1\">클래스 관리</button>\r\n");
      out.write("            <button class=\"admin-navbar2\">회원 관리</button>\r\n");
      out.write("            <button class=\"admin-navbar3\">메세지</button>\r\n");
      out.write("            <button class=\"admin-navbar4\">현황 조회</button>\r\n");
      out.write("            <button class=\"admin-navbar5\">고객센터</button>\r\n");
      out.write("                    </div>\r\n");
      out.write("            </div>\r\n");
      out.write("       \t\t\t <div class=\"helloAdmin\" id=\"helloAdmin\">\r\n");
      out.write("   \t\t\t\t\t<p class=\"helloAdmin-p\" onclick=\"adminLogout();\">\r\n");
      out.write("   \t\t\t\t\t");
      out.print( memberLoggedIn.getUserName() );
      out.write("님, 안녕하세요. </p>\r\n");
      out.write("   \t\t\t\t </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    \t");
 } 
      out.write("\r\n");
      out.write("    \t</div>\r\n");
      out.write("    \t</div>\r\n");
      out.write("    \t</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("<h1>CKK :: pointExchange</h1>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t<div class=\"pointExc-notic\">\r\n");
      out.write("\t\t<p>현재 포인트 : ");
      out.print(memberLoggedIn.getPointSum() );
      out.write("</p>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<br />\r\n");
      out.write("\t<div class=\"pointExc-input1\">\r\n");
      out.write("\t\t<form action=\"");
      out.print( request.getContextPath() );
      out.write("/point/pointDeposit\" method=\"post\" id=\"pointExc-frm\">\r\n");
      out.write("\t\t\t<input type=\"text\" name=\"pointAmount\" id=\"pointAmount\" placeholder=\"환전할 포인트를 입력해주세요.\" required />\r\n");
      out.write("\t\t\t<input type=\"button\" value=\"+1000원\" id=\"plusBtn1\" onclick=\"add(1000);\"/>\r\n");
      out.write("\t\t\t<input type=\"submit\" value=\"충전하기\" />\r\n");
      out.write("\t\t\t<input type=\"hidden\" name=\"userId\" value=\"");
      out.print(memberLoggedIn.getUserId() );
      out.write("\" />\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("function add(num){\r\n");
      out.write("\t\r\n");
      out.write("\tvar pointAmt = document.getElementById(\"pointAmount\");\r\n");
      out.write("\t\r\n");
      out.write("\tpointAmt.text += parseInt(pointAmt.value) + num;\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("    <style>\r\n");
      out.write("        @font-face {\r\n");
      out.write("            font-family: 'IBMPlexSansKR-Text';\r\n");
      out.write("            src: url('https://cdn.jsdelivr.net/gh/projectnoonnu/noonfonts_20-07@1.0/IBMPlexSansKR-Text.woff') format('woff');\r\n");
      out.write("            font-weight: normal;\r\n");
      out.write("            font-style: normal;\r\n");
      out.write("        }\r\n");
      out.write("        html, body{\r\n");
      out.write("            font-family: 'IBMPlexSansKR-Text';\r\n");
      out.write("            margin: 0ex;\r\n");
      out.write("            padding: 0ex;\r\n");
      out.write("            transform-origin: top left;\r\n");
      out.write("        }\r\n");
      out.write("        .public-footer{\r\n");
      out.write("            padding-top: 1em;\r\n");
      out.write("            padding-bottom: 2em;\r\n");
      out.write("            border: 1px solid orange;\r\n");
      out.write("            text-align: center;\r\n");
      out.write("            vertical-align: center;\r\n");
      out.write("            flex-direction: column;\r\n");
      out.write("            justify-content: center;\r\n");
      out.write("            align-items: center;\r\n");
      out.write("            letter-spacing: 1px;\r\n");
      out.write("            background: #ccd6e7;\r\n");
      out.write("            font-size: .9em;\r\n");
      out.write("            color: rgba(0, 0, 0, 0.7);\r\n");
      out.write("        }\r\n");
      out.write("        .footer-inner{\r\n");
      out.write("            width: 100vw;\r\n");
      out.write("            height: 10vw;\r\n");
      out.write("        }\r\n");
      out.write("        .logo-title{\r\n");
      out.write("            text-transform: uppercase;\r\n");
      out.write("            font-weight: bold;\r\n");
      out.write("            font-size: 1.2em;\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <div class=\"public-footer\">\r\n");
      out.write("        <p class=logo-title>Cookingking </p>\r\n");
      out.write("            <div class=\"footer-inner\">\r\n");
      out.write("            <p class=\"first-line\">\r\n");
      out.write("                <strong>상호명</strong> \r\n");
      out.write("                    주식회사 Cookingking\r\n");
      out.write("                <strong>개인정보책임자</strong> \r\n");
      out.write("                    김동현\r\n");
      out.write("                <strong>사업자등록번호</strong> \r\n");
      out.write("                    111-11-11111\r\n");
      out.write("                <strong>통신판매신고번호</strong> \r\n");
      out.write("                    2020-서울강남-0825\r\n");
      out.write("            </p>\r\n");
      out.write("            <p class=\"second-line\">\r\n");
      out.write("                <strong>주소</strong> \r\n");
      out.write("                    서울특별시 강남구 테헤란로 10길 9 그랑프리빌딩 5F\r\n");
      out.write("                <strong>대표번호</strong> \r\n");
      out.write("                    0000-0000\r\n");
      out.write("                <strong>이메일</strong>\r\n");
      out.write("                    we_love_cookingking@ckk.com \r\n");
      out.write("            </p>\r\n");
      out.write("            <p class=\"third-line\">\r\n");
      out.write("                <strong>(주)Cookingking</strong>\r\n");
      out.write("                    은 통신판매중개자이며 통신판매 당사자가 아닙니다. \r\n");
      out.write("                    따라서 클래스/개인간 거래 및 판매에 대하여 책임을 지지 않습니다.\r\n");
      out.write("            </p>        \r\n");
      out.write("            <p class=\"last-line\">\r\n");
      out.write("            <strong>Copyright © Cookingking. All Rights Reserved.</strong>\r\n");
      out.write("            </p>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("    ");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
