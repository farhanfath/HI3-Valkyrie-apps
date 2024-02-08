package com.project.honkaiimpac3rd

import android.content.res.Resources

object valkData {

    private val datavalk = arrayOf(
        arrayOf(
            "Kiana Kaslana",
            "White Comet",
            "MECH",
            R.drawable.valk_kiana,
            R.drawable.card_mech,
            R.drawable.detail_kiana,
            "Lorem"
        ),

        arrayOf(
            "Raiden Mei",
            "Crimson Impulse",
            "BIO",
            R.drawable.valk_mei,
            R.drawable.card_bio,
            R.drawable.detail_mei,
            "Lorem"
        ),

        arrayOf(
            "Bronya Zaychik",
            "Valkyrie Chariot",
            "PSY",
            R.drawable.valk_bronya,
            R.drawable.card_psy,
            R.drawable.detail_bronya,
            "Lorem"
        ),

        arrayOf(
            "Murata Himeko",
            "Battle Storm",
            "BIO",
            R.drawable.valk_himeko,
            R.drawable.card_bio,
            R.drawable.detail_himeko,
            "Lorem"
        ),

        arrayOf(
            "Elysia",
            "Herrscher Of Human",
            "PSY",
            R.drawable.valk_elysia,
            R.drawable.card_psy,
            R.drawable.detail_ely,
            "Elysia was the second Flame-Chaser, and the very creator of the group. She was a member of the MOTHs and a very present figure in the Previous Era, helping humanity to fight Herrschers and the Honkai until the bitter end. In the Current Era, Elysia's simulation is responsible for managing the Elysian Realm in the headquarters of World Serpent, guiding most of the successors sent by the organization in their quest to find the truth about the Previous Era."
        ),

        arrayOf(
            "Theresa Apocalypse",
            "valkyrie Pledge",
            "PSY",
            R.drawable.valk_theresa,
            R.drawable.card_psy,
            R.drawable.detail_theresa,
            "Lorem"
        ),

        arrayOf(
            "Prometheus",
            "Terminal Aide 0017",
            "IMG",
            R.drawable.valk_prometheus,
            R.drawable.card_img,
            R.drawable.detail_prome,
            "Lorem"
        ),

        arrayOf(
            "Fu Hua",
            "Valkyrie Accipiter",
            "PSY",
            R.drawable.valk_hua,
            R.drawable.card_psy,
            R.drawable.detail_hua,
            "Lorem"
        ),

        arrayOf(
            "Rita Rossweise",
            "Fallen Rosemary",
            "QUA",
            R.drawable.valk_rita,
            R.drawable.card_qua,
            R.drawable.detail_rita,
            "Lorem"
        ),

        arrayOf(
            "Seele Vollerei",
            "Swallowtail Phantasm",
            "QUA",
            R.drawable.valk_seele,
            R.drawable.card_qua,
            R.drawable.detail_seele,
            "Lorem"
        ),

        arrayOf(
            "Durandal",
            "Bright Knight: Excelsis",
            "MECH",
            R.drawable.valk_durandal,
            R.drawable.card_mech,
            R.drawable.detail_durandal,
            "Lorem"
        ),

        arrayOf(
            "Yae Sakura",
            "flame Sakitama",
            "BIO",
            R.drawable.valk_yae,
            R.drawable.card_bio,
            R.drawable.detail_yae,
            "Lorem"
        ),

        arrayOf(
            "Rozaliya Olenyeva",
            "Molotov Cherry",
            "PSY",
            R.drawable.valk_rozaliya,
            R.drawable.card_psy,
            R.drawable.detail_rozaliya,
            "Lorem"
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
                honkaiValk.detailimg = data[5] as Int
                honkaiValk.bio = data[6] as String

                list.add(honkaiValk)
            }
            return list
        }
}