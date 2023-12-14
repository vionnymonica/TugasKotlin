package id.infinitelearning.KotlinSubmission.Exercise2

fun main() {

    /** Latihan 1 List
     * Buatlah sebuah variabel bertipe list dengan ketentuan:
     * - List tersebut menampung bilangan genap dari 1 hingga 100
     * Optional:
     * - Agar lebih mudah, gunakanlah for loop dan logika if untuk mengisi bilangan genap pada list
     */
    val evenNumbers = mutableListOf<Int>()

    for (i in 1..100) {
        if (i % 2 == 0) {
            evenNumbers.add(i)
        }
    }

    println("List of even numbers: $evenNumbers")

    /** Latihan 2 Map
     * Buatlah variabel bertipe Map dengan kriteria:
     * Daftar nama bulan dalam setahun,
     * - Set Key nya dengan inisial nama bulan dan Value nya nama bulan, contoh
     * - key "Jan", value January
     * - key "Feb", value February
     * - dst...
     */
    val monthMap = mapOf(
        "Jan" to "January",
        "Feb" to "February",
        "Mar" to "March",
        "Apr" to "April",
        "May" to "May",
        "Jun" to "June",
        "Jul" to "July",
        "Aug" to "August",
        "Sep" to "September",
        "Oct" to "October",
        "Nov" to "November",
        "Dec" to "December"
    )

    monthMap.forEach { (key, value) ->
        println("$key -> $value")
    }

    val monthNow = "Oct"
    val birthMonth = "Apr"
    println("It's $monthNow now, I was born in $birthMonth")
}
