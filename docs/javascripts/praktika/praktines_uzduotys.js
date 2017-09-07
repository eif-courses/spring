
$.getJSON("tasks/praktika/tasksA.json", function (data) {
    var i = 0;
    $.each(data, function (key, val) {

        $(".accordion").click(function () {
            this.classList.toggle("active");
            this.nextElementSibling.classList.toggle("show");
        });
        $("#test-swipe-1").append("<br/><button class='accordion'><b>" + (i + 1) + " užduotis.</b> "  +
            val.head + "</button><div class='panel'>" +"<ul class='w3-ul' id='uzduotysA"+i + "'>"+"<li class='w3-padding-16'>"+"<li><span style='color: midnightblue; font-weight: bold;'>UŽDUOTIES TIKSLAS<br/></span>" +val.aim + "</li></li></ul></div>");
        $(".accordion").click(function () {
            this.classList.toggle("active");
            this.nextElementSibling.classList.toggle("show");
        });

        // Punktai
        $.each(val.tasks, function (k, v) {
            $("#uzduotysA"+i).append("<li class='w3-padding-16'>"+"<img src='images/tasks.png' class='w3-left w3-circle w3-margin-right' style='width:50px'><span>"+ v + "</span></li>");
        });
        $("#uzduotysA"+i).append("<li class='w3-padding-16'>"+"<span style='color: midnightblue; font-weight: bold'>PAPILDOMA INFORMACIJA<br/></span>"+"<span>"+ val.example + "</span><hr/></li>");
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
        $("#test-swipe-2").append("<br/><button class='accordion'><b>" + (i + 1) + " užduotis.</b> " +
            val.head + "</button><div class='panel'>" +"<ul class='w3-ul' id='uzduotysB"+i + "'>"+"<li class='w3-padding-16'>"+"<li><span style='color: midnightblue; font-weight: bold;'>UŽDUOTIES TIKSLAS<br/></span>" +val.aim + "</li></li></ul></div>");
        $(".accordion").click(function () {
            this.classList.toggle("active");
            this.nextElementSibling.classList.toggle("show");
        });
        // Punktai
        $.each(val.tasks, function (k, v) {
            $("#uzduotysB"+i).append("<li class='w3-padding-16'>"+"<img src='images/tasks.png' class='w3-left w3-circle w3-margin-right' style='width:50px'><span>"+ v + "</span></li>");
        });
        $("#uzduotysB"+i).append("<li class='w3-padding-16'>"+"<span style='color: midnightblue; font-weight: bold'>PAPILDOMA INFORMACIJA<br/></span>"+"<span>"+ val.example + "</span><hr/></li>");
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
        $("#test-swipe-3").append("<br/><button class='accordion'><b>" + (i + 1) + " užduotis.</b> "+
            val.head + "</button><div class='panel'>" +"<ul class='w3-ul' id='uzduotysC"+i + "'>"+"<li class='w3-padding-16'>"+"<li><span style='color: midnightblue; font-weight: bold;'>UŽDUOTIES TIKSLAS<br/></span>" +val.aim + "</li></li></ul></div>");
        $(".accordion").click(function () {
            this.classList.toggle("active");
            this.nextElementSibling.classList.toggle("show");
        });

        // Punktai
        $.each(val.tasks, function (k, v) {
            $("#uzduotysC"+i).append("<li class='w3-padding-16'>"+"<img src='images/tasks.png' class='w3-left w3-circle w3-margin-right' style='width:50px'><span>"+ v + "</span></li>");
        });
        $("#uzduotysC"+i).append("<li class='w3-padding-16'>"+"<span style='color: midnightblue; font-weight: bold'>PAPILDOMA INFORMACIJA<br/></span>"+"<span>"+ val.example + "</span><hr/></li>");
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
        $("#test-swipe-4").append("<br/><button class='accordion'><b>" + (i + 1) + " užduotis.</b> "+
            val.head + "</button><div class='panel'>" +"<ul class='w3-ul' id='uzduotysd"+i + "'>"+"<li class='w3-padding-16'>"+"<li><span style='color: midnightblue; font-weight: bold;'>UŽDUOTIES TIKSLAS<br/></span>" +val.aim + "</li></li></ul></div>");
        $(".accordion").click(function () {
            this.classList.toggle("active");
            this.nextElementSibling.classList.toggle("show");
        });

        // Punktai
        $.each(val.tasks, function (k, v) {
            $("#uzduotysd"+i).append("<li class='w3-padding-16'>"+"<img src='images/tasks.png' class='w3-left w3-circle w3-margin-right' style='width:50px'><span>"+ v + "</span></li>");
        });

            $("#uzduotysd"+i).append("<li class='w3-padding-16'>"+"<span style='color: midnightblue; font-weight: bold'>PAPILDOMA INFORMACIJA<br/></span>"+"<span>"+ val.example + "</span><hr/></li>");

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
        $("#test-swipe-5").append("<br/><button class='accordion'><b>" + (i + 1) + " užduotis.</b> " +
            val.head + "</button><div class='panel'>" +"<ul class='w3-ul' id='uzduotysEN"+i + "'>"+"<li class='w3-padding-16'>"+"<li><span style='color: midnightblue; font-weight: bold;'>UŽDUOTIES TIKSLAS<br/></span>" +val.aim + "</li></li></ul></div>");
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
            $("#uzduotysEN"+i).append("<li class='w3-padding-16'>"+"<img src='images/tasks.png' class='w3-left w3-circle w3-margin-right' style='width:50px'><span>"+ v + "</span></li>");
        });

        $("#uzduotysEN"+i).append("<li class='w3-padding-16'>"+"<span style='color: midnightblue; font-weight: bold'>PAPILDOMA INFORMACIJA<br/></span>"+"<span>"+ val.example + "</span><hr/></li>");
        i++;
    });
});








