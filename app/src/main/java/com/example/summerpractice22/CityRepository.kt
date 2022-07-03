package com.example.summerpractice22

object CityRepository {
    fun getCities() : List<City> {
        return listOf(
        City(0,"city0", 2000, "description0", "https://www.spletnik.ru/img/__post/df/df7196d3c2f2dc230eec0a5281010270_635.gif"),
        City(1,"city1", 2001, "description1", "https://russia.travel/upload/uf/3fe/3feb7e5d775670ef9d1da467d00f07dd.jpg"),
        City(2,"city2", 2002, "description2", "https://pustunchik.ua/uploads/school/cache/db2eb3c089be234b6e6758f917eafd13.jpg"),
        City(3,"city3", 2003, "description3", "https://media.admagazine.ru/photos/61409e7c9ecf4e1934c485c5/16:9/w_2560%2Cc_limit/13-Florence-493917575.jpg"),
        City(3,"city3", 2003, "description3", "https://media.admagazine.ru/photos/61409e7c9ecf4e1934c485c5/16:9/w_2560%2Cc_limit/13-Florence-493917575.jpg"),
        )
    }
}