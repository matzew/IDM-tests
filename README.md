IDM-tests
=========

PicketLink IDM tests for Unified Push / device registration




Every device requires the following data:
* token
* os
* type
* version (of the OS)

But... sometimes folks may want to store more (e.g. geo location data, username etc)


For that we need a more flexible "schema"....

I have extended the SimpleAgent, and added fields for the required data:
https://github.com/matzew/IDM-tests/blob/master/src/main/java/org/aerogear/connectivity/api/MobileInstallationAgent.java

Now... we still can add more data to it, using the generic Attribute....
https://github.com/matzew/IDM-tests/blob/master/src/main/java/org/aerogear/connectivity/rest/registry/NewInstallationRegistration.java#L44-53

It's a bit hacky.... Also I am not sure, we really want to use that SimpleAgent (or my extension)


You can try with (after you deployed the WAR):

```
curl -v -H "Accept: application/json" -H "Content-type: application/json" -X POST -d '{"token":"1223", "os":"iOS", "type":"iPad", "version":"6.1.2", "username":"mwessendorf1", "lat":"123","log":"3332"}' http://localhost:8080/unified-push-server-controller/registry/device 
```

or
```
curl -v -H "Accept: application/json" -H "Content-type: application/json" -X POST -d '{"token":"1223", "os":"iOS", "type":"iPad", "version":"6.1.2", "username":"mwessendorf1", "LastGameScore":"9001"}' http://localhost:8080/unified-push-server-controller/registry/device 
```
