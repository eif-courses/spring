/**
 * Created by Marius on 6/10/2017.
 */
myDate = new Date(2016, 12, 02);
toDate = new Date(2016, 12, 13);
var a = moment('2017-01-16');
var b = moment('2017-03-24');
var c = moment('2017-01-20');

$.getJSON("tasks/os/tasks.json", function (data) {
    var i = 0;
    $.each(data, function (key, val) {
        // Task deadline
        var m = moment(a);
        m.diff(b, 'days');
        m.add(7 * i, 'days');
        var d = moment(c);
        d.diff(b, 'days');
        d.add(7 * i, 'days'); // 0 1 2 3 4
        $(".accordion").click(function () {
            this.classList.toggle("active");
            this.nextElementSibling.classList.toggle("show");
        });
        $("#Pratybos").append("<br/><button class='accordion'><b>" + (i + 1) + " užduotis.</b> (" + m.format('YYYY-MM-DD') + " iki " + d.format('YYYY-MM-DD') + "). " +
            val.head + "</button><div class='panel'>" +"<ul class='w3-ul' id='operacines_sistemos"+i + "'>"+"<li class='w3-padding-16'>"+"<span class='nuoroda'>Tikslas!<br/></span>" +val.aim + "</li></ul></div>");
        $(".accordion").click(function () {
            this.classList.toggle("active");
            this.nextElementSibling.classList.toggle("show");
        });
        // Checkboxas uzduotims
        $('.rectangle-list a').click(function () {
            var dd = $(this).css("background-color");
            if (dd == 'rgb(255, 255, 0)') {
                $(this).css("background-color", "#ddd");
                $(this).css("color", "black");
            }
            else {
                $(this).css("background-color", "yellow");
                $(this).css("color", "black");
            }
        });
        // Punktai
        $.each(val.tasks, function (k, v) {
            $("#operacines_sistemos"+i).append("<li class='w3-padding-16'>"+"<img src='images/tasks.png' class='w3-left w3-circle w3-margin-right' style='width:50px'><span>"+ v + "</span></li>");
        });
        $("#operacines_sistemos"+i).append("<li class='w3-padding-16'>"+"<span class='nuoroda'>Pavyzdys!<br/></span>"+"<span>"+ val.example + "</span></li>");
        i++;
    });
});

$.getJSON("tasks/os/project.json", function (data) {
    var i = 0;
    $.each(data, function (key, val) {

        $("#Projektas").append("<ul class='w3-ul w3-border' id" + "=eilesNr" + i + ">" +
            '<li><span style="font-weight: bold">' + val.head + '</span></li>');
        $.each(val.tasks, function (k, v) {
            $("#eilesNr" + i).append("<li>" + v + "</li>");
        });
        $("#Projektas").append('</ul>');
        i++;
    });
});