package id.infinitelearning.KotlinSubmission.Exercise1

/**
Latihan 1
Lengkapi fungsi myProfile di bawah ini dengan membuat variabel dengan ketentuan dibawah ini:
- Variable bertipe data string yang menyimpan nilai nama depan Anda.
- Variable bertipe data string yang menyimpan nilai nama belakang Anda.
- Variable bertipe data number yang menyimpan nilai umur Anda.
- Variable bertipe data boolean yang menyimpan nilai status Anda (single atau tidak)
Dan Cetak setiap variabel ke layar saat variable myProfile di panggil
 */
fun myProfile() {
    val ndepan = "Viony"
    val nbelakang = "Monica"
    val usia = 20
    val status = true

    println("nama saya $ndepan $nbelakang")
    println("usia $usia tahun")
    println("status single $status")
}


/**
 *  Latihan 2
 *  Lengkapi fungsi di bawah ini agar dapat mencetak nilai dari parameter-parameter yang ada dengan fungsi println
 */
fun groupDetail(groupId: String, groupMember: List<Any>, session: String): Any {
    println("groupId $groupId")
    println("My team is: $groupMember")
    println("session $session")
    return ""
}

/**
 * Latihan 3
 * Buat variable yang berisi daftar anggota group kamu,
 * Kemudian akses item yang berisi nama Anda dari variable tersebut, lalu jadikan nilai kembalian untuk fungsi myTeam ini
 *
 */
fun myTeam(): List<Any> {
    return listOf(
        "Viony",
        "Aam",
        "Sarah",
        "Nidzar",
        "Novi",
        "Rendy",
        "Arif",
        "Andy",
        "Wahid",
        "Intan",
    )
}

/**
 * Latihan 4
 * Lengkapi dan perbaiki isi fungsi totalMember() ini dengan rumus:
 *
 *      total mentor + jumlah anggota group
 *
 */
fun totalMember(): Int {
    val mentor = arrayOf<String>("Fatih", "Raihan")
    val countOfGroup = arrayOf<String>(
        "Viony",
        "Aam",
        "Sarah",
        "Nidzar",
        "Novi",
        "Rendy",
        "Arif",
        "Andy",
        "Wahid",
        "Intan",
    )

    return mentor.size + countOfGroup.size
}

fun main() {

    myProfile()

    val myTeam = myTeam()
    println("My team is: $myTeam")

    val totalMember = totalMember()
    println("Total Member group : $totalMember")

    /**
     *  Latihan 5
     *  Ubah nilai argumen-argumen dari fungsi groupDetail di bawah ini sesuai dengan data group kamu
     *
     */
    groupDetail("1", myTeam, "Afternoon")

}