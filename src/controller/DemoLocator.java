/**
 * DemoLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package controller;

public class DemoLocator extends org.apache.axis.client.Service implements controller.Demo {

    public DemoLocator() {
    }


    public DemoLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public DemoLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for DemoHttpSoap11Endpoint
    private java.lang.String DemoHttpSoap11Endpoint_address = "http://localhost:8080/WebServiceServer/services/Demo.DemoHttpSoap11Endpoint/";

    public java.lang.String getDemoHttpSoap11EndpointAddress() {
        return DemoHttpSoap11Endpoint_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String DemoHttpSoap11EndpointWSDDServiceName = "DemoHttpSoap11Endpoint";

    public java.lang.String getDemoHttpSoap11EndpointWSDDServiceName() {
        return DemoHttpSoap11EndpointWSDDServiceName;
    }

    public void setDemoHttpSoap11EndpointWSDDServiceName(java.lang.String name) {
        DemoHttpSoap11EndpointWSDDServiceName = name;
    }

    public controller.DemoPortType getDemoHttpSoap11Endpoint() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(DemoHttpSoap11Endpoint_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getDemoHttpSoap11Endpoint(endpoint);
    }

    public controller.DemoPortType getDemoHttpSoap11Endpoint(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            controller.DemoSoap11BindingStub _stub = new controller.DemoSoap11BindingStub(portAddress, this);
            _stub.setPortName(getDemoHttpSoap11EndpointWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setDemoHttpSoap11EndpointEndpointAddress(java.lang.String address) {
        DemoHttpSoap11Endpoint_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (controller.DemoPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                controller.DemoSoap11BindingStub _stub = new controller.DemoSoap11BindingStub(new java.net.URL(DemoHttpSoap11Endpoint_address), this);
                _stub.setPortName(getDemoHttpSoap11EndpointWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("DemoHttpSoap11Endpoint".equals(inputPortName)) {
            return getDemoHttpSoap11Endpoint();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://controller", "Demo");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://controller", "DemoHttpSoap11Endpoint"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("DemoHttpSoap11Endpoint".equals(portName)) {
            setDemoHttpSoap11EndpointEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
