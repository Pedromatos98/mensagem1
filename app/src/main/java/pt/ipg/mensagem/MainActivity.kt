package pt.ipg.mensagem

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun enviaMensagem(view: View) {
       val ediTextMensagem = findViewById<EditText>(R.id.editTextMensagem)
       val mensagem = ediTextMensagem.text.toString()

       val intent = Intent(this, MostraMensagemActivity :: class.java)
       startActivity(intent)
    }
}