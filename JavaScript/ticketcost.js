var seats = 7;
var costperticket = 9;
var discount = 0;

document.writeln("Your Ticket details <br>");

if(seats <= 2){
     
     document.writeln("Ticket cost is : $" + costperticket + "<br>");

}else if(seats >= 5){

      document.writeln("Booking is not allowed <br>")

}else if(seats == 3){

    var dis1 = 5;
    var dis2 = 7;
    var dis3 = 9;

    var discost1 = costperticket - (costperticket * (dis1/100));
    var discost2 = costperticket - (costperticket * (dis2/100));
    var discost3 = costperticket - (costperticket * (dis3/100));

    let total = discost1 + discost2 + discost3;

    document.writeln("Ticket for Customer 1 gets " + dis1 + "% discount!, Cost is : $" + discost1 + "<br>");
    document.writeln("Ticket for Customer 2 gets " + dis2 + "% discount!, Cost is : $" + discost2 + "<br>");
    document.writeln("Ticket for Customer 3 gets " + dis3 + "% discount!, Cost is : $" + discost3 + "<br>");



    document.writeln("For " + seats + " tickets, you need to pay: $" + total + " instead of $" + costperticket * seats + "<br>");

  
} else if(seats == 4){

    var dis1 = 5;
    var dis2 = 7;
    var dis3 = 9;
    var dis4 = 11;

    var discost1 = costperticket - (costperticket * (dis1/100));
    var discost2 = costperticket - (costperticket * (dis2/100));
    var discost3 = costperticket - (costperticket * (dis3/100));
    var discost4 = costperticket - (costperticket * (dis4/100));

    let total = discost1 + discost2 + discost3 + discost4;

    document.writeln("Ticket for Customer 1 gets " + dis1 + "% discount!, Cost is : $" + discost1 + "<br>");
    document.writeln("Ticket for Customer 2 gets " + dis2 + "% discount!, Cost is : $" + discost2 + "<br>");
    document.writeln("Ticket for Customer 3 gets " + dis3 + "% discount!, Cost is : $" + discost3 + "<br>");
    document.writeln("Ticket for Customer 4 gets " + dis4 + "% discount!, Cost is : $" + discost4 + "<br>");


    document.writeln("For " + seats + " tickets, you need to pay: $" + total + " instead of $" + costperticket * seats + "<br>");

}

document.writeln("Try the code with different values for the number of seats.")