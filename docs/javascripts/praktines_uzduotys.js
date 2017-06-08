
$.getJSON("tasks/praktika/tasksA.json", function (data) {
    var i = 0;
    $.each(data, function (key, val) {

        $(".accordion").click(function () {
            this.classList.toggle("active");
            this.nextElementSibling.classList.toggle("show");
        });
        $("#test-swipe-1").append("<hr><button class='accordion'><b>" + (i + 1) + " užduotis.</b> "  +
            val.head + "</button><div class='panel w3-border w3-white w3-medium'><br/>" +"<div class='w3-panel w3-border w3-white w3-medium'>" +val.aim + "</div>"+ "   <div id" + "=uzdavinysA" + i + "></div></div>");
        $(".accordion").click(function () {
            this.classList.toggle("active");
            this.nextElementSibling.classList.toggle("show");
        });

        // Punktai
        $.each(val.tasks, function (k, v) {
            $("#uzdavinysA" + i).append("<div class='w3-panel w3-border w3-white w3-medium'>" + v + "</div>");
        });
        i++;
    });
});


$.getJSON("tasks/praktika/tasksB.json", function (data) {
    var i = 0;
    $.each(data, function (key, val) {

        $(".accordion").click(function () {
            this.classList.toggle("active");
            this.nextElementSibling.classList.toggle("show");
        });
        $("#test-swipe-2").append("<hr><button class='accordion'><b>" + (i + 1) + " užduotis.</b> " +
            val.head + "</button><div class='panel w3-border w3-white w3-medium'><br/>" +"<div class='w3-panel w3-border w3-white w3-medium'>" +val.aim + "</div>"+ "   <div id" + "=uzdavinysB" + i + "></div></div>");    $(".accordion").click(function () {
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
            $("#uzdavinysB" + i).append("<div class='w3-panel w3-border w3-white w3-medium'>" + v + "</div>");
        });
        i++;
    });
});


$.getJSON("tasks/praktika/tasksC.json", function (data) {
    var i = 0;
    $.each(data, function (key, val) {

        $(".accordion").click(function () {
            this.classList.toggle("active");
            this.nextElementSibling.classList.toggle("show");
        });
        $("#test-swipe-3").append("<hr><button class='accordion'><b>" + (i + 1) + " užduotis.</b> "+
            val.head + "</button><div class='panel w3-border w3-white w3-medium'><br/>" +"<div class='w3-panel w3-border w3-white w3-medium'>" +val.aim + "</div>"+ "   <div id" + "=uzdavinysC" + i + "></div></div>");
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
            $("#uzdavinysC" + i).append("<div class='w3-panel w3-border w3-white w3-medium'>" + v + "</div>");
        });
        i++;
    });
});

$.getJSON("tasks/praktika/tasksD.json", function (data) {
    var i = 0;
    $.each(data, function (key, val) {

        $(".accordion").click(function () {
            this.classList.toggle("active");
            this.nextElementSibling.classList.toggle("show");
        });
        $("#test-swipe-4").append("<hr><button class='accordion'><b>" + (i + 1) + " užduotis.</b> "+
            val.head + "</button><div class='panel w3-border w3-white w3-medium'><br/>" +"<div class='w3-panel w3-border w3-white w3-medium'>" +val.aim + "</div>"+ "   <div id" + "=uzdavinysD" + i + "></div></div>");
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
            $("#uzdavinysD" + i).append("<div class='w3-panel w3-border w3-white w3-medium'>" + v + "</div>");
        });
        i++;
    });
});

















$.getJSON("tasks/praktika/tasksEN.json", function (data) {
    var i = 0;
    $.each(data, function (key, val) {

        $(".accordion").click(function () {
            this.classList.toggle("active");
            this.nextElementSibling.classList.toggle("show");
        });
        $("#test-swipe-5").append("<hr><button class='accordion'><b>" + (i + 1) + " užduotis.</b> " +
            val.head + "</button><div class='panel w3-border w3-white w3-medium'><br/>" +"<div class='w3-panel w3-border w3-white w3-medium'>" +val.aim + "</div>"+ "   <div id" + "=uzdavinysEN" + i + "></div></div>");
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
            $("#uzdavinysEN" + i).append("<div class='w3-panel w3-border w3-white w3-medium'>" + v + "</div>");
        });
        i++;
    });
});








