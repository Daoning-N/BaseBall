//더보기 기능 구현
$(document).ready(function(){
    $("#row>div").hide(); //div 모두 숨김
    $("#row>div").slice(0,15).show(); // 0~15번째까지 15개만 보여줌
})

function more(){
    $("#row>div").slice(15,30).show();
    //more 함수는 16번째부터 30번째까지 보여줌
}