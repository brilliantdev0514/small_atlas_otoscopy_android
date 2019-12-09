package io.realm;


import android.util.JsonReader;
import io.realm.ImportFlag;
import io.realm.internal.ColumnInfo;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.RealmProxyMediator;
import io.realm.internal.Row;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

@io.realm.annotations.RealmModule
class DefaultRealmModuleMediator extends RealmProxyMediator {

    private static final Set<Class<? extends RealmModel>> MODEL_CLASSES;
    static {
        Set<Class<? extends RealmModel>> modelClasses = new HashSet<Class<? extends RealmModel>>(4);
        modelClasses.add(pl.nanoid.atlasotoskopii.Realm.InMemRealm.class);
        modelClasses.add(pl.nanoid.atlasotoskopii.Realm.tableen.class);
        modelClasses.add(pl.nanoid.atlasotoskopii.Realm.tablepl.class);
        modelClasses.add(pl.nanoid.atlasotoskopii.Realm.tableru.class);
        MODEL_CLASSES = Collections.unmodifiableSet(modelClasses);
    }

    @Override
    public Map<Class<? extends RealmModel>, OsObjectSchemaInfo> getExpectedObjectSchemaInfoMap() {
        Map<Class<? extends RealmModel>, OsObjectSchemaInfo> infoMap = new HashMap<Class<? extends RealmModel>, OsObjectSchemaInfo>(4);
        infoMap.put(pl.nanoid.atlasotoskopii.Realm.InMemRealm.class, io.realm.pl_nanoid_atlasotoskopii_Realm_InMemRealmRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(pl.nanoid.atlasotoskopii.Realm.tableen.class, io.realm.pl_nanoid_atlasotoskopii_Realm_tableenRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(pl.nanoid.atlasotoskopii.Realm.tablepl.class, io.realm.pl_nanoid_atlasotoskopii_Realm_tableplRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(pl.nanoid.atlasotoskopii.Realm.tableru.class, io.realm.pl_nanoid_atlasotoskopii_Realm_tableruRealmProxy.getExpectedObjectSchemaInfo());
        return infoMap;
    }

    @Override
    public ColumnInfo createColumnInfo(Class<? extends RealmModel> clazz, OsSchemaInfo schemaInfo) {
        checkClass(clazz);

        if (clazz.equals(pl.nanoid.atlasotoskopii.Realm.InMemRealm.class)) {
            return io.realm.pl_nanoid_atlasotoskopii_Realm_InMemRealmRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(pl.nanoid.atlasotoskopii.Realm.tableen.class)) {
            return io.realm.pl_nanoid_atlasotoskopii_Realm_tableenRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(pl.nanoid.atlasotoskopii.Realm.tablepl.class)) {
            return io.realm.pl_nanoid_atlasotoskopii_Realm_tableplRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(pl.nanoid.atlasotoskopii.Realm.tableru.class)) {
            return io.realm.pl_nanoid_atlasotoskopii_Realm_tableruRealmProxy.createColumnInfo(schemaInfo);
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public String getSimpleClassNameImpl(Class<? extends RealmModel> clazz) {
        checkClass(clazz);

        if (clazz.equals(pl.nanoid.atlasotoskopii.Realm.InMemRealm.class)) {
            return "InMemRealm";
        }
        if (clazz.equals(pl.nanoid.atlasotoskopii.Realm.tableen.class)) {
            return "tableen";
        }
        if (clazz.equals(pl.nanoid.atlasotoskopii.Realm.tablepl.class)) {
            return "tablepl";
        }
        if (clazz.equals(pl.nanoid.atlasotoskopii.Realm.tableru.class)) {
            return "tableru";
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public <E extends RealmModel> E newInstance(Class<E> clazz, Object baseRealm, Row row, ColumnInfo columnInfo, boolean acceptDefaultValue, List<String> excludeFields) {
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        try {
            objectContext.set((BaseRealm) baseRealm, row, columnInfo, acceptDefaultValue, excludeFields);
            checkClass(clazz);

            if (clazz.equals(pl.nanoid.atlasotoskopii.Realm.InMemRealm.class)) {
                return clazz.cast(new io.realm.pl_nanoid_atlasotoskopii_Realm_InMemRealmRealmProxy());
            }
            if (clazz.equals(pl.nanoid.atlasotoskopii.Realm.tableen.class)) {
                return clazz.cast(new io.realm.pl_nanoid_atlasotoskopii_Realm_tableenRealmProxy());
            }
            if (clazz.equals(pl.nanoid.atlasotoskopii.Realm.tablepl.class)) {
                return clazz.cast(new io.realm.pl_nanoid_atlasotoskopii_Realm_tableplRealmProxy());
            }
            if (clazz.equals(pl.nanoid.atlasotoskopii.Realm.tableru.class)) {
                return clazz.cast(new io.realm.pl_nanoid_atlasotoskopii_Realm_tableruRealmProxy());
            }
            throw getMissingProxyClassException(clazz);
        } finally {
            objectContext.clear();
        }
    }

    @Override
    public Set<Class<? extends RealmModel>> getModelClasses() {
        return MODEL_CLASSES;
    }

    @Override
    public <E extends RealmModel> E copyOrUpdate(Realm realm, E obj, boolean update, Map<RealmModel, RealmObjectProxy> cache, Set<ImportFlag> flags) {
        // This cast is correct because obj is either
        // generated by RealmProxy or the original type extending directly from RealmObject
        @SuppressWarnings("unchecked") Class<E> clazz = (Class<E>) ((obj instanceof RealmObjectProxy) ? obj.getClass().getSuperclass() : obj.getClass());

        if (clazz.equals(pl.nanoid.atlasotoskopii.Realm.InMemRealm.class)) {
            pl_nanoid_atlasotoskopii_Realm_InMemRealmRealmProxy.InMemRealmColumnInfo columnInfo = (pl_nanoid_atlasotoskopii_Realm_InMemRealmRealmProxy.InMemRealmColumnInfo) realm.getSchema().getColumnInfo(pl.nanoid.atlasotoskopii.Realm.InMemRealm.class);
            return clazz.cast(io.realm.pl_nanoid_atlasotoskopii_Realm_InMemRealmRealmProxy.copyOrUpdate(realm, columnInfo, (pl.nanoid.atlasotoskopii.Realm.InMemRealm) obj, update, cache, flags));
        }
        if (clazz.equals(pl.nanoid.atlasotoskopii.Realm.tableen.class)) {
            pl_nanoid_atlasotoskopii_Realm_tableenRealmProxy.tableenColumnInfo columnInfo = (pl_nanoid_atlasotoskopii_Realm_tableenRealmProxy.tableenColumnInfo) realm.getSchema().getColumnInfo(pl.nanoid.atlasotoskopii.Realm.tableen.class);
            return clazz.cast(io.realm.pl_nanoid_atlasotoskopii_Realm_tableenRealmProxy.copyOrUpdate(realm, columnInfo, (pl.nanoid.atlasotoskopii.Realm.tableen) obj, update, cache, flags));
        }
        if (clazz.equals(pl.nanoid.atlasotoskopii.Realm.tablepl.class)) {
            pl_nanoid_atlasotoskopii_Realm_tableplRealmProxy.tableplColumnInfo columnInfo = (pl_nanoid_atlasotoskopii_Realm_tableplRealmProxy.tableplColumnInfo) realm.getSchema().getColumnInfo(pl.nanoid.atlasotoskopii.Realm.tablepl.class);
            return clazz.cast(io.realm.pl_nanoid_atlasotoskopii_Realm_tableplRealmProxy.copyOrUpdate(realm, columnInfo, (pl.nanoid.atlasotoskopii.Realm.tablepl) obj, update, cache, flags));
        }
        if (clazz.equals(pl.nanoid.atlasotoskopii.Realm.tableru.class)) {
            pl_nanoid_atlasotoskopii_Realm_tableruRealmProxy.tableruColumnInfo columnInfo = (pl_nanoid_atlasotoskopii_Realm_tableruRealmProxy.tableruColumnInfo) realm.getSchema().getColumnInfo(pl.nanoid.atlasotoskopii.Realm.tableru.class);
            return clazz.cast(io.realm.pl_nanoid_atlasotoskopii_Realm_tableruRealmProxy.copyOrUpdate(realm, columnInfo, (pl.nanoid.atlasotoskopii.Realm.tableru) obj, update, cache, flags));
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public void insert(Realm realm, RealmModel object, Map<RealmModel, Long> cache) {
        // This cast is correct because obj is either
        // generated by RealmProxy or the original type extending directly from RealmObject
        @SuppressWarnings("unchecked") Class<RealmModel> clazz = (Class<RealmModel>) ((object instanceof RealmObjectProxy) ? object.getClass().getSuperclass() : object.getClass());

        if (clazz.equals(pl.nanoid.atlasotoskopii.Realm.InMemRealm.class)) {
            io.realm.pl_nanoid_atlasotoskopii_Realm_InMemRealmRealmProxy.insert(realm, (pl.nanoid.atlasotoskopii.Realm.InMemRealm) object, cache);
        } else if (clazz.equals(pl.nanoid.atlasotoskopii.Realm.tableen.class)) {
            io.realm.pl_nanoid_atlasotoskopii_Realm_tableenRealmProxy.insert(realm, (pl.nanoid.atlasotoskopii.Realm.tableen) object, cache);
        } else if (clazz.equals(pl.nanoid.atlasotoskopii.Realm.tablepl.class)) {
            io.realm.pl_nanoid_atlasotoskopii_Realm_tableplRealmProxy.insert(realm, (pl.nanoid.atlasotoskopii.Realm.tablepl) object, cache);
        } else if (clazz.equals(pl.nanoid.atlasotoskopii.Realm.tableru.class)) {
            io.realm.pl_nanoid_atlasotoskopii_Realm_tableruRealmProxy.insert(realm, (pl.nanoid.atlasotoskopii.Realm.tableru) object, cache);
        } else {
            throw getMissingProxyClassException(clazz);
        }
    }

    @Override
    public void insert(Realm realm, Collection<? extends RealmModel> objects) {
        Iterator<? extends RealmModel> iterator = objects.iterator();
        RealmModel object = null;
        Map<RealmModel, Long> cache = new HashMap<RealmModel, Long>(objects.size());
        if (iterator.hasNext()) {
            //  access the first element to figure out the clazz for the routing below
            object = iterator.next();
            // This cast is correct because obj is either
            // generated by RealmProxy or the original type extending directly from RealmObject
            @SuppressWarnings("unchecked") Class<RealmModel> clazz = (Class<RealmModel>) ((object instanceof RealmObjectProxy) ? object.getClass().getSuperclass() : object.getClass());

            if (clazz.equals(pl.nanoid.atlasotoskopii.Realm.InMemRealm.class)) {
                io.realm.pl_nanoid_atlasotoskopii_Realm_InMemRealmRealmProxy.insert(realm, (pl.nanoid.atlasotoskopii.Realm.InMemRealm) object, cache);
            } else if (clazz.equals(pl.nanoid.atlasotoskopii.Realm.tableen.class)) {
                io.realm.pl_nanoid_atlasotoskopii_Realm_tableenRealmProxy.insert(realm, (pl.nanoid.atlasotoskopii.Realm.tableen) object, cache);
            } else if (clazz.equals(pl.nanoid.atlasotoskopii.Realm.tablepl.class)) {
                io.realm.pl_nanoid_atlasotoskopii_Realm_tableplRealmProxy.insert(realm, (pl.nanoid.atlasotoskopii.Realm.tablepl) object, cache);
            } else if (clazz.equals(pl.nanoid.atlasotoskopii.Realm.tableru.class)) {
                io.realm.pl_nanoid_atlasotoskopii_Realm_tableruRealmProxy.insert(realm, (pl.nanoid.atlasotoskopii.Realm.tableru) object, cache);
            } else {
                throw getMissingProxyClassException(clazz);
            }
            if (iterator.hasNext()) {
                if (clazz.equals(pl.nanoid.atlasotoskopii.Realm.InMemRealm.class)) {
                    io.realm.pl_nanoid_atlasotoskopii_Realm_InMemRealmRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(pl.nanoid.atlasotoskopii.Realm.tableen.class)) {
                    io.realm.pl_nanoid_atlasotoskopii_Realm_tableenRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(pl.nanoid.atlasotoskopii.Realm.tablepl.class)) {
                    io.realm.pl_nanoid_atlasotoskopii_Realm_tableplRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(pl.nanoid.atlasotoskopii.Realm.tableru.class)) {
                    io.realm.pl_nanoid_atlasotoskopii_Realm_tableruRealmProxy.insert(realm, iterator, cache);
                } else {
                    throw getMissingProxyClassException(clazz);
                }
            }
        }
    }

    @Override
    public void insertOrUpdate(Realm realm, RealmModel obj, Map<RealmModel, Long> cache) {
        // This cast is correct because obj is either
        // generated by RealmProxy or the original type extending directly from RealmObject
        @SuppressWarnings("unchecked") Class<RealmModel> clazz = (Class<RealmModel>) ((obj instanceof RealmObjectProxy) ? obj.getClass().getSuperclass() : obj.getClass());

        if (clazz.equals(pl.nanoid.atlasotoskopii.Realm.InMemRealm.class)) {
            io.realm.pl_nanoid_atlasotoskopii_Realm_InMemRealmRealmProxy.insertOrUpdate(realm, (pl.nanoid.atlasotoskopii.Realm.InMemRealm) obj, cache);
        } else if (clazz.equals(pl.nanoid.atlasotoskopii.Realm.tableen.class)) {
            io.realm.pl_nanoid_atlasotoskopii_Realm_tableenRealmProxy.insertOrUpdate(realm, (pl.nanoid.atlasotoskopii.Realm.tableen) obj, cache);
        } else if (clazz.equals(pl.nanoid.atlasotoskopii.Realm.tablepl.class)) {
            io.realm.pl_nanoid_atlasotoskopii_Realm_tableplRealmProxy.insertOrUpdate(realm, (pl.nanoid.atlasotoskopii.Realm.tablepl) obj, cache);
        } else if (clazz.equals(pl.nanoid.atlasotoskopii.Realm.tableru.class)) {
            io.realm.pl_nanoid_atlasotoskopii_Realm_tableruRealmProxy.insertOrUpdate(realm, (pl.nanoid.atlasotoskopii.Realm.tableru) obj, cache);
        } else {
            throw getMissingProxyClassException(clazz);
        }
    }

    @Override
    public void insertOrUpdate(Realm realm, Collection<? extends RealmModel> objects) {
        Iterator<? extends RealmModel> iterator = objects.iterator();
        RealmModel object = null;
        Map<RealmModel, Long> cache = new HashMap<RealmModel, Long>(objects.size());
        if (iterator.hasNext()) {
            //  access the first element to figure out the clazz for the routing below
            object = iterator.next();
            // This cast is correct because obj is either
            // generated by RealmProxy or the original type extending directly from RealmObject
            @SuppressWarnings("unchecked") Class<RealmModel> clazz = (Class<RealmModel>) ((object instanceof RealmObjectProxy) ? object.getClass().getSuperclass() : object.getClass());

            if (clazz.equals(pl.nanoid.atlasotoskopii.Realm.InMemRealm.class)) {
                io.realm.pl_nanoid_atlasotoskopii_Realm_InMemRealmRealmProxy.insertOrUpdate(realm, (pl.nanoid.atlasotoskopii.Realm.InMemRealm) object, cache);
            } else if (clazz.equals(pl.nanoid.atlasotoskopii.Realm.tableen.class)) {
                io.realm.pl_nanoid_atlasotoskopii_Realm_tableenRealmProxy.insertOrUpdate(realm, (pl.nanoid.atlasotoskopii.Realm.tableen) object, cache);
            } else if (clazz.equals(pl.nanoid.atlasotoskopii.Realm.tablepl.class)) {
                io.realm.pl_nanoid_atlasotoskopii_Realm_tableplRealmProxy.insertOrUpdate(realm, (pl.nanoid.atlasotoskopii.Realm.tablepl) object, cache);
            } else if (clazz.equals(pl.nanoid.atlasotoskopii.Realm.tableru.class)) {
                io.realm.pl_nanoid_atlasotoskopii_Realm_tableruRealmProxy.insertOrUpdate(realm, (pl.nanoid.atlasotoskopii.Realm.tableru) object, cache);
            } else {
                throw getMissingProxyClassException(clazz);
            }
            if (iterator.hasNext()) {
                if (clazz.equals(pl.nanoid.atlasotoskopii.Realm.InMemRealm.class)) {
                    io.realm.pl_nanoid_atlasotoskopii_Realm_InMemRealmRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(pl.nanoid.atlasotoskopii.Realm.tableen.class)) {
                    io.realm.pl_nanoid_atlasotoskopii_Realm_tableenRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(pl.nanoid.atlasotoskopii.Realm.tablepl.class)) {
                    io.realm.pl_nanoid_atlasotoskopii_Realm_tableplRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(pl.nanoid.atlasotoskopii.Realm.tableru.class)) {
                    io.realm.pl_nanoid_atlasotoskopii_Realm_tableruRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else {
                    throw getMissingProxyClassException(clazz);
                }
            }
        }
    }

    @Override
    public <E extends RealmModel> E createOrUpdateUsingJsonObject(Class<E> clazz, Realm realm, JSONObject json, boolean update)
        throws JSONException {
        checkClass(clazz);

        if (clazz.equals(pl.nanoid.atlasotoskopii.Realm.InMemRealm.class)) {
            return clazz.cast(io.realm.pl_nanoid_atlasotoskopii_Realm_InMemRealmRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(pl.nanoid.atlasotoskopii.Realm.tableen.class)) {
            return clazz.cast(io.realm.pl_nanoid_atlasotoskopii_Realm_tableenRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(pl.nanoid.atlasotoskopii.Realm.tablepl.class)) {
            return clazz.cast(io.realm.pl_nanoid_atlasotoskopii_Realm_tableplRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(pl.nanoid.atlasotoskopii.Realm.tableru.class)) {
            return clazz.cast(io.realm.pl_nanoid_atlasotoskopii_Realm_tableruRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public <E extends RealmModel> E createUsingJsonStream(Class<E> clazz, Realm realm, JsonReader reader)
        throws IOException {
        checkClass(clazz);

        if (clazz.equals(pl.nanoid.atlasotoskopii.Realm.InMemRealm.class)) {
            return clazz.cast(io.realm.pl_nanoid_atlasotoskopii_Realm_InMemRealmRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(pl.nanoid.atlasotoskopii.Realm.tableen.class)) {
            return clazz.cast(io.realm.pl_nanoid_atlasotoskopii_Realm_tableenRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(pl.nanoid.atlasotoskopii.Realm.tablepl.class)) {
            return clazz.cast(io.realm.pl_nanoid_atlasotoskopii_Realm_tableplRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(pl.nanoid.atlasotoskopii.Realm.tableru.class)) {
            return clazz.cast(io.realm.pl_nanoid_atlasotoskopii_Realm_tableruRealmProxy.createUsingJsonStream(realm, reader));
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public <E extends RealmModel> E createDetachedCopy(E realmObject, int maxDepth, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> cache) {
        // This cast is correct because obj is either
        // generated by RealmProxy or the original type extending directly from RealmObject
        @SuppressWarnings("unchecked") Class<E> clazz = (Class<E>) realmObject.getClass().getSuperclass();

        if (clazz.equals(pl.nanoid.atlasotoskopii.Realm.InMemRealm.class)) {
            return clazz.cast(io.realm.pl_nanoid_atlasotoskopii_Realm_InMemRealmRealmProxy.createDetachedCopy((pl.nanoid.atlasotoskopii.Realm.InMemRealm) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(pl.nanoid.atlasotoskopii.Realm.tableen.class)) {
            return clazz.cast(io.realm.pl_nanoid_atlasotoskopii_Realm_tableenRealmProxy.createDetachedCopy((pl.nanoid.atlasotoskopii.Realm.tableen) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(pl.nanoid.atlasotoskopii.Realm.tablepl.class)) {
            return clazz.cast(io.realm.pl_nanoid_atlasotoskopii_Realm_tableplRealmProxy.createDetachedCopy((pl.nanoid.atlasotoskopii.Realm.tablepl) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(pl.nanoid.atlasotoskopii.Realm.tableru.class)) {
            return clazz.cast(io.realm.pl_nanoid_atlasotoskopii_Realm_tableruRealmProxy.createDetachedCopy((pl.nanoid.atlasotoskopii.Realm.tableru) realmObject, 0, maxDepth, cache));
        }
        throw getMissingProxyClassException(clazz);
    }

}
