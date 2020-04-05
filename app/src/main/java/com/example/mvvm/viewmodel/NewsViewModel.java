package com.example.mvvm.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.mvvm.model.NewsResponse;
import com.example.mvvm.networking.NewsRepository;


public class NewsViewModel extends ViewModel {

    private MutableLiveData<NewsResponse> mutableLiveData;
    private NewsRepository newsRepository;


    public void init(){
        if (mutableLiveData != null){
            return;
        }
        newsRepository = NewsRepository.getInstance();
        mutableLiveData = newsRepository.getNews("google-news", "03bbaa5105344eb692f5a8623d984999");

    }

    public LiveData<NewsResponse> getNewsRepository() {
        return mutableLiveData;
    }

}