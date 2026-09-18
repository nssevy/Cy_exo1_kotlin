import kotlin.collections.mutableSetOf

data class Tags(val label: String);

data class MethodesTags(val vecTag: MutableSet<Tags> = mutableSetOf<Tags>() ) {
    fun ajouterUnTag(newTag: String) {
        vecTag.add(Tags(newTag))
    }

    fun findTag(recherche: String): Boolean {
        return Tags(recherche) in vecTag
    }

    /*fun supprimerUnTag(tag: String) {
        val positon: Int = vecTag.indexOf(tag)
        vecTag.removeAt(positon)
    }*/
}

fun tagEnString(tags: MutableSet<Tags>): MutableSet<String> {
    val labels = mutableSetOf<String>();

    for (tag in tags) {
        labels.add(tag.label)
    }

    return labels
}

fun compareToutLesTags(set1: MethodesTags, set2: MethodesTags): Boolean {
    return set1.vecTag.containsAll(set2.vecTag)
}

fun main() {
    val articleTags = MethodesTags(mutableSetOf<Tags> (
        Tags("Kotlin"),
        Tags("programmation"),
        Tags("android"),
    ));

    articleTags.ajouterUnTag("dev");
    articleTags.ajouterUnTag("kotlin");

    println("---Affiche les tag des articles---")
    val strArticleTags = tagEnString(articleTags.vecTag);
    for (str in strArticleTags) {
        println(str)
    }

    println("\n---Verifie si un tag est présent---")
    val tagRechercher: String = "dev";

    when(articleTags.findTag(tagRechercher)) {
        true -> println("${tagRechercher} est présent.")
        false -> println("${tagRechercher} n'est pas présent.")
    }

    val langageTags = MethodesTags(mutableSetOf<Tags> (
        Tags("Kotlin"),
        Tags("android"),
        Tags("jetpack"),
    ));

    println("\n---Affiche les tags de langage---")

    val popularTags = tagEnString(langageTags.vecTag);
    for (str in popularTags) {
        println(str)
    }

    println("\n---Vérifie s'il contient les mêmes tags---\n")
    when(compareToutLesTags(articleTags, langageTags)) {
        true -> println("articleTags contient tout les tags de langageTags.")
        false -> println("articleTags ne contient pas tout les tags de langageTags.") }
}