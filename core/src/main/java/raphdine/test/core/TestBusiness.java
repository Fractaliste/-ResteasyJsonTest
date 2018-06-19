/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package raphdine.test.core;

import org.springframework.stereotype.Service;
import raphdine.test.api.ITest;
import raphdine.test.api.InputDto;
import raphdine.test.api.OutputDto;

/**
 *
 * @author Raphiki
 */
@Service
public class TestBusiness implements ITest {

    @Override
    public OutputDto test(InputDto o) {
        return new OutputDto();
    }

    @Override
    public String helloWorld() {
        return "Hello world";
    }
}
