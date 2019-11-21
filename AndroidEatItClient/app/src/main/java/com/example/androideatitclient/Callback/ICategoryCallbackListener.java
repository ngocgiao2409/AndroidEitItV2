package com.example.androideatitclient.Callback;

import com.example.androideatitclient.Model.BestDealModel;
import com.example.androideatitclient.Model.CategoryModel;

import java.util.List;

public interface ICategoryCallbackListener {
    void onategoryLoadSuccess(List<CategoryModel> categoryModelList);
    void onategoryLoadFailed(String message);
}
