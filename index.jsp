<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.8.2/css/all.min.css">
    <style type="text/css">
@charset "UTF-8";

:root {
  --text-color: #33ff33;
  --background-color: blue;
  --accent-color: #000000;
  --bodybackground-color: #202020;
}

body { 
  margin: 0;
  background-color: var(--bodybackground-color);
  font-family: 'STIX Two Math';
  
}

a {
  text-decoration: none;
  color: var(--text-color);
}

.navbar {
  display: flex;
  justify-content: space-between;
  align-items: center;
  background-color: var(--background-color);
  padding: 8px 14px;
  font-family: 'STIX Two Math';
  font-weight: 700;
}
.navbar__logo {
    position: sticky;
    font-size: 56px;
}

.navbar__menu {
  list-style: none;
  display: flex;
  margin: 0;
  padding-left: 0;
}

.navbar__menu li {
  padding: 12px 30px;
}
.navbar__menu li:hover {
  background-color: var(--accent-color);
  border-radius: 3px;
}
.navbar__icons {
  list-style: none;
  display: flex;
  color: var(--icons-color);
  padding-left: 0;
}

.navbar__icons li {
  padding: 8px 12px;
  margin: 0;
}
.navbar__toggleBtn {
  display: none;
  color: var(--accent-color);
  position: absolute;
  right: 30px;
  font-size: 20px;
}
.btnLogin {
    margin: 0;
    color: #ed8b9e;
    border: 1px solid #202020;
    background-color: #121212;
  }
/*768 이하로 줄어들면 내비바*/
@media screen and (max-width: 768px) {
  .navbar {
    flex-direction: column;
    align-items: flex-start;
    padding: 8px 24px;
  }
  .navbar__menu {
    display: none;
    flex-direction: column;
    align-items: center;
    width: 100%;
  }
  
  .navbar__menu li {
    width: 100%;
    text-align: center;
  }
  .navbar__icons {
    justify-content: center;
    width: 100%;
  }
  .navbar__toggleBtn {
    display: block;
  }
}
.navbar__menu.active,
.navbar__icons.active {
  display: flex;
}
.user-id {
   position: fixed;
   top: 20%;
   right: 50%;
   font-size: 55px;
   font-weight: bold;
   color: rgb(255,196,255);
}
    	
    </style>
</head>
<body>
		<body>
       <header>
        <nav class="navbar">

            <div class="navbar__logo">
                <a href="">OTTT</a>
            </div>

            <ul class="navbar__menu">
                <li><a href="#">영화</a></li>
                <li><a href="#">드라마</a></li>
                <li><a href="#">애니메이션</a></li>
                <li><a href="#">예능</a></li>
                <li><a href="#">게시판</a></li>
                <li><button class="btnLogin"><a href="login.html">로그인</a></button></li>

            </ul>
            <a href="#" class="navbar__toggleBtn">
                <i class="fas fa-bars" aria-hidden="true"></i>
            </a>
        </nav>
    </header>
    <section>
       <div class="user-id"> ${param.id} 님 OTTT세상에 오신것을 환영합니다.
       </div>
       
   </section>
</body>
</html>
</body>
</html>