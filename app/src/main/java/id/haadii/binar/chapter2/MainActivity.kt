package id.haadii.binar.chapter2

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import id.haadii.binar.chapter2.day4.Person

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        fungsiAset()
        caraBuatAset()

        val person = Person()
        person.editList(3)

        Log.e("elementList", "${person.elementList[0]}")

    }

    private fun caraBuatAset() {
        Toast.makeText(this, "", Toast.LENGTH_SHORT).show()
        Log.e(
            "cara buat", """
            kfjlkfjlkafd
            lkfjklaf
            alkjfdlkaf
            alkjflka
        """.trimIndent()
        )
    }

    private fun fungsiAset() {
        Log.d("funsti", "ini fungsinya")
    }
}
