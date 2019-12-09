package io.realm;


import android.annotation.TargetApi;
import android.os.Build;
import android.util.JsonReader;
import android.util.JsonToken;
import io.realm.ImportFlag;
import io.realm.ProxyUtils;
import io.realm.exceptions.RealmMigrationNeededException;
import io.realm.internal.ColumnInfo;
import io.realm.internal.OsList;
import io.realm.internal.OsObject;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.Property;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.Row;
import io.realm.internal.Table;
import io.realm.internal.android.JsonUtils;
import io.realm.internal.objectstore.OsObjectBuilder;
import io.realm.log.RealmLog;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@SuppressWarnings("all")
public class pl_nanoid_atlasotoskopii_Realm_InMemRealmRealmProxy extends pl.nanoid.atlasotoskopii.Realm.InMemRealm
    implements RealmObjectProxy, pl_nanoid_atlasotoskopii_Realm_InMemRealmRealmProxyInterface {

    static final class InMemRealmColumnInfo extends ColumnInfo {
        long maxColumnIndexValue;
        long idIndex;

        InMemRealmColumnInfo(OsSchemaInfo schemaInfo) {
            super(1);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("InMemRealm");
            this.idIndex = addColumnDetails("id", "id", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        InMemRealmColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new InMemRealmColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final InMemRealmColumnInfo src = (InMemRealmColumnInfo) rawSrc;
            final InMemRealmColumnInfo dst = (InMemRealmColumnInfo) rawDst;
            dst.idIndex = src.idIndex;
            dst.maxColumnIndexValue = src.maxColumnIndexValue;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private InMemRealmColumnInfo columnInfo;
    private ProxyState<pl.nanoid.atlasotoskopii.Realm.InMemRealm> proxyState;

    pl_nanoid_atlasotoskopii_Realm_InMemRealmRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (InMemRealmColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<pl.nanoid.atlasotoskopii.Realm.InMemRealm>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public Integer realmGet$id() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNull(columnInfo.idIndex)) {
            return null;
        }
        return (int) proxyState.getRow$realm().getLong(columnInfo.idIndex);
    }

    @Override
    public void realmSet$id(Integer value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.idIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setLong(columnInfo.idIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.idIndex);
            return;
        }
        proxyState.getRow$realm().setLong(columnInfo.idIndex, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("InMemRealm", 1, 0);
        builder.addPersistedProperty("id", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static InMemRealmColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new InMemRealmColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "InMemRealm";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "InMemRealm";
    }

    @SuppressWarnings("cast")
    public static pl.nanoid.atlasotoskopii.Realm.InMemRealm createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        pl.nanoid.atlasotoskopii.Realm.InMemRealm obj = realm.createObjectInternal(pl.nanoid.atlasotoskopii.Realm.InMemRealm.class, true, excludeFields);

        final pl_nanoid_atlasotoskopii_Realm_InMemRealmRealmProxyInterface objProxy = (pl_nanoid_atlasotoskopii_Realm_InMemRealmRealmProxyInterface) obj;
        if (json.has("id")) {
            if (json.isNull("id")) {
                objProxy.realmSet$id(null);
            } else {
                objProxy.realmSet$id((int) json.getInt("id"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static pl.nanoid.atlasotoskopii.Realm.InMemRealm createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        final pl.nanoid.atlasotoskopii.Realm.InMemRealm obj = new pl.nanoid.atlasotoskopii.Realm.InMemRealm();
        final pl_nanoid_atlasotoskopii_Realm_InMemRealmRealmProxyInterface objProxy = (pl_nanoid_atlasotoskopii_Realm_InMemRealmRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("id")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$id((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$id(null);
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return realm.copyToRealm(obj);
    }

    private static pl_nanoid_atlasotoskopii_Realm_InMemRealmRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating unexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(pl.nanoid.atlasotoskopii.Realm.InMemRealm.class), false, Collections.<String>emptyList());
        io.realm.pl_nanoid_atlasotoskopii_Realm_InMemRealmRealmProxy obj = new io.realm.pl_nanoid_atlasotoskopii_Realm_InMemRealmRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static pl.nanoid.atlasotoskopii.Realm.InMemRealm copyOrUpdate(Realm realm, InMemRealmColumnInfo columnInfo, pl.nanoid.atlasotoskopii.Realm.InMemRealm object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null) {
            final BaseRealm otherRealm = ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm();
            if (otherRealm.threadId != realm.threadId) {
                throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
            }
            if (otherRealm.getPath().equals(realm.getPath())) {
                return object;
            }
        }
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        RealmObjectProxy cachedRealmObject = cache.get(object);
        if (cachedRealmObject != null) {
            return (pl.nanoid.atlasotoskopii.Realm.InMemRealm) cachedRealmObject;
        }

        return copy(realm, columnInfo, object, update, cache, flags);
    }

    public static pl.nanoid.atlasotoskopii.Realm.InMemRealm copy(Realm realm, InMemRealmColumnInfo columnInfo, pl.nanoid.atlasotoskopii.Realm.InMemRealm newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (pl.nanoid.atlasotoskopii.Realm.InMemRealm) cachedRealmObject;
        }

        pl_nanoid_atlasotoskopii_Realm_InMemRealmRealmProxyInterface realmObjectSource = (pl_nanoid_atlasotoskopii_Realm_InMemRealmRealmProxyInterface) newObject;

        Table table = realm.getTable(pl.nanoid.atlasotoskopii.Realm.InMemRealm.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, columnInfo.maxColumnIndexValue, flags);

        // Add all non-"object reference" fields
        builder.addInteger(columnInfo.idIndex, realmObjectSource.realmGet$id());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.pl_nanoid_atlasotoskopii_Realm_InMemRealmRealmProxy realmObjectCopy = newProxyInstance(realm, row);
        cache.put(newObject, realmObjectCopy);

        return realmObjectCopy;
    }

    public static long insert(Realm realm, pl.nanoid.atlasotoskopii.Realm.InMemRealm object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(pl.nanoid.atlasotoskopii.Realm.InMemRealm.class);
        long tableNativePtr = table.getNativePtr();
        InMemRealmColumnInfo columnInfo = (InMemRealmColumnInfo) realm.getSchema().getColumnInfo(pl.nanoid.atlasotoskopii.Realm.InMemRealm.class);
        long rowIndex = OsObject.createRow(table);
        cache.put(object, rowIndex);
        Number realmGet$id = ((pl_nanoid_atlasotoskopii_Realm_InMemRealmRealmProxyInterface) object).realmGet$id();
        if (realmGet$id != null) {
            Table.nativeSetLong(tableNativePtr, columnInfo.idIndex, rowIndex, realmGet$id.longValue(), false);
        }
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(pl.nanoid.atlasotoskopii.Realm.InMemRealm.class);
        long tableNativePtr = table.getNativePtr();
        InMemRealmColumnInfo columnInfo = (InMemRealmColumnInfo) realm.getSchema().getColumnInfo(pl.nanoid.atlasotoskopii.Realm.InMemRealm.class);
        pl.nanoid.atlasotoskopii.Realm.InMemRealm object = null;
        while (objects.hasNext()) {
            object = (pl.nanoid.atlasotoskopii.Realm.InMemRealm) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = OsObject.createRow(table);
            cache.put(object, rowIndex);
            Number realmGet$id = ((pl_nanoid_atlasotoskopii_Realm_InMemRealmRealmProxyInterface) object).realmGet$id();
            if (realmGet$id != null) {
                Table.nativeSetLong(tableNativePtr, columnInfo.idIndex, rowIndex, realmGet$id.longValue(), false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, pl.nanoid.atlasotoskopii.Realm.InMemRealm object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(pl.nanoid.atlasotoskopii.Realm.InMemRealm.class);
        long tableNativePtr = table.getNativePtr();
        InMemRealmColumnInfo columnInfo = (InMemRealmColumnInfo) realm.getSchema().getColumnInfo(pl.nanoid.atlasotoskopii.Realm.InMemRealm.class);
        long rowIndex = OsObject.createRow(table);
        cache.put(object, rowIndex);
        Number realmGet$id = ((pl_nanoid_atlasotoskopii_Realm_InMemRealmRealmProxyInterface) object).realmGet$id();
        if (realmGet$id != null) {
            Table.nativeSetLong(tableNativePtr, columnInfo.idIndex, rowIndex, realmGet$id.longValue(), false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.idIndex, rowIndex, false);
        }
        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(pl.nanoid.atlasotoskopii.Realm.InMemRealm.class);
        long tableNativePtr = table.getNativePtr();
        InMemRealmColumnInfo columnInfo = (InMemRealmColumnInfo) realm.getSchema().getColumnInfo(pl.nanoid.atlasotoskopii.Realm.InMemRealm.class);
        pl.nanoid.atlasotoskopii.Realm.InMemRealm object = null;
        while (objects.hasNext()) {
            object = (pl.nanoid.atlasotoskopii.Realm.InMemRealm) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = OsObject.createRow(table);
            cache.put(object, rowIndex);
            Number realmGet$id = ((pl_nanoid_atlasotoskopii_Realm_InMemRealmRealmProxyInterface) object).realmGet$id();
            if (realmGet$id != null) {
                Table.nativeSetLong(tableNativePtr, columnInfo.idIndex, rowIndex, realmGet$id.longValue(), false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.idIndex, rowIndex, false);
            }
        }
    }

    public static pl.nanoid.atlasotoskopii.Realm.InMemRealm createDetachedCopy(pl.nanoid.atlasotoskopii.Realm.InMemRealm realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        pl.nanoid.atlasotoskopii.Realm.InMemRealm unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new pl.nanoid.atlasotoskopii.Realm.InMemRealm();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (pl.nanoid.atlasotoskopii.Realm.InMemRealm) cachedObject.object;
            }
            unmanagedObject = (pl.nanoid.atlasotoskopii.Realm.InMemRealm) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        pl_nanoid_atlasotoskopii_Realm_InMemRealmRealmProxyInterface unmanagedCopy = (pl_nanoid_atlasotoskopii_Realm_InMemRealmRealmProxyInterface) unmanagedObject;
        pl_nanoid_atlasotoskopii_Realm_InMemRealmRealmProxyInterface realmSource = (pl_nanoid_atlasotoskopii_Realm_InMemRealmRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$id(realmSource.realmGet$id());

        return unmanagedObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("InMemRealm = proxy[");
        stringBuilder.append("{id:");
        stringBuilder.append(realmGet$id() != null ? realmGet$id() : "null");
        stringBuilder.append("}");
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    @Override
    public ProxyState<?> realmGet$proxyState() {
        return proxyState;
    }

    @Override
    public int hashCode() {
        String realmName = proxyState.getRealm$realm().getPath();
        String tableName = proxyState.getRow$realm().getTable().getName();
        long rowIndex = proxyState.getRow$realm().getIndex();

        int result = 17;
        result = 31 * result + ((realmName != null) ? realmName.hashCode() : 0);
        result = 31 * result + ((tableName != null) ? tableName.hashCode() : 0);
        result = 31 * result + (int) (rowIndex ^ (rowIndex >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        pl_nanoid_atlasotoskopii_Realm_InMemRealmRealmProxy aInMemRealm = (pl_nanoid_atlasotoskopii_Realm_InMemRealmRealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = aInMemRealm.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aInMemRealm.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != aInMemRealm.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }
}
