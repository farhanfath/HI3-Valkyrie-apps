package com.project.honkaiimpac3rd

import android.content.res.Resources

object valkData {

    private val datavalk = arrayOf(
        arrayOf(
            "Kiana Kaslana",
            "White Comet",
            "MECH",
            R.drawable.valk_kiana,
            R.drawable.card_mech
        ),

        arrayOf(
            "Raiden Mei",
            "Crimson Impulse",
            "BIO",
            R.drawable.valk_mei,
            R.drawable.card_bio
        ),

        arrayOf(
            "Bronya Zaychik",
            "Valkyrie Chariot",
            "PSY",
            R.drawable.valk_bronya,
            R.drawable.card_psy
        ),

        arrayOf(
            "Murata Himeko",
            "Battle Storm",
            "BIO",
            R.drawable.valk_himeko,
            R.drawable.card_bio
        ),

        arrayOf(
            "Elysia",
            "Herrscher Of Human",
            "PSY",
            R.drawable.valk_elysia,
            R.drawable.card_psy
        ),

        arrayOf(
            "Theresa Apocalypse",
            "valkyrie Pledge",
            "PSY",
            R.drawable.valk_theresa,
            R.drawable.card_psy
        ),

        arrayOf(
            "Prometheus",
            "Terminal Aide 0017",
            "IMG",
            R.drawable.valk_prometheus,
            R.drawable.card_img
        ),

        arrayOf(
            "Fu Hua",
            "Valkyrie Accipiter",
            "PSY",
            R.drawable.valk_hua,
            R.drawable.card_psy
        ),

        arrayOf(
            "Rita Rossweise",
            "Fallen Rosemary",
            "QUA",
            R.drawable.valk_rita,
            R.drawable.card_qua
        ),

        arrayOf(
            "Seele Vollerei",
            "Swallowtail Phantasm",
            "QUA",
            R.drawable.valk_seele,
            R.drawable.card_qua
        ),

        arrayOf(
            "Durandal",
            "Bright Knight: Excelsis",
            "MECH",
            R.drawable.valk_durandal,
            R.drawable.card_mech
        ),

        arrayOf(
            "Yae Sakura",
            "flame Sakitama",
            "BIO",
            R.drawable.valk_yae,
            R.drawable.card_bio
        ),

        arrayOf(
            "Rozaliya Olenyeva",
            "Molotov Cherry",
            "PSY",
            R.drawable.valk_rozaliya,
            R.drawable.card_psy
        ),
    )

    val listValk: ArrayList<valkFormat>
        get() {
            val list = ArrayList<valkFormat>()
            for (data in datavalk) {
                val honkaiValk = valkFormat()
                honkaiValk.name = data[0] as String
                honkaiValk.battlesuit = data[1] as String
                honkaiValk.type = data[2] as String
                honkaiValk.img = data[3] as Int
                honkaiValk.cardtype = data[4] as Int

                list.add(honkaiValk)
            }
            return list
        }
}