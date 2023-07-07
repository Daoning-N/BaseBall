var $container = $(".slide_wrap"),
    $slideShow = $container.find(".slide_show"),
    $slideImg = $slideShow.find(".slide_img"),
    $slides = $slideImg.find(".slide"),
    $slideBtn = $container.find(".slide_btn"),
    $slideDot = $container.find(".slide_dot"),
    $slide_count = $container.find(".slide_count"),
    
    slideCount = $slides.length,
    currentIndex = 0,
    dot = "",
    timer = "";
    

//각 이미지 위치 잡기
$slides.each(function(i){
  $(this).css({ left: 100 * i +"%"});
  
  //var name = $(this).find("img").attr("alt");
  //dot += "<a href='#'>"+ name +"</a>";
  //console.log(name)
  dot += "<a href='#'>"+ ("0"+(i+1)) +"</a>";
    
});

//이미지 개수만큼 닷 표시
$slideDot.html(dot);

//이미지 움직이기
function gotoSlide(index){
  $slideImg.stop().animate({ left: -100 * index+"%" },300,"easeInSine");
  currentIndex = index;
  updateNav();
}

//업데이트 하기
function updateNav(){
  var countCurrent = $slide_count.find(".currentIndex"),
      countTotal = $slide_count.find(".slideCount");
  
  //이미지 개수 표시
  countCurrent.text("0"+ (currentIndex + 1));
  countTotal.text("0"+ slideCount);
  
  //활성화된 이미지한테 닷 활성화 표시
  $slideDot.find("a").removeClass("active").eq(currentIndex).addClass("active");
  
  //활성화된 이미지한테 클래스 추가하기
  $slides.removeClass("active").eq(currentIndex).addClass("active");
}

//버튼 클릭하기
$slideBtn.on("click","a",function(e){
  e.preventDefault();
  
  var nextIndex = (currentIndex + 1) % slideCount; //0 1 2 3 4 0 1 2 3 4 ~~
  var prevIndex = (currentIndex + (slideCount -1)) % slideCount; //0 4 3 2 1 0 4 3 2 1 ~~
  
  //console.log("nextIndex : " + nextIndex);
  console.log("prevIndex : " + prevIndex);
  
  if( $(this).hasClass("prev")){
    gotoSlide(prevIndex);
  } else {
    gotoSlide(nextIndex);
  }
});

//닷 메뉴 클릭 했을 때 이동하기
$slideDot.on("click","a",function(e){
  e.preventDefault();
  if( !$(this).hasClass("acitve") ){
    gotoSlide( $(this).index() );
  }
});

//타이머 설정하기
function startTimer(){
  timer = setInterval(function(){
    var nexIndex = (currentIndex + 1) % slideCount;
    gotoSlide(nexIndex);
  },2000);
}
startTimer();

//마우스 오버하면 타이머 멈추기
function stopTimer(){
  clearInterval(timer);
}

$container.on({
  mouseenter: stopTimer,
  mouseleave: startTimer
});

//첫 번째 이미지 슬라이드 활성화
gotoSlide(currentIndex);