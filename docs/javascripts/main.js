
var main = document.getElementById('main');
main.className = "active";
var blokas = document.getElementById("Pratybos");
blokas.style.display = "block";
function openCity(evt, cityName) {
    main.className = main.className.replace("active", "");
    // Declare all variables
    var i, tabcontent, tablinks;
    // Get all elements with class="tabcontent" and hide them
    tabcontent = document.getElementsByClassName("tabcontent");
    for (i = 0; i < tabcontent.length; i++) {
        tabcontent[i].style.display = "none";
    }
    // Get all elements with class="tablinks" and remove the class "active"
    tablinks = document.getElementsByClassName("tablinks");
    for (i = 0; i < tablinks.length; i++) {
        tablinks[i].className = tablinks[i].className.replace(" active", "");
    }
    // Show the current tab, and add an "active" class to the link that opened the tab
    document.getElementById(cityName).style.display = "block";
    evt.currentTarget.className += " active";
}
$(document).ready(function(){

    var tab_color = 'red';
    var tabs_background_color = 'transparent';
    var text_min_size = '12pt';
    var text_max_size = '20pt';
    var other_tabs_color = 'transparent';
    var groups = ["pi16a", "pi16b", "pi16c", "pi16d", "pi16e"];


    $("#tabs-swipe-demo").css('background-color', tabs_background_color);

    $.each(groups, function( i, v ) {
        $( "a#"+v).click(function() {
            $.each(groups, function (index, value) {
                if (v  === value) {
                    $("a#" + value).css('background-color', tab_color);
                    $("a#" + value).css('font-size', text_max_size);
                }
                else {
                    $("a#" + value).css('background-color', other_tabs_color);
                    $("a#" + value).css('font-size', text_min_size);
                }
            });
        });
    });

    $("a#mainas.tablinks").addClass("tablinks active");

    $('ul.tabs').tabs();

});
/*
function randomLinks(){

    var sidebarLinks = document.querySelectorAll("aside a.button");
    for(d = 0; d < sidebarLinks.length; d++)
    {
        var color = "#";
        for (k = 0; k < 3; k++) {
            color += ("0" + (Math.random()*230|0).toString(16)).substr(-2);
        }
        sidebarLinks[d].style.backgroundColor = "white";
    }
}*/