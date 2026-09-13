// SPDX-License-Identifier: Apache-2.0
//
// Copyright © 2017 Trust Wallet.

package com.trustwallet.core.app.blockchains.acala

import com.trustwallet.core.app.utils.toHex
import com.trustwallet.core.app.utils.toHexByteArray
import org.junit.Assert.assertEquals
import org.junit.Test
import wallet.core.jni.*

class AcalaAddress {

    init {
        System.loadLibrary("TrustWalletCore")
    }

    @Wallet
    fun testAddress() {
        val key = PrivateKey("autogenerate".toHexByteArray())
        val pubkey = key.publicKeyEd25519
        val address = AnyAddress(pubkey, CoinType.ACALA)
        assertEquals(address.description(), "autogenerate")
    }
}
