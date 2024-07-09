document.addEventListener('DOMContentLoaded', () => {
    // Manejar el modal de usuarios
    const modalUsuario = document.getElementById('modal-usuario');
    const botonAbrirModalUsuario = document.querySelector('.usuarios');
    const botonCerrarModalUsuario = document.getElementById('btn-cerrar');

    botonAbrirModalUsuario.addEventListener('click', () => {
        modalUsuario.style.display = 'block';
    });

    botonCerrarModalUsuario.addEventListener('click', () => {
        modalUsuario.style.display = 'none';
    });

    window.addEventListener('click', (event) => {
        if (event.target === modalUsuario) {
            modalUsuario.style.display = 'none';
        }
    });

    // Slideshow de imágenes
    const imagenes = [
        'https://cdn-1.motorsport.com/images/amp/2d1Zz5LY/s1000/max-verstappen-red-bull-racing.jpg',  // Puedes agregar más rutas de imagen aquí
        'https://de2.sportal365images.com/process/smp-betway-images/blog.betway.com.ptb/20022024/b0b4d5d8-e0d5-4d7c-92ad-2c22d2c7679f.jpg'
    ];
  
    let indiceActual = 0;
    const elementoImagen = document.getElementById('slideshow-image');
    const intervalo = 5000; // 5 segundos

    function cambiarImagen() {
        indiceActual = (indiceActual + 1) % imagenes.length;
        elementoImagen.src = imagenes[indiceActual];
    }

    setInterval(cambiarImagen, intervalo);

    // Manejar el modal de registro
    const modalRegistro = document.getElementById('modal-registro');
    const botonAbrirModalRegistro = document.querySelector('.registrarse');
    const botonCerrarModalRegistro = document.getElementById('btn-cerrar-registro');

    botonAbrirModalRegistro.addEventListener('click', () => {
        modalRegistro.style.display = 'flex';
    });

    botonCerrarModalRegistro.addEventListener('click', () => {
        modalRegistro.style.display = 'none';
    });

    window.addEventListener('click', (event) => {
        if (event.target === modalRegistro) {
            modalRegistro.style.display = 'none';
        }
    });
});
