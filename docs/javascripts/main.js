function randomLinks(){

    var sidebarLinks = document.querySelectorAll("aside a.button");
    for(d = 0; d < sidebarLinks.length; d++)
    {
        var color = "#";
        for (k = 0; k < 3; k++) {
            color += ("0" + (Math.random()*230|0).toString(16)).substr(-2);
        }
        sidebarLinks[d].style.backgroundColor = color;
    }
}
$(document).ready(function(){






    $( "a#pi16a" ).click(function() {


       // $("h2.basic_h2#c_praktika").html('<a class="waves-effect waves-light btn yellow darken-2">PI16A GRUPĖ</a>');
            //$("h2.basic_h2#c_praktika").css('background-color','#f9a825');
        $("a#pi16a").css('background-color','#fbc02d');

        $("a#pi16b").css('background-color','transparent');
        $("a#pi16c").css('background-color','transparent');


    });
    $( "a#pi16b" ).click(function() {
       // $("h2.basic_h2#c_praktika").html('<a class="waves-effect waves-light btn green accent-4">PI16B GRUPĖ</a>');
       // $("h2.basic_h2#c_praktika").css('background-color','#00e676');
        $("a#pi16b").css('background-color','#00e676');
        $("a#pi16a").css('background-color','transparent');
        $("a#pi16c").css('background-color','transparent');

    });
    $( "#pi16c" ).click(function() {
      //  $("h2.basic_h2#c_praktika").html('<a class="waves-effect waves-light btn light-blue darken-1">PI16C GRUPĖ</a>');
       // $("h2.basic_h2#c_praktika").css('background-color','#ff5252');
        $("a#pi16c").css('background-color','#039be5');
        $("a#pi16b").css('background-color','transparent');
        $("a#pi16a").css('background-color','transparent');



    });

    $("a#mainas.tablinks").addClass("tablinks active");

    $('ul.tabs').tabs();
    randomLinks();


});
