package com.example.summerpractice22

object CityRepository {
    fun getCities() : List<City> {
        return listOf(
        City(0,
            "Мадрид",
            852,
            "Столица и крупнейший город Испании, а также административный центр одноимённых провинции и автономного сообщества.",
            "https://images.tutu.ru/image/source/4/99d2168bd37a475da12d5ba17c2a9538/"),
        City(1,
            "Барселона",
            237,
            "Город в Испании, столица автономной области Каталония и провинции Барселона.",
            "https://barcelonatm.ru/wp-content/uploads/2018/04/barselona-s-vysoty-1.jpg"),
        City(2,
            "Валенсия",
            138,
            "Город в Испании, центр автономного сообщества Валенсия и одноимённой провинции.",
            "https://traveller-eu.ru/sites/default/files/inline-images/Valencia6.jpeg"),
        City(3,
            "Пальма",
            123,
            "главный город и порт испанского автономного сообщества Балеарские острова.",
            "https://pro-spain.net/wp-content/uploads/2015/10/palma-de-mallorca.jpg"),
        City(4,
            "Малага",
            -800,
            "город на юге Испании, в Андалусии. Административный центр провинции Малага. ",
            "https://espanarusa.com/files/autoupload/22/68/61/ntcf2tss351457.jpg"),
        City(5,
            "Малага",
            825,
            "город на юго-востоке Испании, административный центр автономного сообщества Мурсия и одноимённой провинции.",
            "https://pvmgid.ru/wp-content/uploads/2018/04/gorod-mursiya.jpg"),
        )
    }
}