package shafi.example.smartphonshop.repositories;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import shafi.example.smartphonshop.models.Product;

public class ShopRepo {

    private MutableLiveData<List<Product>> mutableProductList;

    public LiveData<List<Product>> getProducts(){
        if(mutableProductList == null){
            mutableProductList = new MutableLiveData<>();
            loadProducts();
        }
        return  mutableProductList;
    }
    private void loadProducts(){
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(UUID.randomUUID().toString(),"Xiomi M2",1500,true,
                "https://firebasestorage.googleapis.com/v0/b/startup-abbcc.appspot.com/o/Xiaomi-Poco-M2.jpg?alt=media&token=7ced6f9b-e76d-4232-a5c0-75c28a9b6072"));

        productList.add(new Product(UUID.randomUUID().toString(),"Xiomi M2",1500,true,
                "https://firebasestorage.googleapis.com/v0/b/startup-abbcc.appspot.com/o/Xiaomi-Poco-M2.jpg?alt=media&token=7ced6f9b-e76d-4232-a5c0-75c28a9b6072"));
        productList.add(new Product(UUID.randomUUID().toString(),"Huawei",1500,true,
                "https://i.dlpng.com/static/png/6934553_preview.png"));
        productList.add(new Product(UUID.randomUUID().toString(),"Nokia 5",1500,true,
                "https://cdn.imgbin.com/22/5/4/imgbin-feature-phone-smartphone-nokia-5-samsung-galaxy-note-8-nokia-6-samsung-note-8-G581at41UyLtcigCPfxbV3mJd.jpg"));
        productList.add(new Product(UUID.randomUUID().toString(),"Nokia 8",1500,true,
                "https://img2.pngio.com/nokia-8-nokia-5-dual-sim-smartphone-transparent-background-nokia-8-png-700_700.png"));
        productList.add(new Product(UUID.randomUUID().toString(),"IPhone X",1500,true,
                "https://p7.hiclipart.com/preview/70/904/1015/iphone-x-iphone-8-smartphone-apple-ios-11-smartphone.jpg"));
        productList.add(new Product(UUID.randomUUID().toString(),"Samsung Note 5",1500,true,
                "https://static.toiimg.com/thumb/msid-54059006,width-220,resizemode-4,imgv-0/Samsung-Galaxy-Note-5-32GB.jpg"));
        productList.add(new Product(UUID.randomUUID().toString(),"Galaxy s7",1500,true,
                "https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcQqIrj7uq404XbzW-7T8DIuh5YtQXxGyizL2g&usqp=CAU"));
        productList.add(new Product(UUID.randomUUID().toString(),"Xiaomi Mi 5x",1500,true,
                "https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcQqGAYtOonCu6G7dP6mO_WeJgr4j4K0OUfpqA&usqp=CAU"));
        productList.add(new Product(UUID.randomUUID().toString(),"Iphone 4",1500,false,
                "https://freepngimg.com/thumb/smartphone/21604-1-smartphone-transparent-background.png"));

        mutableProductList.setValue(productList);
    }

}
