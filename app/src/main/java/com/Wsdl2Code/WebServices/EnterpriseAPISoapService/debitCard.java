package com.Wsdl2Code.WebServices.EnterpriseAPISoapService;

//------------------------------------------------------------------------------
// <wsdl2code-generated>
//    This code was generated by http://www.wsdl2code.com version  2.5
//
// Date Of Creation: 7/4/2014 4:34:19 PM
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

public class debitCard implements KvmSerializable {

    public String amountInCents;
    public String currency;
    public String reference;
    public String defaultPM;
    public String pmId;

    public debitCard() {
    }

    public debitCard(SoapObject soapObject) {
        if (soapObject == null)
            return;
        if (soapObject.hasProperty("amountInCents")) {
            Object obj = soapObject.getProperty("amountInCents");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                amountInCents = j.toString();
            } else if (obj != null && obj instanceof String) {
                amountInCents = (String) obj;
            }
        }
        if (soapObject.hasProperty("currency")) {
            Object obj = soapObject.getProperty("currency");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                currency = j.toString();
            } else if (obj != null && obj instanceof String) {
                currency = (String) obj;
            }
        }
        if (soapObject.hasProperty("reference")) {
            Object obj = soapObject.getProperty("reference");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                reference = j.toString();
            } else if (obj != null && obj instanceof String) {
                reference = (String) obj;
            }
        }
        if (soapObject.hasProperty("defaultPM")) {
            Object obj = soapObject.getProperty("defaultPM");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                defaultPM = j.toString();
            } else if (obj != null && obj instanceof String) {
                defaultPM = (String) obj;
            }
        }
        if (soapObject.hasProperty("pmId")) {
            Object obj = soapObject.getProperty("pmId");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                pmId = j.toString();
            } else if (obj != null && obj instanceof String) {
                pmId = (String) obj;
            }
        }
    }

    @Override
    public Object getProperty(int arg0) {
        switch (arg0) {
            case 0:
                return amountInCents;
            case 1:
                return currency;
            case 2:
                return reference;
            case 3:
                return defaultPM;
            case 4:
                return pmId;
        }
        return null;
    }

    @Override
    public int getPropertyCount() {
        return 5;
    }

    @Override
    public void getPropertyInfo(int index, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info) {
        switch (index) {
            case 0:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "amountInCents";
                break;
            case 1:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "currency";
                break;
            case 2:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "reference";
                break;
            case 3:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "defaultPM";
                break;
            case 4:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "pmId";
                break;
        }
    }

    @Override
    public void setProperty(int arg0, Object arg1) {
    }

}
