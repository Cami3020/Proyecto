$("#btnRegistro").click(function(){
    $("#modalRegistro").addClass("active");
})

$(".btn-cerrar-signup").click(function(){
    $("#modalRegistro").removeClass("active");
})

$("#imagenNoticia").on("input",function(){
    $("#imgPrevisualizarNoticia").attr("src",$(this).val())
})

$("#imagenCircuito").on("input",function(){
    $("#imgPrevisualizarCircuito").attr("src",$(this).val())
})

$("#rutaImagenRegistro").on("input",function(){
    $("#imgPrevisualizarRegistro").attr("src",$(this).val())
})