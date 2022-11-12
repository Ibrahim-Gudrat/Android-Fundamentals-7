package com.abrahamgudratli.androidfundamentals7

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.fragment_2.*

class Fragment2 : Fragment(R.layout.fragment_2) {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btnSubmit2.setOnClickListener {
            Toast.makeText(activity, etvInputText2.text.toString(), Toast.LENGTH_LONG).show()
        }

    }

}