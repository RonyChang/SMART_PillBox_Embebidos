package com.example.pillbox_emb.fragments

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import com.example.pillbox_emb.R
import com.google.android.material.floatingactionbutton.FloatingActionButton
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Locale
import java.util.TimeZone

class HomeFragment : Fragment() {

    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val View = inflater.inflate(R.layout.fragment_home, container, false)
        //variable boton agregar plan
        val Add_plan = View.findViewById<FloatingActionButton>(R.id.add_plan)
        //variables hora y fecha actual
        val CurrentTimeTextView = View.findViewById<TextView>(R.id.currentTimeTextView)
        val DayOfWeekTextView = View.findViewById<TextView>(R.id.dayOfWeekTextView)

        val calendar = Calendar.getInstance()
        val currentTime = calendar.time

        val dateFormat = SimpleDateFormat("HH:mm a", Locale.getDefault())
        dateFormat.timeZone = TimeZone.getTimeZone("GMT-5")
        val formattedTime = dateFormat.format(currentTime)

        CurrentTimeTextView.text = formattedTime

        val dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK)

        val dayOfWeekString = when (dayOfWeek) {
            Calendar.SUNDAY -> "Domingo"
            Calendar.MONDAY -> "Lunes"
            Calendar.TUESDAY -> "Martes"
            Calendar.WEDNESDAY -> "Miércoles"
            Calendar.THURSDAY -> "Jueves"
            Calendar.FRIDAY -> "Viernes"
            Calendar.SATURDAY -> "Sábado"
            else -> ""
        }
        DayOfWeekTextView.text = dayOfWeekString

        //Botón de agregar plan
        Add_plan.setOnClickListener{
            findNavController().navigate(R.id.ir_a_agregar_plan)
        }

        return View
    }

}