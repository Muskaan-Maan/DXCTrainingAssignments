function setTimer() {
    var countDownDate = new Date().getTime() + (10 * 60 * 1000);
    var x = setInterval(function() {
      var now = new Date().getTime();
      var distance = countDownDate - now;
      var minutes = Math.floor((distance % (1000 * 60 * 60)) / (1000 * 60));
      var seconds = Math.floor((distance % (1000 * 60)) / 1000);
      document.getElementById("counter").innerHTML = minutes + "m " + seconds + "s ";
      if (distance < 0) {
        clearInterval(x);
        document.getElementById("counter").innerHTML = "Offer Expired";
      }
    }, 1000);
  
    return x;
  }

function bookService() {
    localStorage.setItem('selectedService', 'Preventive maintenance service');
    location.assign('./booking.html');
  }
  function goBack() {
    window.location.href = './services.html';   
  }