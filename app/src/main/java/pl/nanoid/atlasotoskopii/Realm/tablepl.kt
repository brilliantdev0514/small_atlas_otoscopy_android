package pl.nanoid.atlasotoskopii.Realm

import io.realm.Realm
import io.realm.RealmObject
import io.realm.RealmQuery
import io.realm.RealmResults
import pl.nanoid.atlasotoskopii.StaticObject

open class tablepl : RealmObject() {

    var dis_id: Long? = null
    var dis_name: String? = null
    var dis_description: String? = null
    var dis_short_description: String? = null
    var dis_treatment: String? = null
    var dis_img_description: String? = null
    var dis_proposed_treatment: String? = null

    companion object {

        fun all (realm: Realm = Realm.getInstance(StaticObject.plRealmConfig) ) : RealmResults<tablepl> {
            return realm.where(tablepl::class.java).findAll()
        }

        fun querry (realm: Realm = Realm.getInstance(StaticObject.plRealmConfig)) : RealmQuery<tablepl> {
            return realm.where(tablepl::class.java)
        }
    }
}
