
package cs.ut.domain.soap.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for hireRequestStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="hireRequestStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PENDING_CONFIRMATION"/>
 *     &lt;enumeration value="OPEN"/>
 *     &lt;enumeration value="PENDING_UPDATE"/>
 *     &lt;enumeration value="CLOSED"/>
 *     &lt;enumeration value="REJECTED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "hireRequestStatus")
@XmlEnum
public enum HireRequestStatus {

    PENDING_CONFIRMATION,
    OPEN,
    PENDING_UPDATE,
    CLOSED,
    REJECTED;

    public String value() {
        return name();
    }

    public static HireRequestStatus fromValue(String v) {
        return valueOf(v);
    }

}
