package org.expath.exist.crypto;
/**
 * eXist-db EXPath Cryptographic library
 * eXist-db wrapper for EXPath Cryptographic Java library
 * Copyright (C) 2018 Claudius Teodorescu
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public License
 * as published by the Free Software Foundation; either version 2.1
 * of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this library; if not, write to the Free Software Foundation,
 * Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA
 */

public class CryptoException extends Exception {
	private static final long serialVersionUID = -2606956271206243301L;
	private final CryptoError cryptoError;

	public CryptoException(final CryptoError cryptoError) {
		super(cryptoError.getDescription());
		this.cryptoError = cryptoError;
	}

	public CryptoException(final CryptoError cryptoError, final Throwable cause) {
		super(cryptoError.getDescription(), cause);
		this.cryptoError = cryptoError;
	}

	public CryptoError getCryptoError() {
		return cryptoError;
	}
}