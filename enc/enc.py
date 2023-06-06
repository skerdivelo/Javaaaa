#!/usr/bin/env python3
from Crypto.Hash import SHA3_384

def enc(plain):
    res = b''
    for c in plain:
        res += SHA3_384.new(bytes([c])).digest()[:2]
    return res.hex()

#7b957b95daf0daf25dbf0312d87854284303dfe8f39ddfe801c117c0f01f7ccae013daf2dfe8636417c0dfe8bef3d17e5f97dfe8d878dfe85c615f974056dfe8854e39773f80489403120c850312f39d02d6

if __name__ == '__main__':
    print(enc(input().encode()))

