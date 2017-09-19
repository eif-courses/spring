
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







    var tab_color = 'transparent';
    var tabs_background_color = 'transparent';
    var text_min_size = '14pt';
    var text_max_size = '14pt';
    var other_tabs_color = 'transparent';
    var groups = ["pi16a", "pi16b", "pi16c", "pi16d", "pi16e"];




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

    $("aside#sidebar").prepend(' <iframe src="https://www.facebook.com/plugins/like.php?locale=en_US&href=https%3A%2F%2Feif-courses.github.io%2F&width=250&layout=button_count&action=like&size=large&show_faces=false&share=true&height=46&appId=795898857225737" width="250" height="46" style="border:none;overflow:hidden" scrolling="no" frameborder="0" allowTransparency="true"></iframe>');

    $("aside#sidebar").prepend(' <h3 class="pavadinimas" style="color: midnightblue; font-family: Raleway, sans-serif; font-size: 16px; font-weight: 800; line-height: 25px; margin: 3px 0px 10px;">NAUDINGOS NUORODOS</h3>');


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