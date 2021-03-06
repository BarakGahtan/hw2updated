package il.ac.technion.cs.softwaredesign.storage.impl

import il.ac.technion.cs.softwaredesign.storage.SecureStorage
import il.ac.technion.cs.softwaredesign.storage.SecureStorageFactory

class SecureStorageFactoryImpl : SecureStorageFactory {
    override fun open(name: ByteArray): SecureStorage = SecureStorageImpl()
}