package com.example.pillbox_emb.fragments

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import com.example.pillbox_emb.R

class InfoFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val View = inflater.inflate(R.layout.fragment_info, container, false)
        val correoRonyLayout = View.findViewById<FrameLayout>(R.id.correoRony)
        val correoRenattoLayout = View.findViewById<FrameLayout>(R.id.correoRenatto)
        val githubLayout = View.findViewById<FrameLayout>(R.id.github_layout)

        githubLayout.setOnClickListener {
            Redirection_link("https://github.com/RonyChang")
        }

        correoRonyLayout.setOnClickListener {
            Redirection_link("https://mail.google.com/mail/u/0/#inbox?compose=CllgCJftMStqWrthMBrxtnJwXbHkLQgKxgnvbwJXnjJPXhTHhmqTHpcwzLhRklpTggTLZMQvtFg")
        }

        correoRenattoLayout.setOnClickListener {
            Redirection_link("https://mail.google.com/mail/u/0/#inbox?compose=CllgCJvlqhhJCPmmxzckvzhdSPzWVGbmRMnRQtlqpQGlRSqrbwzwncQzGqdLtDXzWvGnMjTbtDV")
        }
        return View
    }

    private fun Redirection_link(link : String){
        val url = link
        val intent = Intent(Intent.ACTION_VIEW)
        intent.data = Uri.parse(url)
        startActivity(intent)
    }

}