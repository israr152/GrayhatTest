package com.example.grayhattestproject.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0013B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0002J\u0012\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0014R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\b\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0014"}, d2 = {"Lcom/example/grayhattestproject/ui/HomeActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Lcom/example/grayhattestproject/databinding/ActivityMainBinding;", "getBinding", "()Lcom/example/grayhattestproject/databinding/ActivityMainBinding;", "binding$delegate", "Lkotlin/Lazy;", "homeViewModel", "Lcom/example/grayhattestproject/viewmodels/HomeViewModel;", "getHomeViewModel", "()Lcom/example/grayhattestproject/viewmodels/HomeViewModel;", "homeViewModel$delegate", "initializeTabLayout", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "PagerAdapter", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class HomeActivity extends androidx.appcompat.app.AppCompatActivity {
    private final kotlin.Lazy binding$delegate = null;
    private final kotlin.Lazy homeViewModel$delegate = null;
    
    public HomeActivity() {
        super();
    }
    
    private final com.example.grayhattestproject.databinding.ActivityMainBinding getBinding() {
        return null;
    }
    
    private final com.example.grayhattestproject.viewmodels.HomeViewModel getHomeViewModel() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initializeTabLayout() {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\bH\u0016\u00a8\u0006\n"}, d2 = {"Lcom/example/grayhattestproject/ui/HomeActivity$PagerAdapter;", "Landroidx/viewpager2/adapter/FragmentStateAdapter;", "activity", "Landroidx/fragment/app/FragmentActivity;", "(Lcom/example/grayhattestproject/ui/HomeActivity;Landroidx/fragment/app/FragmentActivity;)V", "createFragment", "Landroidx/fragment/app/Fragment;", "position", "", "getItemCount", "app_debug"})
    final class PagerAdapter extends androidx.viewpager2.adapter.FragmentStateAdapter {
        
        public PagerAdapter(@org.jetbrains.annotations.NotNull()
        androidx.fragment.app.FragmentActivity activity) {
            super(null);
        }
        
        @java.lang.Override()
        public int getItemCount() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public androidx.fragment.app.Fragment createFragment(int position) {
            return null;
        }
    }
}