package com.khios.sitanibalebale.Activity.PetaniActivity.ModelClass

data class Product(
    var uid :String? = "",
    var namaproduk: String? = "",
    var kategori: String? = "",
    var usiaproduk: String? = "",
    var luaslahan: String? = "",
    var harga: String? = "",
    var alamat: String? ="",
    var nohp: String? = ""
){
    constructor():this("","","","","","","","")
}
