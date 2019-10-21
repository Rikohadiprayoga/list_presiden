package com.example.listview_200

object detail_presiden {

    private val presidenName = arrayOf(
        "Soekarno",
        "Soeharto",
        "Bacharuddin Jusuf Habibie",
        "Abdurrahman Wahid",
        "Megawati Soekarnoputri",
        "Susilo Bambang Yudhoyono",
        "Joko Widodo"
    )

    private val presidenTgl_lahir = arrayOf(
        "Jawa Timur, 6 Juni 1901",
        "Yogyakarta, 8 Juni 1921",
        "Sulawesi Selatan, 25 Juni 1936",
        "Jawa Timur, 4 Agustus 1940",
        "Yogyakarta, 23 Januari 1947",
        "Jawa Timur 9 September 1949",
        "Jawa Tengah, 21 Juni 1961"
    )

    private val presidenDurasi = arrayOf(
        "1945-1966",
        "1966-1980",
        "1998-1999",
        "1999-2001",
        "2001-2004",
        "2004-2014",
        "2014-2024"
    )

    private val presidenPoster = arrayOf(
        R.drawable.soekarno,
        R.drawable.suharto,
        R.drawable.bjhabibi,
        R.drawable.goesdur,
        R.drawable.megawati,
        R.drawable.sby,
        R.drawable.jokowi
    )

    val list_presiden: ArrayList<presiden>
        get() {
            val list = arrayListOf<presiden>()
            for (position in presidenName.indices) {
                val Presiden = presiden()
                Presiden.name = presidenName[position]
                Presiden.tgl_lahir = presidenTgl_lahir[position]
                Presiden.durasi = presidenDurasi[position]
                Presiden.poster = presidenPoster[position]
                list.add(Presiden)
            }
            return list
        }
}