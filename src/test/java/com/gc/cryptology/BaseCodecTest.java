package com.gc.cryptology;

import com.gc.utils.ConstantUtils;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author join wick
 * @version 1.0.0
 * @description
 * @createDate 2020/12/9 22:39
 * @since 1.0.0
 */
public class BaseCodecTest {
    private final BaseCodec base58Service = new BaseCodec();
    String initialData = "IF1801@1900.05:10:阿海:Buy:Open:@2017-12-03 15:24:59";
    String base58Data = "6ueqKDQ9byFCHYa1Pvs2PK9imt3v9iYAKFWcm6HdXjvx371M9urSZx9v2BqoiVLCzrTApTxWQQ";
    @Test
    public void base58Encode_ValidEntry() {
        String base58EncodeData = base58Service.base58Encode(initialData.getBytes(ConstantUtils.DEFAULT_CHARSET));
        assertEquals(base58Data, base58EncodeData);
    }

    @Test
    public void base58Decode_ValidEntry() {
        String base58DecodeData = new String(base58Service.base58Decode(base58Data));
        assertEquals(initialData, base58DecodeData);
    }
}