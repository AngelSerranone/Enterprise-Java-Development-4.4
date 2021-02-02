# LAB 4.4

1. Did you use the same type of route to update patient information and to update an employee department? 

   Yes, I used the @PathVariable.  

2. Why did you choose the strategy that you chose? 

   While @RequestParams extract values from the query string, @PathVariables extract values from the URI path. Because @PathVariable is extracting values from the URI path, it’s not encoded. On the other hand, @RequestParam is.  

3. What are the pros and cons of the strategies you chose for creating these routes? 

   While @RequestParams extract values from the query string, @PathVariables extract values from the URI path. Because @PathVariable is extracting values from the URI path, it’s not encoded. On the other hand, @RequestParam is.  

4. What are the tradeoffs between PUT and PATCH? 

   The main difference between PUT and PATCH requests is witnessed in the way the server processes the enclosed entity to update the resource identified by the Request-URI. When making a PUT request, the enclosed entity is viewed as the modified version of the resource saved on the original server, and the client is requesting to replace it. However, with PATCH, the enclosed entity boasts a set of instructions that describe how a resource stored on the original server should be partially modified to create a new version.
   The second difference is when it comes to idempotency. HTTP PUT is said to be idempotent since it always yields the same results every after making several requests. On the other hand, HTTP PATCH is basically said to be non-idempotent. However, it can be made to be idempotent based on where it is implemented.

