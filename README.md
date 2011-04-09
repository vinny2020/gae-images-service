This is a RESTful service for accessing Google App Engine's Images Java API.
GAE's Images API allows for simple manipulation of images on the fly:
[The Images Java API](http://code.google.com/appengine/docs/java/images/overview.html)
This service is written in Groovy using
[the Gaelyk framework](http://gaelyk.appspot.com/)

I hope people find it useful. To store images,App Engine requires that your app have billing enabled.
Images are saved via the GAE BlobStore. As of the time of this writing, the BlobStore can hold as much as 2M and 
ULRFetch requests are limited to 1Mb and 30 seconds. Please visit the docs to see what the current limitations are.
[Quotas and Limits](http://code.google.com/appengine/docs/java/images/overview.html#Quotas_and_Limits)

To see the service in action: [http://hcongruent.appspot.com/test](http://hcongruent.appspot.com/test)

TODO:

1. add JSON as an output format
2. Refactor new File API to replace saving Images  via Form POST.
3. Try to do a better job at handling GAE errors before they are swallowed.


