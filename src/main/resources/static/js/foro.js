document.addEventListener('DOMContentLoaded', () => {
  var form = document.getElementById('new-post-form');
    var postContent = document.getElementById('post-content');
    var forumPosts = document.getElementById('forum-posts');

    form.addEventListener('submit', function(e) {
        e.preventDefault();

        // Verificación manual de espacios en blanco
        if (!postContent.value || postContent.value.replace(/\s/g, '') === '') {
            alert('La publicación no puede estar vacía');
            return;
        }

        var newPostHTML = `
            <div class="forum-post">
                <div class="user-info">
                    <div class="user-avatar"></div>
                    <div class="user-details">
                        <h3>Usuario ID</h3>
                        <p>${postContent.value}</p>
                    </div>
                </div>
                <div class="post-meta">
                    <p>Formula 1</p>
                    <p>Subido ${new Date().toLocaleDateString()}</p>
                </div>
            </div>
        `;

        forumPosts.innerHTML += newPostHTML;

        postContent.value = '';
    });
});
