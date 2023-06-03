package com.example.pillbox_emb.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.ToggleButton
import com.example.pillbox_emb.R

class AgregarPlanFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val View = inflater.inflate(R.layout.fragment_agregar_plan, container, false)
        // variable checkbox
        val CheckBox =View.findViewById<CheckBox>(R.id.checkBox)

        //variables tooglebutton dias
        val ToggleButton_Lunes = View.findViewById<ToggleButton>(R.id.toggleButton_Lunes)
        val ToggleButton_Martes = View.findViewById<ToggleButton>(R.id.toggleButton_Martes)
        val ToggleButton_Miercoles = View.findViewById<ToggleButton>(R.id.toggleButton_Miercoles)
        val ToggleButton_Jueves = View.findViewById<ToggleButton>(R.id.toggleButton_Jueves)
        val ToggleButton_Viernes = View.findViewById<ToggleButton>(R.id.toggleButton_Viernes)
        val ToggleButton_Sabado = View.findViewById<ToggleButton>(R.id.toggleButton_Sabado)
        val ToggleButton_Domingo = View.findViewById<ToggleButton>(R.id.toggleButton_Domingo)

        CheckBox.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                // Cambiar el estado de los ToggleButtons a ON
                ToggleButton_Lunes.isChecked = true
                ToggleButton_Martes.isChecked = true
                ToggleButton_Miercoles.isChecked = true
                ToggleButton_Jueves.isChecked = true
                ToggleButton_Viernes.isChecked = true
                ToggleButton_Sabado.isChecked = true
                ToggleButton_Domingo.isChecked = true
            } else {
                // Cambiar el estado de los ToggleButtons a OFF
                ToggleButton_Lunes.isChecked = false
                ToggleButton_Martes.isChecked = false
                ToggleButton_Miercoles.isChecked = false
                ToggleButton_Jueves.isChecked = false
                ToggleButton_Viernes.isChecked = false
                ToggleButton_Sabado.isChecked = false
                ToggleButton_Domingo.isChecked = false
            }
        }

        // Inflate the layout for this fragment
        return View
    }

}