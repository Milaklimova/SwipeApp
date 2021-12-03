package com.example.swipeapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

const val ARG_OBJECT = "object"

class ContentFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(com.example.swipeapp.R.layout.fragment_content, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        arguments?.takeIf { it.containsKey(ARG_OBJECT) }?.apply {
            val textView: TextView = view.findViewById(com.example.swipeapp.R.id.textView)
            textView.text = getInt(ARG_OBJECT).toString()
            if (getInt(ARG_OBJECT) == 1){
                textView.text = "Сижу за ширмой. У меня\n" +
                        "\n" +
                        "Такие крохотные ножки…\n" +
                        "\n" +
                        "Такие ручки у меня,\n" +
                        "\n" +
                        "Такое тесное окошко…\n" +
                        "\n" +
                        "Тепло и темно. Я гашу\n" +
                        "\n" +
                        "Свечу, которую приносят,\n" +
                        "\n" +
                        "Но благодарность приношу…\n" +
                        "\n" +
                        "Меня давно развлечься просят,\n" +
                        "\n" +
                        "Но эти ручки… Я влюблен\n" +
                        "\n" +
                        "В мою морщинистую кожу…"
            }else{
                textView.text = "Могу увидеть сладкий сон,\n" +
                        "\n" +
                        "Но я себя не потревожу:\n" +
                        "\n" +
                        "Не потревожу забытья,\n" +
                        "\n" +
                        "Вот этих бликов на окошке…\n" +
                        "\n" +
                        "И ручки скрещиваю я,\n" +
                        "\n" +
                        "И также скрещиваю ножки.\n" +
                        "\n" +
                        "Сижу за ширмой. Здесь тепло.\n" +
                        "\n" +
                        "Здесь кто-то есть. Не надо свечки.\n" +
                        "\n" +
                        "Глаза бездонны, как стекло.\n" +
                        "\n" +
                        "На ручке сморщенной – колечки."
            }
        }
    }

}