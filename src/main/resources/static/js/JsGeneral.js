document.addEventListener("DOMContentLoaded", function() {
    // Obtén el modal de usuarios
    var modalUsuarios = document.getElementById("modalUsuarios");

    // Obtén el botón que abre el modal de usuarios
    var btnUsuarios = document.getElementById("btnUsuarios");

    // Obtén el elemento <span> que cierra el modal de usuarios
    var spanUsuarios = document.querySelector("#modalUsuarios .btn-cerrar");

    // Obtén los elementos del usuario
    var divUsuario = document.getElementById("div-usuario");
    var divUsuarioImg = document.querySelector(".div-usuario-img");

    // Cuando el usuario hace clic en el botón, abre el modal de usuarios
    btnUsuarios.onclick = function() {
        modalUsuarios.classList.add("active");
        divUsuario.classList.add("hidden");
        divUsuarioImg.classList.add("hidden");
    }

    // Cuando el usuario hace clic en <span> (x), cierra el modal de usuarios
    spanUsuarios.onclick = function() {
        modalUsuarios.classList.remove("active");
        divUsuario.classList.remove("hidden");
        divUsuarioImg.classList.remove("hidden");
    }

    // Cuando el usuario hace clic en cualquier lugar fuera del modal de usuarios, lo cierra
    window.addEventListener('click', function(event) {
        if (event.target === modalUsuarios) {
            modalUsuarios.classList.remove("active");
            divUsuario.classList.remove("hidden");
            divUsuarioImg.classList.remove("hidden");
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

    // Manejar el modal de registro
    const modalRegistro = document.getElementById("modalRegistro");
    const btnRegistro = document.querySelector(".btnRegistro");
    const spanRegistro = document.querySelector("#modalRegistro .btn-cerrar-signup");

    // Asegúrate de que el modal de registro esté correctamente oculto inicialmente
    modalRegistro.classList.remove("active");

    // Cuando el usuario hace clic en el botón de registro, abre el modal de registro
    btnRegistro.onclick = function() {
        modalRegistro.classList.add("active");
    }

    // Cuando el usuario hace clic en <span> (x), cierra el modal de registro
    spanRegistro.onclick = function() {
        modalRegistro.classList.remove("active");
    }

    // Cuando el usuario hace clic en cualquier lugar fuera del modal de registro, lo cierra
    window.addEventListener('click', function(event) {
        if (event.target === modalRegistro) {
            modalRegistro.classList.remove("active");
        }
    });

    // Leer más de la noticia principal
    document.getElementById("show-more").addEventListener("click", function(event) {
        event.preventDefault();
        var moreText = document.getElementById("more-text");
        if (moreText.style.display === "none") {
            moreText.style.display = "inline";
            this.textContent = "Mostrar menos";
        } else {
            moreText.style.display = "none";
            this.textContent = "Mostrar más";
        }
    });

       // Leer más de la noticia secundaria
       document.getElementById("show-more1").addEventListener("click", function(event) {
        event.preventDefault();
        var moreText = document.getElementById("more-text1");
        if (moreText.style.display === "none") {
            moreText.style.display = "inline";
            this.textContent = "Mostrar menos";
        } else {
            moreText.style.display = "none";
            this.textContent = "Mostrar más";
        }
    });

        // Leer más de la noticia secundaria
        document.getElementById("show-more2").addEventListener("click", function(event) {
            event.preventDefault();
            var moreText = document.getElementById("more-text2");
            if (moreText.style.display === "none") {
                moreText.style.display = "inline";
                this.textContent = "Mostrar menos";
            } else {
                moreText.style.display = "none";
                this.textContent = "Mostrar más";
            }
        });
             // Leer más de la noticia secundaria
             document.getElementById("show-more3").addEventListener("click", function(event) {
                event.preventDefault();
                var moreText = document.getElementById("more-text3");
                if (moreText.style.display === "none") {
                    moreText.style.display = "inline";
                    this.textContent = "Mostrar menos";
                } else {
                    moreText.style.display = "none";
                    this.textContent = "Mostrar más";
                }
            });
});
