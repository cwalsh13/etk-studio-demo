/**
 *
 * test
 *
 * administrator 02/10/2021
 **/

package test.handlers;

import com.entellitrak.ApplicationException;
import com.entellitrak.tracking.DataObjectEventHandler;
import com.entellitrak.DataObjectEventContext;

public class AllTypesHandler implements DataObjectEventHandler {

    public void execute(DataObjectEventContext etk) throws ApplicationException {

        etk.getResult().addMessage("Executing event handler from SYSTEM WORKSPACE 4");
    }

}
