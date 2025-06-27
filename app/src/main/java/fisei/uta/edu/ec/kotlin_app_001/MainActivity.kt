package fisei.uta.edu.ec.kotlin_app_001

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import fisei.uta.edu.ec.kotlin_app_001.databinding.ActivityMainBinding
import fisei.uta.edu.ec.kotlin_app_001.databinding.ActivitySecondBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets

        }

        val binding = ActivityMainBinding.inflate(this.layoutInflater)
        //val binding = ActivityMainBinding ActivitySecondBinding.inflate(this.layoutInflater)

        /*
        val editTextFirstValue = findViewById<EditText>(R.id.editTextFirstValue);
        val editTextSecondValue = findViewById<EditText>(R.id.editTextSecondValue);
        val textViewResult = findViewById<TextView>(R.id.textViewResult);
        val buttonOK = findViewById<Button>(R.id.buttonOK);
        */

        binding.buttonOK.setOnClickListener {

        }
        /*
        buttonOK.setOnClickListener {
            val a = editTextFirstValue.text.toString().toInt();
            val b = editTextSecondValue.text.toString().toInt();
            val sum = a + b;

            textViewResult.text = sum.toString();

            //textViewResult.setText(sum.toString())

        }

        */


        }
    }
