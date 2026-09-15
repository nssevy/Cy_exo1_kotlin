import kotlin.collections.mutableListOf

data class Playlist(val music: MutableList<String> = mutableListOf() ) {

    fun addMusic(musique: String, position: Int) {
        val lastPosition: Int = music.size;

        if (position == 0) {
            music.add(0, musique)
        }
        if (position == 1) {
            music.add(musique)
        }
    }

    fun modifMusic(oldMusic: String, newMusic: String){
        val indexOldMusic: Int = music.indexOf(oldMusic);
        music[indexOldMusic] = newMusic
    }

    fun isHePresent(musics: String): Boolean = if (musics in music) { true } else {false}

    fun positionOfMusic(musique: String): Int {
        return music.indexOf(musique)
    }

    fun delectMusic(musics: String): mutableListOf() {
        return music.drop(positionOfMusic(musics))
    }
}
/*
fun isHePresent(playlist: MutableList<String>, music: String): Boolean = if (music in playlist) { true } else {false}*/

fun main() {
    var p = mutableListOf("Bohemian Rhapsody", "Stairway to Heaven", "Hotel California");
    val maPlaylist = Playlist(p);

    maPlaylist.addMusic("Imagine", 1);
    maPlaylist.addMusic("Like a Rolling Stone", 0);
    println(maPlaylist)
    maPlaylist.addMusic("Bohemian Rhapsody", 1);
    println(maPlaylist);
    maPlaylist.modifMusic("Stairway to Heaven", "Smells Like Teen Spirit")
    println(maPlaylist);
    println(maPlaylist.isHePresent("Hotel California"));
    println("Imagine apparait à la position ${maPlaylist.positionOfMusic("Imagine")}");
    maPlaylist.delectMusic("Hotel California")
    println(maPlaylist);
    /*

    println(isHePresent(playlist,"Hotel California"))
    println("${positionOfMusic(playlist, "Imagine")}")*/

}