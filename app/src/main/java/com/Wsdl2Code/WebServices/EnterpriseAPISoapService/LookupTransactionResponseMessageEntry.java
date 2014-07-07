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

public class LookupTransactionResponseMessageEntry implements KvmSerializable {

    public String key;
    public VectorString value;

    public LookupTransactionResponseMessageEntry() {
    }

    public LookupTransactionResponseMessageEntry(SoapObject soapObject) {
        if (soapObject == null)
            return;
        if (soapObject.hasProperty("key")) {
            Object obj = soapObject.getProperty("key");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                key = j.toString();
            } else if (obj != null && obj instanceof String) {
                key = (String) obj;
            }
        }
        if (soapObject.hasProperty("value")) {
            SoapObject j = (SoapObject) soapObject.getProperty("value");
            value = new VectorString(j);
        }
    }

    @Override
    public Object getProperty(int arg0) {
        switch (arg0) {
            case 0:
                return key;
            case 1:
                return value;
        }
        return null;
    }

    @Override
    public int getPropertyCount() {
        return 2;
    }

    @Override
    public void getPropertyInfo(int index, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info) {
        switch (index) {
            case 0:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "key";
                break;
            case 1:
                info.type = PropertyInfo.VECTOR_CLASS;
                info.name = "value";
                break;
        }
    }

    @Override
    public void setProperty(int arg0, Object arg1) {
    }

}
