package com.example.designassignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.example.designassignment.databinding.DrawerPageBinding

class MainActivity : AppCompatActivity() {
    private lateinit var tasarim:DrawerPageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        tasarim = DrawerPageBinding.inflate(layoutInflater)
        setContentView(tasarim.root)

        val navHostFragment=
            supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment

        NavigationUI.setupWithNavController(tasarim.navigationView,navHostFragment.navController)

        val toggle = ActionBarDrawerToggle(this,tasarim.drawer,tasarim.toolbarDrawer,0,0)
        tasarim.drawer.addDrawerListener(toggle)
        toggle.syncState()
/*
        var menuList = ArrayList<MenuList>()
        var menu1 = MenuList(1,"Karaca","one_cikan_karaca")
        var menu2 = MenuList(2,"Jumbo","one_cikan_jumbo")
        var menu3 = MenuList(3,"Emsan","one_cikan_emsan")
        var menu4 = MenuList(4,"Homend","one_cikan_homend")
        var menu5 = MenuList(5,"Karaca Home","one_cikan_karaca_home")
        var menu6 = MenuList(6,"Sarah Anderson","one_cikan_sarah")
        var menu7 = MenuList(7,"CookPlus","one_cikan_cookplus")

        menuList.add(menu1)
        menuList.add(menu2)
        menuList.add(menu3)
        menuList.add(menu4)
        menuList.add(menu5)
        menuList.add(menu6)
        menuList.add(menu7)

        var menusLists = ArrayList<MenusLists>()
        var m1 = MenusLists(1,"Cotton Comfort","cotton_comfort")
        var m2 = MenusLists(2,"Bonus Fırsatları","cotton_comfort")
        var m3 = MenusLists(3,"Mastermaid BioDiomond Tencere Setleri","mastermaid_biodimond")
        var m4 = MenusLists(4,"Air Pro Cook XL","air_pro_cook")
        var m5 = MenusLists(5,"12 Kişilik Çatal Kaşık Bıçak Seti","catal_kasik_set")

        menusLists.add(m1)
        menusLists.add(m2)
        menusLists.add(m3)
        menusLists.add(m4)
        menusLists.add(m5)

        var productList = ArrayList<Products>()
        var p1 = Products(1,"Homend Süpürge","cok_satan_supurge",34999.00,4.9,2709)
        var p2 = Products(1,"Karaca Home Çarşaf","cok_satan_carsaf",179.00,5.0,1094)
        var p3 = Products(3,"Karaca Aries Tatlı Tabağı","cok_satan_tatli_tabaği",49.99,5.0,767)
        var p4 = Products(4,"Karaca Chef Kesme Tahtası","cok_satan_kesme_tahtasi",89.99,4.7,3307)
        var p5 = Products(5,"Kaşmir Halı","cok_satan_kasmir_hali",879.99,4.5,43)

        productList.add(p1)
        productList.add(p2)
        productList.add(p3)
        productList.add(p4)
        productList.add(p5)
        */
    }
}