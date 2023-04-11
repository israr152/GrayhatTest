package com.example.grayhattestproject.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0002J&\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u0012H\u0016J\u001a\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u00142\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\b\u0010\u001e\u001a\u00020\u0012H\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u001f"}, d2 = {"Lcom/example/grayhattestproject/ui/ProductsFragment;", "Landroidx/fragment/app/Fragment;", "()V", "adapter", "Lcom/example/grayhattestproject/adapters/ProductsAdapter;", "getAdapter", "()Lcom/example/grayhattestproject/adapters/ProductsAdapter;", "setAdapter", "(Lcom/example/grayhattestproject/adapters/ProductsAdapter;)V", "binding", "Lcom/example/grayhattestproject/databinding/FragmentProductsBinding;", "homeViewModel", "Lcom/example/grayhattestproject/viewmodels/HomeViewModel;", "getHomeViewModel", "()Lcom/example/grayhattestproject/viewmodels/HomeViewModel;", "homeViewModel$delegate", "Lkotlin/Lazy;", "initRecycler", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onViewCreated", "view", "setObserver", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class ProductsFragment extends androidx.fragment.app.Fragment {
    private com.example.grayhattestproject.databinding.FragmentProductsBinding binding;
    private final kotlin.Lazy homeViewModel$delegate = null;
    @javax.inject.Inject()
    public com.example.grayhattestproject.adapters.ProductsAdapter adapter;
    
    public ProductsFragment() {
        super();
    }
    
    private final com.example.grayhattestproject.viewmodels.HomeViewModel getHomeViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.grayhattestproject.adapters.ProductsAdapter getAdapter() {
        return null;
    }
    
    public final void setAdapter(@org.jetbrains.annotations.NotNull()
    com.example.grayhattestproject.adapters.ProductsAdapter p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setObserver() {
    }
    
    private final void initRecycler() {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
}