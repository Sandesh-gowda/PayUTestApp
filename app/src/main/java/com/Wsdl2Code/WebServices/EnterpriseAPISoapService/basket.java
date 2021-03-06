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

public class basket implements KvmSerializable {

    public String amountInCents;
    public String currencyCode;
    public String description;
    public VectorproductLineItem productLineItem;
    public shippingDetails shippingDetails;

    public basket() {
    }

    public basket(SoapObject soapObject) {
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
        if (soapObject.hasProperty("currencyCode")) {
            Object obj = soapObject.getProperty("currencyCode");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                currencyCode = j.toString();
            } else if (obj != null && obj instanceof String) {
                currencyCode = (String) obj;
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
        if (soapObject.hasProperty("productLineItem")) {
            SoapObject j = (SoapObject) soapObject.getProperty("productLineItem");
            productLineItem = new VectorproductLineItem(j);
        }
        if (soapObject.hasProperty("shippingDetails")) {
            SoapObject j = (SoapObject) soapObject.getProperty("shippingDetails");
            shippingDetails = new shippingDetails(j);

        }
    }

    @Override
    public Object getProperty(int arg0) {
        switch (arg0) {
            case 0:
                return amountInCents;
            case 1:
                return currencyCode;
            case 2:
                return description;
            case 3:
                return productLineItem;
            case 4:
                return shippingDetails;
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
                info.name = "currencyCode";
                break;
            case 2:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "description";
                break;
            case 3:
                info.type = PropertyInfo.VECTOR_CLASS;
                info.name = "productLineItem";
                break;
            case 4:
                info.type = shippingDetails.class;
                info.name = "shippingDetails";
                break;
        }
    }

    @Override
    public void setProperty(int arg0, Object arg1) {
    }

}
