package com.example.activeexcercise

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.activeexcercise.databinding.ActivityBmiactivityBinding
import java.math.BigDecimal
import java.math.RoundingMode

class BMIActivity : AppCompatActivity() {

    // Radio Option Chooise Option.
    companion object{
        private const val METRIC_UNITS_VIEW = "METRIC_UNITS_VIEW" // Metric Unit View
        private const val US_UNITS_VIEW = "US_UNIT_VIEW" //US Unit View
    }
    private var currentVisibleView: String =
        METRIC_UNITS_VIEW // A variable to hold a value to make a selected view visible

    private var binding: ActivityBmiactivityBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBmiactivityBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        setSupportActionBar(binding?.toolbarBmiActivity)
        if(supportActionBar != null){
            supportActionBar?.setDisplayHomeAsUpEnabled(true)
            supportActionBar?.title = "CALCULATE BMI"
        }

        binding?.toolbarBmiActivity?.setNavigationOnClickListener {
            onBackPressed()
        }

        makeVisibleMetricUnitsView()

        // This Code is Radio active code there code is important code.
        binding?.rgUnits?.setOnCheckedChangeListener{ _, checkedId: Int ->
            if (checkedId == R.id.rbMetricUnits){
                makeVisibleMetricUnitsView()
            }else{

            }
        }

        binding?.btnCalculateUnits?.setOnClickListener{
            if (validateMetricUnits()){
                val heightValue : Float = binding?.etMetricUnitHeight?.text.toString().toFloat()/100

                val WeightValue : Float = binding?.etMetricUnitWeight?.text.toString().toFloat()

                val bmi = WeightValue / (heightValue * heightValue)

                displayBMIResult(bmi)

                //TODO display BMI results
            }else{
                Toast.makeText(this@BMIActivity,
                    "Please enter valid values",
                    Toast.LENGTH_SHORT)
                    .show()
            }
        }
    }

    private fun makeVisibleMetricUnitsView(){
        currentVisibleView = METRIC_UNITS_VIEW // Current View is updated here.
        binding?.tilMetricUnitWeight?.visibility = View.INVISIBLE // METRIC Height UNITS VIEW
        binding?.tilMetricUnitHeight?.visibility = View.INVISIBLE // METRIC Weight UNITS VIEW
        binding?.tilUsMetricUnitWeight?.visibility = View.VISIBLE // Make weight view Gone.
        binding?.tilMetricUsUnitHeightFeet?.visibility = View.VISIBLE // make height feet view Gone.
        binding?.tilMetricUsUnitHeightInch?.visibility = View.VISIBLE // make height inch view Gone.

        binding?.etMetricUnitHeight?.text!!.clear() // height value is cleared if it is added.
        binding?.etMetricUnitWeight?.text!!.clear() // weight value is cleared if it is added.

        binding?.llDisplayBMIResult?.visibility = View.INVISIBLE

    }


    private fun displayBMIResult(bmi: Float){

        val bmiLabel : String
        val bmiDescription: String

        if (bmi.compareTo(15f) <= 0){
            bmiLabel = "Very severely underweight"
            bmiDescription = "Oops! You really need to take better care of yourself! Eat more! "
        } else if (bmi.compareTo(15f) > 0 && bmi.compareTo(16f) <= 0){
            bmiLabel = "Severely underweight"
            bmiDescription = "Oops! You really need to take better care of yourself! Eat more! "
        } else if (bmi.compareTo(16f) > 0 && bmi.compareTo(18.5f) <= 0){
            bmiLabel = "Underweight"
            bmiDescription = "Oops! You really need to take better care of yourself! Eat more! "
        }  else if (bmi.compareTo(18.5f) > 0 && bmi.compareTo(25f) <= 0){
            bmiLabel = "Normal"
            bmiDescription = "Congratulation! You are in a good shape!"
        }  else if (bmi.compareTo(20f) > 0 && bmi.compareTo(30f) <= 0){
            bmiLabel = "Overweight"
            bmiDescription = "Oops! You really need to take care of yourself! Workout! "
        } else if (bmi.compareTo(30f) > 0 && bmi.compareTo(35f) <= 0){
            bmiLabel = "Obese Class | (Moderately obese)"
            bmiDescription = "Oops! You really need to take care of yourself! Workout! "
        } else if (bmi.compareTo(35f) > 0 && bmi.compareTo(40f) <= 0) {
            bmiLabel = "Obese Class | (Severely obese)"
            bmiDescription = "Oops! You are in a very dangerous condition! Act now!"
        }else {
            bmiLabel = "Obese Class | (Severely obese)"
            bmiDescription = "Oops! You are in a very dangerous condition! Act now!"
        }

        val bmiValue = BigDecimal(bmi.toDouble())
            .setScale(2, RoundingMode.HALF_EVEN).toString()

        binding?.llDisplayBMIResult?.visibility = View.VISIBLE
        binding?.tvBMIValue?.text = bmiValue
        binding?.tvBMIType?.text =bmiLabel
        binding?.tvBMIDescription?.text = bmiDescription
    }

    private fun validateMetricUnits():Boolean{
        var isValid = true

        if(binding?.etMetricUnitWeight?.text.toString().isEmpty()){
            isValid = false
        }else if (binding?.etMetricUnitWeight?.text.toString().isEmpty()){
            isValid = false
        }

        return isValid
    }
}