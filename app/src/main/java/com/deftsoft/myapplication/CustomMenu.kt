package com.deftsoft.myapplication

import android.content.Context
import android.view.View
import android.widget.PopupMenu
import android.widget.Toast

class CustomMenu {
    fun customMenu(context: Context, view: View) {
        val pop = PopupMenu(context, view)
        pop.inflate(R.menu.menu)
        pop.setOnMenuItemClickListener {
            when (it!!.itemId) {
                R.id.Edit -> {
                    Toast.makeText(context, "Not right Now", Toast.LENGTH_LONG).show()
                    true;
                };
                R.id.add -> {
                    Toast.makeText(context, "Not right Now", Toast.LENGTH_LONG).show()
                    true;
                }

                R.id.delete -> {
                    Toast.makeText(context, "Not right Now", Toast.LENGTH_LONG).show()
                    true;
                };
                else -> false;
            }

        }
        try {
            val fieldMpopup = PopupMenu::class.java.getDeclaredField("mPopup")
            fieldMpopup.isAccessible= true;
            val mPopup = fieldMpopup.get(pop);
            mPopup.javaClass
                .getDeclaredMethod("SetForceShowIcon",Boolean::class.java)
                .invoke(mPopup,true)
        }catch(e:Exception){

        }finally {
            pop.show()
        }
    }
}