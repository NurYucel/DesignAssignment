package com.example.designassignment

data class Products(var productId:Int,
                    var productName:String,
                    var productPictureName:String,
                    var productPrice:Double,
                    var productRating:Double,
                    var productLiking:Int) : java.io.Serializable {
}