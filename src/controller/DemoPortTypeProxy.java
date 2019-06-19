package controller;

public class DemoPortTypeProxy implements controller.DemoPortType {
  private String _endpoint = null;
  private controller.DemoPortType demoPortType = null;
  
  public DemoPortTypeProxy() {
    _initDemoPortTypeProxy();
  }
  
  public DemoPortTypeProxy(String endpoint) {
    _endpoint = endpoint;
    _initDemoPortTypeProxy();
  }
  
  private void _initDemoPortTypeProxy() {
    try {
      demoPortType = (new controller.DemoLocator()).getDemoHttpSoap11Endpoint();
      if (demoPortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)demoPortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)demoPortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (demoPortType != null)
      ((javax.xml.rpc.Stub)demoPortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public controller.DemoPortType getDemoPortType() {
    if (demoPortType == null)
      _initDemoPortTypeProxy();
    return demoPortType;
  }
  
  public boolean isTCKNCorrect(java.lang.String id) throws java.rmi.RemoteException{
    if (demoPortType == null)
      _initDemoPortTypeProxy();
    return demoPortType.isTCKNCorrect(id);
  }
  
  public java.lang.String hello() throws java.rmi.RemoteException{
    if (demoPortType == null)
      _initDemoPortTypeProxy();
    return demoPortType.hello();
  }
  
  
}