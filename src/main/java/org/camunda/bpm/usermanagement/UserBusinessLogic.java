/* Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.camunda.bpm.usermanagement;

import com.service.User;
import org.camunda.bpm.engine.cdi.jsf.TaskForm;
import org.camunda.bpm.engine.delegate.DelegateExecution;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.Map;
import java.util.logging.Logger;
import javax.xml.ws.WebServiceRef;

@Stateless
@Named
public class UserBusinessLogic {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/flightApp/userService.wsdl")
    private com.service.UserService_Service service;

    // Inject task form available through the camunda cdi artifact
    @Inject
    private TaskForm taskForm;

    private static Logger LOGGER = Logger.getLogger(UserBusinessLogic.class.getName());

    public void checkCredential(DelegateExecution delegateExecution) {
          // Get all process variables
        Map<String, Object> variables = delegateExecution.getVariables();
        Boolean result = true;
        try { // Call Web Service Operation
            com.service.UserService port = service.getUserServicePort();
            // TODO initialize WS operation arguments here
            int userId = Integer.parseInt((String) variables.get("userId"));
            java.lang.String token = (String) variables.get("token");
            // TODO process result here
            result = port.checkToken(userId, token);
            System.out.println("Result = "+result);
            if (result == null) {
                System.out.println("it's null");
            }
            delegateExecution.setVariable("approved", result);
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }
    
    public Boolean getCredentialStatus(DelegateExecution de) {
        Boolean result = (Boolean) de.getVariables().get("approved");
        if (result == null) {
            System.out.println("it's null");
            result = true;
        } 
        return result;
    }

    public void persistUser(DelegateExecution delegateExecution) {
        // Get all process variables
        Map<String, Object> variables = delegateExecution.getVariables();

        // Set order attributes

        String username = (String) variables.get("name");
        String password = ((String) variables.get("username"));
        String name = ((String) variables.get("password"));
        User result = new User();

        try { // Call Web Service Operation
            com.service.UserService port = service.getUserServicePort();
            // TODO initialize WS operation arguments here
            // TODO process result here
            result = port.register(username, password, name);
            System.out.println("Result = "+result);
            // Remove no longer needed process variables
            delegateExecution.removeVariables(variables.keySet());

            // Add newly created order id as process variable
            delegateExecution.setVariable("userId", result.getId());
            delegateExecution.setVariable("token", result.getToken());
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }

//  public OrderEntity getOrder(Long orderId) {
//    // Load order entity from database
//    return entityManager.find(OrderEntity.class, orderId);
//  }
//
//  /*
//    Merge updated order entity and complete task form in one transaction. This ensures
//    that both changes will rollback if an error occurs during transaction.
//   */
//  public void mergeOrderAndCompleteTask(OrderEntity orderEntity) {
//    // Merge detached order entity with current persisted state
//    entityManager.merge(orderEntity);
//    try {
//      // Complete user task from
//      taskForm.completeTask();
//    } catch (IOException e) {
//      // Rollback both transactions on error
//      throw new RuntimeException("Cannot complete task", e);
//    }
//  }
//
//  public void rejectOrder(DelegateExecution delegateExecution) {
//    OrderEntity order = getOrder((Long) delegateExecution.getVariable("orderId"));
//    LOGGER.log(Level.INFO, "\n\n\nSending Email:\nDear {0}, your order {1} of a {2} pizza has been rejected.\n\n\n", new String[]{order.getCustomer(), String.valueOf(order.getId()), order.getPizza()});
//  }

}
