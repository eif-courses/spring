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
        $("#Pratybos").append("<hr><button class='accordion'><b>" + (i + 1) + " užduotis.</b> (" + m.format('YYYY-MM-DD') + " iki " + d.format('YYYY-MM-DD') + "). " +
            val.head + "</button><div class='panel w3-border w3-white w3-medium'><br/>" +"<div class='w3-panel w3-border w3-white w3-medium'>" +val.aim + "</div>"+ "   <div id" + "=uzd" + i + "></div></div>");
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
            $("#uzd" + i).append("<div class='w3-panel w3-border w3-white w3-medium'>" + v + "</div>");
        });
        i++;
    });
});

$.getJSON("tasks/os/project.json", function (data) {
    var i = 0;
    $.each(data, function (key, val) {

        $("#Projektas").append("<ul class='collection basic_collection' id" + "=eilesNr" + i + ">" +
            '<li class="basic_h2_li"><h2 class="basic_h2">' + val.head + '</h2></li>');
        $.each(val.tasks, function (k, v) {
            $("#eilesNr" + i).append("<li class='collection-item'>" + v + "</li>");
        });
        $("#Projektas").append('</ul>');
        i++;
    });
});