package com.gmail.eamosse.tp2


class LocalStudentManager : StudentManager {

    private var students: List<Student> = listOf(
            Student(name = "John1", code = "A1", sexe = "M", address = "Lilles", age = 20),
            Student(name = "John2", code = "A2", sexe = "F", address = "Lilles", age = 30),
            Student(name = "John3", code = "A3", sexe = "F", address = "Lilles", age = 41),
            Student(name = "John4", code = "A4", sexe = "M", address = "Lilles", age = 42),
            Student(name = "John5", code = "A5", sexe = "M", address = "Lilles", age = 34),
            Student(name = "John6", code = "A6", sexe = "F", address = "Lilles", age = 12),
            Student(name = "John7", code = "A7", sexe = "M", address = "Lilles", age = 28),
            Student(name = "John8", code = "A8", sexe = "M", address = "Lilles", age = 16),
            Student(name = "John9", code = "A9", sexe = "F", address = "Lilles", age = 10),
            Student(name = "John10", code = "A10", sexe = "F", address = "Lilles", age = 56),
        )
    override fun listOf10(): List<Student> {
        return students
    }

    override fun sortAgeAscDesc(type: String): List<Student> {
        TODO("Not yet implemented")
    }

    override fun groupBySex(): Map<String, List<Student>> {
        TODO("Not yet implemented")
    }

    override fun boysOrGirls(sexe: String): List<Student> {
        TODO("Not yet implemented")
    }

    override fun onlyNames(): List<String> {
        TODO("Not yet implemented")
    }

    override fun deleteBySex(sex: String) {
        TODO("Not yet implemented")
    }

    override fun reverse(): List<Student> {
        TODO("Not yet implemented")
    }

    override fun clear() {
        TODO("Not yet implemented")
    }
}
