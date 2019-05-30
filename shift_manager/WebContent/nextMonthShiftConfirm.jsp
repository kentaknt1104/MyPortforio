<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset='utf-8' />

	<link href='https://use.fontawesome.com/releases/v5.0.6/css/all.css' rel='stylesheet'>
	<link href='https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css' rel='stylesheet' />

    <link href='./fullcalendar/core/main.css' rel='stylesheet' />
    <link href='./fullcalendar/daygrid/main.css' rel='stylesheet' />
    <link href='./fullcalendar/timegrid/main.css' rel = "stylesheet" />
    <link href='./fullcalendar/bootstrap/main.css' rel = "stylesheet" />

	<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
    <script src='./fullcalendar/core/main.js'></script>
    <script src='./fullcalendar/core/ja.js'></script>
    <script src='./fullcalendar/daygrid/main.js'></script>
    <script src = "./fullcalendar/timegrid/main.js"></script>
    <script src = "./fullcalendar/interaction/main.js"></script>
    <script src = "./fullcalendar/bootstrap/main.js"></script>



  </head>
  <body>

	 <div id = "main">
	 <div id = "top">
	 	<h3>下記のカレンダーで来月の予定を確認して下さい。</h3>
	 	<div id = "howto">
	 		<h4>使用方法</h4>
	 		1. 登録されたシフトを確認して下さい。
	 		2. 間違っていたり、直したい場合はドラッグして好きな日時に変更して下さい。
	 		3. 全ての確認が終わったらシフトの登録ボタンを押して下さい。
	 	</div>
	 </div>
    <div id='calendar'></div>
	 </div>
    <script>

      document.addEventListener('DOMContentLoaded', function() {
        var calendarEl = document.getElementById('calendar');


        var calendar = new FullCalendar.Calendar(calendarEl, {
          plugins: [ 'interaction', 'dayGrid', 'timeGrid', 'bootstrap', 'momentTimezone', 'list' ],
          locale: 'ja',
          navLinks: true,
          selectable: true, // カレンダー空白部分のドラッグ可能
          selectHelper: true, // これをtrueにすると範囲設定できます
          selectMirror: true,
          themeSystem: 'bootstrap',
          header: {
              left: 'title',
              center: 'today, dayGridMonth,timeGridWeek,timeGridDay',
              right:  'prev,next'
          },
          footer: {
        	  left: 'registButton',
        	  center: '',
        	  right: ''
          },
          timeFormat: 'HH:mm', // 時間表示フォーマット
          timezone: 'Asia/Tokyo', // タイムゾーン設定
          eventLimit: true, // イベント増えた時にリンクボタン表示
          editable: true, // 編集可能設定
          slotEventOverlap: true, // イベントの見た目を重ねて表示
          selectMinDistance: 1, // 一定距離動いた時にドラッグと認識させる

//           ドラッグで登録したシフトを動かし変更可能にする機能を実装予定

          customButtons: {
//         	  このボタンを押すと確定する予定
        	  registButton: {
        		  text: 'シフトの登録',
        		  click: function() {
        			  var result = confirm('登録しますか？');
//			  ここで再送する


        		  }
        	  }
          }
        });
        calendar.render();
      });


    </script>
  </body>
</html>