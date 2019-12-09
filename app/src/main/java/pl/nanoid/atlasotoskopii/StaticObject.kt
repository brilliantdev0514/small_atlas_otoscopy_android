package pl.nanoid.atlasotoskopii


import io.realm.RealmConfiguration
import io.realm.annotations.RealmModule
import pl.nanoid.atlasotoskopii.Realm.tableen
import pl.nanoid.atlasotoskopii.Realm.tablepl
import pl.nanoid.atlasotoskopii.Realm.tableru

object StaticObject {

    // value for number of items for adapters:
    const val numberOfItemsInAdapters: Int = 24

    val inMemoryRealm: RealmConfiguration
    val enRealmConfig: RealmConfiguration
    val plRealmConfig: RealmConfiguration
    val ruRealmConfig: RealmConfiguration


    init {

        enRealmConfig = configureENRealm()
        plRealmConfig = configurePLRealm()
        ruRealmConfig = configureRURealm()
        inMemoryRealm = configureInMemoryRealm()

    }


    private fun configureENRealm () : RealmConfiguration {

        return RealmConfiguration.Builder()
            .assetFile("tableen.realm")
            .schemaVersion(1)
            .modules(TableENModule())
            .name("rurealm.realm")
            .readOnly()
            .build()
    }

    private fun configurePLRealm () : RealmConfiguration {

        return RealmConfiguration.Builder()
            .assetFile("tablepl.realm")
            .schemaVersion(1)
            .modules(TablePLModule())
            .name("plrealm.realm")
            .readOnly()
            .build()
    }

    private fun configureRURealm () : RealmConfiguration {

        return RealmConfiguration.Builder()
            .assetFile("tableru.realm")
            .schemaVersion(1)
            .modules(TableRUModule())
            .name("enrealm.realm")
            .readOnly()
            .build()
    }

    private fun configureInMemoryRealm () : RealmConfiguration {
        return RealmConfiguration.Builder()
            .inMemory()
            .name("inMemoryRealm")
            .build()
    }


    @RealmModule(classes = arrayOf(tableen::class))
    private class TableENModule

    @RealmModule(classes = arrayOf(tablepl::class))
    private class TablePLModule

    @RealmModule(classes = arrayOf(tableru::class))
    private class TableRUModule

}