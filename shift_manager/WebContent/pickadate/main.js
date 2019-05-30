/**
 * カレンダー関連のcodeです。
 */
$(function() {

	//datepicker表示イベント
	$('#date').pickadate({
		formatSubmit: 'yyyy/mm/dd',
		hiddenName: true
	});

	//timepicker表示イベント
	$('#start_time').pickatime({
		format : 'HH : i',	//24h表記
		interval : 30,		//表示間隔
		min : [00,00],		//希望開始時間
		max : [23,30],		//希望終了時間
		formatSubmit: 'HH:i',
		hiddenName: true
	});
	$('#finish_time').pickatime({
		format : 'HH : i',	//24h表記
		interval : 30,		//表示間隔
		min : [00,00],		//希望開始時間
		max : [23,30],		//希望終了時間
		formatSubmit: 'HH:i',
		hiddenName: true
	});
	//申請ボタン押下イベント
	$('#submit').click(onClickSubmit);

	//申請ボタン押下処理
	function onClickSubmit() {
		$('#submit_result').remove();
		var date0 = $('#date').val();
		var start0 = $('#start_time').val();
		var end0 = $('#finish_time').val();

		if (date0 != '' && start0 != '' && end0 != '') {

//		 TODO シフトをサーバに送信(JSON形式で送信予定）
//		 NextMonthShiftConfirmActionに送り、DAOから送信予定。

			//登録完了メッセージ
			$('#result').after('<div id = "submit_result" class = "section__block section__block--notification"><p><strong>' + date + start + '~' + end + '</strong><br>申請を受付ました。</p></div>');

		} else {
			//登録失敗メッセージ
			$('#result').after('<div id = "submit_result" class = "section__block section__block--notification-red"><p>希望日・希望時間を選択して下さい。</p></div>');
		}
	}
});