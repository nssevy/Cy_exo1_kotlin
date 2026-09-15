fun addMusic(liste: MutableList<String>, musique: String, position: Int) {
    val lastPosition: Int = liste.size;

    if (position == 0) {
        liste.add(0, musique)
    }
    if (position == 1) {
        liste.add(musique)
    }
}

fun main() {
    var playlist = mutableListOf("Bohemian Rhapsody", "Stairway to Heaven", "Hotel California");
    addMusic(playlist, "Imagine", 1);
    addMusic(playlist, "Like a Rolling Stone", 0)
    println(playlist);
}