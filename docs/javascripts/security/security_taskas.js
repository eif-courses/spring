/**
 * Created by Marius on 6/10/2017.
 */





$.getJSON("tasks/security/project.json", function (data) {
    var i = 0;
    var j = 0;
    $.each(data, function (key, val) {

        $("#Pratybos").append("<ul class='w3-ul w3-border' id" + "=eilesNr" + i + ">" +
            '<li class="w3-grey"><span style="font-weight: bold">' + val.head + '</span></li>');
        $.each(val.tasks, function (k, v) {
            $("#eilesNr" + i).append("<li>" + v + "</li>");
          //  if(i === 0 && j === 0){
            //    $("#eilesNr" + i).append('<li class="w3-grey"><span style="font-weight: bold">' + "TEMŲ SĄRAŠAS" + '</span></li>');
              //  j = 50;
           // }
        });
        $("#Pratybos").append('</ul>');
        i++;
    });
});







$.getJSON("slides/security/slides.json", function (data) {
    var i = 1;
    $.each(data, function (key, val) {
        $("#slideLinks").append('<li class="tab col s3">' +
            '<a id="' + val.name + '" ' + ' href="' + "#" + val.click + '">' + i + "</a></li>");
        $("#" + val.name).click(function () {
            $("#slideContent").append('<div id="' + val.click + '" class="col s12"></div>');
            $("#" + val.click).html("" + val.href);
        });
        i++;
    });
});
$("#uzkrauti").click(function () {
    $("#pirma").trigger('click');
});
