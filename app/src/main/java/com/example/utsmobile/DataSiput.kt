package com.example.utsmobile

object DataSiput {
    private val namaSiput = arrayOf (
        "Keong Apel",
        "Keong Assasin",
        "Keong Bawang",
        "Keong Sulawesi",
        "Keong Tanduk",
        "Keong Terompet",
        "Keong Turbo",
        "Keong Ramshorn",
        "Olive Nerite Snail",
        "Red Race Nerite Snail"
    )

    private val namailmiahSiput = arrayOf (
        "Pomacea Bridgesii",
        "Clea helena",
        "Ruby Nerite",
        "Tylomelania",
        "Clithon corona",
        "Melanoides tuberculata",
        "Turbo",
        "Planorbarius corneus",
        "Vitta usnea",
        "Vittina waigiensis"
    )

    private val detailSiput = arrayOf (
        "Apple Snail atau Keong Apel biasa dikenal dengan sebutan Mystery Snails",
        "Memiliki nama lain yang kurang populer, yaotu Clea Helena. Keong ini merupakan siput asli Asia Tenggara (Malaysia, Indonesia dan Thailand), hidup di danau dan sepanjang aliran sungai.",
        "Keong bawang masih termasuk keluarga keong turbo, bentuknya sama namun warnanya berbeda. Di luar sana keong ini sering dipanggil dengan nama latinnya, yaitu Tracked Nerite atau Ruby Nerite.",
        "Keong ini dijuluki sebagai rabbit snail karena muka keong ini terlihat seperti kelinci. Ukuran tubuhnya lumayan besar, ia dapat tumbuh hingga mencapai 10 cm dan sering disebut jugga sebagai keong gajah.",
        "Keong ini mempunyai bagian menonjol ke arah luar pada cangkangnya sehingga dijuluki keong tanduk atau horned nerite snail.",
        "Keong terompet merupakan sebuah hama dibalik bentuk dan warna jenis keong ini yang indah.",
        "Keong ini dijuluki zebra nerite snail. Ukuran tubuhnya lumayan besar, yaitu 2,5 hingga 3 cm.",
        "Ramshorn Snail memiliki bentuk cangkang unik dan berbeda dengan lainnya, dimana ia berbentuk seperti gulungan tali atau sesuai namanya, tanduk domba.",
        "Keong ini memiliki warna coklat kehijauan sesuai namanya, yaitu olive.",
        "Keong tercepat dalam keluarga nerite snail. Memiliki warna cangkang yang bagus, berwarna merah dan terdapat perpaduan keong turbo pada cangkangnya."
    )
    private val imgSiput = arrayOf (
        R.drawable.keongapel,
        R.drawable.keongassassin,
        R.drawable.keongbawang,
        R.drawable.keongsulawesi,
        R.drawable.keongtanduk,
        R.drawable.keongterompet,
        R.drawable.keongturbo,
        R.drawable.keongramshorn,
        R.drawable.oliveneritesnail,
        R.drawable.redracerneritesnail
    )

    val listData: ArrayList<siput1>
        get() {
            val list = arrayListOf<siput1>()
            for (position in namaSiput.indices) {
                val Siput = siput1()
                Siput.siput = namaSiput[position]
                Siput.ilmiah = namailmiahSiput[position]
                Siput.penjelasanSingkat = detailSiput[position]
                Siput.fotoSiput = imgSiput[position]
                list.add(Siput)
            }
            return list
        }
}
