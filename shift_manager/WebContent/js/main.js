/**
 * パートコード発行時のボタン関連
 */
function backAction() {
	document.getElementById("createForm").action = "CreateCodeAction";
}

function registAction() {
	document.getElementById("createForm").action = "CreateCodeCompleteAction";
}