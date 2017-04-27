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

    (function(d, s, id) {
        var js, fjs = d.getElementsByTagName(s)[0];
        if (d.getElementById(id)) return;
        js = d.createElement(s); js.id = id;
        js.src = "//connect.facebook.net/lt_LT/sdk.js#xfbml=1&version=v2.8&appId=336920023368615";
        fjs.parentNode.insertBefore(js, fjs);
    }(document, 'script', 'facebook-jssdk'));

    $('ul.tabs').tabs();
    randomLinks();

    document.getElementById("index").onclick = function() {
        window.location.href = "index.html";
    };
    document.getElementById("security").onclick = function() {
        window.location.href = "security.html";
    };
    document.getElementById("praktika").onclick = function() {
        window.location.href = "praktika.html";
    };

});
