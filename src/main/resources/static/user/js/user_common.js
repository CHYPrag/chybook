$(document).ready(function(){

    $(".nav-item").click(function(){
        $(".nav-item").css("background-color","#02BCFFFF")
        $(".nav-item").css("border","1px solid white")
        $(this).css("background-color","springgreen")
        $(this).css("font","bold")
    });

});