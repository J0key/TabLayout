package com.example.tugas6

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.navigation.fragment.findNavController

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [LoginFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class LoginFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val fragmentInflater = inflater.inflate(R.layout.fragment_login, container, false)
        val etUsername = fragmentInflater.findViewById<EditText>(R.id.username_edit)
        val etPassword = fragmentInflater.findViewById<EditText>(R.id.password_edit)
        val btnLogin = fragmentInflater.findViewById<Button>(R.id.login_btn)

        btnLogin.setOnClickListener {
            val username = etUsername.text.toString()
            val password = etPassword.text.toString()

            if (username == "Shyra" && password == "123456") {
                Toast.makeText(context, "Login Berhasil", Toast.LENGTH_SHORT).show()
                val intent = Intent(activity, HomepageActivity::class.java)
                intent.putExtra("EXTUSERNAME", username)
                startActivity(intent)
            } else {
                Toast.makeText(context, "Username atau Password Salah", Toast.LENGTH_SHORT).show()
            }
        }
        return fragmentInflater

//            Log.d("LoginFragment", "Button Login Clicked")
        }
    }


