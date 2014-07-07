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

public class creditCard implements KvmSerializable {

    public String amountInCents;
    public String budgetPeriod;
    public String cardExpiry;
    public String cardNumber;
    public String cvv;
    public String description;
    public String fraudIndex;
    public String gatewayCode;
    public String gatewayReference;
    public String information;
    public String knownCard;
    public String nameOnCard;
    public String verified;
    public String defaultPM;
    public String pmId;

    public creditCard() {
    }

    public creditCard(SoapObject soapObject) {
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
        if (soapObject.hasProperty("budgetPeriod")) {
            Object obj = soapObject.getProperty("budgetPeriod");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                budgetPeriod = j.toString();
            } else if (obj != null && obj instanceof String) {
                budgetPeriod = (String) obj;
            }
        }
        if (soapObject.hasProperty("cardExpiry")) {
            Object obj = soapObject.getProperty("cardExpiry");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                cardExpiry = j.toString();
            } else if (obj != null && obj instanceof String) {
                cardExpiry = (String) obj;
            }
        }
        if (soapObject.hasProperty("cardNumber")) {
            Object obj = soapObject.getProperty("cardNumber");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                cardNumber = j.toString();
            } else if (obj != null && obj instanceof String) {
                cardNumber = (String) obj;
            }
        }
        if (soapObject.hasProperty("cvv")) {
            Object obj = soapObject.getProperty("cvv");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                cvv = j.toString();
            } else if (obj != null && obj instanceof String) {
                cvv = (String) obj;
            }
        }
        if (soapObject.hasProperty("description")) {
            Object obj = soapObject.getProperty("description");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                description = j.toString();
            } else if (obj != null && obj instanceof String) {
                description = (String) obj;
            }
        }
        if (soapObject.hasProperty("fraudIndex")) {
            Object obj = soapObject.getProperty("fraudIndex");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                fraudIndex = j.toString();
            } else if (obj != null && obj instanceof String) {
                fraudIndex = (String) obj;
            }
        }
        if (soapObject.hasProperty("gatewayCode")) {
            Object obj = soapObject.getProperty("gatewayCode");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                gatewayCode = j.toString();
            } else if (obj != null && obj instanceof String) {
                gatewayCode = (String) obj;
            }
        }
        if (soapObject.hasProperty("gatewayReference")) {
            Object obj = soapObject.getProperty("gatewayReference");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                gatewayReference = j.toString();
            } else if (obj != null && obj instanceof String) {
                gatewayReference = (String) obj;
            }
        }
        if (soapObject.hasProperty("information")) {
            Object obj = soapObject.getProperty("information");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                information = j.toString();
            } else if (obj != null && obj instanceof String) {
                information = (String) obj;
            }
        }
        if (soapObject.hasProperty("knownCard")) {
            Object obj = soapObject.getProperty("knownCard");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                knownCard = j.toString();
            } else if (obj != null && obj instanceof String) {
                knownCard = (String) obj;
            }
        }
        if (soapObject.hasProperty("nameOnCard")) {
            Object obj = soapObject.getProperty("nameOnCard");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                nameOnCard = j.toString();
            } else if (obj != null && obj instanceof String) {
                nameOnCard = (String) obj;
            }
        }
        if (soapObject.hasProperty("verified")) {
            Object obj = soapObject.getProperty("verified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                verified = j.toString();
            } else if (obj != null && obj instanceof String) {
                verified = (String) obj;
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
                return budgetPeriod;
            case 2:
                return cardExpiry;
            case 3:
                return cardNumber;
            case 4:
                return cvv;
            case 5:
                return description;
            case 6:
                return fraudIndex;
            case 7:
                return gatewayCode;
            case 8:
                return gatewayReference;
            case 9:
                return information;
            case 10:
                return knownCard;
            case 11:
                return nameOnCard;
            case 12:
                return verified;
            case 13:
                return defaultPM;
            case 14:
                return pmId;
        }
        return null;
    }

    @Override
    public int getPropertyCount() {
        return 15;
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
                info.name = "budgetPeriod";
                break;
            case 2:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "cardExpiry";
                break;
            case 3:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "cardNumber";
                break;
            case 4:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "cvv";
                break;
            case 5:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "description";
                break;
            case 6:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "fraudIndex";
                break;
            case 7:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "gatewayCode";
                break;
            case 8:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "gatewayReference";
                break;
            case 9:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "information";
                break;
            case 10:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "knownCard";
                break;
            case 11:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "nameOnCard";
                break;
            case 12:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "verified";
                break;
            case 13:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "defaultPM";
                break;
            case 14:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "pmId";
                break;
        }
    }

    @Override
    public void setProperty(int arg0, Object arg1) {
    }

}
