<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "s" uri = "/struts-tags" %>
<!DOCTYPE html>
<html>
  <head>
    <meta charset='utf-8' />
    <link href='./css/default.css' rel='stylesheet' />
    <link href='./css/default.date.css' rel='stylesheet' />
    <link href='./css/default.time.css' rel='stylesheet' />

	<script src="http://code.jquery.com/jquery-1.10.0.min.js"></script>
    <script src='./pickadate/picker.js'></script>
    <script src='./pickadate/picker.date.js'></script>
    <script src='./pickadate/picker.time.js'></script>
    <script src='./pickadate/legacy.js'></script>
    <script src='./pickadate/lang-ja.js'></script>
    <script src='./pickadate/main.js'></script>


  </head>
  <body>
	<section class="section">
	    <div class="section__block section__block--scoped">
	    <fieldset class="fieldset fieldset--demo">
	      <h3>pickadate.js 予約ページdemo</h3>
	        <div class="fieldset__wrapper">
	          <label> ■パートコード　</label><br />
	          <input id = 'code' type = 'text'><br />
	          <label> ■勤務希望日　 </label><br />
         	  <input id='date' class="fieldset__input js__datepicker" type="text" placeholder='クリックして日付を選択して下さい'></br></br>
	          <label> ■希望開始時間　</label><br />
	          <input id='start_time' class="fieldset__input js__datepicker" type="text" placeholder=クリックして時間を選択して下さい></br></br>
	          <label> ■希望終了時間　</label><br />
	          <input id='finish_time' class="fieldset__input js__datepicker" type="text" placeholder=クリックして時間を選択して下さい></br></br>

	          <button id="submit" class="fieldset__button button button--small">登録</button>
        	</div>
	        <div id="result"></div>      <!-- ボタン押下の結果を表示する -->
	    </fieldset>
	    </div>
<%-- 	    <s:form action = "NextMonthShiftConfirmAction"> --%>
	    	<p>全ての希望を入力し終わったら以下の申請ボタンを押して下さい。</p>
<%-- 	    	<s:submit value = "申請" /> --%>
			<button>申請</button>
			このボタンを押すと次のページに飛ぶ予定
<%-- 	    </s:form> --%>
  	</section>
  </body>
</html>