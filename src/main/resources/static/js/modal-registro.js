document.addEventListener('DOMContentLoaded', function() {
    var modalSignUp = document.getElementById('modalSignUp');
    var btnSignUp = document.querySelector('nav .buttons');
    var spanCloseSignUp = document.getElementsByClassName('btn-cerrar-signup')[0];

    // Abrir modal al hacer clic en el botón Sign Up
    btnSignUp.onclick = function() {
        modalSignUp.style.display = "flex";
    }

    // Cerrar modal al hacer clic en la X
    spanCloseSignUp.onclick = function() {
        modalSignUp.style.display = "none";
    }

    // Cerrar modal al hacer clic fuera del contenido
    window.onclick = function(event) {
        if (event.target == modalSignUp) {
            modalSignUp.style.display = "none";
        }
    }
});
