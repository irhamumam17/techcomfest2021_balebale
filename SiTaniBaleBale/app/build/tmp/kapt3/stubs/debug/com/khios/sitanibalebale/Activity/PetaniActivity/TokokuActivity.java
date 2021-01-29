package com.khios.sitanibalebale.Activity.PetaniActivity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002JX\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u00112\b\u0010\u0016\u001a\u0004\u0018\u00010\u00112\b\u0010\u0017\u001a\u0004\u0018\u00010\u00112\b\u0010\u0018\u001a\u0004\u0018\u00010\u0011H\u0002J\u0012\u0010\u0019\u001a\u00020\u000f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0014J\b\u0010\u001c\u001a\u00020\u001dH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"Lcom/khios/sitanibalebale/Activity/PetaniActivity/TokokuActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "btnaddproducttokoku", "Lcom/google/android/material/floatingactionbutton/FloatingActionButton;", "isifoto", "Lcom/google/firebase/storage/StorageReference;", "listPro", "Landroidx/recyclerview/widget/RecyclerView;", "proList", "", "Lcom/khios/sitanibalebale/Activity/PetaniActivity/ModelClass/Product;", "produkdb", "Lcom/google/firebase/database/DatabaseReference;", "intentshow", "", "uid", "", "namaproduk", "kategori", "usiaproduk", "luaslahan", "harga", "alamat", "nohp", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onSupportNavigateUp", "", "app_debug"})
public final class TokokuActivity extends androidx.appcompat.app.AppCompatActivity {
    private com.google.firebase.database.DatabaseReference produkdb;
    private java.util.List<com.khios.sitanibalebale.Activity.PetaniActivity.ModelClass.Product> proList;
    private androidx.recyclerview.widget.RecyclerView listPro;
    private com.google.firebase.storage.StorageReference isifoto;
    private com.google.android.material.floatingactionbutton.FloatingActionButton btnaddproducttokoku;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void intentshow(java.lang.String uid, java.lang.String namaproduk, java.lang.String kategori, java.lang.String usiaproduk, java.lang.String luaslahan, java.lang.String harga, java.lang.String alamat, java.lang.String nohp) {
    }
    
    @java.lang.Override()
    public boolean onSupportNavigateUp() {
        return false;
    }
    
    public TokokuActivity() {
        super();
    }
}