package com.example.designassignment

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.designassignment.databinding.MenuTasarimBinding

class MenuAdapter(
    var nContext: Context,
    var menuLists: ArrayList<MenuList>
)
    : RecyclerView.Adapter<MenuAdapter.MenuTasarimTutucu>() {

    inner class MenuTasarimTutucu(tasarim: MenuTasarimBinding) : RecyclerView.ViewHolder(tasarim.root){
        var tasarim: MenuTasarimBinding
        init {
            this.tasarim = tasarim
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MenuTasarimTutucu {
        val tasarim = MenuTasarimBinding.inflate(LayoutInflater.from(nContext),parent,false)
        return MenuTasarimTutucu(tasarim)
    }

    override fun onBindViewHolder(holder: MenuTasarimTutucu, position: Int) {
        val product = menuLists.get(position)
        val t = holder.tasarim
        t.imageViewMenuPicture.setImageResource(
            nContext.resources.getIdentifier(product.menuItemPicture,"drawable",nContext.packageName))

        t.textViewMenuName.text = product.menuName

        t.cardViewMenu.setOnClickListener {
            //val gecis = HomePageFragmentDirections.detailPass(product = product)
            //Navigation.findNavController(it).navigate(gecis)
        }


    }

    override fun getItemCount(): Int {
        return menuLists.size
    }
}