document.addEventListener("DOMContentLoaded", function() {
    // Obtén el modal de usuarios
    var modalUsuarios = document.getElementById("modalUsuarios");

    // Obtén el botón que abre el modal de usuarios
    var btnUsuarios = document.getElementById("btnUsuarios");

    // Obtén el elemento <span> que cierra el modal de usuarios
    var spanUsuarios = document.querySelector(".modal-usuario .btn-cerrar");

    // Cuando el usuario hace clic en el botón, abre el modal de usuarios
    btnUsuarios.onclick = function() {
        modalUsuarios.classList.add("active");
    }

    // Cuando el usuario hace clic en <span> (x), cierra el modal de usuarios
    spanUsuarios.onclick = function() {
        modalUsuarios.classList.remove("active");
    }

    // Cuando el usuario hace clic en cualquier lugar fuera del modal de usuarios, lo cierra
    window.addEventListener('click', function(event) {
        if (event.target === modalUsuarios) {
            modalUsuarios.classList.remove("active");
        }
    });

    // Configuración del slideshow
    const images = [
        'https://mxcity.mx/wp-content/uploads/2015/10/formula.jpg',
        'https://e0.365dm.com/23/11/1600x900/skysports-f1-start-2023-singapore-gp_6369777.jpg?20231123161407'
    ];

    let currentIndex = 0;
    const imageElement = document.getElementById('slideshow-image');
    const interval = 5000; // 5 segundos

    function changeImage() {
        currentIndex = (currentIndex + 1) % images.length;
        imageElement.src = images[currentIndex];
    }

    setInterval(changeImage, interval);

   
});