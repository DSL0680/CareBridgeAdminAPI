package org.carebridge.carebridgeadminapi;

import lombok.extern.log4j.Log4j2;

import org.carebridge.carebridgeadminapi.qna.mapper.QNAMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Log4j2
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class CareBridgeAdminApiApplicationTests {



}
