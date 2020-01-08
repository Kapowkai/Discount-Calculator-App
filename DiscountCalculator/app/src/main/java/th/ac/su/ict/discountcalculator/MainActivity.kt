package th.ac.su.ict.discountcalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var edtOriginal = findViewById<EditText>(R.id.edtOriginal)
        var edtPrecentOff = findViewById<EditText>(R.id.edtPrecentOff)
        var btnCalculate = findViewById<Button>(R.id.btnCalculate)
        var tvOutput = findViewById<TextView>(R.id.tvOutput)
        var cbTax = findViewById<CheckBox>(R.id.cbTax)

        btnCalculate.setOnClickListener(){
                var ogPrice:Double = (edtOriginal.text.toString().toDouble())
                var salePrecent:Double = (edtPrecentOff.text.toString().toDouble())
                var salePrice = 0.00
            salePrice += ogPrice-(ogPrice*(salePrecent/100.00))
            if (cbTax.isChecked){
                salePrice += salePrice*(7.00 / 100.00)
            }
            tvOutput.setText(String.format("%.2f", salePrice));

        }
    }
}
