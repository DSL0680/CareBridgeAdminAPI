package org.carebridge.carebridgeadminapi;

import lombok.extern.log4j.Log4j2;
import org.carebridge.carebridgeadminapi.time.mapper.TimeMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Log4j2
class CareBridgeAdminApiApplicationTests {

    @Autowired(required = false)
    TimeMapper timeMapper;

    @Test
    public void Test1(){
        log.info("------------");
        log.info("!"+timeMapper.getTime());
    }

    @Test
    void contextLoads() {
    }

}
