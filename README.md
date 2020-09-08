# App-Spring-Boot

The project includes: a web that includes api, data base, creating an image with Docker,  document for API in Swagger.
</br>
The Spring Boot avialble at: "http://localhost:8080"
</br>
The DB avilable at: "http://localhost:8080/h2/login.do"
</br>
The Swagger UI avilable at: "http://localhost:8080/swagger-ui/"
</br>
<h2>Application API</h2>
</br>
<pre>
The application Include APIs:

<ul>
<li>List of the inventory items list (item no, name, amount, inventory code).</li>
<li>Read item details (by item no).</li>
<li>Withdrawal quantity of a specific item from stock.</li>
<li>Deposit quantity of a specific item to stock.</li>
<li>Add item to stock.</li>
<ul>
</pre>

<h2>Data Base-H2</h2>
<pre>
@Repository is a marker annotation, which indicates that the underlying interface is a repository. 
A repository is created by extending specific repository interfaces, 
such as CrudRepository, PagingAndSortingRepository, or JpaRepository.
CrudRepository implements basic CRUD operations, including count, delete, deleteById, save, saveAll, findById, and findAll.
Using the CrudRepository you can access the table as well as update the data.
</pre>

<h3>Add a product using Postman.</h3>
</br>
<img src="/Images/AddItem.PNG" alt="AddItem" width="450" height="350">
</br>
<h3>Data Base-H2: after add product.</h3>
</br>
<img src="/Images/DB-AddItem.PNG" alt="DB-AddItem" width="450" height="350">
</br>

<h2>Swagger API document </h2>
<pre>
Swagger is open source that describes the Rest API document.
APIs help the client understand how to use the API.
Restful does not have an API document, so Swagger solves the problem of creating API documents.
</pre>
</br>
<img src="/Images/Swagger-API.PNG" alt="Swagger-API" width="450" height="350">
</br>

<h2>Docker</h2>

