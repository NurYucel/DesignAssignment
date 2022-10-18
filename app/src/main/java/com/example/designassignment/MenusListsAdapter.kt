package com.example.designassignment

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.designassignment.databinding.MenusListsBinding

class MenusListsAdapter(
    var nContext: Context,
    var menusLists: ArrayList<MenusLists>
)
    : RecyclerView.Adapter<MenusListsAdapter.MenusListsTutucu>() {

    inner class MenusListsTutucu(tasarim: MenusListsBinding) : RecyclerView.ViewHolder(tasarim.root){
        var tasarim: MenusListsBinding
        init {
            this.tasarim = tasarim
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MenusListsTutucu {
        val tasarim = MenusListsBinding.inflate(LayoutInflater.from(nContext),parent,false)
        return MenusListsTutucu(tasarim)
    }

    override fun onBindViewHolder(holder: MenusListsTutucu, position: Int) {
        val product = menusLists.get(position)
        val t = holder.tasarim
        t.ivPic.setImageResource(
            nContext.resources.getIdentifier(product.menuItemPic,"drawable",nContext.packageName))

        t.tvName.text = product.menuItemName

        t.cardVievMenusLists.setOnClickListener {
            //val gecis = HomePageFragmentDirections.detailPass(product = product)
            //Navigation.findNavController(it).navigate(gecis)
        }


    }

    override fun getItemCount(): Int {
        return menusLists.size
    }
}