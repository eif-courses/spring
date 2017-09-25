/**
 * Created by Marius on 6/10/2017.
 */
myDate = new Date(2017, 09, 04);
toDate = new Date(2017, 12, 13);
var a = moment('2017-09-04');
var b = moment('2017-10-05');
var c = moment('2017-09-10');

$.getJSON("tasks/java/tasks.json", function (data) {
    var i = 0;
    //var currentDate = b.format('YYYY-MM-DD');
    var currentDate = moment().format("YYYY-MM-DD");
    $.each(data, function (key, val) {
        // Task deadline
        var m = moment(a);
        var d = moment(c);
        if(i <= 3){

            m.diff(b, 'days');
            m.add(7 * i, 'days');

            d.diff(b, 'days');
            d.add(7 * i, 'days'); // 0 1 2 3 4
        }
        if(i === 4){
            m.diff(b, 'days');
            m.add(7 * i, 'days');

            d.diff(b, 'days');
            d.add(7 * i+7, 'days'); // 0 1 2 3 4
        }
        if(i === 5){
            m.diff(b, 'days');
            m.add(7 * i+7, 'days');

            d.diff(b, 'days');
            d.add(7 * i+14, 'days'); // 0 1 2 3 4
        }
        if(i === 6){
            m.diff(b, 'days');
            m.add(7 * i+ 14, 'days');

            d.diff(b, 'days');
            d.add(7 * i+21, 'days'); // 0 1 2 3 4
        }
        // 3 paskutines uzduotys
        if(i === 7){
            m.diff(b, 'days');
            m.add(7 * i+21, 'days');
            d.diff(b, 'days');
            d.add(7 * i + 21, 'days'); // 0 1 2 3 4
        }
        if(i === 8){
            m.diff(b, 'days');
            m.add(7 * i + 21, 'days');
            d.diff(b, 'days');
            d.add(7 * i + 28, 'days'); // 0 1 2 3 4
        }
        if(i === 9){
            m.diff(b, 'days');
            m.add(7 * i + 28, 'days');
            d.diff(b, 'days');
            d.add(7 * i + 35, 'days'); // 0 1 2 3 4
        }
        $(".accordion").click(function () {
            this.classList.toggle("active");
            this.nextElementSibling.classList.toggle("show");
        });

        $("#Pratybos").append("<br/><button class='accordion' id='currentTask"+i+"'><b>" + (i + 1) + " užduotis.</b> (" + m.format('YYYY-MM-DD') + " iki " + d.format('YYYY-MM-DD') + "). " +
            val.head + "</button><div class='panel'>" +"<ul class='w3-ul' id='uzdjava"+i + "'>"+"<li><span style='color: midnightblue; font-weight: bold;'>TIKSLAS</span></li><li> " +val.aim + "</li><li><span style='color: midnightblue; font-weight: bold;'>UŽDAVINIAI</span></li></ul></div>");



        // einama uzduotis
        var currentTask = $("#currentTask"+i);

        if(currentDate >= m.format('YYYY-MM-DD') && currentDate <= d.format('YYYY-MM-DD') ){
            currentTask.css("border-left", 'solid 5px midnightblue');
            currentTask.css("background-color", 'rgb(230, 234, 241)');
        }

        var count = 0;
        // Punktai
        $.each(val.tasks, function (k, v) {
            $("#uzdjava"+i).append("<li class='w3-padding-16'>"+"<img src='images/tasks.png' id='tasks_image"+(count++) +"' class='w3-left w3-circle w3-margin-right' style='width:50px'><span>"+ v + "</span></li>");
        });

        $("#uzdjava"+i).append("<li>"+"<span style='color: midnightblue; font-weight: bold'>PAPILDOMA INFORMACIJA UŽDUOČIAI ATLIKTI</span></li>"+"<li><span>"+ val.example + "</span></li>");
        i++;
        $(".accordion").click(function () {
            $("img#tasks_image"+i+'.w3-left.w3-circle.w3-margin-right').attr('src', 'images/tasks.png');
            this.classList.toggle("active");
            this.nextElementSibling.classList.toggle("show");

        });
    });
    // Checkboxas uzduotims
    $('li.w3-padding-16').click(function () {
        var dd = $(this).css("background-color");
        if (dd === 'rgb(221, 221, 221)') {
            $(this).css("background-color", "white");
            $(this).css("color", "grey");
            $(this).find('img').attr('src','images/tasks.png')
        }
        else {
            $(this).css("background-color", "rgb(221, 221, 221)");
            $(this).css("color", "black");
            $(this).find('img').attr('src','images/completed.png')
         }
    });

});

$.getJSON("tasks/java/project.json", function (data) {
    var i = 0;
    var j = 0;
    $.each(data, function (key, val) {

        $("#Projektas").append("<ul class='w3-ul w3-border' id" + "=eilesNr" + i + ">" +
            '<li class="w3-grey"><span style="font-weight: bold">' + val.head + '</span></li>');
        $.each(val.tasks, function (k, v) {
            $("#eilesNr" + i).append("<li>" + v + "</li>");
            if(i === 0 && j === 0){
                $("#eilesNr" + i).append('<li class="w3-grey"><span style="font-weight: bold">' + "TEMŲ SĄRAŠAS" + '</span></li>');
                j = 50;
            }
        });
        $("#Projektas").append('</ul>');
        i++;
    });
});

$.getJSON("slides/java/slides.json", function (data) {
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