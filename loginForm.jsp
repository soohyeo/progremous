<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.8.2/css/all.min.css">
    <style type="text/css">
    	*{ box-sizing: border-box; }
    	.title{
    		font-size: 48px;
    		margin: 40px 0 32px 0;
    		text-align:center;
    		height: 10px;
    	}
    	form{
    		width: 400px;
    		height: 480px;
    		display: flex;
    		flex-direction: column;
    		align-items: center;
    		position: absolute;
    		top: 50%;
    		left: 50%;
    		border: 2px solid rgb(255,196,255);
    		border-radius: 20px;
    		transform: translate(-50%,-50%);
    	}
    	.msg{
    		height: 30px;
    		text-align: center;
    		font-size: 16px;
    		color:red;
    		margin-bottom: 20px;
    	}
    	label{
    		width: 300px;
    		height: 30px;
    		margin-top:4px;
    	
    	}
    	.input-field{
    		width: 300px;
    		height: 40px;
    		border: 1px solid rgb(255,196,255);
    		border-radius:5px;
    		padding: 0 10px;
    		margin-bottom: 10px;
    		line-height: 1px;
    		
    	}

    	button{
    		
    		background-color: rgb(255,196,255);
    		color: #202020;
    		width: 300px;
    		height: 50px;
    		font-size:24px;
    		border: none;
    		border-radius: 10px;
    		magin: 20px 0 30px 0;
    	}
    	
    </style>
    <title>로그인</title>
</head>
<body>
    <form action="<c:url value="/index/storage"/>" method="post"
    		onsubmit="return formCheck(this)">
       <div class="title">OTTT 로그인</div>
       <br/><br/>
       <div id="msg" class="msg"></div>
       
       <label>ID</label>
       <input type="text" name="id" class="input-field" 
       		placeholder="8~12자리의 영대소문자,숫자 조합으로 작성해주세요." autofocus />
    	
       <label>PASSWORD</label>
       <input type="password" name="pwd" class="input-field" 
       		placeholder="8~12자리의 영대소문자,숫자 조합으로 작성해주세요." />
      
       <br/>
       <button>로그인</button>
       <br/>
       <br/>
    </form>
    <script type="text/javascript">
    	function formCheck(frm) {
			/*alert("test")*/
			let msg = ''
		
    		if(frm.id.value.length < 8){
    			setMessage('아이디가 없거나 혹은 틀렸습니다.', frm.id)		
    			return false;
    		}
			if(frm.pwd.value.length < 8){
    			setMessage('비밀번호가 없거나 혹은 틀렸습니다.', frm.pwd)		
    			return false;
    		}
			
			return true;
    	}
    	
    	function setMessage(msg, element){
    		document.getElementById("msg").innerHTML 
    				= `<i class="fa fa-book">${'${msg}'}</i>`
    		if (element){
    			element.select()
    		}
    	}
    </script>
</body>
</html>