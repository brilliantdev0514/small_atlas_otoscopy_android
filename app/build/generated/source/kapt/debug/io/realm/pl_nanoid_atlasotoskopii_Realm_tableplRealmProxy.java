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
public class pl_nanoid_atlasotoskopii_Realm_tableplRealmProxy extends pl.nanoid.atlasotoskopii.Realm.tablepl
    implements RealmObjectProxy, pl_nanoid_atlasotoskopii_Realm_tableplRealmProxyInterface {

    static final class tableplColumnInfo extends ColumnInfo {
        long maxColumnIndexValue;
        long dis_idIndex;
        long dis_nameIndex;
        long dis_descriptionIndex;
        long dis_short_descriptionIndex;
        long dis_treatmentIndex;
        long dis_img_descriptionIndex;
        long dis_proposed_treatmentIndex;

        tableplColumnInfo(OsSchemaInfo schemaInfo) {
            super(7);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("tablepl");
            this.dis_idIndex = addColumnDetails("dis_id", "dis_id", objectSchemaInfo);
            this.dis_nameIndex = addColumnDetails("dis_name", "dis_name", objectSchemaInfo);
            this.dis_descriptionIndex = addColumnDetails("dis_description", "dis_description", objectSchemaInfo);
            this.dis_short_descriptionIndex = addColumnDetails("dis_short_description", "dis_short_description", objectSchemaInfo);
            this.dis_treatmentIndex = addColumnDetails("dis_treatment", "dis_treatment", objectSchemaInfo);
            this.dis_img_descriptionIndex = addColumnDetails("dis_img_description", "dis_img_description", objectSchemaInfo);
            this.dis_proposed_treatmentIndex = addColumnDetails("dis_proposed_treatment", "dis_proposed_treatment", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        tableplColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new tableplColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final tableplColumnInfo src = (tableplColumnInfo) rawSrc;
            final tableplColumnInfo dst = (tableplColumnInfo) rawDst;
            dst.dis_idIndex = src.dis_idIndex;
            dst.dis_nameIndex = src.dis_nameIndex;
            dst.dis_descriptionIndex = src.dis_descriptionIndex;
            dst.dis_short_descriptionIndex = src.dis_short_descriptionIndex;
            dst.dis_treatmentIndex = src.dis_treatmentIndex;
            dst.dis_img_descriptionIndex = src.dis_img_descriptionIndex;
            dst.dis_proposed_treatmentIndex = src.dis_proposed_treatmentIndex;
            dst.maxColumnIndexValue = src.maxColumnIndexValue;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private tableplColumnInfo columnInfo;
    private ProxyState<pl.nanoid.atlasotoskopii.Realm.tablepl> proxyState;

    pl_nanoid_atlasotoskopii_Realm_tableplRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (tableplColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<pl.nanoid.atlasotoskopii.Realm.tablepl>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public Long realmGet$dis_id() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNull(columnInfo.dis_idIndex)) {
            return null;
        }
        return (long) proxyState.getRow$realm().getLong(columnInfo.dis_idIndex);
    }

    @Override
    public void realmSet$dis_id(Long value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.dis_idIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setLong(columnInfo.dis_idIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.dis_idIndex);
            return;
        }
        proxyState.getRow$realm().setLong(columnInfo.dis_idIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$dis_name() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.dis_nameIndex);
    }

    @Override
    public void realmSet$dis_name(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.dis_nameIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.dis_nameIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.dis_nameIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.dis_nameIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$dis_description() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.dis_descriptionIndex);
    }

    @Override
    public void realmSet$dis_description(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.dis_descriptionIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.dis_descriptionIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.dis_descriptionIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.dis_descriptionIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$dis_short_description() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.dis_short_descriptionIndex);
    }

    @Override
    public void realmSet$dis_short_description(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.dis_short_descriptionIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.dis_short_descriptionIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.dis_short_descriptionIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.dis_short_descriptionIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$dis_treatment() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.dis_treatmentIndex);
    }

    @Override
    public void realmSet$dis_treatment(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.dis_treatmentIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.dis_treatmentIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.dis_treatmentIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.dis_treatmentIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$dis_img_description() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.dis_img_descriptionIndex);
    }

    @Override
    public void realmSet$dis_img_description(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.dis_img_descriptionIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.dis_img_descriptionIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.dis_img_descriptionIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.dis_img_descriptionIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$dis_proposed_treatment() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.dis_proposed_treatmentIndex);
    }

    @Override
    public void realmSet$dis_proposed_treatment(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.dis_proposed_treatmentIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.dis_proposed_treatmentIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.dis_proposed_treatmentIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.dis_proposed_treatmentIndex, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("tablepl", 7, 0);
        builder.addPersistedProperty("dis_id", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("dis_name", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("dis_description", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("dis_short_description", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("dis_treatment", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("dis_img_description", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("dis_proposed_treatment", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static tableplColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new tableplColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "tablepl";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "tablepl";
    }

    @SuppressWarnings("cast")
    public static pl.nanoid.atlasotoskopii.Realm.tablepl createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        pl.nanoid.atlasotoskopii.Realm.tablepl obj = realm.createObjectInternal(pl.nanoid.atlasotoskopii.Realm.tablepl.class, true, excludeFields);

        final pl_nanoid_atlasotoskopii_Realm_tableplRealmProxyInterface objProxy = (pl_nanoid_atlasotoskopii_Realm_tableplRealmProxyInterface) obj;
        if (json.has("dis_id")) {
            if (json.isNull("dis_id")) {
                objProxy.realmSet$dis_id(null);
            } else {
                objProxy.realmSet$dis_id((long) json.getLong("dis_id"));
            }
        }
        if (json.has("dis_name")) {
            if (json.isNull("dis_name")) {
                objProxy.realmSet$dis_name(null);
            } else {
                objProxy.realmSet$dis_name((String) json.getString("dis_name"));
            }
        }
        if (json.has("dis_description")) {
            if (json.isNull("dis_description")) {
                objProxy.realmSet$dis_description(null);
            } else {
                objProxy.realmSet$dis_description((String) json.getString("dis_description"));
            }
        }
        if (json.has("dis_short_description")) {
            if (json.isNull("dis_short_description")) {
                objProxy.realmSet$dis_short_description(null);
            } else {
                objProxy.realmSet$dis_short_description((String) json.getString("dis_short_description"));
            }
        }
        if (json.has("dis_treatment")) {
            if (json.isNull("dis_treatment")) {
                objProxy.realmSet$dis_treatment(null);
            } else {
                objProxy.realmSet$dis_treatment((String) json.getString("dis_treatment"));
            }
        }
        if (json.has("dis_img_description")) {
            if (json.isNull("dis_img_description")) {
                objProxy.realmSet$dis_img_description(null);
            } else {
                objProxy.realmSet$dis_img_description((String) json.getString("dis_img_description"));
            }
        }
        if (json.has("dis_proposed_treatment")) {
            if (json.isNull("dis_proposed_treatment")) {
                objProxy.realmSet$dis_proposed_treatment(null);
            } else {
                objProxy.realmSet$dis_proposed_treatment((String) json.getString("dis_proposed_treatment"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static pl.nanoid.atlasotoskopii.Realm.tablepl createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        final pl.nanoid.atlasotoskopii.Realm.tablepl obj = new pl.nanoid.atlasotoskopii.Realm.tablepl();
        final pl_nanoid_atlasotoskopii_Realm_tableplRealmProxyInterface objProxy = (pl_nanoid_atlasotoskopii_Realm_tableplRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("dis_id")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$dis_id((long) reader.nextLong());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$dis_id(null);
                }
            } else if (name.equals("dis_name")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$dis_name((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$dis_name(null);
                }
            } else if (name.equals("dis_description")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$dis_description((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$dis_description(null);
                }
            } else if (name.equals("dis_short_description")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$dis_short_description((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$dis_short_description(null);
                }
            } else if (name.equals("dis_treatment")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$dis_treatment((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$dis_treatment(null);
                }
            } else if (name.equals("dis_img_description")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$dis_img_description((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$dis_img_description(null);
                }
            } else if (name.equals("dis_proposed_treatment")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$dis_proposed_treatment((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$dis_proposed_treatment(null);
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return realm.copyToRealm(obj);
    }

    private static pl_nanoid_atlasotoskopii_Realm_tableplRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating unexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(pl.nanoid.atlasotoskopii.Realm.tablepl.class), false, Collections.<String>emptyList());
        io.realm.pl_nanoid_atlasotoskopii_Realm_tableplRealmProxy obj = new io.realm.pl_nanoid_atlasotoskopii_Realm_tableplRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static pl.nanoid.atlasotoskopii.Realm.tablepl copyOrUpdate(Realm realm, tableplColumnInfo columnInfo, pl.nanoid.atlasotoskopii.Realm.tablepl object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
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
            return (pl.nanoid.atlasotoskopii.Realm.tablepl) cachedRealmObject;
        }

        return copy(realm, columnInfo, object, update, cache, flags);
    }

    public static pl.nanoid.atlasotoskopii.Realm.tablepl copy(Realm realm, tableplColumnInfo columnInfo, pl.nanoid.atlasotoskopii.Realm.tablepl newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (pl.nanoid.atlasotoskopii.Realm.tablepl) cachedRealmObject;
        }

        pl_nanoid_atlasotoskopii_Realm_tableplRealmProxyInterface realmObjectSource = (pl_nanoid_atlasotoskopii_Realm_tableplRealmProxyInterface) newObject;

        Table table = realm.getTable(pl.nanoid.atlasotoskopii.Realm.tablepl.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, columnInfo.maxColumnIndexValue, flags);

        // Add all non-"object reference" fields
        builder.addInteger(columnInfo.dis_idIndex, realmObjectSource.realmGet$dis_id());
        builder.addString(columnInfo.dis_nameIndex, realmObjectSource.realmGet$dis_name());
        builder.addString(columnInfo.dis_descriptionIndex, realmObjectSource.realmGet$dis_description());
        builder.addString(columnInfo.dis_short_descriptionIndex, realmObjectSource.realmGet$dis_short_description());
        builder.addString(columnInfo.dis_treatmentIndex, realmObjectSource.realmGet$dis_treatment());
        builder.addString(columnInfo.dis_img_descriptionIndex, realmObjectSource.realmGet$dis_img_description());
        builder.addString(columnInfo.dis_proposed_treatmentIndex, realmObjectSource.realmGet$dis_proposed_treatment());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.pl_nanoid_atlasotoskopii_Realm_tableplRealmProxy realmObjectCopy = newProxyInstance(realm, row);
        cache.put(newObject, realmObjectCopy);

        return realmObjectCopy;
    }

    public static long insert(Realm realm, pl.nanoid.atlasotoskopii.Realm.tablepl object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(pl.nanoid.atlasotoskopii.Realm.tablepl.class);
        long tableNativePtr = table.getNativePtr();
        tableplColumnInfo columnInfo = (tableplColumnInfo) realm.getSchema().getColumnInfo(pl.nanoid.atlasotoskopii.Realm.tablepl.class);
        long rowIndex = OsObject.createRow(table);
        cache.put(object, rowIndex);
        Number realmGet$dis_id = ((pl_nanoid_atlasotoskopii_Realm_tableplRealmProxyInterface) object).realmGet$dis_id();
        if (realmGet$dis_id != null) {
            Table.nativeSetLong(tableNativePtr, columnInfo.dis_idIndex, rowIndex, realmGet$dis_id.longValue(), false);
        }
        String realmGet$dis_name = ((pl_nanoid_atlasotoskopii_Realm_tableplRealmProxyInterface) object).realmGet$dis_name();
        if (realmGet$dis_name != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.dis_nameIndex, rowIndex, realmGet$dis_name, false);
        }
        String realmGet$dis_description = ((pl_nanoid_atlasotoskopii_Realm_tableplRealmProxyInterface) object).realmGet$dis_description();
        if (realmGet$dis_description != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.dis_descriptionIndex, rowIndex, realmGet$dis_description, false);
        }
        String realmGet$dis_short_description = ((pl_nanoid_atlasotoskopii_Realm_tableplRealmProxyInterface) object).realmGet$dis_short_description();
        if (realmGet$dis_short_description != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.dis_short_descriptionIndex, rowIndex, realmGet$dis_short_description, false);
        }
        String realmGet$dis_treatment = ((pl_nanoid_atlasotoskopii_Realm_tableplRealmProxyInterface) object).realmGet$dis_treatment();
        if (realmGet$dis_treatment != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.dis_treatmentIndex, rowIndex, realmGet$dis_treatment, false);
        }
        String realmGet$dis_img_description = ((pl_nanoid_atlasotoskopii_Realm_tableplRealmProxyInterface) object).realmGet$dis_img_description();
        if (realmGet$dis_img_description != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.dis_img_descriptionIndex, rowIndex, realmGet$dis_img_description, false);
        }
        String realmGet$dis_proposed_treatment = ((pl_nanoid_atlasotoskopii_Realm_tableplRealmProxyInterface) object).realmGet$dis_proposed_treatment();
        if (realmGet$dis_proposed_treatment != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.dis_proposed_treatmentIndex, rowIndex, realmGet$dis_proposed_treatment, false);
        }
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(pl.nanoid.atlasotoskopii.Realm.tablepl.class);
        long tableNativePtr = table.getNativePtr();
        tableplColumnInfo columnInfo = (tableplColumnInfo) realm.getSchema().getColumnInfo(pl.nanoid.atlasotoskopii.Realm.tablepl.class);
        pl.nanoid.atlasotoskopii.Realm.tablepl object = null;
        while (objects.hasNext()) {
            object = (pl.nanoid.atlasotoskopii.Realm.tablepl) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = OsObject.createRow(table);
            cache.put(object, rowIndex);
            Number realmGet$dis_id = ((pl_nanoid_atlasotoskopii_Realm_tableplRealmProxyInterface) object).realmGet$dis_id();
            if (realmGet$dis_id != null) {
                Table.nativeSetLong(tableNativePtr, columnInfo.dis_idIndex, rowIndex, realmGet$dis_id.longValue(), false);
            }
            String realmGet$dis_name = ((pl_nanoid_atlasotoskopii_Realm_tableplRealmProxyInterface) object).realmGet$dis_name();
            if (realmGet$dis_name != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.dis_nameIndex, rowIndex, realmGet$dis_name, false);
            }
            String realmGet$dis_description = ((pl_nanoid_atlasotoskopii_Realm_tableplRealmProxyInterface) object).realmGet$dis_description();
            if (realmGet$dis_description != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.dis_descriptionIndex, rowIndex, realmGet$dis_description, false);
            }
            String realmGet$dis_short_description = ((pl_nanoid_atlasotoskopii_Realm_tableplRealmProxyInterface) object).realmGet$dis_short_description();
            if (realmGet$dis_short_description != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.dis_short_descriptionIndex, rowIndex, realmGet$dis_short_description, false);
            }
            String realmGet$dis_treatment = ((pl_nanoid_atlasotoskopii_Realm_tableplRealmProxyInterface) object).realmGet$dis_treatment();
            if (realmGet$dis_treatment != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.dis_treatmentIndex, rowIndex, realmGet$dis_treatment, false);
            }
            String realmGet$dis_img_description = ((pl_nanoid_atlasotoskopii_Realm_tableplRealmProxyInterface) object).realmGet$dis_img_description();
            if (realmGet$dis_img_description != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.dis_img_descriptionIndex, rowIndex, realmGet$dis_img_description, false);
            }
            String realmGet$dis_proposed_treatment = ((pl_nanoid_atlasotoskopii_Realm_tableplRealmProxyInterface) object).realmGet$dis_proposed_treatment();
            if (realmGet$dis_proposed_treatment != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.dis_proposed_treatmentIndex, rowIndex, realmGet$dis_proposed_treatment, false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, pl.nanoid.atlasotoskopii.Realm.tablepl object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(pl.nanoid.atlasotoskopii.Realm.tablepl.class);
        long tableNativePtr = table.getNativePtr();
        tableplColumnInfo columnInfo = (tableplColumnInfo) realm.getSchema().getColumnInfo(pl.nanoid.atlasotoskopii.Realm.tablepl.class);
        long rowIndex = OsObject.createRow(table);
        cache.put(object, rowIndex);
        Number realmGet$dis_id = ((pl_nanoid_atlasotoskopii_Realm_tableplRealmProxyInterface) object).realmGet$dis_id();
        if (realmGet$dis_id != null) {
            Table.nativeSetLong(tableNativePtr, columnInfo.dis_idIndex, rowIndex, realmGet$dis_id.longValue(), false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.dis_idIndex, rowIndex, false);
        }
        String realmGet$dis_name = ((pl_nanoid_atlasotoskopii_Realm_tableplRealmProxyInterface) object).realmGet$dis_name();
        if (realmGet$dis_name != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.dis_nameIndex, rowIndex, realmGet$dis_name, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.dis_nameIndex, rowIndex, false);
        }
        String realmGet$dis_description = ((pl_nanoid_atlasotoskopii_Realm_tableplRealmProxyInterface) object).realmGet$dis_description();
        if (realmGet$dis_description != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.dis_descriptionIndex, rowIndex, realmGet$dis_description, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.dis_descriptionIndex, rowIndex, false);
        }
        String realmGet$dis_short_description = ((pl_nanoid_atlasotoskopii_Realm_tableplRealmProxyInterface) object).realmGet$dis_short_description();
        if (realmGet$dis_short_description != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.dis_short_descriptionIndex, rowIndex, realmGet$dis_short_description, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.dis_short_descriptionIndex, rowIndex, false);
        }
        String realmGet$dis_treatment = ((pl_nanoid_atlasotoskopii_Realm_tableplRealmProxyInterface) object).realmGet$dis_treatment();
        if (realmGet$dis_treatment != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.dis_treatmentIndex, rowIndex, realmGet$dis_treatment, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.dis_treatmentIndex, rowIndex, false);
        }
        String realmGet$dis_img_description = ((pl_nanoid_atlasotoskopii_Realm_tableplRealmProxyInterface) object).realmGet$dis_img_description();
        if (realmGet$dis_img_description != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.dis_img_descriptionIndex, rowIndex, realmGet$dis_img_description, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.dis_img_descriptionIndex, rowIndex, false);
        }
        String realmGet$dis_proposed_treatment = ((pl_nanoid_atlasotoskopii_Realm_tableplRealmProxyInterface) object).realmGet$dis_proposed_treatment();
        if (realmGet$dis_proposed_treatment != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.dis_proposed_treatmentIndex, rowIndex, realmGet$dis_proposed_treatment, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.dis_proposed_treatmentIndex, rowIndex, false);
        }
        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(pl.nanoid.atlasotoskopii.Realm.tablepl.class);
        long tableNativePtr = table.getNativePtr();
        tableplColumnInfo columnInfo = (tableplColumnInfo) realm.getSchema().getColumnInfo(pl.nanoid.atlasotoskopii.Realm.tablepl.class);
        pl.nanoid.atlasotoskopii.Realm.tablepl object = null;
        while (objects.hasNext()) {
            object = (pl.nanoid.atlasotoskopii.Realm.tablepl) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = OsObject.createRow(table);
            cache.put(object, rowIndex);
            Number realmGet$dis_id = ((pl_nanoid_atlasotoskopii_Realm_tableplRealmProxyInterface) object).realmGet$dis_id();
            if (realmGet$dis_id != null) {
                Table.nativeSetLong(tableNativePtr, columnInfo.dis_idIndex, rowIndex, realmGet$dis_id.longValue(), false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.dis_idIndex, rowIndex, false);
            }
            String realmGet$dis_name = ((pl_nanoid_atlasotoskopii_Realm_tableplRealmProxyInterface) object).realmGet$dis_name();
            if (realmGet$dis_name != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.dis_nameIndex, rowIndex, realmGet$dis_name, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.dis_nameIndex, rowIndex, false);
            }
            String realmGet$dis_description = ((pl_nanoid_atlasotoskopii_Realm_tableplRealmProxyInterface) object).realmGet$dis_description();
            if (realmGet$dis_description != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.dis_descriptionIndex, rowIndex, realmGet$dis_description, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.dis_descriptionIndex, rowIndex, false);
            }
            String realmGet$dis_short_description = ((pl_nanoid_atlasotoskopii_Realm_tableplRealmProxyInterface) object).realmGet$dis_short_description();
            if (realmGet$dis_short_description != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.dis_short_descriptionIndex, rowIndex, realmGet$dis_short_description, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.dis_short_descriptionIndex, rowIndex, false);
            }
            String realmGet$dis_treatment = ((pl_nanoid_atlasotoskopii_Realm_tableplRealmProxyInterface) object).realmGet$dis_treatment();
            if (realmGet$dis_treatment != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.dis_treatmentIndex, rowIndex, realmGet$dis_treatment, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.dis_treatmentIndex, rowIndex, false);
            }
            String realmGet$dis_img_description = ((pl_nanoid_atlasotoskopii_Realm_tableplRealmProxyInterface) object).realmGet$dis_img_description();
            if (realmGet$dis_img_description != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.dis_img_descriptionIndex, rowIndex, realmGet$dis_img_description, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.dis_img_descriptionIndex, rowIndex, false);
            }
            String realmGet$dis_proposed_treatment = ((pl_nanoid_atlasotoskopii_Realm_tableplRealmProxyInterface) object).realmGet$dis_proposed_treatment();
            if (realmGet$dis_proposed_treatment != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.dis_proposed_treatmentIndex, rowIndex, realmGet$dis_proposed_treatment, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.dis_proposed_treatmentIndex, rowIndex, false);
            }
        }
    }

    public static pl.nanoid.atlasotoskopii.Realm.tablepl createDetachedCopy(pl.nanoid.atlasotoskopii.Realm.tablepl realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        pl.nanoid.atlasotoskopii.Realm.tablepl unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new pl.nanoid.atlasotoskopii.Realm.tablepl();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (pl.nanoid.atlasotoskopii.Realm.tablepl) cachedObject.object;
            }
            unmanagedObject = (pl.nanoid.atlasotoskopii.Realm.tablepl) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        pl_nanoid_atlasotoskopii_Realm_tableplRealmProxyInterface unmanagedCopy = (pl_nanoid_atlasotoskopii_Realm_tableplRealmProxyInterface) unmanagedObject;
        pl_nanoid_atlasotoskopii_Realm_tableplRealmProxyInterface realmSource = (pl_nanoid_atlasotoskopii_Realm_tableplRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$dis_id(realmSource.realmGet$dis_id());
        unmanagedCopy.realmSet$dis_name(realmSource.realmGet$dis_name());
        unmanagedCopy.realmSet$dis_description(realmSource.realmGet$dis_description());
        unmanagedCopy.realmSet$dis_short_description(realmSource.realmGet$dis_short_description());
        unmanagedCopy.realmSet$dis_treatment(realmSource.realmGet$dis_treatment());
        unmanagedCopy.realmSet$dis_img_description(realmSource.realmGet$dis_img_description());
        unmanagedCopy.realmSet$dis_proposed_treatment(realmSource.realmGet$dis_proposed_treatment());

        return unmanagedObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("tablepl = proxy[");
        stringBuilder.append("{dis_id:");
        stringBuilder.append(realmGet$dis_id() != null ? realmGet$dis_id() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{dis_name:");
        stringBuilder.append(realmGet$dis_name() != null ? realmGet$dis_name() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{dis_description:");
        stringBuilder.append(realmGet$dis_description() != null ? realmGet$dis_description() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{dis_short_description:");
        stringBuilder.append(realmGet$dis_short_description() != null ? realmGet$dis_short_description() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{dis_treatment:");
        stringBuilder.append(realmGet$dis_treatment() != null ? realmGet$dis_treatment() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{dis_img_description:");
        stringBuilder.append(realmGet$dis_img_description() != null ? realmGet$dis_img_description() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{dis_proposed_treatment:");
        stringBuilder.append(realmGet$dis_proposed_treatment() != null ? realmGet$dis_proposed_treatment() : "null");
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
        pl_nanoid_atlasotoskopii_Realm_tableplRealmProxy atablepl = (pl_nanoid_atlasotoskopii_Realm_tableplRealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = atablepl.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = atablepl.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != atablepl.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }
}
