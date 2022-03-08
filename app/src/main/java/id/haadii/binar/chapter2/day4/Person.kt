package id.haadii.binar.chapter2.day4


/**
 * Created by nurrahmanhaadii on 03,March,2022
 */
class Person {

    private val _elementList = mutableListOf<Int>()
    val elementList: List<Int>
        get() = _elementList

    fun iniFunctionDiluarCompanionObject() {

    }

    fun editList(newElement: Int) {
        _elementList.add(0, newElement)
    }

    companion object {
        const val STATIC_VARIABLE = "static"
        val VERSI_BUKAN_COMPANION_OBJECT = "bukan"

        fun iniFunctionDidalamCompanionObject() {

        }

    }
}