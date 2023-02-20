var seats = 5;
var costperticket = 9;
var discount = 5;
var total = 0;

document.writeln("Your Ticket details <br>");

if(seats <= 2){
     
    document.writeln("Ticket cost is : $" + costperticket + "<br>");

}else if(seats >= 5){

     document.writeln("Booking is not allowed <br>")

}else if(seats > 2 && seats < 5){

    for(var customer = 1; customer <= seats; customer++){

        var discost = costperticket - (costperticket * (discount/100));

        document.writeln("Ticket for Customer " + customer + " gets " + discount + "% discount!, Cost is : $" + discost + "<br>");

        discount += 2;

        total += discost;

    }

    document.writeln("For " + seats + " tickets, you need to pay: $" + total + " instead of $" + costperticket * seats + "<br>");
}


document.writeln("Try the code with different values for the number of seats.");