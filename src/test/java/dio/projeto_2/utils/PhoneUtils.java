package dio.projeto_2.utils;

import dio.projeto_2.entity.Phone;
import dio.projeto_2.dto.request.PhoneDTO;
import dio.projeto_2.enums.PhoneType;

public class PhoneUtils {

    private static final String PHONE_NUMBER = "3799999-9999";
    private static final PhoneType PHONE_TYPE = PhoneType.MOBILE;
    private static final long PHONE_ID = 1L;

    public static PhoneDTO createFakeDTO() {
        return PhoneDTO.builder()
                .number(PHONE_NUMBER)
                .type(PHONE_TYPE)
                .build();
    }

    public static Phone createFakeEntity() {
        return Phone.builder()
                .id(PHONE_ID)
                .number(PHONE_NUMBER)
                .type(PHONE_TYPE)
                .build();
    }
}
