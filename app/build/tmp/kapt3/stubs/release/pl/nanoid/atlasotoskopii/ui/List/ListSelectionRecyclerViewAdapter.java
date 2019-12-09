package pl.nanoid.atlasotoskopii.ui.List;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0011H\u0016J\u0018\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0011H\u0016R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lpl/nanoid/atlasotoskopii/ui/List/ListSelectionRecyclerViewAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lpl/nanoid/atlasotoskopii/ui/List/ListSelectionViewHolder;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "allObjectsEN", "Lio/realm/RealmResults;", "Lpl/nanoid/atlasotoskopii/Realm/tableen;", "allObjectsPL", "Lpl/nanoid/atlasotoskopii/Realm/tablepl;", "allObjectsRU", "Lpl/nanoid/atlasotoskopii/Realm/tableru;", "cont", "inMemRealm", "Lio/realm/Realm;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "app_release"})
public final class ListSelectionRecyclerViewAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<pl.nanoid.atlasotoskopii.ui.List.ListSelectionViewHolder> {
    private final android.content.Context cont = null;
    private final io.realm.Realm inMemRealm = null;
    private io.realm.RealmResults<pl.nanoid.atlasotoskopii.Realm.tablepl> allObjectsPL;
    private io.realm.RealmResults<pl.nanoid.atlasotoskopii.Realm.tableen> allObjectsEN;
    private io.realm.RealmResults<pl.nanoid.atlasotoskopii.Realm.tableru> allObjectsRU;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public pl.nanoid.atlasotoskopii.ui.List.ListSelectionViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    pl.nanoid.atlasotoskopii.ui.List.ListSelectionViewHolder holder, int position) {
    }
    
    public ListSelectionRecyclerViewAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
}