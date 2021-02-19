/**
 *
 * A custom data type that displays "Yes", "No", and "Maybe" radio options.
 *
 * cwalsh 08/31/2015
 **/
 
package test.plugins.yesnomaybe;
 
import com.entellitrak.configuration.AbstractDataElementType;
import com.entellitrak.configuration.FormControlModel;
import com.entellitrak.configuration.FormControlType;
import com.entellitrak.configuration.FormControlModelFactory;
import com.entellitrak.configuration.DataElementColumn;
import com.entellitrak.configuration.NumberColumn;
import com.entellitrak.configuration.StringValues;
import com.entellitrak.configuration.TypedValues;
import com.entellitrak.configuration.ValuesFactory;
import com.entellitrak.form.FormControlHelper;
import test.plugins.yesnomaybe.control.RadioOptionHelper;
import java.util.Map;
import org.apache.commons.lang.StringUtils;
 
/**
 * Definition of the YesNoMaybe type.
 */
public class YesNoMaybe extends AbstractDataElementType<Long> {
    /**
     * Constructor.  This takes the list of database columns that will represent the type.
     * This type uses a single Number column.
     */
    public YesNoMaybe() {
        super(new NumberColumn("yesNoMaybe"));
    }
 
    /**
     * Returns the name of the data type.  This name will be displayed in the
     * Data Type dropdown when creating a new data element.
     *
     * @return Returns the name of the data type.
     */
    public String getName() {
        return "Yes/No/Maybe";
    }
     
    /**
     * Gets the domain object type.  This type returns a Long.
     *
     * @return the object type
     */
    public Class<Long> getObjectType() {
        return Long.class;
    }
     
    /**
     * Returns the form control type that should be displayed on the data form.
     * This returns an instance of YesNoMaybeFormControl, which defines the script
     * objects containing the form control templates.
     *
     * @return the form control model
     */
    public FormControlModel getFormControlModel(){
        return new YesNoMaybeFormControl();
    }
     
    /**
     * Builds the domain object from a set of database values.
     * The columns and value types returned from this function correspond to the
     * data model that was set up in the constructor.  In this case, there
     * will be one column of type Long.  Since our domain object is also a Long,
     * all we have to do is return the value of this column.
     *
     * @param columnValues a set of Object values loaded from the database
     * @return one or more Strings representing the element value
     */
    public Long loadValueObject(TypedValues columnValues) {
        return columnValues.get("yesNoMaybe", Long.class);
    }
     
    /**
     * Builds the domain object from a set of Strings submitted from the form.
     * The StringValues object contains a map of values that were submitted from
     * the form control; the keys correspond to the field names in getFieldNames().
     * By default, there is a single entry with a key of "" (empty string).
     * The syntax "values.getValue()" is a shortcut to return this single entry.
     *
     * This function gets the single String field submitted from the form,
     * and converts it to a Long.
     *
     * @param values the String values submitted from the form.
     * @return the domain object.
     */
    public Long buildValueObject(StringValues values) {
        if (StringUtils.isBlank(values.getValue())) {
            return null;
        } else {
            return Long.valueOf(values.getValue());
        }
    }
     
    /**
     * Generates String values to display on the form. 
     * This function takes the domain object and converts it to a String
     * for form display.
     *
     * @param valueObject the value object
     * @return one or more Strings to populate the fields on the form control
     */
    public StringValues getFormValues(Long valueObject) {
        return ValuesFactory.getStringValues(nullSafeToString(valueObject));
    }
     
    /**
     * Generates a helper class for rendering the form control. 
     * Here we are returning a custom class (RadioOptionHelper) that will
     * hold the values for all the radio button options.
     *
     * @param values the String values for display
     * @return the form control helper
     */
    public FormControlHelper getFormControlHelper(StringValues values) {
       return new RadioOptionHelper(values.getValue());
    }
     
    /**
     * Generates a string to be displayed on the view/listing.
     * This will display the strings "Yes", "No", or "Maybe" depending on the value.
     *
     * @param valueObject the value object
     *
     * @return a display String.
     */
    public String getViewString(Long valueObject) {
        if (valueObject == null) {
            return "";
        } else if (valueObject.equals(1L)) {
            return "Yes";
        } else if (valueObject.equals(0L)) {
            return "No";
        } else {
            return "Maybe";
        }
    }
}