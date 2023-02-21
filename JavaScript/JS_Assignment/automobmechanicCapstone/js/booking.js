function handleFormSubmit(event) {
    event.preventDefault();
    window.location.href = "./booking-success.html";
    return false;
    };

    
var feedbackPopupIsSetup = false;
    function setupFeedbackPopup() {
        if (feedbackPopupIsSetup) {
            return;
          }
    var ratingPopup = document.getElementById("rating-popup");
    var ratingClose = document.getElementsByClassName("close")[0];
  
    var ratingForm = document.getElementsByTagName("form")[0];
    var ratingValue = document.getElementById("rating");
  
    var bookingConfirmation = document.getElementById("booking-confirmation");
    var giveFeedbackButton = bookingConfirmation.querySelector("button");
      var urlParams = new URLSearchParams(window.location.search);
    var name = urlParams.get("name");
    document.getElementById("name").innerHTML = name;
      giveFeedbackButton.addEventListener("click", function() {
      ratingPopup.style.display = "block";
      ratingPopup.scrollIntoView();
    });
      ratingClose.addEventListener("click", function() {
      ratingPopup.style.display = "none";
    });
  
    ratingForm.addEventListener("submit", function(event) {
      event.preventDefault();
        var rating = ratingValue.value;
        var thankYouMessage = document.createElement("p");
      thankYouMessage.innerHTML = "Thank you for the feedback.";
      ratingPopup.appendChild(thankYouMessage);
        setTimeout(function() {
        ratingPopup.style.display = "none";
      }, 2000);
    });
    feedbackPopupIsSetup = true;
        
}