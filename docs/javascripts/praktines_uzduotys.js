
$.getJSON("tasks/praktika/tasksA.json", function (data) {
    var i = 0;
    $.each(data, function (key, val) {

        $(".accordion").click(function () {
            this.classList.toggle("active");
            this.nextElementSibling.classList.toggle("show");
        });
        $("#test-swipe-1").append("<hr><button class='accordion'><b>" + (i + 1) + " užduotis.</b> "  +
            val.head + "</button><div class='panel'><br/>" + val.aim + "<ol class='rectangle-list' id" + "=uzdavinysA" + i + "></ol></div>");
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
            $("#uzdavinysA" + i).append("<li><a>" + v + "</a></li>");
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
            val.head + "</button><div class='panel'><br/>" + val.aim + "<ol class='rectangle-list' id" + "=uzdavinysB" + i + "></ol></div>");
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
            $("#uzdavinysB" + i).append("<li><a>" + v + "</a></li>");
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
            val.head + "</button><div class='panel'><br/>" + val.aim + "<ol class='rectangle-list' id" + "=uzdavinysC" + i + "></ol></div>");
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
            $("#uzdavinysC" + i).append("<li><a>" + v + "</a></li>");
        });
        i++;
    });
});
