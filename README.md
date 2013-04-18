IDM-tests
=========

PicketLink IDM tests for Unified Push / device registration




Every device requires the following data:
* token
* os
* type
* version (of the OS)

But... sometimes folks may want to store more (e.g. geo location data, username etc)

Business related data should be stored in the "business database", but to bridge between these worlds, the following (optional) attribute is needed:

* identifier

I have extended the SimpleAgent, and added fields for the required (and optional) data:
https://github.com/matzew/IDM-tests/blob/master/src/main/java/org/aerogear/connectivity/api/MobileInstallationAgent.java

You can try with (after you deployed the WAR):

```
curl -v -H "Accept: application/json" -H "Content-type: application/json" -X POST -d '{"deviceToken":"123","mobileOperatingSystem":"iOS","deviceType":"iPad","version":"6.1.2"}' http://localhost:8080/unified-push-server-controller/registry/device
```

or, with an optional "client id::
```
curl -v -H "Accept: application/json" -H "Content-type: application/json" -X POST -d '{"deviceToken":"12341","mobileOperatingSystem":"iOS","deviceType":"iPad","version":"6.1.2", "clientIdentifier":"kalle@gmail.com"}' http://localhost:8080/unified-push-server-controller/registry/device
```


