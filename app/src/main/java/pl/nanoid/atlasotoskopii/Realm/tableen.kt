package pl.nanoid.atlasotoskopii.Realm

import io.realm.Realm
import io.realm.RealmObject
import io.realm.RealmQuery
import io.realm.RealmResults
import pl.nanoid.atlasotoskopii.StaticObject

open class tableen : RealmObject() {

    var dis_id: Long? = null
    var dis_name: String? = null
    var dis_description: String? = null
    var dis_short_description: String? = null
    var dis_treatment: String? = null
    var dis_img_description: String? = null
    var dis_proposed_treatment: String? = null


    companion object {

        fun all (realm: Realm = Realm.getInstance(StaticObject.enRealmConfig) ) : RealmResults<tableen> {
            return realm.where(tableen::class.java).findAll()
        }

        fun querry (realm: Realm = Realm.getInstance(StaticObject.enRealmConfig)) : RealmQuery<tableen>{
            return realm.where(tableen::class.java)
        }
    }

}
