package shafi.example.smartphonshop.viewmodels;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import java.util.List;

import shafi.example.smartphonshop.models.Product;
import shafi.example.smartphonshop.repositories.ShopRepo;

public class ShopViewModel extends ViewModel {

    ShopRepo shopRepo = new ShopRepo();

    public LiveData<List<Product>> getProducts(){

        return shopRepo.getProducts();
    }
}
