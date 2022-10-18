package com.example.designassignment

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.example.designassignment.databinding.CardTasarimBinding

class ProductAdapter(var nContext: Context,
                  var productList:List<Products>)
    : RecyclerView.Adapter<ProductAdapter.CardTasarimTutucu>() {

    inner class CardTasarimTutucu(tasarim:CardTasarimBinding) :
        RecyclerView.ViewHolder(tasarim.root){
        var tasarim:CardTasarimBinding
        init {
            this.tasarim = tasarim
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarimTutucu {
        val tasarim = CardTasarimBinding.inflate(LayoutInflater.from(nContext),parent,false)
        return CardTasarimTutucu(tasarim)
    }

    override fun onBindViewHolder(holder: CardTasarimTutucu, position: Int) {
        val product = productList.get(position)
        val t = holder.tasarim
        t.imageViewProduct.setImageResource(
            nContext.resources.getIdentifier(product.productPictureName,"drawable",nContext.packageName))

        t.textViewProductName.text = product.productName
        t.textViewPrice.text = product.productPrice.toString()

        t.cardViewProduct.setOnClickListener {
            //val gecis = HomePageFragmentDirections.detailPass(product = product)
            //Navigation.findNavController(it).navigate(gecis)
        }


    }

    override fun getItemCount(): Int {
        return productList.size
    }
}