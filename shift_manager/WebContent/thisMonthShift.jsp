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
		ここで提出したシフト表示機能を実装予定
		<div id='calendar'></div>
	 </div>
    <script>
//		ページロード時にFullCalendarの設定を行う。
      document.addEventListener('DOMContentLoaded', function() {
        var calendarEl = document.getElementById('calendar');

//		カレンダーの初期化処理 ＋　各種設定
        var calendar = new FullCalendar.Calendar(calendarEl, {
          plugins: [ 'interaction', 'dayGrid', 'timeGrid', 'bootstrap', 'momentTimezone'],
          locale: 'ja',
          navLinks: true,
          selectable: false, // カレンダー空白部分のドラッグ可能
          selectHelper: false, // これをtrueにすると範囲設定できます
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
          editable: false, // 編集可能設定
          slotEventOverlap: true // イベントの見た目を重ねて表示
        });

          calendar.render();
        });


      </script>
    </body>
  </html>