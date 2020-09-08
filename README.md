# App-Spring-Boot

The project includes: a web that includes api, data base, creating an image with Docker,  document for api in swagger.

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

<h3>Add a product using Postman</h3>
</br>
<img src="/Images/AddItem.PNG" alt="AddItem" style="float:right;width:10px;height:10px;">
</br>
<h3>Data Bast- H2</h3>
</br>
<img src="/Images/DB-AddItem.PNG" alt="DB-AddItem" style="float:right;width:10px;height:10px;">
</br>
