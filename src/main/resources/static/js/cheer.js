// 리스트
'use strict';

$(document).on('click', '.accordion-list .accordion-item > a', function(e){
  e.preventDefault();
  var $this = $(this);
  var target = $this.parent();
  var description = $this.siblings('.accordion-desc');
  var other = target.siblings('.accordion-item');
  var otherDescription = other.find('.accordion-desc');
  accordionToggle(target, description, other, otherDescription);
});

function accordionToggle(target, description, other, otherDescription){
  if (target.hasClass('active')) {
    target.removeClass('active');
    description.stop().slideUp(300);
  } else {
    target.addClass('active');
    description.stop().slideDown(300);
  }

  if (other && otherDescription) {
    other.removeClass('active');
    otherDescription.stop().slideUp(300);
  }
};