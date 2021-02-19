/**
 *
 * Helper class that is used to render the set of radio button options.  The constructor takes the selected
 * value and constructs the list of radio buttons to display.
 *
 * administrator 08/31/2015
 **/
 
package test.plugins.yesnomaybe.control;
 
import com.entellitrak.form.FormControlHelper;
import java.util.List;
import java.util.ArrayList;
 
public class RadioOptionHelper implements FormControlHelper {
     
    List<RadioOption> options;
 
    public RadioOptionHelper(String selectedValue) {
        this.options = new ArrayList<RadioOption>();
         
        this.options.add(new RadioOption("yes", "Yes", "1", "1".equals(selectedValue)));
        this.options.add(new RadioOption("no", "No", "0", "0".equals(selectedValue)));
        this.options.add(new RadioOption("maybe", "Maybe", "2", "2".equals(selectedValue)));
    }
     
    public List<RadioOption> getOptions() {
        System.out.println("getOptions() called");
        return this.options;
    }
}