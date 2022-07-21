package com.example.todoapp.viewModel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

import com.example.todoapp.database.ItemModel;
import com.example.todoapp.repository.AddRepository;

import java.util.List;

public class ItemViewModel extends AndroidViewModel {

    AddRepository addRepository;
    public ItemViewModel(@NonNull Application application) {
        super(application);
        addRepository = new AddRepository(application);
        // fe error hena
    }
    public void insertItem(ItemModel itemModel){
        addRepository.insertItem(itemModel);
    }

    public void updateItem(ItemModel itemModel){
        addRepository.updateItem(itemModel);
    }

    public void deleteItem(ItemModel itemModel){
        addRepository.deleteItem(itemModel);
    }

    public List<ItemModel> getItem(){
        return addRepository.getItem();
    }
}
