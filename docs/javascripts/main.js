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
}

$(document).ready(function(){

    var tab_color = '#c6ff00';
    var text_min_size = '12pt';
    var text_max_size = '20pt';
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

    $('ul.tabs').tabs();

    $('.tooltipped').tooltip({delay: 50});

   // randomLinks();

});
