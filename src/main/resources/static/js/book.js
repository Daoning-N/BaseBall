// 박스 시작
$('.button').click(function(){
    var $btn = $(this),
        $step = $btn.parents('.modal-body'),
        stepIndex = $step.index(),
        $pag = $('.modal-header span').eq(stepIndex);
  
    if(stepIndex === 0 || stepIndex === 1) { step1($step, $pag); }
    else { step3($step, $pag); }
  });
  
// 스텝 1
  function step1($step, $pag){
  console.log('step1');
    // animate the step out
    $step.addClass('animate-out');
    
    // animate the step in
    setTimeout(function(){
      $step.removeClass('animate-out is-showing')
           .next().addClass('animate-in');
      $pag.removeClass('is-active')
            .next().addClass('is-active');
    }, 600);
    
    // after the animation, adjust the classes
    setTimeout(function(){
      $step.next().removeClass('animate-in')
            .addClass('is-showing');
      
    }, 1200);
  }
  
// 스텝 2
function step2($step, $pag) {
  console.log('Step 2');

  // Animate the current step out
  $step.addClass('animate-out');

  // Animate the previous step in
  setTimeout(function() {
    $step.removeClass('animate-out is-showing')
         .prev().addClass('animate-in');
    $pag.removeClass('is-active')
         .prev().addClass('is-active');
  }, 600);

  // After the animation, adjust the classes
  setTimeout(function() {
    $step.prev().removeClass('animate-in')
         .addClass('is-showing');
  }, 1200);
}

// 스텝3
  function step3($step, $pag){
  console.log('3');
  
    // animate the step out
    $step.parents('.modal-wrap').addClass('animate-up');
  
    setTimeout(function(){
      $('.rerun-button').css('display', 'inline-block');
    }, 300);
  }
  
  $('.rerun-button').click(function(){
   $('.modal-wrap').removeClass('animate-up')
                    .find('.modal-body')
                    .first().addClass('is-showing')
                    .siblings().removeClass('is-showing');
  
    $('.modal-header span').first().addClass('is-active')
                            .siblings().removeClass('is-active');
   $(this).hide();
  });

// 뒤로가기 버튼
$('.back-button').click(function() {
  var $step = $(this).parents('.modal-body'),
      stepIndex = $step.index(),
      $pag = $('.modal-header span').eq(stepIndex);

  if (stepIndex === 2) { // Check if it's Step 3
    step2($step, $pag); // Call the step2 function to go back to Step 2
  } else if (stepIndex === 1) { // Check if it's Step 2
    step1($step, $pag); // Call the step1 function to go back to Step 1
  }
});
//   박스 끝

