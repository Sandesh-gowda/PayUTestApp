package com.Wsdl2Code.WebServices.EnterpriseAPISoapService;

//------------------------------------------------------------------------------
// <wsdl2code-generated>
//    This code was generated by http://www.wsdl2code.com version  2.5
//
// Date Of Creation: 7/4/2014 4:34:18 PM
//    Please dont change this code, regeneration will override your changes
//</wsdl2code-generated>
//
//------------------------------------------------------------------------------
//
//This source code was auto-generated by Wsdl2Code  Version
//

import org.ksoap2.serialization.KvmSerializable;
import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;

import java.util.Hashtable;

public class customer implements KvmSerializable {

    public String address1;
    public String address2;
    public String addressCity;
    public String countryCode;
    public String countryOfResidence;
    public String dob;
    public String email;
    public String firstName;
    public String ip;
    public String known;
    public String language;
    public String lastName;
    public String merchantUserId;
    public String mobile;
    public String postCode;
    public String regionalId;
    public String regionalIdType;
    public String stateCode;

    public customer() {
    }

    public customer(SoapObject soapObject) {
        if (soapObject == null)
            return;
        if (soapObject.hasProperty("address1")) {
            Object obj = soapObject.getProperty("address1");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                address1 = j.toString();
            } else if (obj != null && obj instanceof String) {
                address1 = (String) obj;
            }
        }
        if (soapObject.hasProperty("address2")) {
            Object obj = soapObject.getProperty("address2");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                address2 = j.toString();
            } else if (obj != null && obj instanceof String) {
                address2 = (String) obj;
            }
        }
        if (soapObject.hasProperty("addressCity")) {
            Object obj = soapObject.getProperty("addressCity");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                addressCity = j.toString();
            } else if (obj != null && obj instanceof String) {
                addressCity = (String) obj;
            }
        }
        if (soapObject.hasProperty("countryCode")) {
            Object obj = soapObject.getProperty("countryCode");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                countryCode = j.toString();
            } else if (obj != null && obj instanceof String) {
                countryCode = (String) obj;
            }
        }
        if (soapObject.hasProperty("countryOfResidence")) {
            Object obj = soapObject.getProperty("countryOfResidence");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                countryOfResidence = j.toString();
            } else if (obj != null && obj instanceof String) {
                countryOfResidence = (String) obj;
            }
        }
        if (soapObject.hasProperty("dob")) {
            Object obj = soapObject.getProperty("dob");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                dob = j.toString();
            } else if (obj != null && obj instanceof String) {
                dob = (String) obj;
            }
        }
        if (soapObject.hasProperty("email")) {
            Object obj = soapObject.getProperty("email");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                email = j.toString();
            } else if (obj != null && obj instanceof String) {
                email = (String) obj;
            }
        }
        if (soapObject.hasProperty("firstName")) {
            Object obj = soapObject.getProperty("firstName");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                firstName = j.toString();
            } else if (obj != null && obj instanceof String) {
                firstName = (String) obj;
            }
        }
        if (soapObject.hasProperty("ip")) {
            Object obj = soapObject.getProperty("ip");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                ip = j.toString();
            } else if (obj != null && obj instanceof String) {
                ip = (String) obj;
            }
        }
        if (soapObject.hasProperty("known")) {
            Object obj = soapObject.getProperty("known");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                known = j.toString();
            } else if (obj != null && obj instanceof String) {
                known = (String) obj;
            }
        }
        if (soapObject.hasProperty("language")) {
            Object obj = soapObject.getProperty("language");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                language = j.toString();
            } else if (obj != null && obj instanceof String) {
                language = (String) obj;
            }
        }
        if (soapObject.hasProperty("lastName")) {
            Object obj = soapObject.getProperty("lastName");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                lastName = j.toString();
            } else if (obj != null && obj instanceof String) {
                lastName = (String) obj;
            }
        }
        if (soapObject.hasProperty("merchantUserId")) {
            Object obj = soapObject.getProperty("merchantUserId");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                merchantUserId = j.toString();
            } else if (obj != null && obj instanceof String) {
                merchantUserId = (String) obj;
            }
        }
        if (soapObject.hasProperty("mobile")) {
            Object obj = soapObject.getProperty("mobile");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                mobile = j.toString();
            } else if (obj != null && obj instanceof String) {
                mobile = (String) obj;
            }
        }
        if (soapObject.hasProperty("postCode")) {
            Object obj = soapObject.getProperty("postCode");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                postCode = j.toString();
            } else if (obj != null && obj instanceof String) {
                postCode = (String) obj;
            }
        }
        if (soapObject.hasProperty("regionalId")) {
            Object obj = soapObject.getProperty("regionalId");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                regionalId = j.toString();
            } else if (obj != null && obj instanceof String) {
                regionalId = (String) obj;
            }
        }
        if (soapObject.hasProperty("regionalIdType")) {
            Object obj = soapObject.getProperty("regionalIdType");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                regionalIdType = j.toString();
            } else if (obj != null && obj instanceof String) {
                regionalIdType = (String) obj;
            }
        }
        if (soapObject.hasProperty("stateCode")) {
            Object obj = soapObject.getProperty("stateCode");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                stateCode = j.toString();
            } else if (obj != null && obj instanceof String) {
                stateCode = (String) obj;
            }
        }
    }

    @Override
    public Object getProperty(int arg0) {
        switch (arg0) {
            case 0:
                return address1;
            case 1:
                return address2;
            case 2:
                return addressCity;
            case 3:
                return countryCode;
            case 4:
                return countryOfResidence;
            case 5:
                return dob;
            case 6:
                return email;
            case 7:
                return firstName;
            case 8:
                return ip;
            case 9:
                return known;
            case 10:
                return language;
            case 11:
                return lastName;
            case 12:
                return merchantUserId;
            case 13:
                return mobile;
            case 14:
                return postCode;
            case 15:
                return regionalId;
            case 16:
                return regionalIdType;
            case 17:
                return stateCode;
        }
        return null;
    }

    @Override
    public int getPropertyCount() {
        return 18;
    }

    @Override
    public void getPropertyInfo(int index, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info) {
        switch (index) {
            case 0:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "address1";
                break;
            case 1:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "address2";
                break;
            case 2:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "addressCity";
                break;
            case 3:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "countryCode";
                break;
            case 4:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "countryOfResidence";
                break;
            case 5:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "dob";
                break;
            case 6:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "email";
                break;
            case 7:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "firstName";
                break;
            case 8:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "ip";
                break;
            case 9:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "known";
                break;
            case 10:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "language";
                break;
            case 11:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "lastName";
                break;
            case 12:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "merchantUserId";
                break;
            case 13:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "mobile";
                break;
            case 14:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "postCode";
                break;
            case 15:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "regionalId";
                break;
            case 16:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "regionalIdType";
                break;
            case 17:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "stateCode";
                break;
        }
    }

    @Override
    public void setProperty(int arg0, Object arg1) {
    }

}
